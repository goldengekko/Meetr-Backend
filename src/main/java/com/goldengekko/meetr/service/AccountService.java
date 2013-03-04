/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goldengekko.meetr.service;

import com.goldengekko.meetr.domain.DmAccount;
import com.goldengekko.meetr.domain.DmContact;
import com.wadpam.open.mvc.CrudService;
import java.io.Serializable;
import net.sf.mardao.core.CursorPage;

/**
 *
 * @author os
 */
public interface AccountService extends CrudService<DmAccount, String> {
    
    CursorPage<DmAccount, String> searchAccounts(String searchText, int pageSize, Serializable cursorKey);
    
    /**
     * Sets the token for this request / thread (ThreadLocal).
     * @param token 
     */
    void setToken(String token);
}
