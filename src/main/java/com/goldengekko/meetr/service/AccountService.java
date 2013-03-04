/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goldengekko.meetr.service;

import com.goldengekko.meetr.domain.DmAccount;
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
     * Sets the appArg0 for this request / thread (ThreadLocal).
     * @param appArg0 
     */
    void setAccountsAppArg0(String appArg0);
    
    /**
     * Sets the token for this request / thread (ThreadLocal).
     * @param token 
     */
    void setAccountsToken(String token);
}
