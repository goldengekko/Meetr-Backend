/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goldengekko.meetr.service.salesforce;

import java.io.IOException;
import java.io.InputStream;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author os
 */
public class ParseResponseTest {
    
    static final ObjectMapper MAPPER = new ObjectMapper();
    
    public ParseResponseTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testParseContactsPage() throws IOException {
        InputStream in = getClass().getResourceAsStream("/junit/salesforce_contacts_page.json");
        JContactQueryResponse response = MAPPER.readValue(in, JContactQueryResponse.class);
    }
}
