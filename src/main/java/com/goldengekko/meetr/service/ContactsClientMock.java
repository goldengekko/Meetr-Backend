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
package com.goldengekko.meetr.service;

import com.goldengekko.meetr.domain.DmContact;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import net.sf.mardao.core.CursorPage;

/**
 *
 * @author sosandstrom
 */
public class ContactsClientMock implements ContactService {

    private final TreeMap<String, DmContact> CONTACTS = new TreeMap<String, DmContact>();
    
    public ContactsClientMock() {
        DmContact contact = null;

        int i = 1;
        contact = new DmContact();
        contact.setId(Integer.toString(i++));
        contact.setFirstName("Mathew");
        contact.setLastName("Ranck");
        contact.setCompanyName("Acme");
        contact.setStreet("Street 302, house 19");
        contact.setCity("Ankeborg");
        contact.setCountry("Finland");
        contact.setEmail("mathew.ranck@fake.com");
        contact.setPhone("+8551234567");
        CONTACTS.put(contact.getId(), contact);

        contact = new DmContact();
        contact.setId(Integer.toString(i++));
        contact.setFirstName("Dollie");
        contact.setLastName("Castagna");
        contact.setCompanyName("Silly Place");
        contact.setStreet("Street 302, house 19");
        contact.setCity("Ankeborg");
        contact.setCountry("Finland");
        contact.setEmail("dollie.castagna@fake.com");
        contact.setPhone("+8551234567");
        CONTACTS.put(contact.getId(), contact);

        contact = new DmContact();
        contact.setId(Integer.toString(i++));
        contact.setFirstName("Annabelle");
        contact.setLastName("Tow");
        contact.setCompanyName("Happy Man Bar");
        contact.setStreet("Street 302, house 19");
        contact.setCity("Ankeborg");
        contact.setCountry("Finland");
        contact.setEmail("annabelle.tow@fake.com");
        contact.setPhone("+8551234567");
        CONTACTS.put(contact.getId(), contact);

        contact = new DmContact();
        contact.setId(Integer.toString(i++));
        contact.setFirstName("Louisa");
        contact.setLastName("Northington");
        contact.setCompanyName("A Company");
        contact.setStreet("Street 302, house 19");
        contact.setCity("Ankeborg");
        contact.setCountry("Finland");
        contact.setEmail("louisa.northington@fake.com");
        contact.setPhone("+8551234567");
        CONTACTS.put(contact.getId(), contact);

        contact = new DmContact();
        contact.setId(Integer.toString(i++));
        contact.setFirstName("Allan");
        contact.setLastName("Hosley");
        contact.setCompanyName("B Company");
        contact.setStreet("Street 302, house 19");
        contact.setCity("Ankeborg");
        contact.setCountry("Finland");
        contact.setEmail("allan.hosley@fake.com");
        contact.setPhone("+8551234567");
        CONTACTS.put(contact.getId(), contact);

        contact = new DmContact();
        contact.setId(Integer.toString(i++));
        contact.setFirstName("Allan");
        contact.setLastName("Hosley");
        contact.setCompanyName("A Company");
        contact.setStreet("Street 302, house 19");
        contact.setCity("Ankeborg");
        contact.setCountry("Finland");
        contact.setEmail("allan.hosley@fake.com");
        contact.setPhone("+8551234567");
        CONTACTS.put(contact.getId(), contact);

        contact = new DmContact();
        contact.setId(Integer.toString(i++));
        contact.setFirstName("Carlene");
        contact.setLastName("Bulow");
        contact.setCompanyName("A Company");
        contact.setStreet("Street 302, house 19");
        contact.setCity("Ankeborg");
        contact.setCountry("Finland");
        contact.setEmail("carlene.bulow@fake.com");
        contact.setPhone("+8551234567");
        CONTACTS.put(contact.getId(), contact);

        contact = new DmContact();
        contact.setId(Integer.toString(i++));
        contact.setFirstName("Dona");
        contact.setLastName("Montagna");
        contact.setCompanyName("C Company");
        contact.setStreet("Street 302, house 19");
        contact.setCity("Ankeborg");
        contact.setCountry("Finland");
        contact.setEmail("dona.montagna@fake.com");
        contact.setPhone("+8551234567");
        CONTACTS.put(contact.getId(), contact);

        contact = new DmContact();
        contact.setId(Integer.toString(i++));
        contact.setFirstName("Karina");
        contact.setLastName("Vannest");
        contact.setCompanyName("D Company");
        contact.setStreet("Street 302, house 19");
        contact.setCity("Ankeborg");
        contact.setCountry("Finland");
        contact.setEmail("karina.vannest@fake.com");
        contact.setPhone("+8551234567");
        CONTACTS.put(contact.getId(), contact);

        contact = new DmContact();
        contact.setId(Integer.toString(i++));
        contact.setFirstName("Darryl");
        contact.setLastName("Clutter");
        contact.setCompanyName("E Company");
        contact.setStreet("Street 302, house 19");
        contact.setCity("Ankeborg");
        contact.setCountry("Finland");
        contact.setEmail("darryl.clutter@fake.com");
        contact.setPhone("+8551234567");
        CONTACTS.put(contact.getId(), contact);

        contact = new DmContact();
        contact.setId(Integer.toString(i++));
        contact.setFirstName("Darryl");
        contact.setLastName("Eastham");
        contact.setCompanyName("E Company");
        contact.setStreet("Street 302, house 19");
        contact.setCity("Ankeborg");
        contact.setCountry("Finland");
        contact.setEmail("darryl.eastham@fake.com");
        contact.setPhone("+8551234567");
        CONTACTS.put(contact.getId(), contact);
    }
    
    @Override
    public DmContact get(String parentKeyString, String id) {
        return CONTACTS.get(id);
    }
    
    @Override
    public CursorPage<DmContact> getPage(int pageSize, String cursorKey) {
        CursorPage<DmContact> page = new CursorPage<DmContact>();
        page.setRequestedPageSize(pageSize);
        int offset = null != cursorKey ? Math.min(Integer.parseInt(cursorKey.toString()), CONTACTS.size()) : 0;
        int size = Math.min(pageSize, CONTACTS.size()-offset);

        if (0 < size) {
            DmContact[] all = CONTACTS.values().toArray(new DmContact[CONTACTS.size()]);
            DmContact[] selected = Arrays.copyOfRange(all, offset, offset + size);
            page.setItems(Arrays.asList(selected));
            if (offset + size < CONTACTS.size()) {
                page.setCursorKey(Integer.toString(CONTACTS.size() - (offset+size)));
            }
        }
        else {
            page.setItems(Collections.EMPTY_LIST);
        }

        return page;
    }

    @Override
    public CursorPage<DmContact> searchContacts(String text, int pageSize, Serializable cursorKey) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public DmContact createDomain() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String create(DmContact domain) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String parentKeyString, String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String parentKeyString, Iterable<String> ids) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exportCsv(OutputStream out, Long startDate, Long endDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterable<DmContact> getByPrimaryKeys(Iterable<String> ids) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getSimpleKey(DmContact domain) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getParentKeyString(DmContact domain) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPrimaryKeyColumnName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Class getPrimaryKeyColumnClass() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTableName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Map<String, Class> getTypeMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String update(DmContact domain) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<String> upsert(Iterable<DmContact> domains) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CursorPage<String> whatsChanged(Date since, int pageSize, String cursorKey) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
