package com.goldengekko.meetr.dao;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import net.sf.mardao.core.CursorPage;
import net.sf.mardao.core.dao.Dao;
import com.goldengekko.meetr.domain.DmTask;
import net.sf.mardao.core.geo.DLocation;

/**
 * DAO interface with finder methods for DmTask entities.
 *
 * Generated on 2013-07-19T15:33:33.389+0700.
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public interface GeneratedDmTaskDao extends Dao<DmTask, java.lang.Long> {

	/** Column name for primary key attribute is "longId" */
	static final String COLUMN_NAME_LONGID = "longId";


	/** Column name for field createdBy is "createdBy" */
	static final String COLUMN_NAME_CREATEDBY = "createdBy";
	/** Column name for field createdDate is "createdDate" */
	static final String COLUMN_NAME_CREATEDDATE = "createdDate";
	/** Column name for field dueDate is "dueDate" */
	static final String COLUMN_NAME_DUEDATE = "dueDate";
	/** Column name for field meetingSyncId is "meetingSyncId" */
	static final String COLUMN_NAME_MEETINGSYNCID = "meetingSyncId";
	/** Column name for field title is "title" */
	static final String COLUMN_NAME_TITLE = "title";
	/** Column name for field updatedBy is "updatedBy" */
	static final String COLUMN_NAME_UPDATEDBY = "updatedBy";
	/** Column name for field updatedDate is "updatedDate" */
	static final String COLUMN_NAME_UPDATEDDATE = "updatedDate";

	/** The list of attribute names */
	static final List<String> COLUMN_NAMES = Arrays.asList(		COLUMN_NAME_CREATEDBY,
		COLUMN_NAME_CREATEDDATE,
		COLUMN_NAME_DUEDATE,
		COLUMN_NAME_MEETINGSYNCID,
		COLUMN_NAME_TITLE,
		COLUMN_NAME_UPDATEDBY,
		COLUMN_NAME_UPDATEDDATE);
	/** The list of Basic attribute names */
	static final List<String> BASIC_NAMES = Arrays.asList(		COLUMN_NAME_CREATEDBY,
		COLUMN_NAME_CREATEDDATE,
		COLUMN_NAME_DUEDATE,
		COLUMN_NAME_MEETINGSYNCID,
		COLUMN_NAME_TITLE,
		COLUMN_NAME_UPDATEDBY,
		COLUMN_NAME_UPDATEDDATE);
	/** The list of attribute names */
	static final List<String> MANY_TO_ONE_NAMES = Arrays.asList();


	// ----------------------- field finders -------------------------------
	/**
	 * query-by method for field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of DmTasks for the specified createdBy
	 */
	Iterable<DmTask> queryByCreatedBy(java.lang.String createdBy);
		
	/**
	 * query-keys-by method for field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of DmTasks for the specified createdBy
	 */
	Iterable<java.lang.Long> queryKeysByCreatedBy(java.lang.String createdBy);

	/**
	 * query-page-by method for field createdBy
	 * @param createdBy the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmTasks for the specified createdBy
	 */
	CursorPage<DmTask> queryPageByCreatedBy(java.lang.String createdBy,
            int pageSize, String cursorString);


	/**
	 * query-by method for field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of DmTasks for the specified createdDate
	 */
	Iterable<DmTask> queryByCreatedDate(java.util.Date createdDate);
		
	/**
	 * query-keys-by method for field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of DmTasks for the specified createdDate
	 */
	Iterable<java.lang.Long> queryKeysByCreatedDate(java.util.Date createdDate);

	/**
	 * query-page-by method for field createdDate
	 * @param createdDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmTasks for the specified createdDate
	 */
	CursorPage<DmTask> queryPageByCreatedDate(java.util.Date createdDate,
            int pageSize, String cursorString);


	/**
	 * query-by method for field dueDate
	 * @param dueDate the specified attribute
	 * @return an Iterable of DmTasks for the specified dueDate
	 */
	Iterable<DmTask> queryByDueDate(java.util.Date dueDate);
		
	/**
	 * query-keys-by method for field dueDate
	 * @param dueDate the specified attribute
	 * @return an Iterable of DmTasks for the specified dueDate
	 */
	Iterable<java.lang.Long> queryKeysByDueDate(java.util.Date dueDate);

	/**
	 * query-page-by method for field dueDate
	 * @param dueDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmTasks for the specified dueDate
	 */
	CursorPage<DmTask> queryPageByDueDate(java.util.Date dueDate,
            int pageSize, String cursorString);


	/**
	 * query-by method for field meetingSyncId
	 * @param meetingSyncId the specified attribute
	 * @return an Iterable of DmTasks for the specified meetingSyncId
	 */
	Iterable<DmTask> queryByMeetingSyncId(java.lang.String meetingSyncId);
		
	/**
	 * query-keys-by method for field meetingSyncId
	 * @param meetingSyncId the specified attribute
	 * @return an Iterable of DmTasks for the specified meetingSyncId
	 */
	Iterable<java.lang.Long> queryKeysByMeetingSyncId(java.lang.String meetingSyncId);

	/**
	 * query-page-by method for field meetingSyncId
	 * @param meetingSyncId the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmTasks for the specified meetingSyncId
	 */
	CursorPage<DmTask> queryPageByMeetingSyncId(java.lang.String meetingSyncId,
            int pageSize, String cursorString);


	/**
	 * query-by method for field title
	 * @param title the specified attribute
	 * @return an Iterable of DmTasks for the specified title
	 */
	Iterable<DmTask> queryByTitle(java.lang.String title);
		
	/**
	 * query-keys-by method for field title
	 * @param title the specified attribute
	 * @return an Iterable of DmTasks for the specified title
	 */
	Iterable<java.lang.Long> queryKeysByTitle(java.lang.String title);

	/**
	 * query-page-by method for field title
	 * @param title the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmTasks for the specified title
	 */
	CursorPage<DmTask> queryPageByTitle(java.lang.String title,
            int pageSize, String cursorString);


	/**
	 * query-by method for field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of DmTasks for the specified updatedBy
	 */
	Iterable<DmTask> queryByUpdatedBy(java.lang.String updatedBy);
		
	/**
	 * query-keys-by method for field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of DmTasks for the specified updatedBy
	 */
	Iterable<java.lang.Long> queryKeysByUpdatedBy(java.lang.String updatedBy);

	/**
	 * query-page-by method for field updatedBy
	 * @param updatedBy the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmTasks for the specified updatedBy
	 */
	CursorPage<DmTask> queryPageByUpdatedBy(java.lang.String updatedBy,
            int pageSize, String cursorString);


	/**
	 * query-by method for field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of DmTasks for the specified updatedDate
	 */
	Iterable<DmTask> queryByUpdatedDate(java.util.Date updatedDate);
		
	/**
	 * query-keys-by method for field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of DmTasks for the specified updatedDate
	 */
	Iterable<java.lang.Long> queryKeysByUpdatedDate(java.util.Date updatedDate);

	/**
	 * query-page-by method for field updatedDate
	 * @param updatedDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmTasks for the specified updatedDate
	 */
	CursorPage<DmTask> queryPageByUpdatedDate(java.util.Date updatedDate,
            int pageSize, String cursorString);


		  
	// ----------------------- one-to-one finders -------------------------

	// ----------------------- many-to-one finders -------------------------
	
	// ----------------------- many-to-many finders -------------------------

	// ----------------------- uniqueFields finders -------------------------
	
	
	// ----------------------- populate / persist method -------------------------

	/**
	 * Persist an entity given all attributes
	 */
	DmTask persist(		java.lang.Long longId, 
		java.util.Date dueDate, 
		java.lang.String meetingSyncId, 
		java.lang.String title);	

}
