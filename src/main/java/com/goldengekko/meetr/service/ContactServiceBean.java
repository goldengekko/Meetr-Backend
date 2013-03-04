/*
 * INSERT COPYRIGHT HERE
 */

package com.goldengekko.meetr.service;

import com.goldengekko.meetr.domain.DmContact;
import com.wadpam.open.exceptions.RestException;
import com.wadpam.open.mvc.CrudServiceWrapper;
import java.io.IOException;
import java.io.Serializable;
import net.sf.mardao.core.CursorPage;
import org.springframework.http.HttpStatus;

/**
 *
 * @author sosandstrom
 */
public class ContactServiceBean extends CrudServiceWrapper<DmContact, String, DmContact> implements ContactService {
    
    @Override
    public String getContactsToken(String instanceUrl, String accessToken) {
        return ((ContactService) delegate).getContactsToken(instanceUrl, accessToken);
    }

    @Override
    public CursorPage<DmContact, String> searchContacts(String searchText, int pageSize, Serializable cursorKey) {
        return ((ContactService) delegate).searchContacts(searchText, pageSize, cursorKey);
    }
    
    @Override
    public void setContactsToken(String token) {
        ((ContactService) delegate).setContactsToken(token);
    }

}
