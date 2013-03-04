/*
 * INSERT COPYRIGHT HERE
 */

package com.goldengekko.meetr.service.salesforce;

import com.goldengekko.meetr.domain.DmAccount;
import com.goldengekko.meetr.service.AccountService;
import com.wadpam.open.exceptions.RestException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import net.sf.mardao.core.CursorPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author sosandstrom
 */
public class AccountClient implements AccountService {
    
    static final Logger LOG = LoggerFactory.getLogger(AccountClient.class);

    private static final String BASE_PATH = "/services/data/v24.0";
    
    private static final ThreadLocal<String> TOKEN = new ThreadLocal<String>();
    
    private final RestTemplate restTemplate;
    protected final String FIELDS = "Id,Name,Phone,ShippingCity,ShippingCountry,ShippingPostalCode,ShippingState,ShippingStreet";

    public AccountClient() {
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
    
    public static Entry<String, String> parseToken(String token) {
        return ContactClient.parseToken(token);
    }

    @Override
    public DmAccount get(String parentKeyString, String id) {
        final Entry<String, String> cred = parseToken(TOKEN.get());
        final String url = cred.getKey() + BASE_PATH + "/sobjects/Account/" + id;
        HttpEntity requestEntity = getRequestEntity(cred.getValue());
        ResponseEntity<JSalesforceAccount> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, JSalesforceAccount.class);
        return convert(response.getBody());
    }
    
    @Override
    public CursorPage<DmAccount, String> getPage(int pageSize, Serializable cursorKey) {
        final Entry<String, String> cred = parseToken(TOKEN.get());
        final String url = cred.getKey() + BASE_PATH + "/query/?q={soql}";
        HttpEntity requestEntity = getRequestEntity(cred.getValue());
        int offset = null != cursorKey ? Integer.parseInt(cursorKey.toString()) : 0;
        String soql = String.format("SELECT %s FROM Account ORDER BY Name LIMIT %d", FIELDS, pageSize);
        if (0 < offset) {
            soql = String.format("%s OFFSET %d", soql, offset);
        }
        LOG.debug("SOQL: {}", soql);
        ResponseEntity<JAccountQueryResponse> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, JAccountQueryResponse.class, soql);
        if (HttpStatus.OK.equals(response.getStatusCode())) {
            final CursorPage<DmAccount, String> page = new CursorPage<DmAccount, String>();
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
    public CursorPage<DmAccount, String> searchAccounts(String text, int pageSize, Serializable cursorKey) {
        final Entry<String, String> cred = parseToken(TOKEN.get());
        int offset = null != cursorKey ? Integer.parseInt(cursorKey.toString()) : 0;
        final String url = cred.getKey() + BASE_PATH + "/search/?q={sosl}";
        HttpEntity requestEntity = getRequestEntity(cred.getValue());
        String sosl = String.format("FIND {%s} IN NAME FIELDS RETURNING Account(%s ORDER BY Name) LIMIT %d", text, FIELDS, offset+pageSize+1);
        LOG.debug("SOSL: {}", sosl);
        ResponseEntity<JSalesforceAccount[]> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, JSalesforceAccount[].class, sosl);
        if (HttpStatus.OK.equals(response.getStatusCode())) {
            JSalesforceAccount[] all = response.getBody();
            JSalesforceAccount[] items = Arrays.copyOfRange(all, offset, Math.min(all.length, offset + pageSize));
            final CursorPage<DmAccount, String> page = new CursorPage<DmAccount, String>();
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
        return ContactClient.getRequestEntity(accessToken);
    }

    protected static Collection<DmAccount> convert(Iterable<JSalesforceAccount> contacts) {
        final Collection<DmAccount> to = new ArrayList<DmAccount>();
        for (JSalesforceAccount con : contacts) {
            to.add(convert(con));
        }
        return to;
    }

    protected static Collection<DmAccount> convert(JSalesforceAccount[] contacts) {
        final Collection<DmAccount> to = new ArrayList<DmAccount>();
        for (JSalesforceAccount con : contacts) {
            to.add(convert(con));
        }
        return to;
    }

    protected static DmAccount convert(JSalesforceAccount from) {
        final DmAccount to = new DmAccount();
        
        to.setId(from.getId());
        to.setName(from.getName());
        to.setPhone(from.getPhone());
        to.setShippingCity(from.getShippingCity());
        to.setShippingCountry(from.getShippingCountry());
        to.setShippingPostalCode(from.getShippingPostalCode());
        to.setShippingState(from.getShippingState());
        to.setShippingStreet(from.getShippingStreet());
        
        return to;
    }

    @Override
    public void setToken(String token) {
        TOKEN.set(token);
    }

    @Override
    public DmAccount createDomain() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String create(DmAccount domain) {
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
    public Iterable<DmAccount> getByPrimaryKeys(Collection<String> ids) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getSimpleKey(DmAccount domain) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getParentKeyString(DmAccount domain) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getTableName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String update(DmAccount domain) {
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
