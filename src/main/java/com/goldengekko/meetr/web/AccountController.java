/*
 * INSERT COPYRIGHT HERE
 */

package com.goldengekko.meetr.web;

import com.goldengekko.meetr.domain.DmAccount;
import com.goldengekko.meetr.json.JAccount;
import com.goldengekko.meetr.service.AccountServiceBean;
import com.wadpam.oauth2.domain.DConnection;
import com.wadpam.open.json.JCursorPage;
import com.wadpam.open.mvc.CrudController;
import com.wadpam.open.security.SecurityInterceptor;
import java.io.Serializable;
import javax.servlet.http.HttpServletRequest;
import net.sf.mardao.core.CursorPage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author sosandstrom
 */
@Controller
@RequestMapping("{domain}/account")
public class AccountController extends CrudController<JAccount, 
        DmAccount, 
        String, 
        AccountServiceBean> {
    
    public static final String AUTH_OAUTH_PREFIX = "OAuth ";
    
    @ModelAttribute(value="token")
    public DConnection populateToken(HttpServletRequest request) {
        
        final DConnection conn = (DConnection) request.getAttribute(SecurityInterceptor.AUTH_PARAM_OAUTH);
        
        // if present on the request, set the ThreadLocal in the service:
        if (null != conn) {
            service.setAccountsToken(conn.getAccessToken());
            service.setAccountsAppArg0(conn.getAppArg0());
        }
        return conn;
    }

    @RequestMapping(value="v10", method= RequestMethod.GET, params={"searchText"})
    @ResponseBody
    public JCursorPage<JAccount> search(@RequestParam String searchText,
            @RequestParam(defaultValue="10") int pageSize, 
            @RequestParam(required=false) Serializable cursorKey) {
        
        final CursorPage<DmAccount, String> page = service.searchAccounts(searchText, pageSize, cursorKey);
        final JCursorPage body = convertPage(page);

        return body;
    }

    // ----------------- Converter and setters ---------------------------------
    
    
    public AccountController() {
        super(JAccount.class);
    }
    

    @Override
    public void convertDomain(DmAccount from, JAccount to) {
        to.setCreatedBy(from.getCreatedBy());
        to.setCreatedDate(toLong(from.getCreatedDate()));
        to.setUpdatedBy(from.getUpdatedBy());
        to.setUpdatedDate(toLong(from.getUpdatedDate()));
        to.setId(from.getId());

        to.setName(from.getName());
        to.setPhone(from.getPhone());
        to.setShippingCity(from.getShippingCity());
        to.setShippingCountry(from.getShippingCountry());
        to.setShippingPostalCode(from.getShippingPostalCode());
        to.setShippingState(from.getShippingState());
        to.setShippingStreet(from.getShippingStreet());
        to.setWwwUrl(from.getWwwUrl());
    }

    @Override
    public void convertJson(JAccount from, DmAccount to) {
        to.setCreatedBy(from.getCreatedBy());
        to.setCreatedDate(toDate(from.getCreatedDate()));
        to.setUpdatedBy(from.getUpdatedBy());
        to.setUpdatedDate(toDate(from.getUpdatedDate()));
        to.setId(from.getId());

        to.setName(from.getName());
        to.setPhone(from.getPhone());
        to.setShippingCity(from.getShippingCity());
        to.setShippingCountry(from.getShippingCountry());
        to.setShippingPostalCode(from.getShippingPostalCode());
        to.setShippingState(from.getShippingState());
        to.setShippingStreet(from.getShippingStreet());
        to.setWwwUrl(from.getWwwUrl());
    }
    
    public void setAccountService(AccountServiceBean accountService) {
        this.service = accountService;
    }
}
