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
import com.wadpam.open.json.JLocation;

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


    // Meeting details

    /** Meeting title */
    private String title;

    /** Meeting type */
    private Long meetingType;

    /** The registered organizer of this meeting */
    private String organizerId;

    /** The name of the company this meeting relates to */
    private String companyName;

    /** Customers phone number */
    private String companyPhoneNumber;

    /** The address where the meeting tak place, often the company address */
    private String companyAddress;

    /** The geographical point of the meeting in latitude and longitude */
    private JLocation companyLocation;

    /** Reference to the company this meeting of organised for/with */
    private String companyId;

    /** References the location this meeting took place at */
    private String locationId;

    /** The external attendees names for this meeting */
    private Collection<String> attendeeNames;

    /** Reference to attendees for this meeting */
    private Collection<String> attendeeIds;

    /** Date and time this meeting will start */
    private Long startDate;

    /** Date and time this meeting will end */
    private Long endDate;

    /** repeat mode can be NONE, DAILY, WORKING_DAYS, WEEKLY, BI_WEEKLY, MONTHLY, YEARLY */
    private Integer repeatMode;

    /** Date and time this meeting is started */
    private Long actualStartDate;

    /** Date and time this meeting is ended */
    private Long actualEndDate;

    /** Meeting actual duration in milliseconds
     * - this cannot indicate actual start/end datetime as user may pause the meeting.*/
    private Long actualDuration;

    /** How many minutes from the meeting should the alarm go off */
    private Integer alertOffsetInMinutes;

    /** Meeting planning notes written before the meeting take place, during the meeting creation */
    private String meetingPlanningNotes;

    /** Meeting image URL */
    private String imageUrl;


    // Agenda Items

    /** Reference to the agenda items */
    private Collection<String> agendaItemIds;


    // Documents and files

    /** Files related to this meeting. */
    private Collection<String> meetingFileNames;

    /** Reference to files related to this meeting. */
    private Collection<String> meetingFileIds;


    // Notes

    /** Meeting notes taken during the meeting */
    private String meetingNotes;


    // Follow up

    /** The date when the last followup email was sent */
    private Long followUpLastSentDate;

    /** Followup notes included in the followup email */
    private String followUpNotes;

    /** Did the follow up email include the agenda points */
    private Boolean followUpIncludesAgenda;

    /** Reference to files included in the sent follow-up email */
    private Collection<String> followUpFileIds;


    // Setters and getters


    public Long getActualDuration() {
        return actualDuration;
    }

    public void setActualDuration(Long actualDuration) {
        this.actualDuration = actualDuration;
    }

    public Long getActualEndDate() {
        return actualEndDate;
    }

    public void setActualEndDate(Long actualEndDate) {
        this.actualEndDate = actualEndDate;
    }

    public Long getActualStartDate() {
        return actualStartDate;
    }

    public void setActualStartDate(Long actualStartDate) {
        this.actualStartDate = actualStartDate;
    }

    public Collection<String> getAgendaItemIds() {
        return agendaItemIds;
    }

    public void setAgendaItemIds(Collection<String> agendaItemIds) {
        this.agendaItemIds = agendaItemIds;
    }

    public Integer getAlertOffsetInMinutes() {
        return alertOffsetInMinutes;
    }

    public void setAlertOffsetInMinutes(Integer alertOffsetInMinutes) {
        this.alertOffsetInMinutes = alertOffsetInMinutes;
    }

    public Collection<String> getAttendeeIds() {
        return attendeeIds;
    }

    public void setAttendeeIds(Collection<String> attendeeIds) {
        this.attendeeIds = attendeeIds;
    }

    public Collection<String> getAttendeeNames() {
        return attendeeNames;
    }

    public void setAttendeeNames(Collection<String> attendeeNames) {
        this.attendeeNames = attendeeNames;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public JLocation getCompanyLocation() {
        return companyLocation;
    }

    public void setCompanyLocation(JLocation companyLocation) {
        this.companyLocation = companyLocation;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyPhoneNumber() {
        return companyPhoneNumber;
    }

    public void setCompanyPhoneNumber(String companyPhoneNumber) {
        this.companyPhoneNumber = companyPhoneNumber;
    }

    public Long getEndDate() {
        return endDate;
    }

    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    public Collection<String> getFollowUpFileIds() {
        return followUpFileIds;
    }

    public void setFollowUpFileIds(Collection<String> followUpFileIds) {
        this.followUpFileIds = followUpFileIds;
    }

    public Boolean getFollowUpIncludesAgenda() {
        return followUpIncludesAgenda;
    }

    public void setFollowUpIncludesAgenda(Boolean followUpIncludesAgenda) {
        this.followUpIncludesAgenda = followUpIncludesAgenda;
    }

    public Long getFollowUpLastSentDate() {
        return followUpLastSentDate;
    }

    public void setFollowUpLastSentDate(Long followUpLastSentDate) {
        this.followUpLastSentDate = followUpLastSentDate;
    }

    public String getFollowUpNotes() {
        return followUpNotes;
    }

    public void setFollowUpNotes(String followUpNotes) {
        this.followUpNotes = followUpNotes;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public Collection<String> getMeetingFileIds() {
        return meetingFileIds;
    }

    public void setMeetingFileIds(Collection<String> meetingFileIds) {
        this.meetingFileIds = meetingFileIds;
    }

    public Collection<String> getMeetingFileNames() {
        return meetingFileNames;
    }

    public void setMeetingFileNames(Collection<String> meetingFileNames) {
        this.meetingFileNames = meetingFileNames;
    }

    public String getMeetingNotes() {
        return meetingNotes;
    }

    public void setMeetingNotes(String meetingNotes) {
        this.meetingNotes = meetingNotes;
    }

    public String getMeetingPlanningNotes() {
        return meetingPlanningNotes;
    }

    public void setMeetingPlanningNotes(String meetingPlanningNotes) {
        this.meetingPlanningNotes = meetingPlanningNotes;
    }

    public Long getMeetingType() {
        return meetingType;
    }

    public void setMeetingType(Long meetingType) {
        this.meetingType = meetingType;
    }

    public String getOrganizerId() {
        return organizerId;
    }

    public void setOrganizerId(String organizerId) {
        this.organizerId = organizerId;
    }

    public Integer getRepeatMode() {
        return repeatMode;
    }

    public void setRepeatMode(Integer repeatMode) {
        this.repeatMode = repeatMode;
    }

    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}