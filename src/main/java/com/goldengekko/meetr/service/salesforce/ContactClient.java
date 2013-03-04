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
import org.springframework.social.salesforce.api.SalesforceContact;
import org.springframework.social.salesforce.api.impl.SalesforceTemplate;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author sosandstrom
 */
public class ContactClient implements ContactService {
    
    static final Logger LOG = LoggerFactory.getLogger(ContactClient.class);

    private static final ThreadLocal<String> TOKEN = new ThreadLocal<String>();
    private static final ThreadLocal<String> INSTANCE_URL = new ThreadLocal<String>();

    @Override
    public DmContact get(String parentKeyString, String id) {
        throw new UnsupportedOperationException("Not supported yet.");
//        final Entry<String, String> cred = parseToken(TOKEN.get());
//        final String url = cred.getKey() + BASE_PATH + "/sobjects/Contact/" + id;
//        HttpEntity requestEntity = getRequestEntity(cred.getValue());
//        ResponseEntity<JSalesforceContact> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, JSalesforceContact.class);
//        return convert(response.getBody());
    }
    
    @Override
    public CursorPage<DmContact, String> getPage(int pageSize, String cursorKey) {
        SalesforceTemplate template = new SalesforceTemplate(TOKEN.get(), INSTANCE_URL.get());
        Iterable<SalesforceContact> response = template.basicOperations().getContacts(pageSize, cursorKey);
        
        final CursorPage<DmContact, String> page = new CursorPage<DmContact, String>();
        page.setRequestedPageSize(pageSize);
        page.setItems(convert(response));
        if (pageSize == page.getItems().size()) {
            int offset = null != cursorKey ? Integer.parseInt(cursorKey.toString()) : 0;
            page.setCursorKey(Integer.toString(offset + pageSize));
        }
        
        return page;
    }

    @Override
    public CursorPage<DmContact, String> searchContacts(String text, int pageSize, Serializable cursorKey) {
        throw new UnsupportedOperationException("Not supported yet.");
//        final Entry<String, String> cred = parseToken(TOKEN.get());
//        int offset = null != cursorKey ? Integer.parseInt(cursorKey.toString()) : 0;
//        final String url = cred.getKey() + BASE_PATH + "/search/?q={sosl}";
//        HttpEntity requestEntity = getRequestEntity(cred.getValue());
//        String sosl = String.format("FIND {%s} IN NAME FIELDS RETURNING Contact(%s ORDER BY Name) LIMIT %d", text, FIELDS, offset+pageSize+1);
//        LOG.debug("SOSL: {}", sosl);
//        ResponseEntity<JSalesforceContact[]> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, JSalesforceContact[].class, sosl);
//        if (HttpStatus.OK.equals(response.getStatusCode())) {
//            JSalesforceContact[] all = response.getBody();
//            JSalesforceContact[] items = Arrays.copyOfRange(all, offset, Math.min(all.length, offset + pageSize));
//            final CursorPage<DmContact, String> page = new CursorPage<DmContact, String>();
//            page.setRequestedPageSize(pageSize);
//            page.setItems(convert(items));
//            if (offset + pageSize < all.length) {
//                page.setCursorKey(Integer.toString(offset+pageSize));
//            }
//            return page;
//        }
//        throw new RestException(93, response.getStatusCode(), sosl);
    }
    
    protected static HttpEntity getRequestEntity(String accessToken) {
        HttpHeaders headers = new HttpHeaders();
        final String auth = String.format("OAuth %s", accessToken);
        headers.add("Authorization", auth);
        LOG.info("Salesforce Authorization: {}", auth);
        final HttpEntity requestEntity = new HttpEntity(headers);
        return requestEntity;
    }

    protected static Collection<DmContact> convert(Iterable<SalesforceContact> contacts) {
        final Collection<DmContact> to = new ArrayList<DmContact>();
        for (SalesforceContact con : contacts) {
            to.add(convert(con));
        }
        return to;
    }

    protected static Collection<DmContact> convert(SalesforceContact[] contacts) {
        final Collection<DmContact> to = new ArrayList<DmContact>();
        for (SalesforceContact con : contacts) {
            to.add(convert(con));
        }
        return to;
    }

    protected static DmContact convert(SalesforceContact from) {
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
    public void setContactsAppArg0(String instanceUrl) {
        INSTANCE_URL.set(instanceUrl);
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
    public CursorPage<String, String> whatsChanged(Date since, int pageSize, String cursorKey) {
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
