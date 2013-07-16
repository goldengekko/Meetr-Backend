package com.goldengekko.meetr.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import net.sf.mardao.core.CursorPage;
import net.sf.mardao.core.Filter;
import net.sf.mardao.core.dao.DaoImpl;
import net.sf.mardao.core.dao.TypeDaoImpl;
import net.sf.mardao.core.geo.DLocation;
import com.goldengekko.meetr.domain.DmContact;

/**
 * The DmContact domain-object specific finders and methods go in this POJO.
 * 
 * Generated on 2013-07-18T11:30:21.619+0200.
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public class GeneratedDmContactDaoImpl extends TypeDaoImpl<DmContact, java.lang.String> 
	implements GeneratedDmContactDao {


    /** to list the property names for ManyToOne relations */
    @Override
    protected List<String> getBasicColumnNames() {
        return BASIC_NAMES;
    }

    /** to list the property names for ManyToOne relations */
    @Override
    protected List<String> getManyToOneColumnNames() {
        return MANY_TO_ONE_NAMES;
    }

    private final Map<String, DaoImpl> MANY_TO_ONE_DAOS = new TreeMap<String, DaoImpl>();

    /** Default constructor */
   public GeneratedDmContactDaoImpl() {
      super(DmContact.class, java.lang.String.class);
   }

   // ------ BEGIN DaoImpl overrides -----------------------------
   
   public String getPrimaryKeyColumnName() {
   		return COLUMN_NAME_ID;
   }
   
   public List<String> getColumnNames() {
        return COLUMN_NAMES;
   }

   @Override
   protected DaoImpl getManyToOneDao(String columnName) {
       return MANY_TO_ONE_DAOS.get(columnName);
   }

    @Override
    protected Object getDomainProperty(DmContact domain, String name) {
        Object value;
        // simple key?
        if (COLUMN_NAME_ID.equals(name)) {
            value = domain.getId();
        }
        // fields
        else if (COLUMN_NAME_CITY.equals(name)) {
            value = domain.getCity();
        }
        else if (COLUMN_NAME_CITYAREA.equals(name)) {
            value = domain.getCityArea();
        }
        else if (COLUMN_NAME_COMPANYNAME.equals(name)) {
            value = domain.getCompanyName();
        }
        else if (COLUMN_NAME_COUNTRY.equals(name)) {
            value = domain.getCountry();
        }
        else if (COLUMN_NAME_COUNTY.equals(name)) {
            value = domain.getCounty();
        }
        else if (COLUMN_NAME_CREATEDBY.equals(name)) {
            value = domain.getCreatedBy();
        }
        else if (COLUMN_NAME_CREATEDDATE.equals(name)) {
            value = domain.getCreatedDate();
        }
        else if (COLUMN_NAME_EMAIL.equals(name)) {
            value = domain.getEmail();
        }
        else if (COLUMN_NAME_FIRSTNAME.equals(name)) {
            value = domain.getFirstName();
        }
        else if (COLUMN_NAME_LASTNAME.equals(name)) {
            value = domain.getLastName();
        }
        else if (COLUMN_NAME_MOBILEPHONE.equals(name)) {
            value = domain.getMobilePhone();
        }
        else if (COLUMN_NAME_NAME.equals(name)) {
            value = domain.getName();
        }
        else if (COLUMN_NAME_PHONE.equals(name)) {
            value = domain.getPhone();
        }
        else if (COLUMN_NAME_POSTALCODE.equals(name)) {
            value = domain.getPostalCode();
        }
        else if (COLUMN_NAME_STREET.equals(name)) {
            value = domain.getStreet();
        }
        else if (COLUMN_NAME_UPDATEDBY.equals(name)) {
            value = domain.getUpdatedBy();
        }
        else if (COLUMN_NAME_UPDATEDDATE.equals(name)) {
            value = domain.getUpdatedDate();
        }
        // one-to-ones
        // many-to-ones
        // many-to-manys
        else {
            value = super.getDomainProperty(domain, name);
        }

        return value;
    }

    /**
     * Returns the class of the domain property for specified column
     * @param name
     * @return the class of the domain property
     */
    public Class getColumnClass(String name) {
        Class clazz;
        // simple key?
        if (COLUMN_NAME_ID.equals(name)) {
            clazz = java.lang.String.class;
        }
        // fields
        else if (COLUMN_NAME_CITY.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_CITYAREA.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_COMPANYNAME.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_COUNTRY.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_COUNTY.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_CREATEDBY.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_CREATEDDATE.equals(name)) {
            clazz = java.util.Date.class;
        }
        else if (COLUMN_NAME_EMAIL.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_FIRSTNAME.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_LASTNAME.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_MOBILEPHONE.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_NAME.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_PHONE.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_POSTALCODE.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_STREET.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_UPDATEDBY.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_UPDATEDDATE.equals(name)) {
            clazz = java.util.Date.class;
        }
        // one-to-ones
        // many-to-ones
        // many-to-manys
        else {
            throw new IllegalArgumentException("No such column " + name);
        }

        return clazz;
    }
      
    @Override
    protected void setDomainProperty(final DmContact domain, final String name, final Object value) {
        // simple key?
        if (COLUMN_NAME_ID.equals(name)) {
            domain.setId((java.lang.String) value);
        }
        // fields
        else if (COLUMN_NAME_CITY.equals(name)) {
            domain.setCity((java.lang.String) value);
        }
        else if (COLUMN_NAME_CITYAREA.equals(name)) {
            domain.setCityArea((java.lang.String) value);
        }
        else if (COLUMN_NAME_COMPANYNAME.equals(name)) {
            domain.setCompanyName((java.lang.String) value);
        }
        else if (COLUMN_NAME_COUNTRY.equals(name)) {
            domain.setCountry((java.lang.String) value);
        }
        else if (COLUMN_NAME_COUNTY.equals(name)) {
            domain.setCounty((java.lang.String) value);
        }
        else if (COLUMN_NAME_CREATEDBY.equals(name)) {
            domain.setCreatedBy((java.lang.String) value);
        }
        else if (COLUMN_NAME_CREATEDDATE.equals(name)) {
            domain.setCreatedDate((java.util.Date) value);
        }
        else if (COLUMN_NAME_EMAIL.equals(name)) {
            domain.setEmail((java.lang.String) value);
        }
        else if (COLUMN_NAME_FIRSTNAME.equals(name)) {
            domain.setFirstName((java.lang.String) value);
        }
        else if (COLUMN_NAME_LASTNAME.equals(name)) {
            domain.setLastName((java.lang.String) value);
        }
        else if (COLUMN_NAME_MOBILEPHONE.equals(name)) {
            domain.setMobilePhone((java.lang.String) value);
        }
        else if (COLUMN_NAME_NAME.equals(name)) {
            domain.setName((java.lang.String) value);
        }
        else if (COLUMN_NAME_PHONE.equals(name)) {
            domain.setPhone((java.lang.String) value);
        }
        else if (COLUMN_NAME_POSTALCODE.equals(name)) {
            domain.setPostalCode((java.lang.String) value);
        }
        else if (COLUMN_NAME_STREET.equals(name)) {
            domain.setStreet((java.lang.String) value);
        }
        else if (COLUMN_NAME_UPDATEDBY.equals(name)) {
            domain.setUpdatedBy((java.lang.String) value);
        }
        else if (COLUMN_NAME_UPDATEDDATE.equals(name)) {
            domain.setUpdatedDate((java.util.Date) value);
        }
        // one-to-ones
        // many-to-ones
        // many-to-manys
        else {
            super.setDomainProperty(domain, name, value);
        }
    }

    @Override
    protected void setDomainStringProperty(final DmContact domain, final String name, final Map<String, String> properties) {
        final String value = properties.get(name);
        Class clazz = getColumnClass(name);
        // many-to-ones
        setDomainProperty(domain, name, parseProperty(value, clazz));
    }

    /**
     * Overrides to substitute Entity properties with foreign keys
     */
    @Override
    protected void setCoreProperty(Object core, String name, Object value) {
        if (null == core || null == name) {
            return;
        }
        else if (null == value) {
            // do nothing in particular, will call super at end
        }
        super.setCoreProperty(core, name, value);
    }

   // ------ END DaoImpl overrides -----------------------------

        // DmContact has no parent

        /**
         * @return the simple key for specified DmContact domain object
         */
        public String getSimpleKey(DmContact domain) {
            if (null == domain) {
                return null;
            }
            return domain.getId();
        }

        /**
         * @return the simple key for specified DmContact domain object
         */
        public void setSimpleKey(DmContact domain, String id) {
            domain.setId(id);
        }

        public String getCreatedByColumnName() {
            return COLUMN_NAME_CREATEDBY;
        }

        public String getCreatedBy(DmContact domain) {
            if (null == domain) {
                return null;
            }
            return domain.getCreatedBy();
        }

        public void _setCreatedBy(DmContact domain, String creator) {
            domain.setCreatedBy(creator);
        }

        public String getUpdatedByColumnName() {
            return COLUMN_NAME_UPDATEDBY;
        }

        public String getUpdatedBy(DmContact domain) {
            if (null == domain) {
                return null;
            }
            return domain.getUpdatedBy();
        }

        public void _setUpdatedBy(DmContact domain, String updator) {
            domain.setUpdatedBy(updator);
        }

        public String getCreatedDateColumnName() {
            return COLUMN_NAME_CREATEDDATE;
        }

        public Date getCreatedDate(DmContact domain) {
            if (null == domain) {
                return null;
            }
            return domain.getCreatedDate();
        }

        public void _setCreatedDate(DmContact domain, Date date) {
            domain.setCreatedDate(date);
        }

        public String getUpdatedDateColumnName() {
            return COLUMN_NAME_UPDATEDDATE;
        }

        public Date getUpdatedDate(DmContact domain) {
            if (null == domain) {
                return null;
            }
            return domain.getUpdatedDate();
        }

        public void _setUpdatedDate(DmContact domain, Date date) {
            domain.setUpdatedDate(date);
        }

	// ----------------------- field finders -------------------------------
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmContact> queryByCity(java.lang.String city) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CITY, city);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field city
	 * @param city the specified attribute
	 * @return an Iterable of keys to the DmContacts with the specified attribute
	 */
	public final Iterable<java.lang.String> queryKeysByCity(java.lang.String city) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CITY, city);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field city
	 * @param city the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified city
	 */
	public final CursorPage<DmContact> queryPageByCity(java.lang.String city,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CITY, city);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmContact> queryByCityArea(java.lang.String cityArea) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CITYAREA, cityArea);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field cityArea
	 * @param cityArea the specified attribute
	 * @return an Iterable of keys to the DmContacts with the specified attribute
	 */
	public final Iterable<java.lang.String> queryKeysByCityArea(java.lang.String cityArea) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CITYAREA, cityArea);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field cityArea
	 * @param cityArea the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified cityArea
	 */
	public final CursorPage<DmContact> queryPageByCityArea(java.lang.String cityArea,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CITYAREA, cityArea);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmContact> queryByCompanyName(java.lang.String companyName) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_COMPANYNAME, companyName);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field companyName
	 * @param companyName the specified attribute
	 * @return an Iterable of keys to the DmContacts with the specified attribute
	 */
	public final Iterable<java.lang.String> queryKeysByCompanyName(java.lang.String companyName) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_COMPANYNAME, companyName);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field companyName
	 * @param companyName the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified companyName
	 */
	public final CursorPage<DmContact> queryPageByCompanyName(java.lang.String companyName,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_COMPANYNAME, companyName);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmContact> queryByCountry(java.lang.String country) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_COUNTRY, country);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field country
	 * @param country the specified attribute
	 * @return an Iterable of keys to the DmContacts with the specified attribute
	 */
	public final Iterable<java.lang.String> queryKeysByCountry(java.lang.String country) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_COUNTRY, country);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field country
	 * @param country the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified country
	 */
	public final CursorPage<DmContact> queryPageByCountry(java.lang.String country,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_COUNTRY, country);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmContact> queryByCounty(java.lang.String county) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_COUNTY, county);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field county
	 * @param county the specified attribute
	 * @return an Iterable of keys to the DmContacts with the specified attribute
	 */
	public final Iterable<java.lang.String> queryKeysByCounty(java.lang.String county) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_COUNTY, county);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field county
	 * @param county the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified county
	 */
	public final CursorPage<DmContact> queryPageByCounty(java.lang.String county,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_COUNTY, county);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmContact> queryByCreatedBy(java.lang.String createdBy) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDBY, createdBy);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of keys to the DmContacts with the specified attribute
	 */
	public final Iterable<java.lang.String> queryKeysByCreatedBy(java.lang.String createdBy) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDBY, createdBy);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field createdBy
	 * @param createdBy the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified createdBy
	 */
	public final CursorPage<DmContact> queryPageByCreatedBy(java.lang.String createdBy,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDBY, createdBy);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmContact> queryByCreatedDate(java.util.Date createdDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDDATE, createdDate);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of keys to the DmContacts with the specified attribute
	 */
	public final Iterable<java.lang.String> queryKeysByCreatedDate(java.util.Date createdDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDDATE, createdDate);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field createdDate
	 * @param createdDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified createdDate
	 */
	public final CursorPage<DmContact> queryPageByCreatedDate(java.util.Date createdDate,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDDATE, createdDate);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmContact> queryByEmail(java.lang.String email) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_EMAIL, email);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field email
	 * @param email the specified attribute
	 * @return an Iterable of keys to the DmContacts with the specified attribute
	 */
	public final Iterable<java.lang.String> queryKeysByEmail(java.lang.String email) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_EMAIL, email);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field email
	 * @param email the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified email
	 */
	public final CursorPage<DmContact> queryPageByEmail(java.lang.String email,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_EMAIL, email);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmContact> queryByFirstName(java.lang.String firstName) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_FIRSTNAME, firstName);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field firstName
	 * @param firstName the specified attribute
	 * @return an Iterable of keys to the DmContacts with the specified attribute
	 */
	public final Iterable<java.lang.String> queryKeysByFirstName(java.lang.String firstName) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_FIRSTNAME, firstName);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field firstName
	 * @param firstName the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified firstName
	 */
	public final CursorPage<DmContact> queryPageByFirstName(java.lang.String firstName,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_FIRSTNAME, firstName);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmContact> queryByLastName(java.lang.String lastName) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_LASTNAME, lastName);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field lastName
	 * @param lastName the specified attribute
	 * @return an Iterable of keys to the DmContacts with the specified attribute
	 */
	public final Iterable<java.lang.String> queryKeysByLastName(java.lang.String lastName) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_LASTNAME, lastName);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field lastName
	 * @param lastName the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified lastName
	 */
	public final CursorPage<DmContact> queryPageByLastName(java.lang.String lastName,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_LASTNAME, lastName);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmContact> queryByMobilePhone(java.lang.String mobilePhone) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_MOBILEPHONE, mobilePhone);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field mobilePhone
	 * @param mobilePhone the specified attribute
	 * @return an Iterable of keys to the DmContacts with the specified attribute
	 */
	public final Iterable<java.lang.String> queryKeysByMobilePhone(java.lang.String mobilePhone) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_MOBILEPHONE, mobilePhone);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field mobilePhone
	 * @param mobilePhone the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified mobilePhone
	 */
	public final CursorPage<DmContact> queryPageByMobilePhone(java.lang.String mobilePhone,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_MOBILEPHONE, mobilePhone);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmContact> queryByName(java.lang.String name) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_NAME, name);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field name
	 * @param name the specified attribute
	 * @return an Iterable of keys to the DmContacts with the specified attribute
	 */
	public final Iterable<java.lang.String> queryKeysByName(java.lang.String name) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_NAME, name);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field name
	 * @param name the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified name
	 */
	public final CursorPage<DmContact> queryPageByName(java.lang.String name,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_NAME, name);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmContact> queryByPhone(java.lang.String phone) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_PHONE, phone);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field phone
	 * @param phone the specified attribute
	 * @return an Iterable of keys to the DmContacts with the specified attribute
	 */
	public final Iterable<java.lang.String> queryKeysByPhone(java.lang.String phone) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_PHONE, phone);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field phone
	 * @param phone the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified phone
	 */
	public final CursorPage<DmContact> queryPageByPhone(java.lang.String phone,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_PHONE, phone);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmContact> queryByPostalCode(java.lang.String postalCode) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_POSTALCODE, postalCode);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field postalCode
	 * @param postalCode the specified attribute
	 * @return an Iterable of keys to the DmContacts with the specified attribute
	 */
	public final Iterable<java.lang.String> queryKeysByPostalCode(java.lang.String postalCode) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_POSTALCODE, postalCode);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field postalCode
	 * @param postalCode the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified postalCode
	 */
	public final CursorPage<DmContact> queryPageByPostalCode(java.lang.String postalCode,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_POSTALCODE, postalCode);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmContact> queryByStreet(java.lang.String street) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_STREET, street);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field street
	 * @param street the specified attribute
	 * @return an Iterable of keys to the DmContacts with the specified attribute
	 */
	public final Iterable<java.lang.String> queryKeysByStreet(java.lang.String street) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_STREET, street);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field street
	 * @param street the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified street
	 */
	public final CursorPage<DmContact> queryPageByStreet(java.lang.String street,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_STREET, street);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmContact> queryByUpdatedBy(java.lang.String updatedBy) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDBY, updatedBy);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of keys to the DmContacts with the specified attribute
	 */
	public final Iterable<java.lang.String> queryKeysByUpdatedBy(java.lang.String updatedBy) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDBY, updatedBy);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field updatedBy
	 * @param updatedBy the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified updatedBy
	 */
	public final CursorPage<DmContact> queryPageByUpdatedBy(java.lang.String updatedBy,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDBY, updatedBy);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmContact> queryByUpdatedDate(java.util.Date updatedDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDDATE, updatedDate);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of keys to the DmContacts with the specified attribute
	 */
	public final Iterable<java.lang.String> queryKeysByUpdatedDate(java.util.Date updatedDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDDATE, updatedDate);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field updatedDate
	 * @param updatedDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmContacts for the specified updatedDate
	 */
	public final CursorPage<DmContact> queryPageByUpdatedDate(java.util.Date updatedDate,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDDATE, updatedDate);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	// ----------------------- one-to-one finders -------------------------

	// ----------------------- many-to-one finders -------------------------

	// ----------------------- many-to-many finders -------------------------

	// ----------------------- uniqueFields finders -------------------------

	// ----------------------- populate / persist method -------------------------

	/**
	 * Persist an entity given all attributes
	 */
	public DmContact persist(		java.lang.String id, 
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
		java.lang.String street) {

            DmContact domain = null;
            // if primaryKey specified, use it
            if (null != id) {
                    domain = findByPrimaryKey(id);
            }
		
            // create new?
            if (null == domain) {
                    domain = new DmContact();
                    // generate Id?
                    if (null != id) {
                            domain.setId(id);
                    }
                    // fields
                    domain.setCity(city);
                    domain.setCityArea(cityArea);
                    domain.setCompanyName(companyName);
                    domain.setCountry(country);
                    domain.setCounty(county);
                    domain.setEmail(email);
                    domain.setFirstName(firstName);
                    domain.setLastName(lastName);
                    domain.setMobilePhone(mobilePhone);
                    domain.setName(name);
                    domain.setPhone(phone);
                    domain.setPostalCode(postalCode);
                    domain.setStreet(street);
                    // one-to-ones
                    // many-to-ones
			
                    persist(domain);
            }
            return domain;
	}



}
