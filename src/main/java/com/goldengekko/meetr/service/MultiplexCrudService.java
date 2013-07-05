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

import com.wadpam.open.mvc.CrudService;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import net.sf.mardao.core.CursorPage;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author sosandstrom
 */
public class MultiplexCrudService<T extends Object, ID extends Serializable>
        implements CrudService<T, ID> {

    /** Contains either the key, or a JSON map of serviceName-to-keys */
    protected static final ThreadLocal<String> MULTIPLEX_VALUE = new ThreadLocal<String>();
    
    protected static final ObjectMapper MAPPER = new ObjectMapper();
    
    private final String serviceName;
    private Map<String, CrudService<T, ID>> multiplexMap;
    private CrudService<T, ID> defaultService;

    public MultiplexCrudService(String serviceName) {
        this.serviceName = serviceName;
    }
    
    /**
     * If multiplex value is a JSON-String Map, it picks the key from map.get(serviceName).
     * @return mapped serviceName key, or just the flat multiplex value
     */
    public String getMultiplexKey() {
        final String value = MULTIPLEX_VALUE.get();
        if (null == serviceName || null == value || null == multiplexMap) {
            return null;
        }
        
        if (value.startsWith("{")) {
            try {
                Map map = MAPPER.readValue(value, Map.class);
                Object key = map.get(serviceName);
                return null != key ? key.toString() : null;
            } catch (IOException ignore) {
            }
        }
        
        return value;
    }
    
    protected CrudService<T, ID> getService() {
        final String key = getMultiplexKey();
        if (null != key && null != multiplexMap) {
            final CrudService<T, ID> service = multiplexMap.get(key);
            if (null != service) {
                return service;
            }
        }
        
        return defaultService;
    }
    
    public static void setMultiplexKey(String key) {
        MULTIPLEX_VALUE.set(key);
    }

    public void setMultiplexMap(Map<String, CrudService<T, ID>> multiplexMap) {
        this.multiplexMap = multiplexMap;
    }

    public void setDefaultService(CrudService<T, ID> defaultService) {
        this.defaultService = defaultService;
    }

    public String getServiceName() {
        return serviceName;
    }

    @Override
    public T createDomain() {
        return getService().createDomain();
    }

    @Override
    public ID create(T domain) {
        return getService().create(domain);
    }

    @Override
    public void delete(String parentKeyString, ID id) {
        getService().delete(parentKeyString, id);
    }

    @Override
    public void delete(String parentKeyString, Iterable<ID> ids) {
        getService().delete(parentKeyString, ids);
    }

    @Override
    public void exportCsv(OutputStream out, Long startDate, Long endDate) {
        getService().exportCsv(out, startDate, endDate);
    }

    @Override
    public T get(String parentKeyString, ID id) {
        return getService().get(parentKeyString, id);
    }

    @Override
    public Iterable<T> getByPrimaryKeys(Iterable<ID> ids) {
        return getService().getByPrimaryKeys(ids);
    }

    @Override
    public CursorPage<T, ID> getPage(int pageSize, String cursorKey) {
        return getService().getPage(pageSize, cursorKey);
    }

    @Override
    public ID getSimpleKey(T domain) {
        return getService().getSimpleKey(domain);
    }

    @Override
    public String getParentKeyString(T domain) {
        return getService().getParentKeyString(domain);
    }

    @Override
    public String getPrimaryKeyColumnName() {
        return getService().getPrimaryKeyColumnName();
    }

    @Override
    public Class getPrimaryKeyColumnClass() {
        return getService().getPrimaryKeyColumnClass();
    }

    @Override
    public String getTableName() {
        return getService().getTableName();
    }

    @Override
    public Map<String, Class> getTypeMap() {
        return getService().getTypeMap();
    }

    @Override
    public ID update(T domain) {
        return getService().update(domain);
    }

    @Override
    public List<ID> upsert(Iterable<T> domains) {
        return getService().upsert(domains);
    }

    @Override
    public CursorPage<ID, ID> whatsChanged(Date since, int pageSize, String cursorKey) {
        return getService().whatsChanged(since, pageSize, cursorKey);
    }
}
