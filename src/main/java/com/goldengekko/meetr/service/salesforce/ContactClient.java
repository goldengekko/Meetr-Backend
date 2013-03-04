/*
 * INSERT COPYRIGHT HERE
 */

package com.goldengekko.meetr.service.salesforce;

import com.goldengekko.meetr.domain.DmContact;
import com.goldengekko.meetr.service.ContactService;
import com.wadpam.open.exceptions.AuthenticationFailedException;
import com.wadpam.open.exceptions.RestException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import net.sf.mardao.core.CursorPage;
import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author sosandstrom
 */
public class ContactClient implements ContactService {
    
    static final Logger LOG = LoggerFactory.getLogger(ContactClient.class);

    private static final String BASE_PATH = "/services/data/v24.0";
    
    private static final ThreadLocal<String> TOKEN = new ThreadLocal<String>();
    protected final String FIELDS = "Id,Email,Name,FirstName,LastName";
    
    private final RestTemplate restTemplate;

    public ContactClient() {
        restTemplate = new RestTemplate();
        restTemplate.setErrorHandler(new DefaultResponseErrorHandler() {
            @Override
            protected boolean hasError(HttpStatus statusCode) {
                switch (statusCode.value()) {
                    case 400:
                    case 401:
                    case 404:
                        return false;
                }
                return super.hasError(statusCode);
            }
        });
    }
    
