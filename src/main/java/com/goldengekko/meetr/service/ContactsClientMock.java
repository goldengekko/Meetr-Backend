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
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.TreeMap;
import net.sf.mardao.core.CursorPage;
import org.apache.commons.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;

/**
 *
 * @author sosandstrom
 */
public class ContactsClientMock implements ContactsClient {

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
    
    public static String createToken(String username, String password) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baos);
        dos.writeUTF(username);
        dos.writeUTF(password);
        return Base64.encodeBase64URLSafeString(baos.toByteArray());
    }
    
    public static Entry<String, String> parseToken(String token) throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(Base64.decodeBase64(token));
        DataInputStream dis = new DataInputStream(bais);
        String instanceUrl = dis.readUTF();
        String accessToken = dis.readUTF();
        Entry<String, String> entry = new AbstractMap.SimpleImmutableEntry<String, String>(instanceUrl, accessToken);
        return entry;
    }

    @Override
    public String getToken(String instanceUrl, String accessToken) throws IOException {
        return createToken(instanceUrl, accessToken);
    }

    @Override
    public DmContact getContact(String id, String token) throws IOException {
        return CONTACTS.get(id);
    }
    
    @Override
    public CursorPage<DmContact, String> getContacts(int pageSize, Serializable cursorKey, String token) throws IOException {
        CursorPage<DmContact, String> page = new CursorPage<DmContact, String>();
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
    public CursorPage<DmContact, String> searchContacts(String text, int pageSize, Serializable cursorKey, String token) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    protected static HttpEntity getRequestEntity(String accessToken) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", String.format("OAuth %s", accessToken));
        final HttpEntity requestEntity = new HttpEntity(headers);
        return requestEntity;
    }

}
