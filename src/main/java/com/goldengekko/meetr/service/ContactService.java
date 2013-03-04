/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goldengekko.meetr.service;

import com.goldengekko.meetr.domain.DmContact;
import com.wadpam.open.mvc.CrudService;
import java.io.Serializable;
import net.sf.mardao.core.CursorPage;

/**
 *
 * @author os
 */
public interface ContactService extends CrudService<DmContact, String> {
    
    CursorPage<DmContact, String> searchContacts(String searchText, int pageSize, Serializable cursorKey);
    
    /**
     * Sets the token for this request / thread (ThreadLocal).
     * @param token 
     */
    void setContactsToken(String token);
    
    /**
     * Sets the appArg0 for this request / thread (ThreadLocal).
     * @param appArg0 
     */
    void setContactsAppArg0(String appArg0);
}
