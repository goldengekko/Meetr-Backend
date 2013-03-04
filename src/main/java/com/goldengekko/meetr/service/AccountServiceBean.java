/*
 * INSERT COPYRIGHT HERE
 */

package com.goldengekko.meetr.service;

import com.goldengekko.meetr.domain.DmAccount;
import com.goldengekko.meetr.domain.DmContact;
import com.wadpam.open.mvc.CrudServiceWrapper;
import java.io.Serializable;
import net.sf.mardao.core.CursorPage;

/**
 *
 * @author sosandstrom
 */
public class AccountServiceBean extends CrudServiceWrapper<DmAccount, String, DmAccount> implements AccountService {
    
    @Override
    public CursorPage<DmAccount, String> searchAccounts(String searchText, int pageSize, Serializable cursorKey) {
        return ((AccountService) delegate).searchAccounts(searchText, pageSize, cursorKey);
    }
    
    @Override
    public void setToken(String token) {
        ((AccountService) delegate).setToken(token);
    }

}
