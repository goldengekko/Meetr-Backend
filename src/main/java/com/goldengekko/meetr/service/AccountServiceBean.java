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

import com.goldengekko.meetr.domain.DmAccount;
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
