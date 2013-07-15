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
package com.goldengekko.meetr.json;

import com.wadpam.open.json.JBaseObject;

/**
 *
 * @author sosandstrom
 */
public class JTask extends JBaseObject {

    private String title;

    private String meetingSynchId;

    private Long dueDate;

    public String getTitle() {
        return title;
    }


    // Setters and getters

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMeetingSynchId() {
        return meetingSynchId;
    }

    public void setMeetingSynchId(String meetingSynchId) {
        this.meetingSynchId = meetingSynchId;
    }

    public Long getDueDate() {
        return dueDate;
    }

    public void setDueDate(Long dueDate) {
        this.dueDate = dueDate;
    }

}
