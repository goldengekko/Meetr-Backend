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
