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
package com.goldengekko.meetr.itest;

import com.goldengekko.meetr.json.JMeeting;
import com.wadpam.oauth2.itest.ITestTemplate;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.wadpam.oauth2.json.JConnection;
import com.wadpam.oauth2.service.OAuth2Service;
import com.wadpam.open.domain.DomainHelper;
import com.wadpam.open.json.JCursorPage;
/**
 *
 * @author os
 */
public class AuthITest  {
    public static final int PORT = 9263;
    public static final String BASE_URL = String.format("http://localhost:%d", PORT);
    public static final String API_URL = String.format("%s/api/itest", BASE_URL);

    public final static String TOKEN = "any.random.access.token.for.itest";
    protected static final Logger LOG = LoggerFactory.getLogger(AuthITest.class);
    RestTemplate restTemplate;
    
    public AuthITest() {
        restTemplate = new RestTemplate();
      List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();

      MappingJacksonHttpMessageConverter jacksonHttpMessageConverter = new MappingJacksonHttpMessageConverter();
      ObjectMapper jacksonMapper = new ObjectMapper();
      jacksonMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
      jacksonHttpMessageConverter.setObjectMapper(jacksonMapper);

      messageConverters.add(jacksonHttpMessageConverter);
      messageConverters.addAll(restTemplate.getMessageConverters());

      restTemplate.setMessageConverters(messageConverters);
    }
    
    @Before
    public void setUp() {
        DomainHelper.upsertITestDomain(BASE_URL);
    }
    
    @After
    public void tearDown() {
    }
    
//    @Test
//    public void testAppAccess() {
//        final String API_URL = DomainHelper.getEndpoints(BASE_URL);
//        
//        HttpHeaders headers = new HttpHeaders();
//        HttpEntity requestEntity = new HttpEntity(headers);
//
//        // negative test first:
//        try {
//            ResponseEntity<JEndpoints> endpointsResponse = restTemplate.exchange(API_URL + "/endpoints", 
//                    HttpMethod.GET, requestEntity, JEndpoints.class);
//            fail("Expected exception");
//        }
//        catch (HttpClientErrorException expected) {
//            assertEquals("401 Unauthorized", expected.getMessage());
//        }
//        
//        // then with basic auth:
//        headers.set("Authorization", DomainHelper.J_BASIC_ITEST);
//        requestEntity = new HttpEntity(headers);
//        ResponseEntity<JEndpoints> endpointsResponse = restTemplate.exchange(API_URL + "/endpoints", 
//                HttpMethod.GET, requestEntity, JEndpoints.class);
//        assertEquals(HttpStatus.OK, endpointsResponse.getStatusCode());
//    }
    
    @Test
    public void testNegativeUserAccess() {
//        final String API_URL = DomainHelper.getEndpoints(BASE_URL);
        
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", DomainHelper.J_BASIC_ITEST);
        HttpEntity requestEntity = new HttpEntity(headers);

        // negative test first:
        try {
            ResponseEntity<MeetingPage> noTokenResponse = restTemplate.exchange(API_URL + "/meeting/v10", 
                    HttpMethod.GET, requestEntity, MeetingPage.class);
            fail("Expected exception");
        }
        catch (HttpClientErrorException expected) {
            assertEquals("403 Forbidden", expected.getMessage());
        }
        
        // then with unregistered token:
        try {
            ResponseEntity<MeetingPage> unregisteredResponse = restTemplate.exchange(API_URL + "/meeting/v10?access_token=itest", 
                    HttpMethod.GET, requestEntity, MeetingPage.class);
            fail("Expected exception");
        }
        catch (HttpClientErrorException expected) {
            assertEquals("403 Forbidden", expected.getMessage());
        }
    }
    
    public static HttpHeaders getHttpBasicHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", DomainHelper.J_BASIC_ITEST);
        headers.add("Content-Type", "application/x-www-form-urlencoded");
        return headers;
    }
    
    public static  LinkedMultiValueMap<String,String> getOAuth2Request() {
        
         LinkedMultiValueMap<String,String> request = new LinkedMultiValueMap<String,String>();
        
        request.add("access_token", TOKEN);
        request.add("providerId", OAuth2Service.PROVIDER_ID_ITEST);
        request.add("providerUserId", ITestTemplate.ITEST_PROVIDER_USER_ID);
        request.add("expires_in", "60");
        request.add("appArg0", "appArg0");
        return request;
    }
    public static HttpEntity getFullAccessHttpEntity() {
        HttpHeaders headers = getHttpBasicHeader();
        LinkedMultiValueMap<String,String> body = getOAuth2Request();
        HttpEntity<MultiValueMap> requestEntity = new HttpEntity<MultiValueMap>(body, headers);
        return requestEntity;
    }
    
    // register federated token first
    public static JConnection registerToken(RestTemplate restTemplate){
        
        LinkedMultiValueMap<String,String> request = getOAuth2Request();
        HttpEntity requestEntity = new HttpEntity(request,getHttpBasicHeader());
        
        // register federated token first
//        JConnection fedResponse = restTemplate.postForObject(API_URL + "/federated/v11", 
//                 requestEntity, JConnection.class);
        ResponseEntity<JConnection> fedResponse = restTemplate.exchange(API_URL + "/federated/v11", 
                HttpMethod.POST, requestEntity, JConnection.class);
        
       //assertEquals(HttpStatus.CREATED, fedResponse.getStatusCode());
        assertNotNull("JConnection ", fedResponse.getBody());
        return fedResponse.getBody();
    }

    @Test
    public void testHappyUserAccess() {
        //register token
        JConnection fedResponse = registerToken(restTemplate);

        // get my user profile
        LinkedMultiValueMap<String,String> request = new LinkedMultiValueMap<String,String>();
        HttpEntity requestEntity = new HttpEntity(request,getHttpBasicHeader());

        ResponseEntity<MeetingPage> myResponse = restTemplate.exchange(API_URL + "/meeting/v10?access_token={access_token}", 
                HttpMethod.GET, requestEntity, MeetingPage.class, TOKEN);
        assertEquals(HttpStatus.OK, myResponse.getStatusCode());
        assertNotNull(myResponse.getBody());
    }

    public static class MeetingPage extends JCursorPage<JMeeting> {}
}
