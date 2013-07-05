package com.goldengekko.meetr.dao;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import net.sf.mardao.core.CursorPage;
import net.sf.mardao.core.dao.Dao;
import com.goldengekko.meetr.domain.DmAgendaItem;
import net.sf.mardao.core.geo.DLocation;

/**
 * DAO interface with finder methods for DmAgendaItem entities.
 *
 * Generated on 2013-07-05T11:38:47.866+0700.
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public interface GeneratedDmAgendaItemDao extends Dao<DmAgendaItem, java.lang.Long> {

	/** Column name for primary key attribute is "id" */
	static final String COLUMN_NAME_ID = "id";


	/** Column name for field createdBy is "createdBy" */
	static final String COLUMN_NAME_CREATEDBY = "createdBy";
	/** Column name for field createdDate is "createdDate" */
	static final String COLUMN_NAME_CREATEDDATE = "createdDate";
	/** Column name for field isDone is "isDone" */
	static final String COLUMN_NAME_ISDONE = "isDone";
	/** Column name for field meetingId is "meetingId" */
	static final String COLUMN_NAME_MEETINGID = "meetingId";
	/** Column name for field title is "title" */
	static final String COLUMN_NAME_TITLE = "title";
	/** Column name for field updatedBy is "updatedBy" */
	static final String COLUMN_NAME_UPDATEDBY = "updatedBy";
	/** Column name for field updatedDate is "updatedDate" */
	static final String COLUMN_NAME_UPDATEDDATE = "updatedDate";

	/** The list of attribute names */
	static final List<String> COLUMN_NAMES = Arrays.asList(		COLUMN_NAME_CREATEDBY,
		COLUMN_NAME_CREATEDDATE,
		COLUMN_NAME_ISDONE,
		COLUMN_NAME_MEETINGID,
		COLUMN_NAME_TITLE,
		COLUMN_NAME_UPDATEDBY,
		COLUMN_NAME_UPDATEDDATE);
	/** The list of Basic attribute names */
	static final List<String> BASIC_NAMES = Arrays.asList(		COLUMN_NAME_CREATEDBY,
		COLUMN_NAME_CREATEDDATE,
		COLUMN_NAME_ISDONE,
		COLUMN_NAME_MEETINGID,
		COLUMN_NAME_TITLE,
		COLUMN_NAME_UPDATEDBY,
		COLUMN_NAME_UPDATEDDATE);
	/** The list of attribute names */
	static final List<String> MANY_TO_ONE_NAMES = Arrays.asList();


	// ----------------------- field finders -------------------------------
	/**
	 * query-by method for field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of DmAgendaItems for the specified createdBy
	 */
	Iterable<DmAgendaItem> queryByCreatedBy(java.lang.String createdBy);
		
	/**
	 * query-keys-by method for field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of DmAgendaItems for the specified createdBy
	 */
	Iterable<java.lang.Long> queryKeysByCreatedBy(java.lang.String createdBy);

	/**
	 * query-page-by method for field createdBy
	 * @param createdBy the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAgendaItems for the specified createdBy
	 */
	CursorPage<DmAgendaItem, java.lang.Long> queryPageByCreatedBy(java.lang.String createdBy,
            int pageSize, String cursorString);


	/**
	 * query-by method for field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of DmAgendaItems for the specified createdDate
	 */
	Iterable<DmAgendaItem> queryByCreatedDate(java.util.Date createdDate);
		
	/**
	 * query-keys-by method for field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of DmAgendaItems for the specified createdDate
	 */
	Iterable<java.lang.Long> queryKeysByCreatedDate(java.util.Date createdDate);

	/**
	 * query-page-by method for field createdDate
	 * @param createdDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAgendaItems for the specified createdDate
	 */
	CursorPage<DmAgendaItem, java.lang.Long> queryPageByCreatedDate(java.util.Date createdDate,
            int pageSize, String cursorString);


	/**
	 * query-by method for field isDone
	 * @param isDone the specified attribute
	 * @return an Iterable of DmAgendaItems for the specified isDone
	 */
	Iterable<DmAgendaItem> queryByIsDone(java.lang.Boolean isDone);
		
	/**
	 * query-keys-by method for field isDone
	 * @param isDone the specified attribute
	 * @return an Iterable of DmAgendaItems for the specified isDone
	 */
	Iterable<java.lang.Long> queryKeysByIsDone(java.lang.Boolean isDone);

	/**
	 * query-page-by method for field isDone
	 * @param isDone the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAgendaItems for the specified isDone
	 */
	CursorPage<DmAgendaItem, java.lang.Long> queryPageByIsDone(java.lang.Boolean isDone,
            int pageSize, String cursorString);


	/**
	 * query-by method for field meetingId
	 * @param meetingId the specified attribute
	 * @return an Iterable of DmAgendaItems for the specified meetingId
	 */
	Iterable<DmAgendaItem> queryByMeetingId(java.lang.String meetingId);
		
	/**
	 * query-keys-by method for field meetingId
	 * @param meetingId the specified attribute
	 * @return an Iterable of DmAgendaItems for the specified meetingId
	 */
	Iterable<java.lang.Long> queryKeysByMeetingId(java.lang.String meetingId);

	/**
	 * query-page-by method for field meetingId
	 * @param meetingId the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAgendaItems for the specified meetingId
	 */
	CursorPage<DmAgendaItem, java.lang.Long> queryPageByMeetingId(java.lang.String meetingId,
            int pageSize, String cursorString);


	/**
	 * query-by method for field title
	 * @param title the specified attribute
	 * @return an Iterable of DmAgendaItems for the specified title
	 */
	Iterable<DmAgendaItem> queryByTitle(java.lang.String title);
		
	/**
	 * query-keys-by method for field title
	 * @param title the specified attribute
	 * @return an Iterable of DmAgendaItems for the specified title
	 */
	Iterable<java.lang.Long> queryKeysByTitle(java.lang.String title);

	/**
	 * query-page-by method for field title
	 * @param title the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAgendaItems for the specified title
	 */
	CursorPage<DmAgendaItem, java.lang.Long> queryPageByTitle(java.lang.String title,
            int pageSize, String cursorString);


	/**
	 * query-by method for field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of DmAgendaItems for the specified updatedBy
	 */
	Iterable<DmAgendaItem> queryByUpdatedBy(java.lang.String updatedBy);
		
	/**
	 * query-keys-by method for field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of DmAgendaItems for the specified updatedBy
	 */
	Iterable<java.lang.Long> queryKeysByUpdatedBy(java.lang.String updatedBy);

	/**
	 * query-page-by method for field updatedBy
	 * @param updatedBy the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAgendaItems for the specified updatedBy
	 */
	CursorPage<DmAgendaItem, java.lang.Long> queryPageByUpdatedBy(java.lang.String updatedBy,
            int pageSize, String cursorString);


	/**
	 * query-by method for field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of DmAgendaItems for the specified updatedDate
	 */
	Iterable<DmAgendaItem> queryByUpdatedDate(java.util.Date updatedDate);
		
	/**
	 * query-keys-by method for field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of DmAgendaItems for the specified updatedDate
	 */
	Iterable<java.lang.Long> queryKeysByUpdatedDate(java.util.Date updatedDate);

	/**
	 * query-page-by method for field updatedDate
	 * @param updatedDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAgendaItems for the specified updatedDate
	 */
	CursorPage<DmAgendaItem, java.lang.Long> queryPageByUpdatedDate(java.util.Date updatedDate,
            int pageSize, String cursorString);


		  
	// ----------------------- one-to-one finders -------------------------

	// ----------------------- many-to-one finders -------------------------
	
	// ----------------------- many-to-many finders -------------------------

	// ----------------------- uniqueFields finders -------------------------
	
	
	// ----------------------- populate / persist method -------------------------

	/**
	 * Persist an entity given all attributes
	 */
	DmAgendaItem persist(		java.lang.Long id, 
		java.lang.Boolean isDone, 
		java.lang.String meetingId, 
		java.lang.String title);	

}
