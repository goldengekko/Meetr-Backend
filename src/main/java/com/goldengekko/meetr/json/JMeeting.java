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
import java.util.Collection;
import javax.persistence.Basic;

/**
 *
 * @author os
 */
public class JMeeting extends JBaseObject {
    
    public static final int    REPEAT_MODE_NONE               = 0;
    public static final int    REPEAT_MODE_DAILY              = 1;
    // public static final int  REPEAT_MODE_WORKING_DAYS = 5;
    public static final int    REPEAT_MODE_WEEKLY             = 7;
    public static final int    REPEAT_MODE_BI_WEEKLY          = 14;
    public static final int    REPEAT_MODE_EVERY_3_WEEKS      = 21;
    public static final int    REPEAT_MODE_MONTHLY            = 28; // 4 WEEKS
    public static final int    REPEAT_MODE_BI_MONTHLY         = 56; // 8 WEEKS
    public static final int    REPEAT_MODE_QUARTERLY          = 84;
    public static final int    REPEAT_MODE_YEARLY             = 365;

    public static final String LIB_REPEAT_MODE_NONE          = "NEVER";
    public static final String LIB_REPEAT_MODE_DAILY         = "DAILY";
    // public static final String LIB_REPEAT_MODE_WORKING_DAYS = "WORKDAYS";
    public static final String LIB_REPEAT_MODE_WEEKLY        = "WEEKLY";
    public static final String LIB_REPEAT_MODE_BI_WEEKLY     = "BI-WEEKLY";
    public static final String LIB_REPEAT_MODE_EVERY_3_WEEKS = "EVERY 3 WEEKS";
    public static final String LIB_REPEAT_MODE_MONTHLY       = "EVERY 4 WEEKS";
    public static final String LIB_REPEAT_MODE_BI_MONTHLY    = "EVERY 8 WEEKS";
    public static final String LIB_REPEAT_MODE_QUARTERLY     = "EVERY 12 WEEKS";
    public static final String LIB_REPEAT_MODE_YEARLY        = "YEARLY";

    /* Meeting type constants */
    public static final long TYPE_BAKERY     = 0x0001L;
    public static final long TYPE_FREEFROM   = 0x0008L;
    public static final long TYPE_SNACKS     = 0x0010L;
    public static final long TYPE_PHONE_CALL = 0x0020L;
    public static final long TYPE_OTHER      = 0x00040L;

    public static final String LIB_TYPE_BAKERY     = "BAKERY";
    public static final String LIB_TYPE_FREEFROM   = "FREE FROM";
    public static final String LIB_TYPE_SNACKS     = "SNACKS";
    public static final String LIB_TYPE_PHONE_CALL = "TELEPHONE CALL";
    public static final String LIB_TYPE_OTHER      = "OTHER";

    /** Meeting actual duration in milliseconds
     * - this cannot indicate actual start/end datetime as user may pause the meeting.*/
    private Long actualDuration;

    /** Date and time this meeting is started */
    private Long               actualStartDate;

    /** Date and time this meeting is ended */
    private Long               actualEndDate;

    /** References the location this meeting took place at */
    private Long locationId;
    
    /** Meeting type */
    private Long meetingType;

    /** Date and time this meeting will start */
    private Long startDate;

    /** Date and time this meeting will end */
    private Long endDate;
    
    /** The registered attendees for this meeting */
    private Collection<String> attendeeIds;
    
    /** The external attendees for this meeting */
    private Collection<String> attendeeNames;

    /** The registered organizer of this meeting */
    private String organizerId;
    
    /** repeat mode can be NONE, DAILY, WORKING_DAYS, WEEKLY, BI_WEEKLY, MONTHLY, YEARLY */
    private Integer repeatMode;
    
    /** Meeting image URL */
    private String imageUrl;
    
    /** Files related to this meeting. */
    private Collection<String> fileIds;

    /** Files related to this meeting. */
    private Collection<String> fileNames;

    /** Files for follow-up related to this meeting. */
    private Collection<String> followUpFileIds;

    public Long getActualDuration() {
        return actualDuration;
    }

    public void setActualDuration(Long actualDuration) {
        this.actualDuration = actualDuration;
    }

    public Long getActualStartDate() {
        return actualStartDate;
    }

    public void setActualStartDate(Long actualStartDate) {
        this.actualStartDate = actualStartDate;
    }

    public Long getActualEndDate() {
        return actualEndDate;
    }

    public void setActualEndDate(Long actualEndDate) {
        this.actualEndDate = actualEndDate;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public Long getMeetingType() {
        return meetingType;
    }

    public void setMeetingType(Long meetingType) {
        this.meetingType = meetingType;
    }

    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public Long getEndDate() {
        return endDate;
    }

    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    public Collection<String> getAttendeeIds() {
        return attendeeIds;
    }

    public void setAttendeeIds(Collection<String> attendeeIds) {
        this.attendeeIds = attendeeIds;
    }

    public Integer getRepeatMode() {
        return repeatMode;
    }

    public void setRepeatMode(Integer repeatMode) {
        this.repeatMode = repeatMode;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Collection<String> getAttendeeNames() {
        return attendeeNames;
    }

    public void setAttendeeNames(Collection<String> attendeeNames) {
        this.attendeeNames = attendeeNames;
    }

    public String getOrganizerId() {
        return organizerId;
    }

    public void setOrganizerId(String organizerId) {
        this.organizerId = organizerId;
    }

    public Collection<String> getFileIds() {
        return fileIds;
    }

    public void setFileIds(Collection<String> fileIds) {
        this.fileIds = fileIds;
    }

    public Collection<String> getFileNames() {
        return fileNames;
    }

    public void setFileNames(Collection<String> fileNames) {
        this.fileNames = fileNames;
    }

    public Collection<String> getFollowUpFileIds() {
        return followUpFileIds;
    }

    public void setFollowUpFileIds(Collection<String> followUpFileIds) {
        this.followUpFileIds = followUpFileIds;
    }

}