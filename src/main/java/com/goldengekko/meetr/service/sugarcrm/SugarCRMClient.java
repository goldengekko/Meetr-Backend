/**
 *     Copyright 2012, 2013 Golden Gekko
 *
 *     This file is part of Meetr.
 *
 *     Meetr is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Meetr is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Meetr.  If not, see <http://www.gnu.org/licenses />.
 */
package com.goldengekko.meetr.service.sugarcrm;

import com.goldengekko.meetr.domain.DmContact;
import com.goldengekko.meetr.service.ContactsClient;
import com.wadpam.open.exceptions.BadRequestException;
import com.wadpam.open.exceptions.RestException;
import net.sf.mardao.core.CursorPage;
import org.apache.commons.codec.binary.Hex;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.ResponseExtractor;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Implements communication with a SugarCRM instance.
 * @author mlv
 */


// For SugarCRM we will try and use the same user for all requests regardless of the app user
// We will get the user and password from the Spring Context and store the token as an instance
// variable.

// For SugarCRM it looks like the token is always the same for the same user. But the token seem
// to expire after some time (a couple or hours) and you need to generate a new token.
// The new token will be the same as before (guess the SugareCRM keeps a timestamp when the token was
// generated and yells if it was too long ago)

// Apps should always ask for a new token when they are started and the MW will request a token
// from SugarCRM (even if one exists). This way there is bigger chance that the token will not expire.

// Is the token expire during a get contacts request, the MW will silently requests a new token and
// redo the get contacts request (will request will take longer timer).

// Format of the request
// http://sugarcrm.goldengekko.com/service/v4/rest.php?
// method=login&
// input_type=json&
// response_type=json&rest_data={"user_auth":{"user_name":"admin","password":"36491b3476d3ed80d5a5ae6f4975579e","version":"1.0"},"application_name":"RestTest"}
// NOTE! The response_type parameter must be URL encoded
// NOTE! The parameters seem to be position dependent and MUST follow a specific order
// A PHP example can be found here http://support.sugarcrm.com/04_Find_Answers/03_Developers/100Web_Services/100REST_API/100Examples/100PHP/Retrieving_a_List_of_Records_With_Related_Info_-_REST_and_PHP

public class SugarCRMClient implements ContactsClient {

    static final Logger LOG = LoggerFactory.getLogger(SugarCRMClient.class);

    static final int ERR_MISSING_USER_PASSWORD = 500 + 1;
    static final int ERR_SUGAR_NOT_AVAILABLE = 500 + 2;
    static final int ERR_SUGAR_LOGIN_FAILED = 500 + 3;
    static final int ERR_SUGAR_GET_CONTACTS_FAILED = 500 + 4;
    static final int ERR_SUGAR_INVALID_TOKEN = 500 + 5;

    private String user;
    private String password;
    private String sugarCRMUrl;

    private String token;

    private final RestTemplate TEMPLATE;
    private final ObjectMapper MAPPER;


    static private final String PARAM_TEMPLATE = "?method={method}&input_type={input_type}&response_type={response_type}&rest_data={rest_data}";


