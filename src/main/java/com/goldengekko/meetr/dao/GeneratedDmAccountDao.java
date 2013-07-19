package com.goldengekko.meetr.dao;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import net.sf.mardao.core.CursorPage;
import net.sf.mardao.core.dao.Dao;
import com.goldengekko.meetr.domain.DmAccount;
import net.sf.mardao.core.geo.DLocation;

/**
 * DAO interface with finder methods for DmAccount entities.
 *
 * Generated on 2013-07-19T15:33:33.389+0700.
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public interface GeneratedDmAccountDao extends Dao<DmAccount, java.lang.String> {

	/** Column name for primary key attribute is "id" */
	static final String COLUMN_NAME_ID = "id";


	/** Column name for field billingCity is "billingCity" */
	static final String COLUMN_NAME_BILLINGCITY = "billingCity";
	/** Column name for field billingCountry is "billingCountry" */
	static final String COLUMN_NAME_BILLINGCOUNTRY = "billingCountry";
	/** Column name for field billingPostalCode is "billingPostalCode" */
	static final String COLUMN_NAME_BILLINGPOSTALCODE = "billingPostalCode";
	/** Column name for field billingState is "billingState" */
	static final String COLUMN_NAME_BILLINGSTATE = "billingState";
	/** Column name for field billingStreet is "billingStreet" */
	static final String COLUMN_NAME_BILLINGSTREET = "billingStreet";
	/** Column name for field createdBy is "createdBy" */
	static final String COLUMN_NAME_CREATEDBY = "createdBy";
	/** Column name for field createdDate is "createdDate" */
	static final String COLUMN_NAME_CREATEDDATE = "createdDate";
	/** Column name for field name is "name" */
	static final String COLUMN_NAME_NAME = "name";
	/** Column name for field phone is "phone" */
	static final String COLUMN_NAME_PHONE = "phone";
	/** Column name for field shippingCity is "shippingCity" */
	static final String COLUMN_NAME_SHIPPINGCITY = "shippingCity";
	/** Column name for field shippingCountry is "shippingCountry" */
	static final String COLUMN_NAME_SHIPPINGCOUNTRY = "shippingCountry";
	/** Column name for field shippingPostalCode is "shippingPostalCode" */
	static final String COLUMN_NAME_SHIPPINGPOSTALCODE = "shippingPostalCode";
	/** Column name for field shippingState is "shippingState" */
	static final String COLUMN_NAME_SHIPPINGSTATE = "shippingState";
	/** Column name for field shippingStreet is "shippingStreet" */
	static final String COLUMN_NAME_SHIPPINGSTREET = "shippingStreet";
	/** Column name for field updatedBy is "updatedBy" */
	static final String COLUMN_NAME_UPDATEDBY = "updatedBy";
	/** Column name for field updatedDate is "updatedDate" */
	static final String COLUMN_NAME_UPDATEDDATE = "updatedDate";
	/** Column name for field wwwUrl is "wwwUrl" */
	static final String COLUMN_NAME_WWWURL = "wwwUrl";

	/** The list of attribute names */
	static final List<String> COLUMN_NAMES = Arrays.asList(		COLUMN_NAME_BILLINGCITY,
		COLUMN_NAME_BILLINGCOUNTRY,
		COLUMN_NAME_BILLINGPOSTALCODE,
		COLUMN_NAME_BILLINGSTATE,
		COLUMN_NAME_BILLINGSTREET,
		COLUMN_NAME_CREATEDBY,
		COLUMN_NAME_CREATEDDATE,
		COLUMN_NAME_NAME,
		COLUMN_NAME_PHONE,
		COLUMN_NAME_SHIPPINGCITY,
		COLUMN_NAME_SHIPPINGCOUNTRY,
		COLUMN_NAME_SHIPPINGPOSTALCODE,
		COLUMN_NAME_SHIPPINGSTATE,
		COLUMN_NAME_SHIPPINGSTREET,
		COLUMN_NAME_UPDATEDBY,
		COLUMN_NAME_UPDATEDDATE,
		COLUMN_NAME_WWWURL);
	/** The list of Basic attribute names */
	static final List<String> BASIC_NAMES = Arrays.asList(		COLUMN_NAME_BILLINGCITY,
		COLUMN_NAME_BILLINGCOUNTRY,
		COLUMN_NAME_BILLINGPOSTALCODE,
		COLUMN_NAME_BILLINGSTATE,
		COLUMN_NAME_BILLINGSTREET,
		COLUMN_NAME_CREATEDBY,
		COLUMN_NAME_CREATEDDATE,
		COLUMN_NAME_NAME,
		COLUMN_NAME_PHONE,
		COLUMN_NAME_SHIPPINGCITY,
		COLUMN_NAME_SHIPPINGCOUNTRY,
		COLUMN_NAME_SHIPPINGPOSTALCODE,
		COLUMN_NAME_SHIPPINGSTATE,
		COLUMN_NAME_SHIPPINGSTREET,
		COLUMN_NAME_UPDATEDBY,
		COLUMN_NAME_UPDATEDDATE,
		COLUMN_NAME_WWWURL);
	/** The list of attribute names */
	static final List<String> MANY_TO_ONE_NAMES = Arrays.asList();


	// ----------------------- field finders -------------------------------
	/**
	 * query-by method for field billingCity
	 * @param billingCity the specified attribute
	 * @return an Iterable of DmAccounts for the specified billingCity
	 */
	Iterable<DmAccount> queryByBillingCity(java.lang.String billingCity);
		
	/**
	 * query-keys-by method for field billingCity
	 * @param billingCity the specified attribute
	 * @return an Iterable of DmAccounts for the specified billingCity
	 */
	Iterable<java.lang.String> queryKeysByBillingCity(java.lang.String billingCity);

	/**
	 * query-page-by method for field billingCity
	 * @param billingCity the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAccounts for the specified billingCity
	 */
	CursorPage<DmAccount> queryPageByBillingCity(java.lang.String billingCity,
            int pageSize, String cursorString);


	/**
	 * query-by method for field billingCountry
	 * @param billingCountry the specified attribute
	 * @return an Iterable of DmAccounts for the specified billingCountry
	 */
	Iterable<DmAccount> queryByBillingCountry(java.lang.String billingCountry);
		
	/**
	 * query-keys-by method for field billingCountry
	 * @param billingCountry the specified attribute
	 * @return an Iterable of DmAccounts for the specified billingCountry
	 */
	Iterable<java.lang.String> queryKeysByBillingCountry(java.lang.String billingCountry);

	/**
	 * query-page-by method for field billingCountry
	 * @param billingCountry the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAccounts for the specified billingCountry
	 */
	CursorPage<DmAccount> queryPageByBillingCountry(java.lang.String billingCountry,
            int pageSize, String cursorString);


	/**
	 * query-by method for field billingPostalCode
	 * @param billingPostalCode the specified attribute
	 * @return an Iterable of DmAccounts for the specified billingPostalCode
	 */
	Iterable<DmAccount> queryByBillingPostalCode(java.lang.String billingPostalCode);
		
	/**
	 * query-keys-by method for field billingPostalCode
	 * @param billingPostalCode the specified attribute
	 * @return an Iterable of DmAccounts for the specified billingPostalCode
	 */
	Iterable<java.lang.String> queryKeysByBillingPostalCode(java.lang.String billingPostalCode);

	/**
	 * query-page-by method for field billingPostalCode
	 * @param billingPostalCode the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAccounts for the specified billingPostalCode
	 */
	CursorPage<DmAccount> queryPageByBillingPostalCode(java.lang.String billingPostalCode,
            int pageSize, String cursorString);


	/**
	 * query-by method for field billingState
	 * @param billingState the specified attribute
	 * @return an Iterable of DmAccounts for the specified billingState
	 */
	Iterable<DmAccount> queryByBillingState(java.lang.String billingState);
		
	/**
	 * query-keys-by method for field billingState
	 * @param billingState the specified attribute
	 * @return an Iterable of DmAccounts for the specified billingState
	 */
	Iterable<java.lang.String> queryKeysByBillingState(java.lang.String billingState);

	/**
	 * query-page-by method for field billingState
	 * @param billingState the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAccounts for the specified billingState
	 */
	CursorPage<DmAccount> queryPageByBillingState(java.lang.String billingState,
            int pageSize, String cursorString);


	/**
	 * query-by method for field billingStreet
	 * @param billingStreet the specified attribute
	 * @return an Iterable of DmAccounts for the specified billingStreet
	 */
	Iterable<DmAccount> queryByBillingStreet(java.lang.String billingStreet);
		
	/**
	 * query-keys-by method for field billingStreet
	 * @param billingStreet the specified attribute
	 * @return an Iterable of DmAccounts for the specified billingStreet
	 */
	Iterable<java.lang.String> queryKeysByBillingStreet(java.lang.String billingStreet);

	/**
	 * query-page-by method for field billingStreet
	 * @param billingStreet the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAccounts for the specified billingStreet
	 */
	CursorPage<DmAccount> queryPageByBillingStreet(java.lang.String billingStreet,
            int pageSize, String cursorString);


	/**
	 * query-by method for field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of DmAccounts for the specified createdBy
	 */
	Iterable<DmAccount> queryByCreatedBy(java.lang.String createdBy);
		
	/**
	 * query-keys-by method for field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of DmAccounts for the specified createdBy
	 */
	Iterable<java.lang.String> queryKeysByCreatedBy(java.lang.String createdBy);

	/**
	 * query-page-by method for field createdBy
	 * @param createdBy the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAccounts for the specified createdBy
	 */
	CursorPage<DmAccount> queryPageByCreatedBy(java.lang.String createdBy,
            int pageSize, String cursorString);


	/**
	 * query-by method for field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of DmAccounts for the specified createdDate
	 */
	Iterable<DmAccount> queryByCreatedDate(java.util.Date createdDate);
		
	/**
	 * query-keys-by method for field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of DmAccounts for the specified createdDate
	 */
	Iterable<java.lang.String> queryKeysByCreatedDate(java.util.Date createdDate);

	/**
	 * query-page-by method for field createdDate
	 * @param createdDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAccounts for the specified createdDate
	 */
	CursorPage<DmAccount> queryPageByCreatedDate(java.util.Date createdDate,
            int pageSize, String cursorString);


	/**
	 * query-by method for field name
	 * @param name the specified attribute
	 * @return an Iterable of DmAccounts for the specified name
	 */
	Iterable<DmAccount> queryByName(java.lang.String name);
		
	/**
	 * query-keys-by method for field name
	 * @param name the specified attribute
	 * @return an Iterable of DmAccounts for the specified name
	 */
	Iterable<java.lang.String> queryKeysByName(java.lang.String name);

	/**
	 * query-page-by method for field name
	 * @param name the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAccounts for the specified name
	 */
	CursorPage<DmAccount> queryPageByName(java.lang.String name,
            int pageSize, String cursorString);


	/**
	 * query-by method for field phone
	 * @param phone the specified attribute
	 * @return an Iterable of DmAccounts for the specified phone
	 */
	Iterable<DmAccount> queryByPhone(java.lang.String phone);
		
	/**
	 * query-keys-by method for field phone
	 * @param phone the specified attribute
	 * @return an Iterable of DmAccounts for the specified phone
	 */
	Iterable<java.lang.String> queryKeysByPhone(java.lang.String phone);

	/**
	 * query-page-by method for field phone
	 * @param phone the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAccounts for the specified phone
	 */
	CursorPage<DmAccount> queryPageByPhone(java.lang.String phone,
            int pageSize, String cursorString);


	/**
	 * query-by method for field shippingCity
	 * @param shippingCity the specified attribute
	 * @return an Iterable of DmAccounts for the specified shippingCity
	 */
	Iterable<DmAccount> queryByShippingCity(java.lang.String shippingCity);
		
	/**
	 * query-keys-by method for field shippingCity
	 * @param shippingCity the specified attribute
	 * @return an Iterable of DmAccounts for the specified shippingCity
	 */
	Iterable<java.lang.String> queryKeysByShippingCity(java.lang.String shippingCity);

	/**
	 * query-page-by method for field shippingCity
	 * @param shippingCity the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAccounts for the specified shippingCity
	 */
	CursorPage<DmAccount> queryPageByShippingCity(java.lang.String shippingCity,
            int pageSize, String cursorString);


	/**
	 * query-by method for field shippingCountry
	 * @param shippingCountry the specified attribute
	 * @return an Iterable of DmAccounts for the specified shippingCountry
	 */
	Iterable<DmAccount> queryByShippingCountry(java.lang.String shippingCountry);
		
	/**
	 * query-keys-by method for field shippingCountry
	 * @param shippingCountry the specified attribute
	 * @return an Iterable of DmAccounts for the specified shippingCountry
	 */
	Iterable<java.lang.String> queryKeysByShippingCountry(java.lang.String shippingCountry);

	/**
	 * query-page-by method for field shippingCountry
	 * @param shippingCountry the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAccounts for the specified shippingCountry
	 */
	CursorPage<DmAccount> queryPageByShippingCountry(java.lang.String shippingCountry,
            int pageSize, String cursorString);


	/**
	 * query-by method for field shippingPostalCode
	 * @param shippingPostalCode the specified attribute
	 * @return an Iterable of DmAccounts for the specified shippingPostalCode
	 */
	Iterable<DmAccount> queryByShippingPostalCode(java.lang.String shippingPostalCode);
		
	/**
	 * query-keys-by method for field shippingPostalCode
	 * @param shippingPostalCode the specified attribute
	 * @return an Iterable of DmAccounts for the specified shippingPostalCode
	 */
	Iterable<java.lang.String> queryKeysByShippingPostalCode(java.lang.String shippingPostalCode);

	/**
	 * query-page-by method for field shippingPostalCode
	 * @param shippingPostalCode the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAccounts for the specified shippingPostalCode
	 */
	CursorPage<DmAccount> queryPageByShippingPostalCode(java.lang.String shippingPostalCode,
            int pageSize, String cursorString);


	/**
	 * query-by method for field shippingState
	 * @param shippingState the specified attribute
	 * @return an Iterable of DmAccounts for the specified shippingState
	 */
	Iterable<DmAccount> queryByShippingState(java.lang.String shippingState);
		
	/**
	 * query-keys-by method for field shippingState
	 * @param shippingState the specified attribute
	 * @return an Iterable of DmAccounts for the specified shippingState
	 */
	Iterable<java.lang.String> queryKeysByShippingState(java.lang.String shippingState);

	/**
	 * query-page-by method for field shippingState
	 * @param shippingState the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAccounts for the specified shippingState
	 */
	CursorPage<DmAccount> queryPageByShippingState(java.lang.String shippingState,
            int pageSize, String cursorString);


	/**
	 * query-by method for field shippingStreet
	 * @param shippingStreet the specified attribute
	 * @return an Iterable of DmAccounts for the specified shippingStreet
	 */
	Iterable<DmAccount> queryByShippingStreet(java.lang.String shippingStreet);
		
	/**
	 * query-keys-by method for field shippingStreet
	 * @param shippingStreet the specified attribute
	 * @return an Iterable of DmAccounts for the specified shippingStreet
	 */
	Iterable<java.lang.String> queryKeysByShippingStreet(java.lang.String shippingStreet);

	/**
	 * query-page-by method for field shippingStreet
	 * @param shippingStreet the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAccounts for the specified shippingStreet
	 */
	CursorPage<DmAccount> queryPageByShippingStreet(java.lang.String shippingStreet,
            int pageSize, String cursorString);


	/**
	 * query-by method for field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of DmAccounts for the specified updatedBy
	 */
	Iterable<DmAccount> queryByUpdatedBy(java.lang.String updatedBy);
		
	/**
	 * query-keys-by method for field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of DmAccounts for the specified updatedBy
	 */
	Iterable<java.lang.String> queryKeysByUpdatedBy(java.lang.String updatedBy);

	/**
	 * query-page-by method for field updatedBy
	 * @param updatedBy the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAccounts for the specified updatedBy
	 */
	CursorPage<DmAccount> queryPageByUpdatedBy(java.lang.String updatedBy,
            int pageSize, String cursorString);


	/**
	 * query-by method for field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of DmAccounts for the specified updatedDate
	 */
	Iterable<DmAccount> queryByUpdatedDate(java.util.Date updatedDate);
		
	/**
	 * query-keys-by method for field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of DmAccounts for the specified updatedDate
	 */
	Iterable<java.lang.String> queryKeysByUpdatedDate(java.util.Date updatedDate);

	/**
	 * query-page-by method for field updatedDate
	 * @param updatedDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAccounts for the specified updatedDate
	 */
	CursorPage<DmAccount> queryPageByUpdatedDate(java.util.Date updatedDate,
            int pageSize, String cursorString);


	/**
	 * query-by method for field wwwUrl
	 * @param wwwUrl the specified attribute
	 * @return an Iterable of DmAccounts for the specified wwwUrl
	 */
	Iterable<DmAccount> queryByWwwUrl(java.lang.String wwwUrl);
		
	/**
	 * query-keys-by method for field wwwUrl
	 * @param wwwUrl the specified attribute
	 * @return an Iterable of DmAccounts for the specified wwwUrl
	 */
	Iterable<java.lang.String> queryKeysByWwwUrl(java.lang.String wwwUrl);

	/**
	 * query-page-by method for field wwwUrl
	 * @param wwwUrl the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAccounts for the specified wwwUrl
	 */
	CursorPage<DmAccount> queryPageByWwwUrl(java.lang.String wwwUrl,
            int pageSize, String cursorString);


		  
	// ----------------------- one-to-one finders -------------------------

	// ----------------------- many-to-one finders -------------------------
	
	// ----------------------- many-to-many finders -------------------------

	// ----------------------- uniqueFields finders -------------------------
	
	
	// ----------------------- populate / persist method -------------------------

	/**
	 * Persist an entity given all attributes
	 */
	DmAccount persist(		java.lang.String id, 
		java.lang.String billingCity, 
		java.lang.String billingCountry, 
		java.lang.String billingPostalCode, 
		java.lang.String billingState, 
		java.lang.String billingStreet, 
		java.lang.String name, 
		java.lang.String phone, 
		java.lang.String shippingCity, 
		java.lang.String shippingCountry, 
		java.lang.String shippingPostalCode, 
		java.lang.String shippingState, 
		java.lang.String shippingStreet, 
		java.lang.String wwwUrl);	

}
