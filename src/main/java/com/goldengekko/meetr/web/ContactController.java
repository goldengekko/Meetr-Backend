/*
 * INSERT COPYRIGHT HERE
 */

package com.goldengekko.meetr.web;

import com.goldengekko.meetr.service.ContactServiceBean;
import com.goldengekko.meetr.domain.DmContact;
import com.goldengekko.meetr.json.JContact;
import com.wadpam.open.json.JCursorPage;
import com.wadpam.open.mvc.CrudController;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import net.sf.mardao.core.CursorPage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author sosandstrom
 */
@Controller
@RequestMapping("{domain}/contact")
public class ContactController extends CrudController<JContact, 
        DmContact, 
        String, 
        ContactServiceBean> {
    
    public static final String AUTH_OAUTH_PREFIX = "OAuth ";
    
    @RequestMapping(value="v10/token", method= RequestMethod.GET, params={"username", "password"})
    @ResponseBody
    public Map<String, String> getContactsToken(@RequestParam("username") String instanceUrl,
            @RequestParam("password") String accessToken) {
        final String token = service.getContactsToken(instanceUrl, accessToken);
        final HashMap<String, String> body = new HashMap<String, String>();
        body.put("token", token);
        return body;
    }
    
    @ModelAttribute(value="token")
    public String populateToken(
            @RequestParam(value="token", required=false) String token,
            @RequestHeader(value="Authorization", required=false) String authorization) {
        
        // if present on the request, set the ThreadLocal in the service:
        if (null != token) {
            service.setContactsToken(token);
        }
        else if (null != authorization && authorization.startsWith(AUTH_OAUTH_PREFIX)) {
            token = authorization.substring(AUTH_OAUTH_PREFIX.length());
            service.setContactsToken(token);
        }
        return token;
    }

    @RequestMapping(value="v10", method= RequestMethod.GET, params={"searchText"})
    @ResponseBody
    public JCursorPage<JContact> search(@RequestParam String searchText,
            @RequestParam(defaultValue="10") int pageSize, 
            @RequestParam(required=false) Serializable cursorKey) {
        
        final CursorPage<DmContact, String> page = service.searchContacts(searchText, pageSize, cursorKey);
        final JCursorPage body = convertPage(page);

        return body;
    }

    // ----------------- Converter and setters ---------------------------------
    
    
    public ContactController() {
        super(JContact.class);
    }
    

    @Override
    public void convertDomain(DmContact from, JContact to) {
        to.setCreatedBy(from.getCreatedBy());
        to.setCreatedDate(toLong(from.getCreatedDate()));
        to.setUpdatedBy(from.getUpdatedBy());
        to.setUpdatedDate(toLong(from.getUpdatedDate()));
        to.setId(from.getId());

        to.setFirstName(from.getFirstName());
        to.setLastName(from.getLastName());
        to.setEmail(from.getEmail());
        to.setPhoneNumber(from.getPhoneNumber());
    }

    @Override
    public void convertJson(JContact from, DmContact to) {
        to.setCreatedBy(from.getCreatedBy());
        to.setCreatedDate(toDate(from.getCreatedDate()));
        to.setUpdatedBy(from.getUpdatedBy());
        to.setUpdatedDate(toDate(from.getUpdatedDate()));
        to.setId(from.getId());

        to.setFirstName(from.getFirstName());
        to.setLastName(from.getLastName());
        to.setEmail(from.getEmail());
        to.setPhoneNumber(from.getPhoneNumber());
    }
    
    public void setContactService(ContactServiceBean contactService) {
        this.service = contactService;
    }
}
