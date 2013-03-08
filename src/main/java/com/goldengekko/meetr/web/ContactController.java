/*
 * INSERT COPYRIGHT HERE
 */

package com.goldengekko.meetr.web;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

import net.sf.mardao.core.CursorPage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goldengekko.meetr.domain.DmContact;
import com.goldengekko.meetr.json.JContact;
import com.goldengekko.meetr.service.ContactServiceBean;
import com.wadpam.oauth2.domain.DConnection;
import com.wadpam.open.json.JCursorPage;
import com.wadpam.open.mvc.CrudController;
import com.wadpam.open.security.SecurityInterceptor;

/**
 * 
 * @author sosandstrom
 */
@Controller
@RequestMapping("{domain}/contact")
public class ContactController extends CrudController<JContact, DmContact, String, ContactServiceBean> {

    @ModelAttribute(value = "token")
    public DConnection populateToken(HttpServletRequest request) {

        final DConnection conn = (DConnection) request.getAttribute(SecurityInterceptor.AUTH_PARAM_OAUTH);

        // if present on the request, set the ThreadLocal in the service:
        if (null != conn) {
            service.setContactsToken(conn.getAccessToken());
            service.setContactsAppArg0(conn.getAppArg0());
        }
        return conn;
    }

    @RequestMapping(value = "v10", method = RequestMethod.GET, params = {"searchText"})
    @ResponseBody
    public JCursorPage<JContact> search(@RequestParam String searchText, @RequestParam(defaultValue = "10") int pageSize,
            @RequestParam(required = false) Serializable cursorKey) {

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
        to.setMobilePhone(from.getMobilePhone());

        // convert Address
        to.setStreet(from.getStreet());
        to.setCityArea(from.getCityArea());
        to.setCity(from.getCity());
        to.setCounty(from.getCounty());
        to.setPostalCode(from.getPostalCode());
        to.setCountry(from.getCountry());
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
        to.setMobilePhone(from.getMobilePhone());

        // convert Address
        to.setStreet(from.getStreet());
        to.setCityArea(from.getCityArea());
        to.setCity(from.getCity());
        to.setCounty(from.getCounty());
        to.setPostalCode(from.getPostalCode());
        to.setCountry(from.getCountry());
    }

    public void setContactService(ContactServiceBean contactService) {
        this.service = contactService;
    }
}
