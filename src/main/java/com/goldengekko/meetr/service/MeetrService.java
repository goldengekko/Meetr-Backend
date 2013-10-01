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

import com.goldengekko.meetr.domain.DmMeeting;
import com.goldengekko.meetr.service.domain.DsTask;
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
import java.util.Date;
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
    
    private CrudService<DmMeeting, Long> meetingService;
    private CrudService<DsTask, String> taskService;

    public void init() throws IOException, ServletException {
        if (SystemProperty.Environment.Value.Development == SystemProperty.environment.value()) {
            populate();
            // TODO Always run?
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

        // TODO Add TMO
        
        final DAppDomain itest = new DAppDomain();
        itest.setId("itest");
        itest.setUsername("itest");
        itest.setPassword("itest");
        itest.setAppArg1("{\"DmAccount\":\"local\",\"DmContact\":\"local\",\"DmMeeting\":\"local\"}");
        domainService.create(itest);
        
        final DAppDomain dev = new DAppDomain();
        dev.setId("dev");
        dev.setUsername("dev");
        dev.setPassword("dev");
        dev.setAppArg1("{\"DmAccount\":\"local\",\"DmContact\":\"local\",\"DmMeeting\":\"local\"}");
        domainService.create(dev);
        
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

        // TODO Need TMO client id and secret
        
        DomainNamespaceFilter.doInNamespace("itest", new Runnable() {
            @Override
            public void run() {
                DmMeeting m = new DmMeeting();
                Date startDate = new Date(1368763200000L);
                m.setStartDate(startDate);
                m.setEndDate(new Date(startDate.getTime() + 3600L*1000L));
                m.setActualStartDate(new Date(startDate.getTime() + 422L*1000L));
                m.setActualEndDate(new Date(startDate.getTime() + 3500L*1000L));
                meetingService.create(m);
            }
        });
        
        DomainNamespaceFilter.doInNamespace("dev", new Runnable() {
            @Override
            public void run() {
                DsTask t = new DsTask();
                t.setDueDate(new Date(1368763200000L));
//                t.setMeetingId("4242");
                t.setTitle("A dev Task");
                taskService.create(t);
            }
        });
    }

    /**
     * Hook for registerFederated() and
     * Hook for getAppDomain, to set MultiplexValue
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
        
        switch (operation) {
            case OAuth2Service.OPERATION_REGISTER_FEDERATED:
                DConnection conn = (DConnection)json;
                UserProfile profile = (UserProfile) serviceResponse;
                String userId = (String)id;

                if (null != conn && OAuth2Service.PROVIDER_ID_SALESFORCE.equals(conn.getProviderId())) {
                    String address = getEmailServiceAddress(conn.getAppArg0(), conn.getAccessToken());
                    conn.setSecret(address);
                }
                break;
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

    public void setMeetingService(CrudService<DmMeeting, Long> meetingService) {
        this.meetingService = meetingService;
    }

    public void setTaskService(CrudService<DsTask, String> taskService) {
        this.taskService = taskService;
    }

}
