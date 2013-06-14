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
package com.goldengekko.meetr.service.sugarcrm;

/**
 * A list of entries returned from SugarCRM.
 * @author mattiaslevin
 */
public class SugarCRMEntryListResponse {

    private String id;

    private SugarCRMNameValueListResponse name_value_list;


    // Setters and getters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public SugarCRMNameValueListResponse getName_value_list() {
        return name_value_list;
    }

    public void setName_value_list(SugarCRMNameValueListResponse name_value_list) {
        this.name_value_list = name_value_list;
    }
}
