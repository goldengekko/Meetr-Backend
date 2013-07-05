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
package com.goldengekko.meetr.web;

import com.goldengekko.meetr.domain.DmMeeting;
import com.goldengekko.meetr.json.JMeeting;
import com.wadpam.open.mvc.CrudController;
import com.wadpam.open.mvc.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author sosandstrom
 */
@RequestMapping("{domain}/meeting")
public class MeetingController extends CrudController<JMeeting, DmMeeting, Long, CrudService<DmMeeting, Long>> {

    public MeetingController() {
        super(JMeeting.class);
    }

    @Override
    public void convertDomain(DmMeeting from, JMeeting to) {
        convertLongEntity(from, to);

        to.setActualDuration(from.getActualDuration());
        to.setActualStartDate(toLong(from.getActualStartDate()));
        to.setActualEndDate(toLong(from.getActualEndDate()));
        to.setAttendeeIds(from.getAttendeeIds());
        to.setAttendeeNames(from.getAttendeeNames());
        to.setEndDate(toLong(from.getEndDate()));
        to.setLocationId(from.getLocationId());
        to.setMeetingType(from.getMeetingType());
        to.setOrganizerId(from.getOrganizerId());
        to.setRepeatMode(from.getRepeatMode());
        to.setFileIds(from.getFileIds());
        to.setFileNames(from.getFileNames());
        to.setFollowUpFileIds(from.getFollowUpFileIds());
        to.setImageUrl(from.getImageUrl());
        to.setStartDate(toLong(from.getStartDate()));
    }

    @Override
    public void convertJson(JMeeting from, DmMeeting to) {
        convertJLong(from, to);
        
        to.setActualDuration(from.getActualDuration());
        to.setActualStartDate(toDate(from.getActualStartDate()));
        to.setActualEndDate(toDate(from.getActualEndDate()));
        to.setAttendeeIds(from.getAttendeeIds());
        to.setAttendeeNames(from.getAttendeeNames());
        to.setEndDate(toDate(from.getEndDate()));
        to.setLocationId(from.getLocationId());
        to.setMeetingType(from.getMeetingType());
        to.setOrganizerId(from.getOrganizerId());
        to.setRepeatMode(from.getRepeatMode());
        to.setFileIds(from.getFileIds());
        to.setFileNames(from.getFileNames());
        to.setFollowUpFileIds(from.getFollowUpFileIds());
        to.setImageUrl(from.getImageUrl());
        to.setStartDate(toDate(from.getStartDate()));
    }

    
}
