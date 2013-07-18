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
package com.goldengekko.meetr.domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;

import com.google.appengine.api.datastore.GeoPt;
import net.sf.mardao.core.GeoLocation;
import net.sf.mardao.core.domain.AbstractLongEntity;
import net.sf.mardao.core.geo.DLocation;

/**
 *
 * @author sosandstrom
 */
@Entity
public class DmMeeting extends AbstractLongEntity {

    // Meeting details

    /** Meeting title */
    @Basic
    private String title;

    /** Meeting type can be PHONE_CALL, VISIT, BAKERY, OTHER
     * Not used by Meetr */
    @Basic
    private Long meetingType;

    /** The registered organizer of this meeting */
    @Basic
    private String organizerId;

    /** The name of the company this meeting relates to */
    @Basic
    private String companyName;

    /** Customers phone number */
    @Basic
    private String companyPhoneNumber;

    /** The address where the meeting tak place, often the company address */
    @Basic
    private String companyAddress;

    /** The geographical point of the meeting in latitude and longitude */
    @Basic
    @GeoLocation
    private DLocation companyLocation;

    /** Reference to company entity */
    @Basic
    private String companyId;

    /** A reference to the store/place where this visit took place
     * Not used by Meetr, replaced by companyId*/
    @Basic
    private String locationId;

    /** The external attendees for this meeting */
    @Basic
    private Collection<String> attendeeNames;

    /** Reference to attendee entities. */
    @Basic
    private Collection<String> attendeeIds;

    /** Date and time this meeting will start */
    @Basic
    private Date startDate;

    /** Date and time this meeting will end */
    @Basic
    private Date endDate;

    /** repeat mode can be NONE, DAILY, WORKING_DAYS, WEEKLY, BI-WEEKLY, MONTHLY, YEARLY
     * Not used by Meetr */
    @Basic
    private Integer repeatMode;

    /** Date and time this meeting is started
     * Not used by Meetr */
    @Basic
    private Date actualStartDate;

    /** Date and time this meeting is ended
     * Not used by Meetr */
    @Basic
    private Date actualEndDate;

    /** Meeting actual duration in milliseconds
     * - this cannot indicate actual start/end datetime as user may pause the meeting.
     * Not used by Meetr */
    @Basic
    private Long actualDuration;

    /** How many minutes from the meeting should the alarm go off */
    @Basic
    private Integer alertOffsetInMinutes;

    /** Meeting planning notes written before the meeting take place, during the meeting creation */
    @Basic
    private String meetingPlanningNotes;

    /** Meeting image URL
     * Not used by Meetr */
    @Basic
    private String imageUrl;


    // Agenda items

    /** Reference to the agenda item entities. */
    @Basic
    private Collection<String> agendaItemIds;


    // Documents and files

    /** Files related to this meeting. */
    @Basic
    private Collection<String> meetingFileNames;

    /** Files related to this meeting. */
    @Basic
    private Collection<String> meetingFileIds;


    // Notes (from the meeting)

    /** Notes created during the meeting */
    @Basic
    private String meetingNotes;


    // Follow up

    /** The date when the last followup email was sent */
    @Basic
    private Date followUpLastSentDate;

    /** Notes created after the meeting when sending the followup email */
    @Basic
    private String followUpNotes;

    /** Did the follow up email include the agenda points */
    @Basic
    private Boolean followUpIncludesAgenda;

    /** References to files included in sent follow up emails */
    @Basic
    private Collection<String> followUpFileIds;


    // Getter and setters


    public Long getActualDuration() {
        return actualDuration;
    }

    public void setActualDuration(Long actualDuration) {
        this.actualDuration = actualDuration;
    }

    public Date getActualEndDate() {
        return actualEndDate;
    }

    public void setActualEndDate(Date actualEndDate) {
        this.actualEndDate = actualEndDate;
    }

    public Date getActualStartDate() {
        return actualStartDate;
    }

    public void setActualStartDate(Date actualStartDate) {
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

    public DLocation getCompanyLocation() {
        return companyLocation;
    }

    public void setCompanyLocation(DLocation companyLocation) {
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

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
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

    public Date getFollowUpLastSentDate() {
        return followUpLastSentDate;
    }

    public void setFollowUpLastSentDate(Date followUpLastSentDate) {
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
