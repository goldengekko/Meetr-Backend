/**
 *     Copyright 2012, 2013 Golden Gekko
 *
 *     This file is part of Meetr.
 *
 *     Meetr is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
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
import java.io.IOException;
import net.sf.mardao.core.CursorPage;

import java.io.Serializable;

/**
 * Interface that that all services providing contact must implement
 */
public interface ContactsClient {

    /** Create a token */
    String getToken(String user, String password) throws IOException;

    /** Get all contacts using pagination */
    CursorPage<DmContact, String> getContacts(int pageSize, Serializable cursorKey, String token) throws IOException;

    /** Search for matching contacts, auto-completion */
    CursorPage<DmContact, String> searchContacts(String text, int pageSize, Serializable cursorKey, String token) throws IOException;

    DmContact getContact(String id, String token) throws IOException;
}