    public static String createToken(String instanceUrl, String accessToken) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            DataOutputStream dos = new DataOutputStream(baos);
            dos.writeUTF(instanceUrl);
            dos.writeUTF(accessToken);
            return Base64.encodeBase64URLSafeString(baos.toByteArray());
        }
        catch (IOException ex) {
            throw new RestException(95, HttpStatus.SERVICE_UNAVAILABLE, ex.getMessage());
        }
    }
    
    public static Entry<String, String> parseToken(String token) {
        if (null == token) {
            throw new AuthenticationFailedException(96, "Access Token required");
        }
        try {
            ByteArrayInputStream bais = new ByteArrayInputStream(Base64.decodeBase64(token));
            DataInputStream dis = new DataInputStream(bais);
            String instanceUrl = dis.readUTF();
            String accessToken = dis.readUTF();
            Entry<String, String> entry = new AbstractMap.SimpleImmutableEntry<String, String>(instanceUrl, accessToken);
            return entry;
        }
        catch (IOException ex) {
            throw new RestException(99, HttpStatus.SERVICE_UNAVAILABLE, ex.getMessage());
        }
    }

    @Override
    public String getContactsToken(String instanceUrl, String accessToken) {
        final String returnValue = createToken(instanceUrl, accessToken);
        LOG.info("Creating token for {}, returning {}", accessToken, returnValue);
        return returnValue;
    }

    @Override
    public DmContact get(String parentKeyString, String id) {
        final Entry<String, String> cred = parseToken(TOKEN.get());
        final String url = cred.getKey() + BASE_PATH + "/sobjects/Contact/" + id;
        HttpEntity requestEntity = getRequestEntity(cred.getValue());
        ResponseEntity<JSalesforceContact> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, JSalesforceContact.class);
        return convert(response.getBody());
    }
    
    @Override
    public CursorPage<DmContact, String> getPage(int pageSize, Serializable cursorKey) {
        final Entry<String, String> cred = parseToken(TOKEN.get());
        final String url = cred.getKey() + BASE_PATH + "/query/?q={soql}";
        HttpEntity requestEntity = getRequestEntity(cred.getValue());
        int offset = null != cursorKey ? Integer.parseInt(cursorKey.toString()) : 0;
        String soql = String.format("SELECT %s FROM Contact ORDER BY Name LIMIT %d", FIELDS, pageSize);
        if (0 < offset) {
            soql = String.format("%s OFFSET %d", soql, offset);
        }
        LOG.debug("SOQL: {}", soql);
        ResponseEntity<JContactQueryResponse> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, JContactQueryResponse.class, soql);
        if (HttpStatus.OK.equals(response.getStatusCode())) {
            final CursorPage<DmContact, String> page = new CursorPage<DmContact, String>();
            page.setRequestedPageSize(pageSize);
            page.setItems(convert(response.getBody().getRecords()));
            if (pageSize == page.getItems().size()) {
                page.setCursorKey(Integer.toString(offset + pageSize));
            }
            return page;
        }
        throw new RestException(92, response.getStatusCode(), soql);
    }

    @Override
    public CursorPage<DmContact, String> searchContacts(String text, int pageSize, Serializable cursorKey) {
        final Entry<String, String> cred = parseToken(TOKEN.get());
        int offset = null != cursorKey ? Integer.parseInt(cursorKey.toString()) : 0;
        final String url = cred.getKey() + BASE_PATH + "/search/?q={sosl}";
        HttpEntity requestEntity = getRequestEntity(cred.getValue());
        String sosl = String.format("FIND {%s} IN NAME FIELDS RETURNING Contact(%s ORDER BY Name) LIMIT %d", text, FIELDS, offset+pageSize+1);
        LOG.debug("SOSL: {}", sosl);
        ResponseEntity<JSalesforceContact[]> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, JSalesforceContact[].class, sosl);
        if (HttpStatus.OK.equals(response.getStatusCode())) {
            JSalesforceContact[] all = response.getBody();
            JSalesforceContact[] items = Arrays.copyOfRange(all, offset, Math.min(all.length, offset + pageSize));
            final CursorPage<DmContact, String> page = new CursorPage<DmContact, String>();
            page.setRequestedPageSize(pageSize);
            page.setItems(convert(items));
            if (offset + pageSize < all.length) {
                page.setCursorKey(Integer.toString(offset+pageSize));
            }
            return page;
        }
        throw new RestException(93, response.getStatusCode(), sosl);
    }
    
    protected static HttpEntity getRequestEntity(String accessToken) {
        HttpHeaders headers = new HttpHeaders();
        final String auth = String.format("OAuth %s", accessToken);
        headers.add("Authorization", auth);
        LOG.info("Salesforce Authorization: {}", auth);
        final HttpEntity requestEntity = new HttpEntity(headers);
        return requestEntity;
    }

    protected static Collection<DmContact> convert(Iterable<JSalesforceContact> contacts) {
        final Collection<DmContact> to = new ArrayList<DmContact>();
        for (JSalesforceContact con : contacts) {
            to.add(convert(con));
        }
        return to;
    }

    protected static Collection<DmContact> convert(JSalesforceContact[] contacts) {
        final Collection<DmContact> to = new ArrayList<DmContact>();
        for (JSalesforceContact con : contacts) {
            to.add(convert(con));
        }
        return to;
    }

    protected static DmContact convert(JSalesforceContact from) {
        final DmContact to = new DmContact();
        
        to.setId(from.getId());
        to.setEmail(from.getEmail());
        to.setFirstName(from.getFirstName());
        to.setLastName(from.getLastName());
        to.setName(null != from.getName() ? from.getName() : 
                String.format("%s, %s", from.getLastName(), from.getFirstName()));
        
        return to;
    }

    @Override
    public void setContactsToken(String token) {
        TOKEN.set(token);
    }

    @Override
    public DmContact createDomain() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String create(DmContact domain) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(String parentKeyString, String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void exportCsv(OutputStream out, Long startDate, Long endDate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Iterable<DmContact> getByPrimaryKeys(Collection<String> ids) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getSimpleKey(DmContact domain) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getParentKeyString(DmContact domain) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getTableName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String update(DmContact domain) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public CursorPage<String, String> whatsChanged(Date since, int pageSize, Serializable cursorKey) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Class getPrimaryKeyColumnClass() {
        return null;
    }

    @Override
    public String getPrimaryKeyColumnName() {
        return null;
    }

    @Override
    public Map<String, Class> getTypeMap() {
        return null;
    }
}
