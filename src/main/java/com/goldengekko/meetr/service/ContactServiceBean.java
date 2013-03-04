/*
 * INSERT COPYRIGHT HERE
 */

package com.goldengekko.meetr.service;

import com.goldengekko.meetr.domain.DmContact;
import com.wadpam.open.mvc.CrudServiceWrapper;
import java.io.Serializable;
import net.sf.mardao.core.CursorPage;

/**
 *
 * @author sosandstrom
 */
public class ContactServiceBean extends CrudServiceWrapper<DmContact, String, DmContact> implements ContactService {
    
    @Override
    public CursorPage<DmContact, String> searchContacts(String searchText, int pageSize, Serializable cursorKey) {
        return ((ContactService) delegate).searchContacts(searchText, pageSize, cursorKey);
    }
    
    @Override
    public void setContactsToken(String token) {
        ((ContactService) delegate).setContactsToken(token);
    }

    @Override
    public void setContactsAppArg0(String appArg0) {
        ((ContactService) delegate).setContactsAppArg0(appArg0);
    }

}
