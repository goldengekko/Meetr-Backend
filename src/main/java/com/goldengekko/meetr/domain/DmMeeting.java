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

import net.sf.mardao.core.domain.AbstractLongEntity;

/**
 * 
 * @author sosandstrom
 */
@Entity
public class DmMeeting extends AbstractLongEntity {
    
    /** Meeting actual duration in milliseconds
     * - this cannot indicate actual start/end datetime as user may pause the meeting.*/
    @Basic
    private Long actualDuration;

    /** Date and time this meeting is started */
    @Basic
    private Date               actualStartDate;

    /** Date and time this meeting is ended */
    @Basic
    private Date               actualEndDate;

    /** A reference to the store where this visit took place */
    @Basic
    private Long               locationId;

    /** Meeting type can be PHONE_CALL, VISIT, BAKERY, OTHER */
    @Basic
    private Long               meetingType;

    /** Date and time this meeting will start */
    @Basic
    private Date               startDate;

    /** Date and time this meeting will end */
    @Basic
    private Date               endDate;

    /** The registered attendees for this meeting */
    @Basic
    private Collection<String>   attendeeIds;
    
    /** The external attendees for this meeting */
    @Basic
    private Collection<String> attendeeNames;

    /** The registered organizer of this meeting */
    @Basic
    private String               organizerId;

    /** repeat mode can be NONE, DAILY, WORKING_DAYS, WEEKLY, BI-WEEKLY, MONTHLY, YEARLY */
    @Basic
    private Integer            repeatMode;

    /** Meeting image URL */
    @Basic
    private String             imageUrl;

    /** Files related to this meeting. */
    @Basic
    private Collection<String> fileIds;

    /** Files related to this meeting. */
    @Basic
    private Collection<String> fileNames;

    /** Files for follow-up related to this meeting. */
    @Basic
    private Collection<String> followUpFileIds;

    public Long getActualDuration() {
        return actualDuration;
    }

    public void setActualDuration(Long actualDuration) {
        this.actualDuration = actualDuration;
    }

    public Date getActualStartDate() {
        return actualStartDate;
    }

    public void setActualStartDate(Date actualStartDate) {
        this.actualStartDate = actualStartDate;
    }

    public Date getActualEndDate() {
        return actualEndDate;
    }

    public void setActualEndDate(Date actualEndDate) {
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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
