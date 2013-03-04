/*
 * INSERT COPYRIGHT HERE
 */

package com.goldengekko.meetr.service;

import com.google.appengine.api.utils.SystemProperty;
import com.wadpam.oauth2.domain.DFactory;
import com.wadpam.oauth2.service.FactoryService;
import com.wadpam.oauth2.service.OAuth2Service;
import com.wadpam.open.domain.DAppDomain;
import com.wadpam.open.service.DomainService;
import com.wadpam.open.web.DomainNamespaceFilter;
import java.io.IOException;
import javax.servlet.ServletException;

/**
 *
 * @author sosandstrom
 */
public class MeetrService {
    private DomainService domainService;
    private FactoryService factoryService;

    public void init() throws IOException, ServletException {
        if (SystemProperty.Environment.Value.Development == SystemProperty.environment.value()) {
            populate();
        }
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
    
    
}
