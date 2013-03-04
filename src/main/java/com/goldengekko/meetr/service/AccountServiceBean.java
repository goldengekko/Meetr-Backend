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
    public void setAccountsToken(String token) {
        ((AccountService) delegate).setAccountsToken(token);
    }

    @Override
    public void setAccountsAppArg0(String appArg0) {
        ((AccountService) delegate).setAccountsAppArg0(appArg0);
    }

}