    public SugarCRMClient() {
        this.TEMPLATE = new RestTemplate();

        MAPPER = new ObjectMapper();
        MAPPER.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    @Override
    public String getToken(String user, String password) {
        LOG.debug("Get SugarCRM token");


        if (null == user || null == password || user.isEmpty() || password.isEmpty()) {
            LOG.info("User and password must be provided when creating token");
            throw new BadRequestException(ERR_MISSING_USER_PASSWORD, "User and password must be provided when creating token");
        }

        String data = String.format("{\"user_auth\":{\"user_name\":\"%s\",\"password\":\"%s\",\"version\":\"%s\"},\"application_name\":\"%s\"}",
                this.user, md5Hash(this.password), "1.0", "Meeter");
        //LOG.debug("Send login with data:{}", data);

        this.token = TEMPLATE.execute(this.sugarCRMUrl + PARAM_TEMPLATE,
                    HttpMethod.GET,
                    new RequestCallback() {
                        @Override
                        public void doWithRequest(ClientHttpRequest clientHttpRequest) throws IOException {
                            LOG.debug("Sending login request with url:{}", clientHttpRequest.getURI().toURL().toExternalForm());
                        }
                    },
                    new ResponseExtractor<String>() {
                        @Override
                        public String extractData(ClientHttpResponse clientHttpResponse) throws IOException {
                            LOG.debug("Response with http code:{}", clientHttpResponse.getStatusCode().value());

                            if (clientHttpResponse.getStatusCode() == HttpStatus.OK) {
                                SugarCRMLoginResponse response = MAPPER.readValue(clientHttpResponse.getBody(), SugarCRMLoginResponse.class);
                                LOG.debug("Response:{}", response);
                                if (!response.hasError()) {
                                    return response.getId();
                                } else if (response.isInvalidCredentials()) {
                                    LOG.info("SugarCRM login failed with invalid credentials", new StringHttpMessageConverter().read(String.class, clientHttpResponse));
                                    throw new RestException(ERR_SUGAR_LOGIN_FAILED, HttpStatus.FORBIDDEN, "SugarCRM login failed with invalid credentials");
                                } else {
                                    LOG.info("SugarCRM login failed with unknown reason:{}", new StringHttpMessageConverter().read(String.class, clientHttpResponse));
                                    throw new RestException(ERR_SUGAR_LOGIN_FAILED, HttpStatus.FORBIDDEN, "SugarCRM login failed with unknown reason");
                                }
                            } else {
                                // If the SugarCRM does not respond with 200 throw http 503
                                LOG.warn("SugarCRM is responding with http code:{}", clientHttpResponse.getStatusCode().value());
                                throw new RestException(ERR_SUGAR_NOT_AVAILABLE, HttpStatus.SERVICE_UNAVAILABLE, "SugarCRM request failed");
                            }
                        }
                    },
                    "login", "json", "json", data);

        LOG.debug("Got token:{}", this.token);

        return this.token;
    }


    // md5 hash
    private String md5Hash(String string) {

        byte[] bytesOfMessage = new byte[0];
        try {
            bytesOfMessage = string.getBytes("UTF-8");
        } catch (UnsupportedEncodingException willNeverHappen) {
        }

        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException willNeverHappen) {
        }

        byte[] digest = md.digest(bytesOfMessage);
        return Hex.encodeHexString(digest);
    }

