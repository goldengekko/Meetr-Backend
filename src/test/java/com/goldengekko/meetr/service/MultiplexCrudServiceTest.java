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
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goldengekko.meetr.service;

import java.util.HashMap;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author os
 */
public class MultiplexCrudServiceTest {
    
    final MultiplexCrudService alpha = new MultiplexCrudService("alpha");
    final MultiplexCrudService beta = new MultiplexCrudService("beta");
    final MultiplexCrudService delta = new MultiplexCrudService("delta");
    
    MultiplexCrudService mux;
    
    public MultiplexCrudServiceTest() {
    }
    
    @Before
    public void setUp() {
        mux = new MultiplexCrudService("mux");
        HashMap map = new HashMap();
        mux.setMultiplexMap(map);
        map.put("alpha", alpha);
        map.put("beta", beta);
        
        mux.setDefaultService(delta);
        
        MultiplexCrudService.setMultiplexKey(null);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testKeyNull() {
        assertNull(mux.getMultiplexKey());
        assertEquals(delta, mux.getService());
    }
    
    @Test
    public void testFlatKey() {
        MultiplexCrudService.setMultiplexKey("alpha");
        assertEquals("alpha", mux.getMultiplexKey());
        assertEquals(alpha, mux.getService());
    }
    
    @Test
    public void testFlatNotFound() {
        MultiplexCrudService.setMultiplexKey("notFound");
        assertEquals("notFound", mux.getMultiplexKey());
        assertEquals(delta, mux.getService());
    }
    
    @Test
    public void testMappedKey() {
        MultiplexCrudService.setMultiplexKey("{\"mux\":\"alpha\",\"mix\":\"beta\",\"max\":\"max\"}");
        assertEquals("alpha", mux.getMultiplexKey());
        assertEquals(alpha, mux.getService());
    }
    
    @Test
    public void testMapped2Key() {
        MultiplexCrudService.setMultiplexKey("{\"mux\":\"beta\",\"mix\":\"alpha\",\"max\":\"max\"}");
        assertEquals("beta", mux.getMultiplexKey());
        assertEquals(beta, mux.getService());
    }
    
    @Test
    public void testKeyNotMapped() {
        MultiplexCrudService.setMultiplexKey("{\"mux\":\"notFound\",\"mix\":\"beta\",\"max\":\"max\"}");
        assertEquals("notFound", mux.getMultiplexKey());
        assertEquals(delta, mux.getService());
    }
    
    @Test
    public void testServiceKeyNotFound() {
        MultiplexCrudService.setMultiplexKey("{\"mix\":\"beta\",\"max\":\"max\"}");
        assertNull(mux.getMultiplexKey());
        assertEquals(delta, mux.getService());
    }
    
}