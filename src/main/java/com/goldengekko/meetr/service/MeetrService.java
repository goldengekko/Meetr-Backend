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
package com.goldengekko.meetr.service;

import com.google.appengine.api.utils.SystemProperty;
import com.wadpam.oauth2.domain.DConnection;
import com.wadpam.oauth2.domain.DFactory;
import com.wadpam.oauth2.service.FactoryService;
import com.wadpam.oauth2.service.OAuth2Service;
import com.wadpam.open.domain.DAppDomain;
import com.wadpam.open.mvc.CrudController;
import com.wadpam.open.mvc.CrudListenerAdapter;
import com.wadpam.open.mvc.CrudService;
import com.wadpam.open.service.DomainService;
import com.wadpam.open.web.DomainNamespaceFilter;
import java.io.IOException;
import java.io.Serializable;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.salesforce.api.impl.SalesforceTemplate;

/**
 *
 * @author sosandstrom
 */
public class MeetrService extends CrudListenerAdapter {
    
    static final Logger LOG = LoggerFactory.getLogger(MeetrService.class);
    
    private DomainService domainService;
    private FactoryService factoryService;
    private OAuth2Service oauth2Service;

    public void init() throws IOException, ServletException {
        if (SystemProperty.Environment.Value.Development == SystemProperty.environment.value()) {
            populate();
        }
        oauth2Service.addListener(this);
    }

    protected String getEmailServiceAddress(String instanceUrl, String accessToken) {
        SalesforceTemplate template = new SalesforceTemplate(accessToken, instanceUrl);
        String domain = template.basicOperations().getEmail2SalesforceAddress();
        return domain;
    }
    
    protected void populate() throws IOException, ServletException {
        final DAppDomain dmi = new DAppDomain();
        dmi.setId("dmi");
        dmi.setUsername("dmi");
        dmi.setPassword("dmi");
        domainService.create(dmi);
        
        DomainNamespaceFilter.doInNamespace("dmi", new Runnable() {
            @Override
            public void run() {
                DFactory salesforce = new DFactory();
                salesforce.setId(OAuth2Service.PROVIDER_ID_SALESFORCE);
                salesforce.setClientId("3MVG9Y6d_Btp4xp6Vx7Q48.faY7yxrHscdtZCIFbQaINzMKOCJutdGLe3xjOdvo0SEvGC52GCEWRKAES8nfS4");
                salesforce.setClientSecret("5779430182160054773");
                factoryService.create(salesforce);
            }
        });
    }

    /**
     * Hook for registerFederated()
     * 
     * @param controller
     * @param service
     * @param request
     * @param namespace
     * @param operation
     * @param json the DConnection being returned to the client
     * @param id the userId
     * @param serviceResponse the UserProfile from the federated service
     */
    @Override
    public void postService(CrudController controller, CrudService service, 
            HttpServletRequest request, String namespace, int operation, 
            Object json, Serializable id, Object serviceResponse) {
        
        if (OAuth2Service.OPERATION_REGISTER_FEDERATED == operation) {
            DConnection conn = (DConnection)json;
            UserProfile profile = (UserProfile) serviceResponse;
            String userId = (String)id;
            
            if (null != conn) {
                String address = getEmailServiceAddress(conn.getAppArg0(), conn.getAccessToken());
                conn.setSecret(address);
            }
        }
    }
    
    public DomainService getDomainService() {
        return domainService;
    }

    public void setDomainService(DomainService domainService) {
        this.domainService = domainService;
    }

    public FactoryService getFactoryService() {
        return factoryService;
    }

    public void setFactoryService(FactoryService factoryService) {
        this.factoryService = factoryService;
    }

    public void setOauth2Service(OAuth2Service oauth2Service) {
        this.oauth2Service = oauth2Service;
    }

}