    @Override
    public DmContact getContact(String id, String token) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public CursorPage<DmContact, String> getContacts(int pageSize, Serializable cursorKey, String token) {
        LOG.debug("SugarCRM client, get contacts. Token:{}", token);

        // Check that we have a token
        if (null == this.token || null == token) {
            throw new RestException(ERR_SUGAR_INVALID_TOKEN, HttpStatus.FORBIDDEN, "Token missing, app must generate token first");
        }

        // If the cursor is null start from the beginning
        if (null == cursorKey) {
            cursorKey = "0";
        }

        // The request
        // {"session":"f9psqc1rgd2iuri76u3v17aul1","module_name":"Contacts","query":"","order_by":"","offset":1,"select_fields":["id","name"],"link_name_to_fields_array":[],"max_results":2,"deleted":0,"Favorites":0}
        String data = String.format("{\"session\":\"%s\",\"module_name\":\"Contacts\",\"query\":\"\",\"order_by\":\"\",\"offset\":%s,\"select_fields\":[\"id\",\"first_name\",\"last_name\",\"email\",\"phone_work\",\"primary_address_street\",\"primary_address_city\",\"primary_address_country\",\"primary_address_postalcode\"],\"link_name_to_fields_array\":[],\"max_results\":%s,\"deleted\":0,\"Favorites\":0}",
                this.token, cursorKey.toString(), pageSize);
        LOG.debug("get contacts with data:{}", data);

        SugarCRMContactsResponse contacts = TEMPLATE.execute(this.sugarCRMUrl + PARAM_TEMPLATE,
                HttpMethod.GET,
                new RequestCallback() {
                    @Override
                    public void doWithRequest(ClientHttpRequest clientHttpRequest) throws IOException {
                        LOG.debug("Sending get contact request with url:{}", clientHttpRequest.getURI().toURL().toExternalForm());
                    }
                },
                new ResponseExtractor<SugarCRMContactsResponse>() {
                    @Override
                    public SugarCRMContactsResponse extractData(ClientHttpResponse clientHttpResponse) throws IOException {
                        LOG.debug("Response with http code:{}", clientHttpResponse.getStatusCode().value());

                        if (clientHttpResponse.getStatusCode() == HttpStatus.OK) {
                            SugarCRMContactsResponse response = MAPPER.readValue(clientHttpResponse.getBody(), SugarCRMContactsResponse.class);
                            LOG.debug("Response:{}", response);
                            if (!response.hasError()) {
                                return response;
                            } else if (response.isTokenInvalid()) {
                                LOG.info("Get contacts failed, invalid token");
                                throw new RestException(ERR_SUGAR_INVALID_TOKEN, HttpStatus.FORBIDDEN, "SugarCRM get contacts failed, invalid token");
                            } else {
                                LOG.info("SugarCRM get contacts failed with unknown reason:{}", new StringHttpMessageConverter().read(String.class, clientHttpResponse));
                                throw new RestException(ERR_SUGAR_GET_CONTACTS_FAILED, HttpStatus.SERVICE_UNAVAILABLE, "SugarCRM get contacts failed with unknown reason");
                            }
                        } else {
                            // If the SugarCRM does not respond with 200 throw http 503
                            LOG.warn("SugarCRM is responding with http code:{}", clientHttpResponse.getStatusCode().value());
                            throw new RestException(ERR_SUGAR_NOT_AVAILABLE, HttpStatus.SERVICE_UNAVAILABLE, "SugarCRM request failed");
                        }
                    }
                },
                "get_entry_list", "json", "json", data);

        LOG.debug("Got number of contacts:{}", contacts.getResult_count());

        CursorPage<DmContact, String> page = convertToPage(contacts, pageSize);
        return page;
    }

    // Convert from SugarCRM response
    private CursorPage<DmContact, String> convertToPage(SugarCRMContactsResponse response, int pageSize) {

        if (null == response) {
            return null;
        }

        CursorPage<DmContact, String> page = new CursorPage<DmContact, String>();
        page.setRequestedPageSize(pageSize);
        page.setCursorKey(Integer.toString(response.getNext_offset()));

        // "id","first_name","last_name","email","phone_work","primary_address_street","primary_address_city","primary_address_country","primary_address_postalcode"

        Collection<DmContact> contacts = new ArrayList<DmContact>();
        for (SugarCRMEntryListResponse entry : response.getEntry_list()) {
            DmContact dmContact = new DmContact();
            dmContact.setId(entry.getName_value_list().getId().getValue());
            dmContact.setFirstName(entry.getName_value_list().getFirst_name().getValue());
            dmContact.setLastName(entry.getName_value_list().getLast_name().getValue());
            dmContact.setEmail(entry.getName_value_list().getEmail().getValue());
            dmContact.setPhone(entry.getName_value_list().getPhone_work().getValue());
            dmContact.setStreet(entry.getName_value_list().getPrimary_address_street().getValue());
            dmContact.setCity(entry.getName_value_list().getPrimary_address_city().getValue());
            dmContact.setCountry(entry.getName_value_list().getPrimary_address_country().getValue());
            dmContact.setPostalCode(entry.getName_value_list().getPrimary_address_postalcode().getValue());
            contacts.add(dmContact);
        }
        page.setItems(contacts);

        return page;
    }

    @Override
    public CursorPage<DmContact, String> searchContacts(String text, int pageSize, Serializable cursorKey, String token) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    // Setters and getters
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getSugarCRMUrl() {
        return sugarCRMUrl;
    }

    public void setSugarCRMUrl(String sugarCRMUrl) {
        this.sugarCRMUrl = sugarCRMUrl;
    }



    private class LoginRequest {

        private String user;
        private String password;

        LoginRequest(String user, String password) {

        }


    }

}
