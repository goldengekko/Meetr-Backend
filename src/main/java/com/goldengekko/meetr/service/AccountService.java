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
