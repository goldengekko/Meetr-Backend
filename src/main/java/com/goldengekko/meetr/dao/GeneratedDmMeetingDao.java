package com.goldengekko.meetr.dao;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import net.sf.mardao.core.CursorPage;
import net.sf.mardao.core.dao.Dao;
import com.goldengekko.meetr.domain.DmMeeting;
import net.sf.mardao.core.geo.DLocation;

/**
 * DAO interface with finder methods for DmMeeting entities.
 *
 * Generated on 2013-07-18T11:30:21.619+0200.
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public interface GeneratedDmMeetingDao extends Dao<DmMeeting, java.lang.Long> {

	/** Column name for primary key attribute is "id" */
	static final String COLUMN_NAME_ID = "id";


	/** Column name for field actualDuration is "actualDuration" */
	static final String COLUMN_NAME_ACTUALDURATION = "actualDuration";
	/** Column name for field actualEndDate is "actualEndDate" */
	static final String COLUMN_NAME_ACTUALENDDATE = "actualEndDate";
	/** Column name for field actualStartDate is "actualStartDate" */
	static final String COLUMN_NAME_ACTUALSTARTDATE = "actualStartDate";
	/** Column name for field agendaItemIds is "agendaItemIds" */
	static final String COLUMN_NAME_AGENDAITEMIDS = "agendaItemIds";
	/** Column name for field alertOffsetInMinutes is "alertOffsetInMinutes" */
	static final String COLUMN_NAME_ALERTOFFSETINMINUTES = "alertOffsetInMinutes";
	/** Column name for field attendeeIds is "attendeeIds" */
	static final String COLUMN_NAME_ATTENDEEIDS = "attendeeIds";
	/** Column name for field attendeeNames is "attendeeNames" */
	static final String COLUMN_NAME_ATTENDEENAMES = "attendeeNames";
	/** Column name for field companyAddress is "companyAddress" */
	static final String COLUMN_NAME_COMPANYADDRESS = "companyAddress";
	/** Column name for field companyId is "companyId" */
	static final String COLUMN_NAME_COMPANYID = "companyId";
	/** Column name for field companyLocation is "companyLocation" */
	static final String COLUMN_NAME_COMPANYLOCATION = "companyLocation";
	/** Column name for field companyName is "companyName" */
	static final String COLUMN_NAME_COMPANYNAME = "companyName";
	/** Column name for field companyPhoneNumber is "companyPhoneNumber" */
	static final String COLUMN_NAME_COMPANYPHONENUMBER = "companyPhoneNumber";
	/** Column name for field createdBy is "createdBy" */
	static final String COLUMN_NAME_CREATEDBY = "createdBy";
	/** Column name for field createdDate is "createdDate" */
	static final String COLUMN_NAME_CREATEDDATE = "createdDate";
	/** Column name for field endDate is "endDate" */
	static final String COLUMN_NAME_ENDDATE = "endDate";
	/** Column name for field followUpFileIds is "followUpFileIds" */
	static final String COLUMN_NAME_FOLLOWUPFILEIDS = "followUpFileIds";
	/** Column name for field followUpIncludesAgenda is "followUpIncludesAgenda" */
	static final String COLUMN_NAME_FOLLOWUPINCLUDESAGENDA = "followUpIncludesAgenda";
	/** Column name for field followUpLastSentDate is "followUpLastSentDate" */
	static final String COLUMN_NAME_FOLLOWUPLASTSENTDATE = "followUpLastSentDate";
	/** Column name for field followUpNotes is "followUpNotes" */
	static final String COLUMN_NAME_FOLLOWUPNOTES = "followUpNotes";
	/** Column name for field imageUrl is "imageUrl" */
	static final String COLUMN_NAME_IMAGEURL = "imageUrl";
	/** Column name for field locationId is "locationId" */
	static final String COLUMN_NAME_LOCATIONID = "locationId";
	/** Column name for field meetingFileIds is "meetingFileIds" */
	static final String COLUMN_NAME_MEETINGFILEIDS = "meetingFileIds";
	/** Column name for field meetingFileNames is "meetingFileNames" */
	static final String COLUMN_NAME_MEETINGFILENAMES = "meetingFileNames";
	/** Column name for field meetingNotes is "meetingNotes" */
	static final String COLUMN_NAME_MEETINGNOTES = "meetingNotes";
	/** Column name for field meetingPlanningNotes is "meetingPlanningNotes" */
	static final String COLUMN_NAME_MEETINGPLANNINGNOTES = "meetingPlanningNotes";
	/** Column name for field meetingType is "meetingType" */
	static final String COLUMN_NAME_MEETINGTYPE = "meetingType";
	/** Column name for field organizerId is "organizerId" */
	static final String COLUMN_NAME_ORGANIZERID = "organizerId";
	/** Column name for field repeatMode is "repeatMode" */
	static final String COLUMN_NAME_REPEATMODE = "repeatMode";
	/** Column name for field startDate is "startDate" */
	static final String COLUMN_NAME_STARTDATE = "startDate";
	/** Column name for field title is "title" */
	static final String COLUMN_NAME_TITLE = "title";
	/** Column name for field updatedBy is "updatedBy" */
	static final String COLUMN_NAME_UPDATEDBY = "updatedBy";
	/** Column name for field updatedDate is "updatedDate" */
	static final String COLUMN_NAME_UPDATEDDATE = "updatedDate";

	/** The list of attribute names */
	static final List<String> COLUMN_NAMES = Arrays.asList(		COLUMN_NAME_ACTUALDURATION,
		COLUMN_NAME_ACTUALENDDATE,
		COLUMN_NAME_ACTUALSTARTDATE,
		COLUMN_NAME_AGENDAITEMIDS,
		COLUMN_NAME_ALERTOFFSETINMINUTES,
		COLUMN_NAME_ATTENDEEIDS,
		COLUMN_NAME_ATTENDEENAMES,
		COLUMN_NAME_COMPANYADDRESS,
		COLUMN_NAME_COMPANYID,
		COLUMN_NAME_COMPANYLOCATION,
		COLUMN_NAME_COMPANYNAME,
		COLUMN_NAME_COMPANYPHONENUMBER,
		COLUMN_NAME_CREATEDBY,
		COLUMN_NAME_CREATEDDATE,
		COLUMN_NAME_ENDDATE,
		COLUMN_NAME_FOLLOWUPFILEIDS,
		COLUMN_NAME_FOLLOWUPINCLUDESAGENDA,
		COLUMN_NAME_FOLLOWUPLASTSENTDATE,
		COLUMN_NAME_FOLLOWUPNOTES,
		COLUMN_NAME_IMAGEURL,
		COLUMN_NAME_LOCATIONID,
		COLUMN_NAME_MEETINGFILEIDS,
		COLUMN_NAME_MEETINGFILENAMES,
		COLUMN_NAME_MEETINGNOTES,
		COLUMN_NAME_MEETINGPLANNINGNOTES,
		COLUMN_NAME_MEETINGTYPE,
		COLUMN_NAME_ORGANIZERID,
		COLUMN_NAME_REPEATMODE,
		COLUMN_NAME_STARTDATE,
		COLUMN_NAME_TITLE,
		COLUMN_NAME_UPDATEDBY,
		COLUMN_NAME_UPDATEDDATE);
	/** The list of Basic attribute names */
	static final List<String> BASIC_NAMES = Arrays.asList(		COLUMN_NAME_ACTUALDURATION,
		COLUMN_NAME_ACTUALENDDATE,
		COLUMN_NAME_ACTUALSTARTDATE,
		COLUMN_NAME_AGENDAITEMIDS,
		COLUMN_NAME_ALERTOFFSETINMINUTES,
		COLUMN_NAME_ATTENDEEIDS,
		COLUMN_NAME_ATTENDEENAMES,
		COLUMN_NAME_COMPANYADDRESS,
		COLUMN_NAME_COMPANYID,
		COLUMN_NAME_COMPANYLOCATION,
		COLUMN_NAME_COMPANYNAME,
		COLUMN_NAME_COMPANYPHONENUMBER,
		COLUMN_NAME_CREATEDBY,
		COLUMN_NAME_CREATEDDATE,
		COLUMN_NAME_ENDDATE,
		COLUMN_NAME_FOLLOWUPFILEIDS,
		COLUMN_NAME_FOLLOWUPINCLUDESAGENDA,
		COLUMN_NAME_FOLLOWUPLASTSENTDATE,
		COLUMN_NAME_FOLLOWUPNOTES,
		COLUMN_NAME_IMAGEURL,
		COLUMN_NAME_LOCATIONID,
		COLUMN_NAME_MEETINGFILEIDS,
		COLUMN_NAME_MEETINGFILENAMES,
		COLUMN_NAME_MEETINGNOTES,
		COLUMN_NAME_MEETINGPLANNINGNOTES,
		COLUMN_NAME_MEETINGTYPE,
		COLUMN_NAME_ORGANIZERID,
		COLUMN_NAME_REPEATMODE,
		COLUMN_NAME_STARTDATE,
		COLUMN_NAME_TITLE,
		COLUMN_NAME_UPDATEDBY,
		COLUMN_NAME_UPDATEDDATE);
	/** The list of attribute names */
	static final List<String> MANY_TO_ONE_NAMES = Arrays.asList();


	// ----------------------- field finders -------------------------------
	/**
	 * query-by method for field actualDuration
	 * @param actualDuration the specified attribute
	 * @return an Iterable of DmMeetings for the specified actualDuration
	 */
	Iterable<DmMeeting> queryByActualDuration(java.lang.Long actualDuration);
		
	/**
	 * query-keys-by method for field actualDuration
	 * @param actualDuration the specified attribute
	 * @return an Iterable of DmMeetings for the specified actualDuration
	 */
	Iterable<java.lang.Long> queryKeysByActualDuration(java.lang.Long actualDuration);

	/**
	 * query-page-by method for field actualDuration
	 * @param actualDuration the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified actualDuration
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByActualDuration(java.lang.Long actualDuration,
            int pageSize, String cursorString);


	/**
	 * query-by method for field actualEndDate
	 * @param actualEndDate the specified attribute
	 * @return an Iterable of DmMeetings for the specified actualEndDate
	 */
	Iterable<DmMeeting> queryByActualEndDate(java.util.Date actualEndDate);
		
	/**
	 * query-keys-by method for field actualEndDate
	 * @param actualEndDate the specified attribute
	 * @return an Iterable of DmMeetings for the specified actualEndDate
	 */
	Iterable<java.lang.Long> queryKeysByActualEndDate(java.util.Date actualEndDate);

	/**
	 * query-page-by method for field actualEndDate
	 * @param actualEndDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified actualEndDate
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByActualEndDate(java.util.Date actualEndDate,
            int pageSize, String cursorString);


	/**
	 * query-by method for field actualStartDate
	 * @param actualStartDate the specified attribute
	 * @return an Iterable of DmMeetings for the specified actualStartDate
	 */
	Iterable<DmMeeting> queryByActualStartDate(java.util.Date actualStartDate);
		
	/**
	 * query-keys-by method for field actualStartDate
	 * @param actualStartDate the specified attribute
	 * @return an Iterable of DmMeetings for the specified actualStartDate
	 */
	Iterable<java.lang.Long> queryKeysByActualStartDate(java.util.Date actualStartDate);

	/**
	 * query-page-by method for field actualStartDate
	 * @param actualStartDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified actualStartDate
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByActualStartDate(java.util.Date actualStartDate,
            int pageSize, String cursorString);


	/**
	 * query-by method for field agendaItemIds
	 * @param agendaItemIds the specified attribute
	 * @return an Iterable of DmMeetings for the specified agendaItemIds
	 */
	Iterable<DmMeeting> queryByAgendaItemIds(java.lang.Object agendaItemIds);
		
	/**
	 * query-keys-by method for field agendaItemIds
	 * @param agendaItemIds the specified attribute
	 * @return an Iterable of DmMeetings for the specified agendaItemIds
	 */
	Iterable<java.lang.Long> queryKeysByAgendaItemIds(java.lang.Object agendaItemIds);

	/**
	 * query-page-by method for field agendaItemIds
	 * @param agendaItemIds the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified agendaItemIds
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByAgendaItemIds(java.lang.Object agendaItemIds,
            int pageSize, String cursorString);


	/**
	 * query-by method for field alertOffsetInMinutes
	 * @param alertOffsetInMinutes the specified attribute
	 * @return an Iterable of DmMeetings for the specified alertOffsetInMinutes
	 */
	Iterable<DmMeeting> queryByAlertOffsetInMinutes(java.lang.Integer alertOffsetInMinutes);
		
	/**
	 * query-keys-by method for field alertOffsetInMinutes
	 * @param alertOffsetInMinutes the specified attribute
	 * @return an Iterable of DmMeetings for the specified alertOffsetInMinutes
	 */
	Iterable<java.lang.Long> queryKeysByAlertOffsetInMinutes(java.lang.Integer alertOffsetInMinutes);

	/**
	 * query-page-by method for field alertOffsetInMinutes
	 * @param alertOffsetInMinutes the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified alertOffsetInMinutes
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByAlertOffsetInMinutes(java.lang.Integer alertOffsetInMinutes,
            int pageSize, String cursorString);


	/**
	 * query-by method for field attendeeIds
	 * @param attendeeIds the specified attribute
	 * @return an Iterable of DmMeetings for the specified attendeeIds
	 */
	Iterable<DmMeeting> queryByAttendeeIds(java.lang.Object attendeeIds);
		
	/**
	 * query-keys-by method for field attendeeIds
	 * @param attendeeIds the specified attribute
	 * @return an Iterable of DmMeetings for the specified attendeeIds
	 */
	Iterable<java.lang.Long> queryKeysByAttendeeIds(java.lang.Object attendeeIds);

	/**
	 * query-page-by method for field attendeeIds
	 * @param attendeeIds the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified attendeeIds
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByAttendeeIds(java.lang.Object attendeeIds,
            int pageSize, String cursorString);


	/**
	 * query-by method for field attendeeNames
	 * @param attendeeNames the specified attribute
	 * @return an Iterable of DmMeetings for the specified attendeeNames
	 */
	Iterable<DmMeeting> queryByAttendeeNames(java.lang.Object attendeeNames);
		
	/**
	 * query-keys-by method for field attendeeNames
	 * @param attendeeNames the specified attribute
	 * @return an Iterable of DmMeetings for the specified attendeeNames
	 */
	Iterable<java.lang.Long> queryKeysByAttendeeNames(java.lang.Object attendeeNames);

	/**
	 * query-page-by method for field attendeeNames
	 * @param attendeeNames the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified attendeeNames
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByAttendeeNames(java.lang.Object attendeeNames,
            int pageSize, String cursorString);


	/**
	 * query-by method for field companyAddress
	 * @param companyAddress the specified attribute
	 * @return an Iterable of DmMeetings for the specified companyAddress
	 */
	Iterable<DmMeeting> queryByCompanyAddress(java.lang.String companyAddress);
		
	/**
	 * query-keys-by method for field companyAddress
	 * @param companyAddress the specified attribute
	 * @return an Iterable of DmMeetings for the specified companyAddress
	 */
	Iterable<java.lang.Long> queryKeysByCompanyAddress(java.lang.String companyAddress);

	/**
	 * query-page-by method for field companyAddress
	 * @param companyAddress the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified companyAddress
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByCompanyAddress(java.lang.String companyAddress,
            int pageSize, String cursorString);


	/**
	 * query-by method for field companyId
	 * @param companyId the specified attribute
	 * @return an Iterable of DmMeetings for the specified companyId
	 */
	Iterable<DmMeeting> queryByCompanyId(java.lang.String companyId);
		
	/**
	 * query-keys-by method for field companyId
	 * @param companyId the specified attribute
	 * @return an Iterable of DmMeetings for the specified companyId
	 */
	Iterable<java.lang.Long> queryKeysByCompanyId(java.lang.String companyId);

	/**
	 * query-page-by method for field companyId
	 * @param companyId the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified companyId
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByCompanyId(java.lang.String companyId,
            int pageSize, String cursorString);


	/**
	 * query-by method for field companyLocation
	 * @param companyLocation the specified attribute
	 * @return an Iterable of DmMeetings for the specified companyLocation
	 */
	Iterable<DmMeeting> queryByCompanyLocation(net.sf.mardao.core.geo.DLocation companyLocation);
		
	/**
	 * query-keys-by method for field companyLocation
	 * @param companyLocation the specified attribute
	 * @return an Iterable of DmMeetings for the specified companyLocation
	 */
	Iterable<java.lang.Long> queryKeysByCompanyLocation(net.sf.mardao.core.geo.DLocation companyLocation);

	/**
	 * query-page-by method for field companyLocation
	 * @param companyLocation the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified companyLocation
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByCompanyLocation(net.sf.mardao.core.geo.DLocation companyLocation,
            int pageSize, String cursorString);


	/**
	 * query-by method for field companyName
	 * @param companyName the specified attribute
	 * @return an Iterable of DmMeetings for the specified companyName
	 */
	Iterable<DmMeeting> queryByCompanyName(java.lang.String companyName);
		
	/**
	 * query-keys-by method for field companyName
	 * @param companyName the specified attribute
	 * @return an Iterable of DmMeetings for the specified companyName
	 */
	Iterable<java.lang.Long> queryKeysByCompanyName(java.lang.String companyName);

	/**
	 * query-page-by method for field companyName
	 * @param companyName the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified companyName
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByCompanyName(java.lang.String companyName,
            int pageSize, String cursorString);


	/**
	 * query-by method for field companyPhoneNumber
	 * @param companyPhoneNumber the specified attribute
	 * @return an Iterable of DmMeetings for the specified companyPhoneNumber
	 */
	Iterable<DmMeeting> queryByCompanyPhoneNumber(java.lang.String companyPhoneNumber);
		
	/**
	 * query-keys-by method for field companyPhoneNumber
	 * @param companyPhoneNumber the specified attribute
	 * @return an Iterable of DmMeetings for the specified companyPhoneNumber
	 */
	Iterable<java.lang.Long> queryKeysByCompanyPhoneNumber(java.lang.String companyPhoneNumber);

	/**
	 * query-page-by method for field companyPhoneNumber
	 * @param companyPhoneNumber the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified companyPhoneNumber
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByCompanyPhoneNumber(java.lang.String companyPhoneNumber,
            int pageSize, String cursorString);


	/**
	 * query-by method for field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of DmMeetings for the specified createdBy
	 */
	Iterable<DmMeeting> queryByCreatedBy(java.lang.String createdBy);
		
	/**
	 * query-keys-by method for field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of DmMeetings for the specified createdBy
	 */
	Iterable<java.lang.Long> queryKeysByCreatedBy(java.lang.String createdBy);

	/**
	 * query-page-by method for field createdBy
	 * @param createdBy the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified createdBy
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByCreatedBy(java.lang.String createdBy,
            int pageSize, String cursorString);


	/**
	 * query-by method for field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of DmMeetings for the specified createdDate
	 */
	Iterable<DmMeeting> queryByCreatedDate(java.util.Date createdDate);
		
	/**
	 * query-keys-by method for field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of DmMeetings for the specified createdDate
	 */
	Iterable<java.lang.Long> queryKeysByCreatedDate(java.util.Date createdDate);

	/**
	 * query-page-by method for field createdDate
	 * @param createdDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified createdDate
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByCreatedDate(java.util.Date createdDate,
            int pageSize, String cursorString);


	/**
	 * query-by method for field endDate
	 * @param endDate the specified attribute
	 * @return an Iterable of DmMeetings for the specified endDate
	 */
	Iterable<DmMeeting> queryByEndDate(java.util.Date endDate);
		
	/**
	 * query-keys-by method for field endDate
	 * @param endDate the specified attribute
	 * @return an Iterable of DmMeetings for the specified endDate
	 */
	Iterable<java.lang.Long> queryKeysByEndDate(java.util.Date endDate);

	/**
	 * query-page-by method for field endDate
	 * @param endDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified endDate
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByEndDate(java.util.Date endDate,
            int pageSize, String cursorString);


	/**
	 * query-by method for field followUpFileIds
	 * @param followUpFileIds the specified attribute
	 * @return an Iterable of DmMeetings for the specified followUpFileIds
	 */
	Iterable<DmMeeting> queryByFollowUpFileIds(java.lang.Object followUpFileIds);
		
	/**
	 * query-keys-by method for field followUpFileIds
	 * @param followUpFileIds the specified attribute
	 * @return an Iterable of DmMeetings for the specified followUpFileIds
	 */
	Iterable<java.lang.Long> queryKeysByFollowUpFileIds(java.lang.Object followUpFileIds);

	/**
	 * query-page-by method for field followUpFileIds
	 * @param followUpFileIds the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified followUpFileIds
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByFollowUpFileIds(java.lang.Object followUpFileIds,
            int pageSize, String cursorString);


	/**
	 * query-by method for field followUpIncludesAgenda
	 * @param followUpIncludesAgenda the specified attribute
	 * @return an Iterable of DmMeetings for the specified followUpIncludesAgenda
	 */
	Iterable<DmMeeting> queryByFollowUpIncludesAgenda(java.lang.Boolean followUpIncludesAgenda);
		
	/**
	 * query-keys-by method for field followUpIncludesAgenda
	 * @param followUpIncludesAgenda the specified attribute
	 * @return an Iterable of DmMeetings for the specified followUpIncludesAgenda
	 */
	Iterable<java.lang.Long> queryKeysByFollowUpIncludesAgenda(java.lang.Boolean followUpIncludesAgenda);

	/**
	 * query-page-by method for field followUpIncludesAgenda
	 * @param followUpIncludesAgenda the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified followUpIncludesAgenda
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByFollowUpIncludesAgenda(java.lang.Boolean followUpIncludesAgenda,
            int pageSize, String cursorString);


	/**
	 * query-by method for field followUpLastSentDate
	 * @param followUpLastSentDate the specified attribute
	 * @return an Iterable of DmMeetings for the specified followUpLastSentDate
	 */
	Iterable<DmMeeting> queryByFollowUpLastSentDate(java.util.Date followUpLastSentDate);
		
	/**
	 * query-keys-by method for field followUpLastSentDate
	 * @param followUpLastSentDate the specified attribute
	 * @return an Iterable of DmMeetings for the specified followUpLastSentDate
	 */
	Iterable<java.lang.Long> queryKeysByFollowUpLastSentDate(java.util.Date followUpLastSentDate);

	/**
	 * query-page-by method for field followUpLastSentDate
	 * @param followUpLastSentDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified followUpLastSentDate
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByFollowUpLastSentDate(java.util.Date followUpLastSentDate,
            int pageSize, String cursorString);


	/**
	 * query-by method for field followUpNotes
	 * @param followUpNotes the specified attribute
	 * @return an Iterable of DmMeetings for the specified followUpNotes
	 */
	Iterable<DmMeeting> queryByFollowUpNotes(java.lang.String followUpNotes);
		
	/**
	 * query-keys-by method for field followUpNotes
	 * @param followUpNotes the specified attribute
	 * @return an Iterable of DmMeetings for the specified followUpNotes
	 */
	Iterable<java.lang.Long> queryKeysByFollowUpNotes(java.lang.String followUpNotes);

	/**
	 * query-page-by method for field followUpNotes
	 * @param followUpNotes the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified followUpNotes
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByFollowUpNotes(java.lang.String followUpNotes,
            int pageSize, String cursorString);


	/**
	 * query-by method for field imageUrl
	 * @param imageUrl the specified attribute
	 * @return an Iterable of DmMeetings for the specified imageUrl
	 */
	Iterable<DmMeeting> queryByImageUrl(java.lang.String imageUrl);
		
	/**
	 * query-keys-by method for field imageUrl
	 * @param imageUrl the specified attribute
	 * @return an Iterable of DmMeetings for the specified imageUrl
	 */
	Iterable<java.lang.Long> queryKeysByImageUrl(java.lang.String imageUrl);

	/**
	 * query-page-by method for field imageUrl
	 * @param imageUrl the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified imageUrl
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByImageUrl(java.lang.String imageUrl,
            int pageSize, String cursorString);


	/**
	 * query-by method for field locationId
	 * @param locationId the specified attribute
	 * @return an Iterable of DmMeetings for the specified locationId
	 */
	Iterable<DmMeeting> queryByLocationId(java.lang.String locationId);
		
	/**
	 * query-keys-by method for field locationId
	 * @param locationId the specified attribute
	 * @return an Iterable of DmMeetings for the specified locationId
	 */
	Iterable<java.lang.Long> queryKeysByLocationId(java.lang.String locationId);

	/**
	 * query-page-by method for field locationId
	 * @param locationId the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified locationId
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByLocationId(java.lang.String locationId,
            int pageSize, String cursorString);


	/**
	 * query-by method for field meetingFileIds
	 * @param meetingFileIds the specified attribute
	 * @return an Iterable of DmMeetings for the specified meetingFileIds
	 */
	Iterable<DmMeeting> queryByMeetingFileIds(java.lang.Object meetingFileIds);
		
	/**
	 * query-keys-by method for field meetingFileIds
	 * @param meetingFileIds the specified attribute
	 * @return an Iterable of DmMeetings for the specified meetingFileIds
	 */
	Iterable<java.lang.Long> queryKeysByMeetingFileIds(java.lang.Object meetingFileIds);

	/**
	 * query-page-by method for field meetingFileIds
	 * @param meetingFileIds the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified meetingFileIds
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByMeetingFileIds(java.lang.Object meetingFileIds,
            int pageSize, String cursorString);


	/**
	 * query-by method for field meetingFileNames
	 * @param meetingFileNames the specified attribute
	 * @return an Iterable of DmMeetings for the specified meetingFileNames
	 */
	Iterable<DmMeeting> queryByMeetingFileNames(java.lang.Object meetingFileNames);
		
	/**
	 * query-keys-by method for field meetingFileNames
	 * @param meetingFileNames the specified attribute
	 * @return an Iterable of DmMeetings for the specified meetingFileNames
	 */
	Iterable<java.lang.Long> queryKeysByMeetingFileNames(java.lang.Object meetingFileNames);

	/**
	 * query-page-by method for field meetingFileNames
	 * @param meetingFileNames the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified meetingFileNames
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByMeetingFileNames(java.lang.Object meetingFileNames,
            int pageSize, String cursorString);


	/**
	 * query-by method for field meetingNotes
	 * @param meetingNotes the specified attribute
	 * @return an Iterable of DmMeetings for the specified meetingNotes
	 */
	Iterable<DmMeeting> queryByMeetingNotes(java.lang.String meetingNotes);
		
	/**
	 * query-keys-by method for field meetingNotes
	 * @param meetingNotes the specified attribute
	 * @return an Iterable of DmMeetings for the specified meetingNotes
	 */
	Iterable<java.lang.Long> queryKeysByMeetingNotes(java.lang.String meetingNotes);

	/**
	 * query-page-by method for field meetingNotes
	 * @param meetingNotes the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified meetingNotes
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByMeetingNotes(java.lang.String meetingNotes,
            int pageSize, String cursorString);


	/**
	 * query-by method for field meetingPlanningNotes
	 * @param meetingPlanningNotes the specified attribute
	 * @return an Iterable of DmMeetings for the specified meetingPlanningNotes
	 */
	Iterable<DmMeeting> queryByMeetingPlanningNotes(java.lang.String meetingPlanningNotes);
		
	/**
	 * query-keys-by method for field meetingPlanningNotes
	 * @param meetingPlanningNotes the specified attribute
	 * @return an Iterable of DmMeetings for the specified meetingPlanningNotes
	 */
	Iterable<java.lang.Long> queryKeysByMeetingPlanningNotes(java.lang.String meetingPlanningNotes);

	/**
	 * query-page-by method for field meetingPlanningNotes
	 * @param meetingPlanningNotes the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified meetingPlanningNotes
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByMeetingPlanningNotes(java.lang.String meetingPlanningNotes,
            int pageSize, String cursorString);


	/**
	 * query-by method for field meetingType
	 * @param meetingType the specified attribute
	 * @return an Iterable of DmMeetings for the specified meetingType
	 */
	Iterable<DmMeeting> queryByMeetingType(java.lang.Long meetingType);
		
	/**
	 * query-keys-by method for field meetingType
	 * @param meetingType the specified attribute
	 * @return an Iterable of DmMeetings for the specified meetingType
	 */
	Iterable<java.lang.Long> queryKeysByMeetingType(java.lang.Long meetingType);

	/**
	 * query-page-by method for field meetingType
	 * @param meetingType the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified meetingType
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByMeetingType(java.lang.Long meetingType,
            int pageSize, String cursorString);


	/**
	 * query-by method for field organizerId
	 * @param organizerId the specified attribute
	 * @return an Iterable of DmMeetings for the specified organizerId
	 */
	Iterable<DmMeeting> queryByOrganizerId(java.lang.String organizerId);
		
	/**
	 * query-keys-by method for field organizerId
	 * @param organizerId the specified attribute
	 * @return an Iterable of DmMeetings for the specified organizerId
	 */
	Iterable<java.lang.Long> queryKeysByOrganizerId(java.lang.String organizerId);

	/**
	 * query-page-by method for field organizerId
	 * @param organizerId the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified organizerId
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByOrganizerId(java.lang.String organizerId,
            int pageSize, String cursorString);


	/**
	 * query-by method for field repeatMode
	 * @param repeatMode the specified attribute
	 * @return an Iterable of DmMeetings for the specified repeatMode
	 */
	Iterable<DmMeeting> queryByRepeatMode(java.lang.Integer repeatMode);
		
	/**
	 * query-keys-by method for field repeatMode
	 * @param repeatMode the specified attribute
	 * @return an Iterable of DmMeetings for the specified repeatMode
	 */
	Iterable<java.lang.Long> queryKeysByRepeatMode(java.lang.Integer repeatMode);

	/**
	 * query-page-by method for field repeatMode
	 * @param repeatMode the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified repeatMode
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByRepeatMode(java.lang.Integer repeatMode,
            int pageSize, String cursorString);


	/**
	 * query-by method for field startDate
	 * @param startDate the specified attribute
	 * @return an Iterable of DmMeetings for the specified startDate
	 */
	Iterable<DmMeeting> queryByStartDate(java.util.Date startDate);
		
	/**
	 * query-keys-by method for field startDate
	 * @param startDate the specified attribute
	 * @return an Iterable of DmMeetings for the specified startDate
	 */
	Iterable<java.lang.Long> queryKeysByStartDate(java.util.Date startDate);

	/**
	 * query-page-by method for field startDate
	 * @param startDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified startDate
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByStartDate(java.util.Date startDate,
            int pageSize, String cursorString);


	/**
	 * query-by method for field title
	 * @param title the specified attribute
	 * @return an Iterable of DmMeetings for the specified title
	 */
	Iterable<DmMeeting> queryByTitle(java.lang.String title);
		
	/**
	 * query-keys-by method for field title
	 * @param title the specified attribute
	 * @return an Iterable of DmMeetings for the specified title
	 */
	Iterable<java.lang.Long> queryKeysByTitle(java.lang.String title);

	/**
	 * query-page-by method for field title
	 * @param title the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified title
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByTitle(java.lang.String title,
            int pageSize, String cursorString);


	/**
	 * query-by method for field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of DmMeetings for the specified updatedBy
	 */
	Iterable<DmMeeting> queryByUpdatedBy(java.lang.String updatedBy);
		
	/**
	 * query-keys-by method for field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of DmMeetings for the specified updatedBy
	 */
	Iterable<java.lang.Long> queryKeysByUpdatedBy(java.lang.String updatedBy);

	/**
	 * query-page-by method for field updatedBy
	 * @param updatedBy the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified updatedBy
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByUpdatedBy(java.lang.String updatedBy,
            int pageSize, String cursorString);


	/**
	 * query-by method for field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of DmMeetings for the specified updatedDate
	 */
	Iterable<DmMeeting> queryByUpdatedDate(java.util.Date updatedDate);
		
	/**
	 * query-keys-by method for field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of DmMeetings for the specified updatedDate
	 */
	Iterable<java.lang.Long> queryKeysByUpdatedDate(java.util.Date updatedDate);

	/**
	 * query-page-by method for field updatedDate
	 * @param updatedDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified updatedDate
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByUpdatedDate(java.util.Date updatedDate,
            int pageSize, String cursorString);


		  
	// ----------------------- one-to-one finders -------------------------

	// ----------------------- many-to-one finders -------------------------
	
	// ----------------------- many-to-many finders -------------------------

	// ----------------------- uniqueFields finders -------------------------
	
	
	// ----------------------- populate / persist method -------------------------

	/**
	 * Persist an entity given all attributes
	 */
	DmMeeting persist(		java.lang.Long id, 
		java.lang.Long actualDuration, 
		java.util.Date actualEndDate, 
		java.util.Date actualStartDate, 
		java.util.Collection agendaItemIds, 
		java.lang.Integer alertOffsetInMinutes, 
		java.util.Collection attendeeIds, 
		java.util.Collection attendeeNames, 
		java.lang.String companyAddress, 
		java.lang.String companyId, 
		net.sf.mardao.core.geo.DLocation companyLocation, 
		java.lang.String companyName, 
		java.lang.String companyPhoneNumber, 
		java.util.Date endDate, 
		java.util.Collection followUpFileIds, 
		java.lang.Boolean followUpIncludesAgenda, 
		java.util.Date followUpLastSentDate, 
		java.lang.String followUpNotes, 
		java.lang.String imageUrl, 
		java.lang.String locationId, 
		java.util.Collection meetingFileIds, 
		java.util.Collection meetingFileNames, 
		java.lang.String meetingNotes, 
		java.lang.String meetingPlanningNotes, 
		java.lang.Long meetingType, 
		java.lang.String organizerId, 
		java.lang.Integer repeatMode, 
		java.util.Date startDate, 
		java.lang.String title);	

}
