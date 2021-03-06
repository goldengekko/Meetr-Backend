/**
 *     Copyright 2012, 2013 Golden Gekko
 *
 *     This file is part of Meetr.
 *
 *     Meetr is free software: you can use it, modify it and / or
 *     redistribute it as is or with your changes under the terms of the
 *     GNU General Public License as published by the Free Software
 *     Foundation, either version 3 of the License, or (at your option)
 *     any later version.
 *
 *     Meetr is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Meetr.  If not, see <http://www.gnu.org/licenses />.
 */
package com.goldengekko.meetr.service.salesforce;

import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import net.sf.mardao.core.CursorPage;

import org.springframework.social.salesforce.api.SalesforceContact;
import org.springframework.social.salesforce.api.impl.SalesforceTemplate;

import com.goldengekko.meetr.domain.DmContact;
import com.goldengekko.meetr.service.ContactService;

/**
 * 
 * @author sosandstrom
 */
public class ContactClient extends SalesforceService implements ContactService {

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
    public CursorPage<DmContact> getPage(int pageSize, final String cursorKey) {
        SalesforceTemplate template = new SalesforceTemplate(TOKEN.get(), INSTANCE_URL.get());
        Iterable<SalesforceContact> response = template.basicOperations().getContacts(pageSize, cursorKey);

        final CursorPage<DmContact> page = new CursorPage<DmContact>();
        ArrayList<DmContact> items = convert(response);
        page.setItems(items);
        
        // Salesforce uses Name as cursorKey
        if (pageSize == items.size()) {
            page.setCursorKey(items.get(pageSize-1).getName());
        }
        
        // populate totalSize for first page
        if (null == cursorKey) {
            int count = template.basicOperations().getContactCount();
            page.setTotalSize(count);
        }

        return page;
    }

    @Override
    public CursorPage<DmContact> searchContacts(String text, int pageSize, Serializable cursorKey) {
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
    public CursorPage<String> whatsChanged(Date since, String createdBy, String updatedBy, 
            int pageSize, String cursorKey) {
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

    @Override
    public List<String> upsert(Iterable<DmContact> domains) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String parentKeyString, Iterable<String> ids) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterable<DmContact> getByPrimaryKeys(Iterable<String> ids) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
