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

import com.goldengekko.meetr.domain.DmAccount;
import com.goldengekko.meetr.service.AccountService;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import net.sf.mardao.core.CursorPage;
import org.springframework.social.salesforce.api.SalesforceAccount;
import org.springframework.social.salesforce.api.impl.SalesforceTemplate;

/**
 *
 * @author sosandstrom
 */
public class AccountClient extends SalesforceService implements AccountService {
    
    @Override
    public DmAccount get(String parentKeyString, String id) {
        throw new UnsupportedOperationException("Not supported yet.");
//        final Entry<String, String> cred = parseToken(TOKEN.get());
//        final String url = cred.getKey() + BASE_PATH + "/sobjects/Account/" + id;
//        HttpEntity requestEntity = getRequestEntity(cred.getValue());
//        ResponseEntity<JSalesforceAccount> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, JSalesforceAccount.class);
//        return convert(response.getBody());
    }
    
    @Override
    public CursorPage<DmAccount, String> getPage(int pageSize, final String cursorKey) {
        SalesforceTemplate template = new SalesforceTemplate(TOKEN.get(), INSTANCE_URL.get());
        Iterable<SalesforceAccount> response = template.basicOperations().getAccounts(pageSize, cursorKey);
        
        final CursorPage<DmAccount, String> page = new CursorPage<DmAccount, String>();
        ArrayList<DmAccount> items = convert(response);
        page.setItems(items);
        
        // salesforce uses Name as cursorKey
        if (pageSize == items.size()) {
            page.setCursorKey(items.get(pageSize-1).getName());
        }
        
        // populate totalSize for first page
        if (null == cursorKey) {
            int count = template.basicOperations().getAccountCount();
            page.setTotalSize(count);
        }
        
        return page;
    }

    @Override
    public CursorPage<DmAccount, String> searchAccounts(String text, int pageSize, Serializable cursorKey) {
        throw new UnsupportedOperationException("Not supported yet.");
//        final Entry<String, String> cred = parseToken(TOKEN.get());
//        int offset = null != cursorKey ? Integer.parseInt(cursorKey.toString()) : 0;
//        final String url = cred.getKey() + BASE_PATH + "/search/?q={sosl}";
//        HttpEntity requestEntity = getRequestEntity(cred.getValue());
//        String sosl = String.format("FIND {%s} IN NAME FIELDS RETURNING Account(%s ORDER BY Name) LIMIT %d", text, FIELDS, offset+pageSize+1);
//        LOG.debug("SOSL: {}", sosl);
//        ResponseEntity<JSalesforceAccount[]> response = restTemplate.exchange(url, HttpMethod.GET, requestEntity, JSalesforceAccount[].class, sosl);
//        if (HttpStatus.OK.equals(response.getStatusCode())) {
//            JSalesforceAccount[] all = response.getBody();
//            JSalesforceAccount[] items = Arrays.copyOfRange(all, offset, Math.min(all.length, offset + pageSize));
//            final CursorPage<DmAccount, String> page = new CursorPage<DmAccount, String>();
//            page.setRequestedPageSize(pageSize);
//            page.setItems(convert(items));
//            if (offset + pageSize < all.length) {
//                page.setCursorKey(Integer.toString(offset+pageSize));
//            }
//            return page;
//        }
//        throw new RestException(93, response.getStatusCode(), sosl);
    }
    
    protected static ArrayList<DmAccount> convert(Iterable<SalesforceAccount> from) {
        final ArrayList<DmAccount> to = new ArrayList<DmAccount>();
        for (SalesforceAccount sf : from) {
            to.add(convert(sf));
        }
        return to;
    }

    protected static ArrayList<DmAccount> convert(SalesforceAccount[] from) {
        final ArrayList<DmAccount> to = new ArrayList<DmAccount>();
        for (SalesforceAccount st : from) {
            to.add(convert(st));
        }
        return to;
    }

    protected static DmAccount convert(SalesforceAccount from) {
        final DmAccount to = new DmAccount();
        
        to.setId(from.getId());
        to.setName(from.getName());
        to.setPhone(from.getPhone());
        
        to.setBillingCity(from.getBillingCity());
        to.setBillingCountry(from.getBillingCountry());
        to.setBillingPostalCode(from.getBillingPostalCode());
        to.setBillingState(from.getBillingState());
        to.setBillingStreet(from.getBillingStreet());
        
        to.setShippingCity(from.getShippingCity());
        to.setShippingCountry(from.getShippingCountry());
        to.setShippingPostalCode(from.getShippingPostalCode());
        to.setShippingState(from.getShippingState());
        to.setShippingStreet(from.getShippingStreet());
        
        return to;
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

    @Override
    public List<String> upsert(Iterable<DmAccount> domains) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String parentKeyString, Iterable<String> ids) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterable<DmAccount> getByPrimaryKeys(Iterable<String> ids) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
