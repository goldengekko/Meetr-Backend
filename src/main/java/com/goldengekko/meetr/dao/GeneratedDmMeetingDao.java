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
 * Generated on 2013-07-15T22:26:05.765+0200.
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
	/** Column name for field address is "address" */
	static final String COLUMN_NAME_ADDRESS = "address";
	/** Column name for field agendaItemSynchIds is "agendaItemSynchIds" */
	static final String COLUMN_NAME_AGENDAITEMSYNCHIDS = "agendaItemSynchIds";
	/** Column name for field alertOffsetInMinutes is "alertOffsetInMinutes" */
	static final String COLUMN_NAME_ALERTOFFSETINMINUTES = "alertOffsetInMinutes";
	/** Column name for field attendeeNames is "attendeeNames" */
	static final String COLUMN_NAME_ATTENDEENAMES = "attendeeNames";
	/** Column name for field attendeeSynchIds is "attendeeSynchIds" */
	static final String COLUMN_NAME_ATTENDEESYNCHIDS = "attendeeSynchIds";
	/** Column name for field companyName is "companyName" */
	static final String COLUMN_NAME_COMPANYNAME = "companyName";
	/** Column name for field companySynchId is "companySynchId" */
	static final String COLUMN_NAME_COMPANYSYNCHID = "companySynchId";
	/** Column name for field createdBy is "createdBy" */
	static final String COLUMN_NAME_CREATEDBY = "createdBy";
	/** Column name for field createdDate is "createdDate" */
	static final String COLUMN_NAME_CREATEDDATE = "createdDate";
	/** Column name for field detailsNotes is "detailsNotes" */
	static final String COLUMN_NAME_DETAILSNOTES = "detailsNotes";
	/** Column name for field endDate is "endDate" */
	static final String COLUMN_NAME_ENDDATE = "endDate";
	/** Column name for field fileNames is "fileNames" */
	static final String COLUMN_NAME_FILENAMES = "fileNames";
	/** Column name for field fileSynchIds is "fileSynchIds" */
	static final String COLUMN_NAME_FILESYNCHIDS = "fileSynchIds";
	/** Column name for field followUpFileSynchIds is "followUpFileSynchIds" */
	static final String COLUMN_NAME_FOLLOWUPFILESYNCHIDS = "followUpFileSynchIds";
	/** Column name for field followUpIncludeAgenda is "followUpIncludeAgenda" */
	static final String COLUMN_NAME_FOLLOWUPINCLUDEAGENDA = "followUpIncludeAgenda";
	/** Column name for field followUpLastSentDate is "followUpLastSentDate" */
	static final String COLUMN_NAME_FOLLOWUPLASTSENTDATE = "followUpLastSentDate";
	/** Column name for field followUpNotes is "followUpNotes" */
	static final String COLUMN_NAME_FOLLOWUPNOTES = "followUpNotes";
	/** Column name for field imageUrl is "imageUrl" */
	static final String COLUMN_NAME_IMAGEURL = "imageUrl";
	/** Column name for field location is "location" */
	static final String COLUMN_NAME_LOCATION = "location";
	/** Column name for field locationId is "locationId" */
	static final String COLUMN_NAME_LOCATIONID = "locationId";
	/** Column name for field meetingType is "meetingType" */
	static final String COLUMN_NAME_MEETINGTYPE = "meetingType";
	/** Column name for field notes is "notes" */
	static final String COLUMN_NAME_NOTES = "notes";
	/** Column name for field organizerId is "organizerId" */
	static final String COLUMN_NAME_ORGANIZERID = "organizerId";
	/** Column name for field phoneNumber is "phoneNumber" */
	static final String COLUMN_NAME_PHONENUMBER = "phoneNumber";
	/** Column name for field repeatMode is "repeatMode" */
	static final String COLUMN_NAME_REPEATMODE = "repeatMode";
	/** Column name for field startDate is "startDate" */
	static final String COLUMN_NAME_STARTDATE = "startDate";
	/** Column name for field synchId is "synchId" */
	static final String COLUMN_NAME_SYNCHID = "synchId";
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
		COLUMN_NAME_ADDRESS,
		COLUMN_NAME_AGENDAITEMSYNCHIDS,
		COLUMN_NAME_ALERTOFFSETINMINUTES,
		COLUMN_NAME_ATTENDEENAMES,
		COLUMN_NAME_ATTENDEESYNCHIDS,
		COLUMN_NAME_COMPANYNAME,
		COLUMN_NAME_COMPANYSYNCHID,
		COLUMN_NAME_CREATEDBY,
		COLUMN_NAME_CREATEDDATE,
		COLUMN_NAME_DETAILSNOTES,
		COLUMN_NAME_ENDDATE,
		COLUMN_NAME_FILENAMES,
		COLUMN_NAME_FILESYNCHIDS,
		COLUMN_NAME_FOLLOWUPFILESYNCHIDS,
		COLUMN_NAME_FOLLOWUPINCLUDEAGENDA,
		COLUMN_NAME_FOLLOWUPLASTSENTDATE,
		COLUMN_NAME_FOLLOWUPNOTES,
		COLUMN_NAME_IMAGEURL,
		COLUMN_NAME_LOCATION,
		COLUMN_NAME_LOCATIONID,
		COLUMN_NAME_MEETINGTYPE,
		COLUMN_NAME_NOTES,
		COLUMN_NAME_ORGANIZERID,
		COLUMN_NAME_PHONENUMBER,
		COLUMN_NAME_REPEATMODE,
		COLUMN_NAME_STARTDATE,
		COLUMN_NAME_SYNCHID,
		COLUMN_NAME_TITLE,
		COLUMN_NAME_UPDATEDBY,
		COLUMN_NAME_UPDATEDDATE);
	/** The list of Basic attribute names */
	static final List<String> BASIC_NAMES = Arrays.asList(		COLUMN_NAME_ACTUALDURATION,
		COLUMN_NAME_ACTUALENDDATE,
		COLUMN_NAME_ACTUALSTARTDATE,
		COLUMN_NAME_ADDRESS,
		COLUMN_NAME_AGENDAITEMSYNCHIDS,
		COLUMN_NAME_ALERTOFFSETINMINUTES,
		COLUMN_NAME_ATTENDEENAMES,
		COLUMN_NAME_ATTENDEESYNCHIDS,
		COLUMN_NAME_COMPANYNAME,
		COLUMN_NAME_COMPANYSYNCHID,
		COLUMN_NAME_CREATEDBY,
		COLUMN_NAME_CREATEDDATE,
		COLUMN_NAME_DETAILSNOTES,
		COLUMN_NAME_ENDDATE,
		COLUMN_NAME_FILENAMES,
		COLUMN_NAME_FILESYNCHIDS,
		COLUMN_NAME_FOLLOWUPFILESYNCHIDS,
		COLUMN_NAME_FOLLOWUPINCLUDEAGENDA,
		COLUMN_NAME_FOLLOWUPLASTSENTDATE,
		COLUMN_NAME_FOLLOWUPNOTES,
		COLUMN_NAME_IMAGEURL,
		COLUMN_NAME_LOCATION,
		COLUMN_NAME_LOCATIONID,
		COLUMN_NAME_MEETINGTYPE,
		COLUMN_NAME_NOTES,
		COLUMN_NAME_ORGANIZERID,
		COLUMN_NAME_PHONENUMBER,
		COLUMN_NAME_REPEATMODE,
		COLUMN_NAME_STARTDATE,
		COLUMN_NAME_SYNCHID,
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
	 * query-by method for field address
	 * @param address the specified attribute
	 * @return an Iterable of DmMeetings for the specified address
	 */
	Iterable<DmMeeting> queryByAddress(java.lang.String address);
		
	/**
	 * query-keys-by method for field address
	 * @param address the specified attribute
	 * @return an Iterable of DmMeetings for the specified address
	 */
	Iterable<java.lang.Long> queryKeysByAddress(java.lang.String address);

	/**
	 * query-page-by method for field address
	 * @param address the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified address
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByAddress(java.lang.String address,
            int pageSize, String cursorString);


	/**
	 * query-by method for field agendaItemSynchIds
	 * @param agendaItemSynchIds the specified attribute
	 * @return an Iterable of DmMeetings for the specified agendaItemSynchIds
	 */
	Iterable<DmMeeting> queryByAgendaItemSynchIds(java.lang.Object agendaItemSynchIds);
		
	/**
	 * query-keys-by method for field agendaItemSynchIds
	 * @param agendaItemSynchIds the specified attribute
	 * @return an Iterable of DmMeetings for the specified agendaItemSynchIds
	 */
	Iterable<java.lang.Long> queryKeysByAgendaItemSynchIds(java.lang.Object agendaItemSynchIds);

	/**
	 * query-page-by method for field agendaItemSynchIds
	 * @param agendaItemSynchIds the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified agendaItemSynchIds
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByAgendaItemSynchIds(java.lang.Object agendaItemSynchIds,
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
	 * query-by method for field attendeeSynchIds
	 * @param attendeeSynchIds the specified attribute
	 * @return an Iterable of DmMeetings for the specified attendeeSynchIds
	 */
	Iterable<DmMeeting> queryByAttendeeSynchIds(java.lang.Object attendeeSynchIds);
		
	/**
	 * query-keys-by method for field attendeeSynchIds
	 * @param attendeeSynchIds the specified attribute
	 * @return an Iterable of DmMeetings for the specified attendeeSynchIds
	 */
	Iterable<java.lang.Long> queryKeysByAttendeeSynchIds(java.lang.Object attendeeSynchIds);

	/**
	 * query-page-by method for field attendeeSynchIds
	 * @param attendeeSynchIds the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified attendeeSynchIds
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByAttendeeSynchIds(java.lang.Object attendeeSynchIds,
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
	 * query-by method for field companySynchId
	 * @param companySynchId the specified attribute
	 * @return an Iterable of DmMeetings for the specified companySynchId
	 */
	Iterable<DmMeeting> queryByCompanySynchId(java.lang.String companySynchId);
		
	/**
	 * query-keys-by method for field companySynchId
	 * @param companySynchId the specified attribute
	 * @return an Iterable of DmMeetings for the specified companySynchId
	 */
	Iterable<java.lang.Long> queryKeysByCompanySynchId(java.lang.String companySynchId);

	/**
	 * query-page-by method for field companySynchId
	 * @param companySynchId the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified companySynchId
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByCompanySynchId(java.lang.String companySynchId,
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
	 * query-by method for field detailsNotes
	 * @param detailsNotes the specified attribute
	 * @return an Iterable of DmMeetings for the specified detailsNotes
	 */
	Iterable<DmMeeting> queryByDetailsNotes(java.lang.String detailsNotes);
		
	/**
	 * query-keys-by method for field detailsNotes
	 * @param detailsNotes the specified attribute
	 * @return an Iterable of DmMeetings for the specified detailsNotes
	 */
	Iterable<java.lang.Long> queryKeysByDetailsNotes(java.lang.String detailsNotes);

	/**
	 * query-page-by method for field detailsNotes
	 * @param detailsNotes the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified detailsNotes
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByDetailsNotes(java.lang.String detailsNotes,
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
	 * query-by method for field fileNames
	 * @param fileNames the specified attribute
	 * @return an Iterable of DmMeetings for the specified fileNames
	 */
	Iterable<DmMeeting> queryByFileNames(java.lang.Object fileNames);
		
	/**
	 * query-keys-by method for field fileNames
	 * @param fileNames the specified attribute
	 * @return an Iterable of DmMeetings for the specified fileNames
	 */
	Iterable<java.lang.Long> queryKeysByFileNames(java.lang.Object fileNames);

	/**
	 * query-page-by method for field fileNames
	 * @param fileNames the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified fileNames
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByFileNames(java.lang.Object fileNames,
            int pageSize, String cursorString);


	/**
	 * query-by method for field fileSynchIds
	 * @param fileSynchIds the specified attribute
	 * @return an Iterable of DmMeetings for the specified fileSynchIds
	 */
	Iterable<DmMeeting> queryByFileSynchIds(java.lang.Object fileSynchIds);
		
	/**
	 * query-keys-by method for field fileSynchIds
	 * @param fileSynchIds the specified attribute
	 * @return an Iterable of DmMeetings for the specified fileSynchIds
	 */
	Iterable<java.lang.Long> queryKeysByFileSynchIds(java.lang.Object fileSynchIds);

	/**
	 * query-page-by method for field fileSynchIds
	 * @param fileSynchIds the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified fileSynchIds
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByFileSynchIds(java.lang.Object fileSynchIds,
            int pageSize, String cursorString);


	/**
	 * query-by method for field followUpFileSynchIds
	 * @param followUpFileSynchIds the specified attribute
	 * @return an Iterable of DmMeetings for the specified followUpFileSynchIds
	 */
	Iterable<DmMeeting> queryByFollowUpFileSynchIds(java.lang.Object followUpFileSynchIds);
		
	/**
	 * query-keys-by method for field followUpFileSynchIds
	 * @param followUpFileSynchIds the specified attribute
	 * @return an Iterable of DmMeetings for the specified followUpFileSynchIds
	 */
	Iterable<java.lang.Long> queryKeysByFollowUpFileSynchIds(java.lang.Object followUpFileSynchIds);

	/**
	 * query-page-by method for field followUpFileSynchIds
	 * @param followUpFileSynchIds the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified followUpFileSynchIds
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByFollowUpFileSynchIds(java.lang.Object followUpFileSynchIds,
            int pageSize, String cursorString);


	/**
	 * query-by method for field followUpIncludeAgenda
	 * @param followUpIncludeAgenda the specified attribute
	 * @return an Iterable of DmMeetings for the specified followUpIncludeAgenda
	 */
	Iterable<DmMeeting> queryByFollowUpIncludeAgenda(java.lang.Boolean followUpIncludeAgenda);
		
	/**
	 * query-keys-by method for field followUpIncludeAgenda
	 * @param followUpIncludeAgenda the specified attribute
	 * @return an Iterable of DmMeetings for the specified followUpIncludeAgenda
	 */
	Iterable<java.lang.Long> queryKeysByFollowUpIncludeAgenda(java.lang.Boolean followUpIncludeAgenda);

	/**
	 * query-page-by method for field followUpIncludeAgenda
	 * @param followUpIncludeAgenda the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified followUpIncludeAgenda
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByFollowUpIncludeAgenda(java.lang.Boolean followUpIncludeAgenda,
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
	 * query-by method for field location
	 * @param location the specified attribute
	 * @return an Iterable of DmMeetings for the specified location
	 */
	Iterable<DmMeeting> queryByLocation(com.google.appengine.api.datastore.GeoPt location);
		
	/**
	 * query-keys-by method for field location
	 * @param location the specified attribute
	 * @return an Iterable of DmMeetings for the specified location
	 */
	Iterable<java.lang.Long> queryKeysByLocation(com.google.appengine.api.datastore.GeoPt location);

	/**
	 * query-page-by method for field location
	 * @param location the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified location
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByLocation(com.google.appengine.api.datastore.GeoPt location,
            int pageSize, String cursorString);


	/**
	 * query-by method for field locationId
	 * @param locationId the specified attribute
	 * @return an Iterable of DmMeetings for the specified locationId
	 */
	Iterable<DmMeeting> queryByLocationId(java.lang.Long locationId);
		
	/**
	 * query-keys-by method for field locationId
	 * @param locationId the specified attribute
	 * @return an Iterable of DmMeetings for the specified locationId
	 */
	Iterable<java.lang.Long> queryKeysByLocationId(java.lang.Long locationId);

	/**
	 * query-page-by method for field locationId
	 * @param locationId the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified locationId
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByLocationId(java.lang.Long locationId,
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
	 * query-by method for field notes
	 * @param notes the specified attribute
	 * @return an Iterable of DmMeetings for the specified notes
	 */
	Iterable<DmMeeting> queryByNotes(java.lang.String notes);
		
	/**
	 * query-keys-by method for field notes
	 * @param notes the specified attribute
	 * @return an Iterable of DmMeetings for the specified notes
	 */
	Iterable<java.lang.Long> queryKeysByNotes(java.lang.String notes);

	/**
	 * query-page-by method for field notes
	 * @param notes the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified notes
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByNotes(java.lang.String notes,
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
	 * query-by method for field phoneNumber
	 * @param phoneNumber the specified attribute
	 * @return an Iterable of DmMeetings for the specified phoneNumber
	 */
	Iterable<DmMeeting> queryByPhoneNumber(java.lang.String phoneNumber);
		
	/**
	 * query-keys-by method for field phoneNumber
	 * @param phoneNumber the specified attribute
	 * @return an Iterable of DmMeetings for the specified phoneNumber
	 */
	Iterable<java.lang.Long> queryKeysByPhoneNumber(java.lang.String phoneNumber);

	/**
	 * query-page-by method for field phoneNumber
	 * @param phoneNumber the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified phoneNumber
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageByPhoneNumber(java.lang.String phoneNumber,
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
	 * query-by method for field synchId
	 * @param synchId the specified attribute
	 * @return an Iterable of DmMeetings for the specified synchId
	 */
	Iterable<DmMeeting> queryBySynchId(java.lang.String synchId);
		
	/**
	 * query-keys-by method for field synchId
	 * @param synchId the specified attribute
	 * @return an Iterable of DmMeetings for the specified synchId
	 */
	Iterable<java.lang.Long> queryKeysBySynchId(java.lang.String synchId);

	/**
	 * query-page-by method for field synchId
	 * @param synchId the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified synchId
	 */
	CursorPage<DmMeeting, java.lang.Long> queryPageBySynchId(java.lang.String synchId,
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
		java.lang.String address, 
		java.util.Collection agendaItemSynchIds, 
		java.lang.Integer alertOffsetInMinutes, 
		java.util.Collection attendeeNames, 
		java.util.Collection attendeeSynchIds, 
		java.lang.String companyName, 
		java.lang.String companySynchId, 
		java.lang.String detailsNotes, 
		java.util.Date endDate, 
		java.util.Collection fileNames, 
		java.util.Collection fileSynchIds, 
		java.util.Collection followUpFileSynchIds, 
		java.lang.Boolean followUpIncludeAgenda, 
		java.util.Date followUpLastSentDate, 
		java.lang.String followUpNotes, 
		java.lang.String imageUrl, 
		com.google.appengine.api.datastore.GeoPt location, 
		java.lang.Long locationId, 
		java.lang.Long meetingType, 
		java.lang.String notes, 
		java.lang.String organizerId, 
		java.lang.String phoneNumber, 
		java.lang.Integer repeatMode, 
		java.util.Date startDate, 
		java.lang.String synchId, 
		java.lang.String title);	

}
