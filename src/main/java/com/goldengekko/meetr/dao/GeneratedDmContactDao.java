package com.goldengekko.meetr.dao;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import net.sf.mardao.core.CursorPage;
import net.sf.mardao.core.dao.Dao;
import com.goldengekko.meetr.domain.DmContact;
import net.sf.mardao.core.geo.DLocation;

/**
 * DAO interface with finder methods for DmContact entities.
 *
 * Generated on 2013-07-18T11:30:21.619+0200.
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public interface GeneratedDmContactDao extends Dao<DmContact, java.lang.String> {

	/** Column name for primary key attribute is "id" */
	static final String COLUMN_NAME_ID = "id";


	/** Column name for field city is "city" */
	static final String COLUMN_NAME_CITY = "city";
	/** Column name for field cityArea is "cityArea" */
	static final String COLUMN_NAME_CITYAREA = "cityArea";
	/** Column name for field companyName is "companyName" */
	static final String COLUMN_NAME_COMPANYNAME = "companyName";
	/** Column name for field country is "country" */
	static final String COLUMN_NAME_COUNTRY = "country";
	/** Column name for field county is "county" */
	static final String COLUMN_NAME_COUNTY = "county";
	/** Column name for field createdBy is "createdBy" */
	static final String COLUMN_NAME_CREATEDBY = "createdBy";
	/** Column name for field createdDate is "createdDate" */
	static final String COLUMN_NAME_CREATEDDATE = "createdDate";
	/** Column name for field email is "email" */
	static final String COLUMN_NAME_EMAIL = "email";
	/** Column name for field firstName is "firstName" */
	static final String COLUMN_NAME_FIRSTNAME = "firstName";
	/** Column name for field lastName is "lastName" */
	static final String COLUMN_NAME_LASTNAME = "lastName";
	/** Column name for field mobilePhone is "mobilePhone" */
	static final String COLUMN_NAME_MOBILEPHONE = "mobilePhone";
	/** Column name for field name is "name" */
	static final String COLUMN_NAME_NAME = "name";
	/** Column name for field phone is "phone" */
	static final String COLUMN_NAME_PHONE = "phone";
	/** Column name for field postalCode is "postalCode" */
	static final String COLUMN_NAME_POSTALCODE = "postalCode";
	/** Column name for field street is "street" */
	static final String COLUMN_NAME_STREET = "street";
	/** Column name for field updatedBy is "updatedBy" */
	static final String COLUMN_NAME_UPDATEDBY = "updatedBy";
	/** Column name for field updatedDate is "updatedDate" */
	static final String COLUMN_NAME_UPDATEDDATE = "updatedDate";

	/** The list of attribute names */
	static final List<String> COLUMN_NAMES = Arrays.asList(		COLUMN_NAME_CITY,
		COLUMN_NAME_CITYAREA,
		COLUMN_NAME_COMPANYNAME,
		COLUMN_NAME_COUNTRY,
		COLUMN_NAME_COUNTY,
		COLUMN_NAME_CREATEDBY,
		COLUMN_NAME_CREATEDDATE,
		COLUMN_NAME_EMAIL,
		COLUMN_NAME_FIRSTNAME,
		COLUMN_NAME_LASTNAME,
		COLUMN_NAME_MOBILEPHONE,
		COLUMN_NAME_NAME,
		COLUMN_NAME_PHONE,
		COLUMN_NAME_POSTALCODE,
		COLUMN_NAME_STREET,
		COLUMN_NAME_UPDATEDBY,
		COLUMN_NAME_UPDATEDDATE);
	/** The list of Basic attribute names */
	static final List<String> BASIC_NAMES = Arrays.asList(		COLUMN_NAME_CITY,
		COLUMN_NAME_CITYAREA,
		COLUMN_NAME_COMPANYNAME,
		COLUMN_NAME_COUNTRY,
		COLUMN_NAME_COUNTY,
		COLUMN_NAME_CREATEDBY,
		COLUMN_NAME_CREATEDDATE,
		COLUMN_NAME_EMAIL,
		COLUMN_NAME_FIRSTNAME,
		COLUMN_NAME_LASTNAME,
		COLUMN_NAME_MOBILEPHONE,
		COLUMN_NAME_NAME,
		COLUMN_NAME_PHONE,
		COLUMN_NAME_POSTALCODE,
		COLUMN_NAME_STREET,
		COLUMN_NAME_UPDATEDBY,
		COLUMN_NAME_UPDATEDDATE);
	/** The list of attribute names */
	static final List<String> MANY_TO_ONE_NAMES = Arrays.asList();


	// ----------------------- field finders -------------------------------
	/**
	 * query-by method for field city
	 * @param city the specified attribute
	 * @return an Iterable of DmContacts for the specified city
	 */
	Iterable<DmContact> queryByCity(java.lang.String city);
		
	/**
	 * query-keys-by method for field city
	 * @param city the specified attribute
	 * @return an Iterable of DmContacts for the specified city
	 */
	Iterable<java.lang.String> queryKeysByCity(java.lang.String city);

	/**
	 * query-page-by method for field city
	 * @param city the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified city
	 */
	CursorPage<DmContact> queryPageByCity(java.lang.String city,
            int pageSize, String cursorString);


	/**
	 * query-by method for field cityArea
	 * @param cityArea the specified attribute
	 * @return an Iterable of DmContacts for the specified cityArea
	 */
	Iterable<DmContact> queryByCityArea(java.lang.String cityArea);
		
	/**
	 * query-keys-by method for field cityArea
	 * @param cityArea the specified attribute
	 * @return an Iterable of DmContacts for the specified cityArea
	 */
	Iterable<java.lang.String> queryKeysByCityArea(java.lang.String cityArea);

	/**
	 * query-page-by method for field cityArea
	 * @param cityArea the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified cityArea
	 */
	CursorPage<DmContact> queryPageByCityArea(java.lang.String cityArea,
            int pageSize, String cursorString);


	/**
	 * query-by method for field companyName
	 * @param companyName the specified attribute
	 * @return an Iterable of DmContacts for the specified companyName
	 */
	Iterable<DmContact> queryByCompanyName(java.lang.String companyName);
		
	/**
	 * query-keys-by method for field companyName
	 * @param companyName the specified attribute
	 * @return an Iterable of DmContacts for the specified companyName
	 */
	Iterable<java.lang.String> queryKeysByCompanyName(java.lang.String companyName);

	/**
	 * query-page-by method for field companyName
	 * @param companyName the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified companyName
	 */
	CursorPage<DmContact> queryPageByCompanyName(java.lang.String companyName,
            int pageSize, String cursorString);


	/**
	 * query-by method for field country
	 * @param country the specified attribute
	 * @return an Iterable of DmContacts for the specified country
	 */
	Iterable<DmContact> queryByCountry(java.lang.String country);
		
	/**
	 * query-keys-by method for field country
	 * @param country the specified attribute
	 * @return an Iterable of DmContacts for the specified country
	 */
	Iterable<java.lang.String> queryKeysByCountry(java.lang.String country);

	/**
	 * query-page-by method for field country
	 * @param country the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified country
	 */
	CursorPage<DmContact> queryPageByCountry(java.lang.String country,
            int pageSize, String cursorString);


	/**
	 * query-by method for field county
	 * @param county the specified attribute
	 * @return an Iterable of DmContacts for the specified county
	 */
	Iterable<DmContact> queryByCounty(java.lang.String county);
		
	/**
	 * query-keys-by method for field county
	 * @param county the specified attribute
	 * @return an Iterable of DmContacts for the specified county
	 */
	Iterable<java.lang.String> queryKeysByCounty(java.lang.String county);

	/**
	 * query-page-by method for field county
	 * @param county the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified county
	 */
	CursorPage<DmContact> queryPageByCounty(java.lang.String county,
            int pageSize, String cursorString);


	/**
	 * query-by method for field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of DmContacts for the specified createdBy
	 */
	Iterable<DmContact> queryByCreatedBy(java.lang.String createdBy);
		
	/**
	 * query-keys-by method for field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of DmContacts for the specified createdBy
	 */
	Iterable<java.lang.String> queryKeysByCreatedBy(java.lang.String createdBy);

	/**
	 * query-page-by method for field createdBy
	 * @param createdBy the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified createdBy
	 */
	CursorPage<DmContact> queryPageByCreatedBy(java.lang.String createdBy,
            int pageSize, String cursorString);


	/**
	 * query-by method for field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of DmContacts for the specified createdDate
	 */
	Iterable<DmContact> queryByCreatedDate(java.util.Date createdDate);
		
	/**
	 * query-keys-by method for field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of DmContacts for the specified createdDate
	 */
	Iterable<java.lang.String> queryKeysByCreatedDate(java.util.Date createdDate);

	/**
	 * query-page-by method for field createdDate
	 * @param createdDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified createdDate
	 */
	CursorPage<DmContact> queryPageByCreatedDate(java.util.Date createdDate,
            int pageSize, String cursorString);


	/**
	 * query-by method for field email
	 * @param email the specified attribute
	 * @return an Iterable of DmContacts for the specified email
	 */
	Iterable<DmContact> queryByEmail(java.lang.String email);
		
	/**
	 * query-keys-by method for field email
	 * @param email the specified attribute
	 * @return an Iterable of DmContacts for the specified email
	 */
	Iterable<java.lang.String> queryKeysByEmail(java.lang.String email);

	/**
	 * query-page-by method for field email
	 * @param email the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified email
	 */
	CursorPage<DmContact> queryPageByEmail(java.lang.String email,
            int pageSize, String cursorString);


	/**
	 * query-by method for field firstName
	 * @param firstName the specified attribute
	 * @return an Iterable of DmContacts for the specified firstName
	 */
	Iterable<DmContact> queryByFirstName(java.lang.String firstName);
		
	/**
	 * query-keys-by method for field firstName
	 * @param firstName the specified attribute
	 * @return an Iterable of DmContacts for the specified firstName
	 */
	Iterable<java.lang.String> queryKeysByFirstName(java.lang.String firstName);

	/**
	 * query-page-by method for field firstName
	 * @param firstName the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified firstName
	 */
	CursorPage<DmContact> queryPageByFirstName(java.lang.String firstName,
            int pageSize, String cursorString);


	/**
	 * query-by method for field lastName
	 * @param lastName the specified attribute
	 * @return an Iterable of DmContacts for the specified lastName
	 */
	Iterable<DmContact> queryByLastName(java.lang.String lastName);
		
	/**
	 * query-keys-by method for field lastName
	 * @param lastName the specified attribute
	 * @return an Iterable of DmContacts for the specified lastName
	 */
	Iterable<java.lang.String> queryKeysByLastName(java.lang.String lastName);

	/**
	 * query-page-by method for field lastName
	 * @param lastName the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified lastName
	 */
	CursorPage<DmContact> queryPageByLastName(java.lang.String lastName,
            int pageSize, String cursorString);


	/**
	 * query-by method for field mobilePhone
	 * @param mobilePhone the specified attribute
	 * @return an Iterable of DmContacts for the specified mobilePhone
	 */
	Iterable<DmContact> queryByMobilePhone(java.lang.String mobilePhone);
		
	/**
	 * query-keys-by method for field mobilePhone
	 * @param mobilePhone the specified attribute
	 * @return an Iterable of DmContacts for the specified mobilePhone
	 */
	Iterable<java.lang.String> queryKeysByMobilePhone(java.lang.String mobilePhone);

	/**
	 * query-page-by method for field mobilePhone
	 * @param mobilePhone the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified mobilePhone
	 */
	CursorPage<DmContact> queryPageByMobilePhone(java.lang.String mobilePhone,
            int pageSize, String cursorString);


	/**
	 * query-by method for field name
	 * @param name the specified attribute
	 * @return an Iterable of DmContacts for the specified name
	 */
	Iterable<DmContact> queryByName(java.lang.String name);
		
	/**
	 * query-keys-by method for field name
	 * @param name the specified attribute
	 * @return an Iterable of DmContacts for the specified name
	 */
	Iterable<java.lang.String> queryKeysByName(java.lang.String name);

	/**
	 * query-page-by method for field name
	 * @param name the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified name
	 */
	CursorPage<DmContact> queryPageByName(java.lang.String name,
            int pageSize, String cursorString);


	/**
	 * query-by method for field phone
	 * @param phone the specified attribute
	 * @return an Iterable of DmContacts for the specified phone
	 */
	Iterable<DmContact> queryByPhone(java.lang.String phone);
		
	/**
	 * query-keys-by method for field phone
	 * @param phone the specified attribute
	 * @return an Iterable of DmContacts for the specified phone
	 */
	Iterable<java.lang.String> queryKeysByPhone(java.lang.String phone);

	/**
	 * query-page-by method for field phone
	 * @param phone the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified phone
	 */
	CursorPage<DmContact> queryPageByPhone(java.lang.String phone,
            int pageSize, String cursorString);


	/**
	 * query-by method for field postalCode
	 * @param postalCode the specified attribute
	 * @return an Iterable of DmContacts for the specified postalCode
	 */
	Iterable<DmContact> queryByPostalCode(java.lang.String postalCode);
		
	/**
	 * query-keys-by method for field postalCode
	 * @param postalCode the specified attribute
	 * @return an Iterable of DmContacts for the specified postalCode
	 */
	Iterable<java.lang.String> queryKeysByPostalCode(java.lang.String postalCode);

	/**
	 * query-page-by method for field postalCode
	 * @param postalCode the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified postalCode
	 */
	CursorPage<DmContact> queryPageByPostalCode(java.lang.String postalCode,
            int pageSize, String cursorString);


	/**
	 * query-by method for field street
	 * @param street the specified attribute
	 * @return an Iterable of DmContacts for the specified street
	 */
	Iterable<DmContact> queryByStreet(java.lang.String street);
		
	/**
	 * query-keys-by method for field street
	 * @param street the specified attribute
	 * @return an Iterable of DmContacts for the specified street
	 */
	Iterable<java.lang.String> queryKeysByStreet(java.lang.String street);

	/**
	 * query-page-by method for field street
	 * @param street the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified street
	 */
	CursorPage<DmContact> queryPageByStreet(java.lang.String street,
            int pageSize, String cursorString);


	/**
	 * query-by method for field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of DmContacts for the specified updatedBy
	 */
	Iterable<DmContact> queryByUpdatedBy(java.lang.String updatedBy);
		
	/**
	 * query-keys-by method for field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of DmContacts for the specified updatedBy
	 */
	Iterable<java.lang.String> queryKeysByUpdatedBy(java.lang.String updatedBy);

	/**
	 * query-page-by method for field updatedBy
	 * @param updatedBy the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified updatedBy
	 */
	CursorPage<DmContact> queryPageByUpdatedBy(java.lang.String updatedBy,
            int pageSize, String cursorString);


	/**
	 * query-by method for field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of DmContacts for the specified updatedDate
	 */
	Iterable<DmContact> queryByUpdatedDate(java.util.Date updatedDate);
		
	/**
	 * query-keys-by method for field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of DmContacts for the specified updatedDate
	 */
	Iterable<java.lang.String> queryKeysByUpdatedDate(java.util.Date updatedDate);

	/**
	 * query-page-by method for field updatedDate
	 * @param updatedDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified updatedDate
	 */
	CursorPage<DmContact> queryPageByUpdatedDate(java.util.Date updatedDate,
            int pageSize, String cursorString);


		  
	// ----------------------- one-to-one finders -------------------------

	// ----------------------- many-to-one finders -------------------------
	
	// ----------------------- many-to-many finders -------------------------

	// ----------------------- uniqueFields finders -------------------------
	
	
	// ----------------------- populate / persist method -------------------------

	/**
	 * Persist an entity given all attributes
	 */
	DmContact persist(		java.lang.String id, 
		java.lang.String city, 
		java.lang.String cityArea, 
		java.lang.String companyName, 
		java.lang.String country, 
		java.lang.String county, 
		java.lang.String email, 
		java.lang.String firstName, 
		java.lang.String lastName, 
		java.lang.String mobilePhone, 
		java.lang.String name, 
		java.lang.String phone, 
		java.lang.String postalCode, 
		java.lang.String street);	

}
