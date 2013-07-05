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
import com.goldengekko.meetr.domain.DmAccount;

/**
 * The DmAccount domain-object specific finders and methods go in this POJO.
 * 
 * Generated on 2013-07-05T11:38:47.866+0700.
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public class GeneratedDmAccountDaoImpl extends TypeDaoImpl<DmAccount, java.lang.String> 
	implements GeneratedDmAccountDao {


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
   public GeneratedDmAccountDaoImpl() {
      super(DmAccount.class, java.lang.String.class);
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
    protected Object getDomainProperty(DmAccount domain, String name) {
        Object value;
        // simple key?
        if (COLUMN_NAME_ID.equals(name)) {
            value = domain.getId();
        }
        // fields
        else if (COLUMN_NAME_BILLINGCITY.equals(name)) {
            value = domain.getBillingCity();
        }
        else if (COLUMN_NAME_BILLINGCOUNTRY.equals(name)) {
            value = domain.getBillingCountry();
        }
        else if (COLUMN_NAME_BILLINGPOSTALCODE.equals(name)) {
            value = domain.getBillingPostalCode();
        }
        else if (COLUMN_NAME_BILLINGSTATE.equals(name)) {
            value = domain.getBillingState();
        }
        else if (COLUMN_NAME_BILLINGSTREET.equals(name)) {
            value = domain.getBillingStreet();
        }
        else if (COLUMN_NAME_CREATEDBY.equals(name)) {
            value = domain.getCreatedBy();
        }
        else if (COLUMN_NAME_CREATEDDATE.equals(name)) {
            value = domain.getCreatedDate();
        }
        else if (COLUMN_NAME_NAME.equals(name)) {
            value = domain.getName();
        }
        else if (COLUMN_NAME_PHONE.equals(name)) {
            value = domain.getPhone();
        }
        else if (COLUMN_NAME_SHIPPINGCITY.equals(name)) {
            value = domain.getShippingCity();
        }
        else if (COLUMN_NAME_SHIPPINGCOUNTRY.equals(name)) {
            value = domain.getShippingCountry();
        }
        else if (COLUMN_NAME_SHIPPINGPOSTALCODE.equals(name)) {
            value = domain.getShippingPostalCode();
        }
        else if (COLUMN_NAME_SHIPPINGSTATE.equals(name)) {
            value = domain.getShippingState();
        }
        else if (COLUMN_NAME_SHIPPINGSTREET.equals(name)) {
            value = domain.getShippingStreet();
        }
        else if (COLUMN_NAME_UPDATEDBY.equals(name)) {
            value = domain.getUpdatedBy();
        }
        else if (COLUMN_NAME_UPDATEDDATE.equals(name)) {
            value = domain.getUpdatedDate();
        }
        else if (COLUMN_NAME_WWWURL.equals(name)) {
            value = domain.getWwwUrl();
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
        else if (COLUMN_NAME_BILLINGCITY.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_BILLINGCOUNTRY.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_BILLINGPOSTALCODE.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_BILLINGSTATE.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_BILLINGSTREET.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_CREATEDBY.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_CREATEDDATE.equals(name)) {
            clazz = java.util.Date.class;
        }
        else if (COLUMN_NAME_NAME.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_PHONE.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_SHIPPINGCITY.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_SHIPPINGCOUNTRY.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_SHIPPINGPOSTALCODE.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_SHIPPINGSTATE.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_SHIPPINGSTREET.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_UPDATEDBY.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_UPDATEDDATE.equals(name)) {
            clazz = java.util.Date.class;
        }
        else if (COLUMN_NAME_WWWURL.equals(name)) {
            clazz = java.lang.String.class;
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
    protected void setDomainProperty(final DmAccount domain, final String name, final Object value) {
        // simple key?
        if (COLUMN_NAME_ID.equals(name)) {
            domain.setId((java.lang.String) value);
        }
        // fields
        else if (COLUMN_NAME_BILLINGCITY.equals(name)) {
            domain.setBillingCity((java.lang.String) value);
        }
        else if (COLUMN_NAME_BILLINGCOUNTRY.equals(name)) {
            domain.setBillingCountry((java.lang.String) value);
        }
        else if (COLUMN_NAME_BILLINGPOSTALCODE.equals(name)) {
            domain.setBillingPostalCode((java.lang.String) value);
        }
        else if (COLUMN_NAME_BILLINGSTATE.equals(name)) {
            domain.setBillingState((java.lang.String) value);
        }
        else if (COLUMN_NAME_BILLINGSTREET.equals(name)) {
            domain.setBillingStreet((java.lang.String) value);
        }
        else if (COLUMN_NAME_CREATEDBY.equals(name)) {
            domain.setCreatedBy((java.lang.String) value);
        }
        else if (COLUMN_NAME_CREATEDDATE.equals(name)) {
            domain.setCreatedDate((java.util.Date) value);
        }
        else if (COLUMN_NAME_NAME.equals(name)) {
            domain.setName((java.lang.String) value);
        }
        else if (COLUMN_NAME_PHONE.equals(name)) {
            domain.setPhone((java.lang.String) value);
        }
        else if (COLUMN_NAME_SHIPPINGCITY.equals(name)) {
            domain.setShippingCity((java.lang.String) value);
        }
        else if (COLUMN_NAME_SHIPPINGCOUNTRY.equals(name)) {
            domain.setShippingCountry((java.lang.String) value);
        }
        else if (COLUMN_NAME_SHIPPINGPOSTALCODE.equals(name)) {
            domain.setShippingPostalCode((java.lang.String) value);
        }
        else if (COLUMN_NAME_SHIPPINGSTATE.equals(name)) {
            domain.setShippingState((java.lang.String) value);
        }
        else if (COLUMN_NAME_SHIPPINGSTREET.equals(name)) {
            domain.setShippingStreet((java.lang.String) value);
        }
        else if (COLUMN_NAME_UPDATEDBY.equals(name)) {
            domain.setUpdatedBy((java.lang.String) value);
        }
        else if (COLUMN_NAME_UPDATEDDATE.equals(name)) {
            domain.setUpdatedDate((java.util.Date) value);
        }
        else if (COLUMN_NAME_WWWURL.equals(name)) {
            domain.setWwwUrl((java.lang.String) value);
        }
        // one-to-ones
        // many-to-ones
        // many-to-manys
        else {
            super.setDomainProperty(domain, name, value);
        }
    }

    @Override
    protected void setDomainStringProperty(final DmAccount domain, final String name, final Map<String, String> properties) {
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

        // DmAccount has no parent

        /**
         * @return the simple key for specified DmAccount domain object
         */
        public String getSimpleKey(DmAccount domain) {
            if (null == domain) {
                return null;
            }
            return domain.getId();
        }

        /**
         * @return the simple key for specified DmAccount domain object
         */
        public void setSimpleKey(DmAccount domain, String id) {
            domain.setId(id);
        }

        public String getCreatedByColumnName() {
            return COLUMN_NAME_CREATEDBY;
        }

        public String getCreatedBy(DmAccount domain) {
            if (null == domain) {
                return null;
            }
            return domain.getCreatedBy();
        }

        public void _setCreatedBy(DmAccount domain, String creator) {
            domain.setCreatedBy(creator);
        }

        public String getUpdatedByColumnName() {
            return COLUMN_NAME_UPDATEDBY;
        }

        public String getUpdatedBy(DmAccount domain) {
            if (null == domain) {
                return null;
            }
            return domain.getUpdatedBy();
        }

        public void _setUpdatedBy(DmAccount domain, String updator) {
            domain.setUpdatedBy(updator);
        }

        public String getCreatedDateColumnName() {
            return COLUMN_NAME_CREATEDDATE;
        }

        public Date getCreatedDate(DmAccount domain) {
            if (null == domain) {
                return null;
            }
            return domain.getCreatedDate();
        }

        public void _setCreatedDate(DmAccount domain, Date date) {
            domain.setCreatedDate(date);
        }

        public String getUpdatedDateColumnName() {
            return COLUMN_NAME_UPDATEDDATE;
        }

        public Date getUpdatedDate(DmAccount domain) {
            if (null == domain) {
                return null;
            }
            return domain.getUpdatedDate();
        }

        public void _setUpdatedDate(DmAccount domain, Date date) {
            domain.setUpdatedDate(date);
        }

	// ----------------------- field finders -------------------------------
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmAccount> queryByBillingCity(java.lang.String billingCity) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_BILLINGCITY, billingCity);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field billingCity
	 * @param billingCity the specified attribute
	 * @return an Iterable of keys to the DmAccounts with the specified attribute
	 */
	public final Iterable<java.lang.String> queryKeysByBillingCity(java.lang.String billingCity) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_BILLINGCITY, billingCity);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field billingCity
	 * @param billingCity the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAccounts for the specified billingCity
	 */
	public final CursorPage<DmAccount, java.lang.String> queryPageByBillingCity(java.lang.String billingCity,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_BILLINGCITY, billingCity);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmAccount> queryByBillingCountry(java.lang.String billingCountry) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_BILLINGCOUNTRY, billingCountry);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field billingCountry
	 * @param billingCountry the specified attribute
	 * @return an Iterable of keys to the DmAccounts with the specified attribute
	 */
	public final Iterable<java.lang.String> queryKeysByBillingCountry(java.lang.String billingCountry) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_BILLINGCOUNTRY, billingCountry);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field billingCountry
	 * @param billingCountry the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAccounts for the specified billingCountry
	 */
	public final CursorPage<DmAccount, java.lang.String> queryPageByBillingCountry(java.lang.String billingCountry,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_BILLINGCOUNTRY, billingCountry);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmAccount> queryByBillingPostalCode(java.lang.String billingPostalCode) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_BILLINGPOSTALCODE, billingPostalCode);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field billingPostalCode
	 * @param billingPostalCode the specified attribute
	 * @return an Iterable of keys to the DmAccounts with the specified attribute
	 */
	public final Iterable<java.lang.String> queryKeysByBillingPostalCode(java.lang.String billingPostalCode) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_BILLINGPOSTALCODE, billingPostalCode);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field billingPostalCode
	 * @param billingPostalCode the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAccounts for the specified billingPostalCode
	 */
	public final CursorPage<DmAccount, java.lang.String> queryPageByBillingPostalCode(java.lang.String billingPostalCode,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_BILLINGPOSTALCODE, billingPostalCode);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmAccount> queryByBillingState(java.lang.String billingState) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_BILLINGSTATE, billingState);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field billingState
	 * @param billingState the specified attribute
	 * @return an Iterable of keys to the DmAccounts with the specified attribute
	 */
	public final Iterable<java.lang.String> queryKeysByBillingState(java.lang.String billingState) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_BILLINGSTATE, billingState);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field billingState
	 * @param billingState the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAccounts for the specified billingState
	 */
	public final CursorPage<DmAccount, java.lang.String> queryPageByBillingState(java.lang.String billingState,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_BILLINGSTATE, billingState);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmAccount> queryByBillingStreet(java.lang.String billingStreet) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_BILLINGSTREET, billingStreet);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field billingStreet
	 * @param billingStreet the specified attribute
	 * @return an Iterable of keys to the DmAccounts with the specified attribute
	 */
	public final Iterable<java.lang.String> queryKeysByBillingStreet(java.lang.String billingStreet) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_BILLINGSTREET, billingStreet);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field billingStreet
	 * @param billingStreet the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAccounts for the specified billingStreet
	 */
	public final CursorPage<DmAccount, java.lang.String> queryPageByBillingStreet(java.lang.String billingStreet,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_BILLINGSTREET, billingStreet);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmAccount> queryByCreatedBy(java.lang.String createdBy) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDBY, createdBy);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of keys to the DmAccounts with the specified attribute
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
	 * @return a Page of DmAccounts for the specified createdBy
	 */
	public final CursorPage<DmAccount, java.lang.String> queryPageByCreatedBy(java.lang.String createdBy,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDBY, createdBy);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmAccount> queryByCreatedDate(java.util.Date createdDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDDATE, createdDate);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of keys to the DmAccounts with the specified attribute
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
	 * @return a Page of DmAccounts for the specified createdDate
	 */
	public final CursorPage<DmAccount, java.lang.String> queryPageByCreatedDate(java.util.Date createdDate,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDDATE, createdDate);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmAccount> queryByName(java.lang.String name) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_NAME, name);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field name
	 * @param name the specified attribute
	 * @return an Iterable of keys to the DmAccounts with the specified attribute
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
	 * @return a Page of DmAccounts for the specified name
	 */
	public final CursorPage<DmAccount, java.lang.String> queryPageByName(java.lang.String name,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_NAME, name);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmAccount> queryByPhone(java.lang.String phone) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_PHONE, phone);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field phone
	 * @param phone the specified attribute
	 * @return an Iterable of keys to the DmAccounts with the specified attribute
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
	 * @return a Page of DmAccounts for the specified phone
	 */
	public final CursorPage<DmAccount, java.lang.String> queryPageByPhone(java.lang.String phone,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_PHONE, phone);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmAccount> queryByShippingCity(java.lang.String shippingCity) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_SHIPPINGCITY, shippingCity);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field shippingCity
	 * @param shippingCity the specified attribute
	 * @return an Iterable of keys to the DmAccounts with the specified attribute
	 */
	public final Iterable<java.lang.String> queryKeysByShippingCity(java.lang.String shippingCity) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_SHIPPINGCITY, shippingCity);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field shippingCity
	 * @param shippingCity the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAccounts for the specified shippingCity
	 */
	public final CursorPage<DmAccount, java.lang.String> queryPageByShippingCity(java.lang.String shippingCity,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_SHIPPINGCITY, shippingCity);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmAccount> queryByShippingCountry(java.lang.String shippingCountry) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_SHIPPINGCOUNTRY, shippingCountry);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field shippingCountry
	 * @param shippingCountry the specified attribute
	 * @return an Iterable of keys to the DmAccounts with the specified attribute
	 */
	public final Iterable<java.lang.String> queryKeysByShippingCountry(java.lang.String shippingCountry) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_SHIPPINGCOUNTRY, shippingCountry);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field shippingCountry
	 * @param shippingCountry the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAccounts for the specified shippingCountry
	 */
	public final CursorPage<DmAccount, java.lang.String> queryPageByShippingCountry(java.lang.String shippingCountry,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_SHIPPINGCOUNTRY, shippingCountry);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmAccount> queryByShippingPostalCode(java.lang.String shippingPostalCode) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_SHIPPINGPOSTALCODE, shippingPostalCode);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field shippingPostalCode
	 * @param shippingPostalCode the specified attribute
	 * @return an Iterable of keys to the DmAccounts with the specified attribute
	 */
	public final Iterable<java.lang.String> queryKeysByShippingPostalCode(java.lang.String shippingPostalCode) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_SHIPPINGPOSTALCODE, shippingPostalCode);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field shippingPostalCode
	 * @param shippingPostalCode the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAccounts for the specified shippingPostalCode
	 */
	public final CursorPage<DmAccount, java.lang.String> queryPageByShippingPostalCode(java.lang.String shippingPostalCode,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_SHIPPINGPOSTALCODE, shippingPostalCode);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmAccount> queryByShippingState(java.lang.String shippingState) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_SHIPPINGSTATE, shippingState);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field shippingState
	 * @param shippingState the specified attribute
	 * @return an Iterable of keys to the DmAccounts with the specified attribute
	 */
	public final Iterable<java.lang.String> queryKeysByShippingState(java.lang.String shippingState) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_SHIPPINGSTATE, shippingState);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field shippingState
	 * @param shippingState the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAccounts for the specified shippingState
	 */
	public final CursorPage<DmAccount, java.lang.String> queryPageByShippingState(java.lang.String shippingState,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_SHIPPINGSTATE, shippingState);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmAccount> queryByShippingStreet(java.lang.String shippingStreet) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_SHIPPINGSTREET, shippingStreet);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field shippingStreet
	 * @param shippingStreet the specified attribute
	 * @return an Iterable of keys to the DmAccounts with the specified attribute
	 */
	public final Iterable<java.lang.String> queryKeysByShippingStreet(java.lang.String shippingStreet) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_SHIPPINGSTREET, shippingStreet);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field shippingStreet
	 * @param shippingStreet the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAccounts for the specified shippingStreet
	 */
	public final CursorPage<DmAccount, java.lang.String> queryPageByShippingStreet(java.lang.String shippingStreet,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_SHIPPINGSTREET, shippingStreet);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmAccount> queryByUpdatedBy(java.lang.String updatedBy) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDBY, updatedBy);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of keys to the DmAccounts with the specified attribute
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
	 * @return a Page of DmAccounts for the specified updatedBy
	 */
	public final CursorPage<DmAccount, java.lang.String> queryPageByUpdatedBy(java.lang.String updatedBy,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDBY, updatedBy);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmAccount> queryByUpdatedDate(java.util.Date updatedDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDDATE, updatedDate);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of keys to the DmAccounts with the specified attribute
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
	 * @return a Page of DmAccounts for the specified updatedDate
	 */
	public final CursorPage<DmAccount, java.lang.String> queryPageByUpdatedDate(java.util.Date updatedDate,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDDATE, updatedDate);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmAccount> queryByWwwUrl(java.lang.String wwwUrl) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_WWWURL, wwwUrl);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field wwwUrl
	 * @param wwwUrl the specified attribute
	 * @return an Iterable of keys to the DmAccounts with the specified attribute
	 */
	public final Iterable<java.lang.String> queryKeysByWwwUrl(java.lang.String wwwUrl) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_WWWURL, wwwUrl);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field wwwUrl
	 * @param wwwUrl the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmAccounts for the specified wwwUrl
	 */
	public final CursorPage<DmAccount, java.lang.String> queryPageByWwwUrl(java.lang.String wwwUrl,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_WWWURL, wwwUrl);
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
	public DmAccount persist(		java.lang.String id, 
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
		java.lang.String wwwUrl) {

            DmAccount domain = null;
            // if primaryKey specified, use it
            if (null != id) {
                    domain = findByPrimaryKey(id);
            }
		
            // create new?
            if (null == domain) {
                    domain = new DmAccount();
                    // generate Id?
                    if (null != id) {
                            domain.setId(id);
                    }
                    // fields
                    domain.setBillingCity(billingCity);
                    domain.setBillingCountry(billingCountry);
                    domain.setBillingPostalCode(billingPostalCode);
                    domain.setBillingState(billingState);
                    domain.setBillingStreet(billingStreet);
                    domain.setName(name);
                    domain.setPhone(phone);
                    domain.setShippingCity(shippingCity);
                    domain.setShippingCountry(shippingCountry);
                    domain.setShippingPostalCode(shippingPostalCode);
                    domain.setShippingState(shippingState);
                    domain.setShippingStreet(shippingStreet);
                    domain.setWwwUrl(wwwUrl);
                    // one-to-ones
                    // many-to-ones
			
                    persist(domain);
            }
            return domain;
	}



}
