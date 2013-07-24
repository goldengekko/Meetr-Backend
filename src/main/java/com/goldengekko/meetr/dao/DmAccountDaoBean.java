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
package com.goldengekko.meetr.dao;

import com.google.appengine.api.datastore.DeleteContext;
import com.google.appengine.api.datastore.PostDelete;

/**
 * Implementation of Business Methods related to entity DmAccount.
 * This (empty) class is generated by mardao, but edited by developers.
 * It is not overwritten by the generator once it exists.
 *
 * Generated on 2013-06-14T16:24:55.160+0700.
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public class DmAccountDaoBean 
	extends GeneratedDmAccountDaoImpl
		implements DmAccountDao 
{

    /**
     * To enable auditing of DELETEs
     */
    @PostDelete(kinds = {"DmAccount"})
    void postDeleteCallback(DeleteContext context) {
        doDeleteAuditCallback(context);
    }
    
	// TODO: implement your Business Methods here

}
