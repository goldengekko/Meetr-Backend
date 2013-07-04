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
package com.goldengekko.meetr.web;

import com.goldengekko.meetr.domain.DmAccount;
import com.goldengekko.meetr.json.JAccount;
import com.goldengekko.meetr.service.salesforce.SalesforceService;
import com.wadpam.oauth2.domain.DConnection;
import com.wadpam.open.mvc.CrudController;
import com.wadpam.open.mvc.CrudService;
import com.wadpam.open.security.SecurityInterceptor;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author sosandstrom
 */
@Controller
@RequestMapping("{domain}/account")
public class AccountController extends CrudController<JAccount, 
        DmAccount, 
        String, 
        CrudService<DmAccount,String>> {
    
    public static final String AUTH_OAUTH_PREFIX = "OAuth ";
    
    private SalesforceService salesforceService;
    
    @ModelAttribute(value="token")
    public DConnection populateToken(HttpServletRequest request) {
        
        final DConnection conn = (DConnection) request.getAttribute(SecurityInterceptor.AUTH_PARAM_OAUTH);
        
        // if present on the request, set the ThreadLocal in the service:
        if (null != conn) {
            salesforceService.setToken(conn.getAccessToken());
            salesforceService.setAppArg0(conn.getAppArg0());
        }
        return conn;
    }

//    @RequestMapping(value="v10", method= RequestMethod.GET, params={"searchText"})
//    @ResponseBody
//    public JCursorPage<JAccount> search(@RequestParam String searchText,
//            @RequestParam(defaultValue="10") int pageSize, 
//            @RequestParam(required=false) Serializable cursorKey) {
//        
//        final CursorPage<DmAccount, String> page = service.searchAccounts(searchText, pageSize, cursorKey);
//        final JCursorPage body = convertPage(page);
//
//        return body;
//    }

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

        to.setBillingCity(from.getBillingCity());
        to.setBillingCountry(from.getBillingCountry());
        to.setBillingPostalCode(from.getBillingPostalCode());
        to.setBillingState(from.getBillingState());
        to.setBillingStreet(from.getBillingStreet());
        
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

        to.setBillingCity(from.getBillingCity());
        to.setBillingCountry(from.getBillingCountry());
        to.setBillingPostalCode(from.getBillingPostalCode());
        to.setBillingState(from.getBillingState());
        to.setBillingStreet(from.getBillingStreet());
        
        to.setShippingCity(from.getShippingCity());
        to.setShippingCountry(from.getShippingCountry());
        to.setShippingPostalCode(from.getShippingPostalCode());
        to.setShippingState(from.getShippingState());
        to.setShippingStreet(from.getShippingStreet());
        to.setWwwUrl(from.getWwwUrl());
    }

    public void setSalesforceService(SalesforceService salesforceService) {
        this.salesforceService = salesforceService;
    }
    
}
