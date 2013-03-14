/*
 * INSERT COPYRIGHT HERE
 */

package com.goldengekko.meetr.service.salesforce;

import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

import net.sf.mardao.core.CursorPage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.social.salesforce.api.SalesforceContact;
import org.springframework.social.salesforce.api.impl.SalesforceTemplate;

import com.goldengekko.meetr.domain.DmContact;
import com.goldengekko.meetr.service.ContactService;

/**
 * 
 * @author sosandstrom
 */
public class ContactClient implements ContactService {

    static final Logger                      LOG          = LoggerFactory.getLogger(ContactClient.class);

    private static final ThreadLocal<String> TOKEN        = new ThreadLocal<String>();
    private static final ThreadLocal<String> INSTANCE_URL = new ThreadLocal<String>();

    @Override
    public DmContact get(String parentKeyString, String id) {
        throw new UnsupportedOperationException("Not supported yet.");
        // final Entry<String, String> cred = parseToken(TOKEN.get());
        // final String url = cred.getKey() + BASE_PATH + "/sobjects/Contact/" + id;
        // HttpEntity requestEntity = getRequestEntity(cred.getValue());
        // ResponseEntity<JSalesforceContact> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity,
        // JSalesforceContact.class);
        // return convert(response.getBody());
    }

    @Override
    public CursorPage<DmContact, String> getPage(int pageSize, String cursorKey) {
        SalesforceTemplate template = new SalesforceTemplate(TOKEN.get(), INSTANCE_URL.get());
        Iterable<SalesforceContact> response = template.basicOperations().getContacts(pageSize, cursorKey);

        final CursorPage<DmContact, String> page = new CursorPage<DmContact, String>();
        page.setRequestedPageSize(pageSize);
        ArrayList<DmContact> items = convert(response);
        page.setItems(items);
        if (pageSize == items.size()) {
            page.setCursorKey(items.get(pageSize-1).getName());
        }

        return page;
    }

    @Override
    public CursorPage<DmContact, String> searchContacts(String text, int pageSize, Serializable cursorKey) {
        throw new UnsupportedOperationException("Not supported yet.");
        // final Entry<String, String> cred = parseToken(TOKEN.get());
        // int offset = null != cursorKey ? Integer.parseInt(cursorKey.toString()) : 0;
        // final String url = cred.getKey() + BASE_PATH + "/search/?q={sosl}";
        // HttpEntity requestEntity = getRequestEntity(cred.getValue());
        // String sosl = String.format("FIND {%s} IN NAME FIELDS RETURNING Contact(%s ORDER BY Name) LIMIT %d", text, FIELDS,
        // offset+pageSize+1);
        // LOG.debug("SOSL: {}", sosl);
        // ResponseEntity<JSalesforceContact[]> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity,
        // JSalesforceContact[].class, sosl);
        // if (HttpStatus.OK.equals(response.getStatusCode())) {
        // JSalesforceContact[] all = response.getBody();
        // JSalesforceContact[] items = Arrays.copyOfRange(all, offset, Math.min(all.length, offset + pageSize));
        // final CursorPage<DmContact, String> page = new CursorPage<DmContact, String>();
        // page.setRequestedPageSize(pageSize);
        // page.setItems(convert(items));
        // if (offset + pageSize < all.length) {
        // page.setCursorKey(Integer.toString(offset+pageSize));
        // }
        // return page;
        // }
        // throw new RestException(93, response.getStatusCode(), sosl);
    }

    protected static HttpEntity getRequestEntity(String accessToken) {
        HttpHeaders headers = new HttpHeaders();
        final String auth = String.format("OAuth %s", accessToken);
        headers.add("Authorization", auth);
        LOG.info("Salesforce Authorization: {}", auth);
        final HttpEntity requestEntity = new HttpEntity(headers);
        return requestEntity;
    }

    protected static ArrayList<DmContact> convert(Iterable<SalesforceContact> contacts) {
        final ArrayList<DmContact> to = new ArrayList<DmContact>();
        for (SalesforceContact con : contacts) {
            to.add(convert(con));
        }
        return to;
    }

    protected static Collection<DmContact> convert(SalesforceContact[] contacts) {
        final Collection<DmContact> to = new ArrayList<DmContact>();
        for(SalesforceContact con : contacts) {
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
        to.setName(null != from.getName() ? from.getName() : String.format("%s, %s", from.getLastName(), from.getFirstName()));
        to.setPhone(from.getPhone());
        to.setMobilePhone(from.getMobilePhone());

        // convert Address
        to.setStreet(from.getMailingStreet());
        to.setCity(from.getMailingCity());
        to.setCounty(from.getMailingState());
        to.setPostalCode(from.getMailingPostalCode());
        to.setCountry(from.getMailingCountry());

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
