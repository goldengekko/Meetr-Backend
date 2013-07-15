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
import com.goldengekko.meetr.domain.DmMeeting;

/**
 * The DmMeeting domain-object specific finders and methods go in this POJO.
 * 
 * Generated on 2013-07-15T22:26:05.765+0200.
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public class GeneratedDmMeetingDaoImpl extends TypeDaoImpl<DmMeeting, java.lang.Long> 
	implements GeneratedDmMeetingDao {


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
   public GeneratedDmMeetingDaoImpl() {
      super(DmMeeting.class, java.lang.Long.class);
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
    protected Object getDomainProperty(DmMeeting domain, String name) {
        Object value;
        // simple key?
        if (COLUMN_NAME_ID.equals(name)) {
            value = domain.getId();
        }
        // fields
        else if (COLUMN_NAME_ACTUALDURATION.equals(name)) {
            value = domain.getActualDuration();
        }
        else if (COLUMN_NAME_ACTUALENDDATE.equals(name)) {
            value = domain.getActualEndDate();
        }
        else if (COLUMN_NAME_ACTUALSTARTDATE.equals(name)) {
            value = domain.getActualStartDate();
        }
        else if (COLUMN_NAME_ADDRESS.equals(name)) {
            value = domain.getAddress();
        }
        else if (COLUMN_NAME_AGENDAITEMSYNCHIDS.equals(name)) {
            value = domain.getAgendaItemSynchIds();
        }
        else if (COLUMN_NAME_ALERTOFFSETINMINUTES.equals(name)) {
            value = domain.getAlertOffsetInMinutes();
        }
        else if (COLUMN_NAME_ATTENDEENAMES.equals(name)) {
            value = domain.getAttendeeNames();
        }
        else if (COLUMN_NAME_ATTENDEESYNCHIDS.equals(name)) {
            value = domain.getAttendeeSynchIds();
        }
        else if (COLUMN_NAME_COMPANYNAME.equals(name)) {
            value = domain.getCompanyName();
        }
        else if (COLUMN_NAME_COMPANYSYNCHID.equals(name)) {
            value = domain.getCompanySynchId();
        }
        else if (COLUMN_NAME_CREATEDBY.equals(name)) {
            value = domain.getCreatedBy();
        }
        else if (COLUMN_NAME_CREATEDDATE.equals(name)) {
            value = domain.getCreatedDate();
        }
        else if (COLUMN_NAME_DETAILSNOTES.equals(name)) {
            value = domain.getDetailsNotes();
        }
        else if (COLUMN_NAME_ENDDATE.equals(name)) {
            value = domain.getEndDate();
        }
        else if (COLUMN_NAME_FILENAMES.equals(name)) {
            value = domain.getFileNames();
        }
        else if (COLUMN_NAME_FILESYNCHIDS.equals(name)) {
            value = domain.getFileSynchIds();
        }
        else if (COLUMN_NAME_FOLLOWUPFILESYNCHIDS.equals(name)) {
            value = domain.getFollowUpFileSynchIds();
        }
        else if (COLUMN_NAME_FOLLOWUPINCLUDEAGENDA.equals(name)) {
            value = domain.getFollowUpIncludeAgenda();
        }
        else if (COLUMN_NAME_FOLLOWUPLASTSENTDATE.equals(name)) {
            value = domain.getFollowUpLastSentDate();
        }
        else if (COLUMN_NAME_FOLLOWUPNOTES.equals(name)) {
            value = domain.getFollowUpNotes();
        }
        else if (COLUMN_NAME_IMAGEURL.equals(name)) {
            value = domain.getImageUrl();
        }
        else if (COLUMN_NAME_LOCATION.equals(name)) {
            value = domain.getLocation();
        }
        else if (COLUMN_NAME_LOCATIONID.equals(name)) {
            value = domain.getLocationId();
        }
        else if (COLUMN_NAME_MEETINGTYPE.equals(name)) {
            value = domain.getMeetingType();
        }
        else if (COLUMN_NAME_NOTES.equals(name)) {
            value = domain.getNotes();
        }
        else if (COLUMN_NAME_ORGANIZERID.equals(name)) {
            value = domain.getOrganizerId();
        }
        else if (COLUMN_NAME_PHONENUMBER.equals(name)) {
            value = domain.getPhoneNumber();
        }
        else if (COLUMN_NAME_REPEATMODE.equals(name)) {
            value = domain.getRepeatMode();
        }
        else if (COLUMN_NAME_STARTDATE.equals(name)) {
            value = domain.getStartDate();
        }
        else if (COLUMN_NAME_SYNCHID.equals(name)) {
            value = domain.getSynchId();
        }
        else if (COLUMN_NAME_TITLE.equals(name)) {
            value = domain.getTitle();
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
            clazz = java.lang.Long.class;
        }
        // fields
        else if (COLUMN_NAME_ACTUALDURATION.equals(name)) {
            clazz = java.lang.Long.class;
        }
        else if (COLUMN_NAME_ACTUALENDDATE.equals(name)) {
            clazz = java.util.Date.class;
        }
        else if (COLUMN_NAME_ACTUALSTARTDATE.equals(name)) {
            clazz = java.util.Date.class;
        }
        else if (COLUMN_NAME_ADDRESS.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_AGENDAITEMSYNCHIDS.equals(name)) {
            clazz = java.util.Collection.class;
        }
        else if (COLUMN_NAME_ALERTOFFSETINMINUTES.equals(name)) {
            clazz = java.lang.Integer.class;
        }
        else if (COLUMN_NAME_ATTENDEENAMES.equals(name)) {
            clazz = java.util.Collection.class;
        }
        else if (COLUMN_NAME_ATTENDEESYNCHIDS.equals(name)) {
            clazz = java.util.Collection.class;
        }
        else if (COLUMN_NAME_COMPANYNAME.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_COMPANYSYNCHID.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_CREATEDBY.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_CREATEDDATE.equals(name)) {
            clazz = java.util.Date.class;
        }
        else if (COLUMN_NAME_DETAILSNOTES.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_ENDDATE.equals(name)) {
            clazz = java.util.Date.class;
        }
        else if (COLUMN_NAME_FILENAMES.equals(name)) {
            clazz = java.util.Collection.class;
        }
        else if (COLUMN_NAME_FILESYNCHIDS.equals(name)) {
            clazz = java.util.Collection.class;
        }
        else if (COLUMN_NAME_FOLLOWUPFILESYNCHIDS.equals(name)) {
            clazz = java.util.Collection.class;
        }
        else if (COLUMN_NAME_FOLLOWUPINCLUDEAGENDA.equals(name)) {
            clazz = java.lang.Boolean.class;
        }
        else if (COLUMN_NAME_FOLLOWUPLASTSENTDATE.equals(name)) {
            clazz = java.util.Date.class;
        }
        else if (COLUMN_NAME_FOLLOWUPNOTES.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_IMAGEURL.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_LOCATION.equals(name)) {
            clazz = com.google.appengine.api.datastore.GeoPt.class;
        }
        else if (COLUMN_NAME_LOCATIONID.equals(name)) {
            clazz = java.lang.Long.class;
        }
        else if (COLUMN_NAME_MEETINGTYPE.equals(name)) {
            clazz = java.lang.Long.class;
        }
        else if (COLUMN_NAME_NOTES.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_ORGANIZERID.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_PHONENUMBER.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_REPEATMODE.equals(name)) {
            clazz = java.lang.Integer.class;
        }
        else if (COLUMN_NAME_STARTDATE.equals(name)) {
            clazz = java.util.Date.class;
        }
        else if (COLUMN_NAME_SYNCHID.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_TITLE.equals(name)) {
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
    protected void setDomainProperty(final DmMeeting domain, final String name, final Object value) {
        // simple key?
        if (COLUMN_NAME_ID.equals(name)) {
            domain.setId((java.lang.Long) value);
        }
        // fields
        else if (COLUMN_NAME_ACTUALDURATION.equals(name)) {
            domain.setActualDuration((java.lang.Long) value);
        }
        else if (COLUMN_NAME_ACTUALENDDATE.equals(name)) {
            domain.setActualEndDate((java.util.Date) value);
        }
        else if (COLUMN_NAME_ACTUALSTARTDATE.equals(name)) {
            domain.setActualStartDate((java.util.Date) value);
        }
        else if (COLUMN_NAME_ADDRESS.equals(name)) {
            domain.setAddress((java.lang.String) value);
        }
        else if (COLUMN_NAME_AGENDAITEMSYNCHIDS.equals(name)) {
            domain.setAgendaItemSynchIds((java.util.Collection) value);
        }
        else if (COLUMN_NAME_ALERTOFFSETINMINUTES.equals(name)) {
            domain.setAlertOffsetInMinutes((java.lang.Integer) value);
        }
        else if (COLUMN_NAME_ATTENDEENAMES.equals(name)) {
            domain.setAttendeeNames((java.util.Collection) value);
        }
        else if (COLUMN_NAME_ATTENDEESYNCHIDS.equals(name)) {
            domain.setAttendeeSynchIds((java.util.Collection) value);
        }
        else if (COLUMN_NAME_COMPANYNAME.equals(name)) {
            domain.setCompanyName((java.lang.String) value);
        }
        else if (COLUMN_NAME_COMPANYSYNCHID.equals(name)) {
            domain.setCompanySynchId((java.lang.String) value);
        }
        else if (COLUMN_NAME_CREATEDBY.equals(name)) {
            domain.setCreatedBy((java.lang.String) value);
        }
        else if (COLUMN_NAME_CREATEDDATE.equals(name)) {
            domain.setCreatedDate((java.util.Date) value);
        }
        else if (COLUMN_NAME_DETAILSNOTES.equals(name)) {
            domain.setDetailsNotes((java.lang.String) value);
        }
        else if (COLUMN_NAME_ENDDATE.equals(name)) {
            domain.setEndDate((java.util.Date) value);
        }
        else if (COLUMN_NAME_FILENAMES.equals(name)) {
            domain.setFileNames((java.util.Collection) value);
        }
        else if (COLUMN_NAME_FILESYNCHIDS.equals(name)) {
            domain.setFileSynchIds((java.util.Collection) value);
        }
        else if (COLUMN_NAME_FOLLOWUPFILESYNCHIDS.equals(name)) {
            domain.setFollowUpFileSynchIds((java.util.Collection) value);
        }
        else if (COLUMN_NAME_FOLLOWUPINCLUDEAGENDA.equals(name)) {
            domain.setFollowUpIncludeAgenda((java.lang.Boolean) value);
        }
        else if (COLUMN_NAME_FOLLOWUPLASTSENTDATE.equals(name)) {
            domain.setFollowUpLastSentDate((java.util.Date) value);
        }
        else if (COLUMN_NAME_FOLLOWUPNOTES.equals(name)) {
            domain.setFollowUpNotes((java.lang.String) value);
        }
        else if (COLUMN_NAME_IMAGEURL.equals(name)) {
            domain.setImageUrl((java.lang.String) value);
        }
        else if (COLUMN_NAME_LOCATION.equals(name)) {
            domain.setLocation((com.google.appengine.api.datastore.GeoPt) value);
        }
        else if (COLUMN_NAME_LOCATIONID.equals(name)) {
            domain.setLocationId((java.lang.Long) value);
        }
        else if (COLUMN_NAME_MEETINGTYPE.equals(name)) {
            domain.setMeetingType((java.lang.Long) value);
        }
        else if (COLUMN_NAME_NOTES.equals(name)) {
            domain.setNotes((java.lang.String) value);
        }
        else if (COLUMN_NAME_ORGANIZERID.equals(name)) {
            domain.setOrganizerId((java.lang.String) value);
        }
        else if (COLUMN_NAME_PHONENUMBER.equals(name)) {
            domain.setPhoneNumber((java.lang.String) value);
        }
        else if (COLUMN_NAME_REPEATMODE.equals(name)) {
            domain.setRepeatMode((java.lang.Integer) value);
        }
        else if (COLUMN_NAME_STARTDATE.equals(name)) {
            domain.setStartDate((java.util.Date) value);
        }
        else if (COLUMN_NAME_SYNCHID.equals(name)) {
            domain.setSynchId((java.lang.String) value);
        }
        else if (COLUMN_NAME_TITLE.equals(name)) {
            domain.setTitle((java.lang.String) value);
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
    protected void setDomainStringProperty(final DmMeeting domain, final String name, final Map<String, String> properties) {
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

        // DmMeeting has no parent

        /**
         * @return the simple key for specified DmMeeting domain object
         */
        public Long getSimpleKey(DmMeeting domain) {
            if (null == domain) {
                return null;
            }
            return domain.getId();
        }

        /**
         * @return the simple key for specified DmMeeting domain object
         */
        public void setSimpleKey(DmMeeting domain, Long id) {
            domain.setId(id);
        }

        public String getCreatedByColumnName() {
            return COLUMN_NAME_CREATEDBY;
        }

        public String getCreatedBy(DmMeeting domain) {
            if (null == domain) {
                return null;
            }
            return domain.getCreatedBy();
        }

        public void _setCreatedBy(DmMeeting domain, String creator) {
            domain.setCreatedBy(creator);
        }

        public String getUpdatedByColumnName() {
            return COLUMN_NAME_UPDATEDBY;
        }

        public String getUpdatedBy(DmMeeting domain) {
            if (null == domain) {
                return null;
            }
            return domain.getUpdatedBy();
        }

        public void _setUpdatedBy(DmMeeting domain, String updator) {
            domain.setUpdatedBy(updator);
        }

        public String getCreatedDateColumnName() {
            return COLUMN_NAME_CREATEDDATE;
        }

        public Date getCreatedDate(DmMeeting domain) {
            if (null == domain) {
                return null;
            }
            return domain.getCreatedDate();
        }

        public void _setCreatedDate(DmMeeting domain, Date date) {
            domain.setCreatedDate(date);
        }

        public String getUpdatedDateColumnName() {
            return COLUMN_NAME_UPDATEDDATE;
        }

        public Date getUpdatedDate(DmMeeting domain) {
            if (null == domain) {
                return null;
            }
            return domain.getUpdatedDate();
        }

        public void _setUpdatedDate(DmMeeting domain, Date date) {
            domain.setUpdatedDate(date);
        }

	// ----------------------- field finders -------------------------------
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByActualDuration(java.lang.Long actualDuration) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ACTUALDURATION, actualDuration);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field actualDuration
	 * @param actualDuration the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByActualDuration(java.lang.Long actualDuration) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ACTUALDURATION, actualDuration);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field actualDuration
	 * @param actualDuration the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified actualDuration
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByActualDuration(java.lang.Long actualDuration,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ACTUALDURATION, actualDuration);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByActualEndDate(java.util.Date actualEndDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ACTUALENDDATE, actualEndDate);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field actualEndDate
	 * @param actualEndDate the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByActualEndDate(java.util.Date actualEndDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ACTUALENDDATE, actualEndDate);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field actualEndDate
	 * @param actualEndDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified actualEndDate
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByActualEndDate(java.util.Date actualEndDate,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ACTUALENDDATE, actualEndDate);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByActualStartDate(java.util.Date actualStartDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ACTUALSTARTDATE, actualStartDate);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field actualStartDate
	 * @param actualStartDate the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByActualStartDate(java.util.Date actualStartDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ACTUALSTARTDATE, actualStartDate);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field actualStartDate
	 * @param actualStartDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified actualStartDate
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByActualStartDate(java.util.Date actualStartDate,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ACTUALSTARTDATE, actualStartDate);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByAddress(java.lang.String address) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ADDRESS, address);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field address
	 * @param address the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByAddress(java.lang.String address) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ADDRESS, address);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field address
	 * @param address the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified address
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByAddress(java.lang.String address,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ADDRESS, address);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByAgendaItemSynchIds(java.lang.Object agendaItemSynchIds) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_AGENDAITEMSYNCHIDS, agendaItemSynchIds);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field agendaItemSynchIds
	 * @param agendaItemSynchIds the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByAgendaItemSynchIds(java.lang.Object agendaItemSynchIds) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_AGENDAITEMSYNCHIDS, agendaItemSynchIds);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field agendaItemSynchIds
	 * @param agendaItemSynchIds the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified agendaItemSynchIds
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByAgendaItemSynchIds(java.lang.Object agendaItemSynchIds,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_AGENDAITEMSYNCHIDS, agendaItemSynchIds);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByAlertOffsetInMinutes(java.lang.Integer alertOffsetInMinutes) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ALERTOFFSETINMINUTES, alertOffsetInMinutes);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field alertOffsetInMinutes
	 * @param alertOffsetInMinutes the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByAlertOffsetInMinutes(java.lang.Integer alertOffsetInMinutes) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ALERTOFFSETINMINUTES, alertOffsetInMinutes);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field alertOffsetInMinutes
	 * @param alertOffsetInMinutes the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified alertOffsetInMinutes
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByAlertOffsetInMinutes(java.lang.Integer alertOffsetInMinutes,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ALERTOFFSETINMINUTES, alertOffsetInMinutes);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByAttendeeNames(java.lang.Object attendeeNames) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ATTENDEENAMES, attendeeNames);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field attendeeNames
	 * @param attendeeNames the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByAttendeeNames(java.lang.Object attendeeNames) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ATTENDEENAMES, attendeeNames);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field attendeeNames
	 * @param attendeeNames the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified attendeeNames
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByAttendeeNames(java.lang.Object attendeeNames,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ATTENDEENAMES, attendeeNames);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByAttendeeSynchIds(java.lang.Object attendeeSynchIds) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ATTENDEESYNCHIDS, attendeeSynchIds);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field attendeeSynchIds
	 * @param attendeeSynchIds the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByAttendeeSynchIds(java.lang.Object attendeeSynchIds) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ATTENDEESYNCHIDS, attendeeSynchIds);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field attendeeSynchIds
	 * @param attendeeSynchIds the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified attendeeSynchIds
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByAttendeeSynchIds(java.lang.Object attendeeSynchIds,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ATTENDEESYNCHIDS, attendeeSynchIds);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByCompanyName(java.lang.String companyName) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_COMPANYNAME, companyName);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field companyName
	 * @param companyName the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByCompanyName(java.lang.String companyName) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_COMPANYNAME, companyName);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field companyName
	 * @param companyName the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified companyName
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByCompanyName(java.lang.String companyName,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_COMPANYNAME, companyName);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByCompanySynchId(java.lang.String companySynchId) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_COMPANYSYNCHID, companySynchId);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field companySynchId
	 * @param companySynchId the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByCompanySynchId(java.lang.String companySynchId) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_COMPANYSYNCHID, companySynchId);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field companySynchId
	 * @param companySynchId the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified companySynchId
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByCompanySynchId(java.lang.String companySynchId,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_COMPANYSYNCHID, companySynchId);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByCreatedBy(java.lang.String createdBy) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDBY, createdBy);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field createdBy
	 * @param createdBy the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByCreatedBy(java.lang.String createdBy) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDBY, createdBy);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field createdBy
	 * @param createdBy the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified createdBy
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByCreatedBy(java.lang.String createdBy,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDBY, createdBy);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByCreatedDate(java.util.Date createdDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDDATE, createdDate);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field createdDate
	 * @param createdDate the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByCreatedDate(java.util.Date createdDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDDATE, createdDate);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field createdDate
	 * @param createdDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified createdDate
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByCreatedDate(java.util.Date createdDate,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDDATE, createdDate);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByDetailsNotes(java.lang.String detailsNotes) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_DETAILSNOTES, detailsNotes);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field detailsNotes
	 * @param detailsNotes the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByDetailsNotes(java.lang.String detailsNotes) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_DETAILSNOTES, detailsNotes);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field detailsNotes
	 * @param detailsNotes the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified detailsNotes
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByDetailsNotes(java.lang.String detailsNotes,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_DETAILSNOTES, detailsNotes);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByEndDate(java.util.Date endDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ENDDATE, endDate);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field endDate
	 * @param endDate the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByEndDate(java.util.Date endDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ENDDATE, endDate);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field endDate
	 * @param endDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified endDate
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByEndDate(java.util.Date endDate,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ENDDATE, endDate);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByFileNames(java.lang.Object fileNames) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_FILENAMES, fileNames);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field fileNames
	 * @param fileNames the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByFileNames(java.lang.Object fileNames) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_FILENAMES, fileNames);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field fileNames
	 * @param fileNames the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified fileNames
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByFileNames(java.lang.Object fileNames,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_FILENAMES, fileNames);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByFileSynchIds(java.lang.Object fileSynchIds) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_FILESYNCHIDS, fileSynchIds);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field fileSynchIds
	 * @param fileSynchIds the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByFileSynchIds(java.lang.Object fileSynchIds) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_FILESYNCHIDS, fileSynchIds);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field fileSynchIds
	 * @param fileSynchIds the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified fileSynchIds
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByFileSynchIds(java.lang.Object fileSynchIds,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_FILESYNCHIDS, fileSynchIds);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByFollowUpFileSynchIds(java.lang.Object followUpFileSynchIds) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_FOLLOWUPFILESYNCHIDS, followUpFileSynchIds);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field followUpFileSynchIds
	 * @param followUpFileSynchIds the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByFollowUpFileSynchIds(java.lang.Object followUpFileSynchIds) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_FOLLOWUPFILESYNCHIDS, followUpFileSynchIds);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field followUpFileSynchIds
	 * @param followUpFileSynchIds the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified followUpFileSynchIds
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByFollowUpFileSynchIds(java.lang.Object followUpFileSynchIds,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_FOLLOWUPFILESYNCHIDS, followUpFileSynchIds);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByFollowUpIncludeAgenda(java.lang.Boolean followUpIncludeAgenda) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_FOLLOWUPINCLUDEAGENDA, followUpIncludeAgenda);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field followUpIncludeAgenda
	 * @param followUpIncludeAgenda the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByFollowUpIncludeAgenda(java.lang.Boolean followUpIncludeAgenda) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_FOLLOWUPINCLUDEAGENDA, followUpIncludeAgenda);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field followUpIncludeAgenda
	 * @param followUpIncludeAgenda the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified followUpIncludeAgenda
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByFollowUpIncludeAgenda(java.lang.Boolean followUpIncludeAgenda,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_FOLLOWUPINCLUDEAGENDA, followUpIncludeAgenda);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByFollowUpLastSentDate(java.util.Date followUpLastSentDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_FOLLOWUPLASTSENTDATE, followUpLastSentDate);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field followUpLastSentDate
	 * @param followUpLastSentDate the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByFollowUpLastSentDate(java.util.Date followUpLastSentDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_FOLLOWUPLASTSENTDATE, followUpLastSentDate);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field followUpLastSentDate
	 * @param followUpLastSentDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified followUpLastSentDate
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByFollowUpLastSentDate(java.util.Date followUpLastSentDate,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_FOLLOWUPLASTSENTDATE, followUpLastSentDate);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByFollowUpNotes(java.lang.String followUpNotes) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_FOLLOWUPNOTES, followUpNotes);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field followUpNotes
	 * @param followUpNotes the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByFollowUpNotes(java.lang.String followUpNotes) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_FOLLOWUPNOTES, followUpNotes);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field followUpNotes
	 * @param followUpNotes the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified followUpNotes
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByFollowUpNotes(java.lang.String followUpNotes,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_FOLLOWUPNOTES, followUpNotes);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByImageUrl(java.lang.String imageUrl) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_IMAGEURL, imageUrl);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field imageUrl
	 * @param imageUrl the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByImageUrl(java.lang.String imageUrl) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_IMAGEURL, imageUrl);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field imageUrl
	 * @param imageUrl the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified imageUrl
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByImageUrl(java.lang.String imageUrl,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_IMAGEURL, imageUrl);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByLocation(com.google.appengine.api.datastore.GeoPt location) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_LOCATION, location);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field location
	 * @param location the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByLocation(com.google.appengine.api.datastore.GeoPt location) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_LOCATION, location);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field location
	 * @param location the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified location
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByLocation(com.google.appengine.api.datastore.GeoPt location,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_LOCATION, location);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByLocationId(java.lang.Long locationId) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_LOCATIONID, locationId);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field locationId
	 * @param locationId the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByLocationId(java.lang.Long locationId) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_LOCATIONID, locationId);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field locationId
	 * @param locationId the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified locationId
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByLocationId(java.lang.Long locationId,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_LOCATIONID, locationId);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByMeetingType(java.lang.Long meetingType) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_MEETINGTYPE, meetingType);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field meetingType
	 * @param meetingType the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByMeetingType(java.lang.Long meetingType) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_MEETINGTYPE, meetingType);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field meetingType
	 * @param meetingType the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified meetingType
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByMeetingType(java.lang.Long meetingType,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_MEETINGTYPE, meetingType);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByNotes(java.lang.String notes) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_NOTES, notes);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field notes
	 * @param notes the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByNotes(java.lang.String notes) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_NOTES, notes);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field notes
	 * @param notes the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified notes
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByNotes(java.lang.String notes,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_NOTES, notes);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByOrganizerId(java.lang.String organizerId) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ORGANIZERID, organizerId);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field organizerId
	 * @param organizerId the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByOrganizerId(java.lang.String organizerId) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ORGANIZERID, organizerId);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field organizerId
	 * @param organizerId the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified organizerId
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByOrganizerId(java.lang.String organizerId,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ORGANIZERID, organizerId);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByPhoneNumber(java.lang.String phoneNumber) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_PHONENUMBER, phoneNumber);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field phoneNumber
	 * @param phoneNumber the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByPhoneNumber(java.lang.String phoneNumber) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_PHONENUMBER, phoneNumber);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field phoneNumber
	 * @param phoneNumber the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified phoneNumber
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByPhoneNumber(java.lang.String phoneNumber,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_PHONENUMBER, phoneNumber);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByRepeatMode(java.lang.Integer repeatMode) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_REPEATMODE, repeatMode);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field repeatMode
	 * @param repeatMode the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByRepeatMode(java.lang.Integer repeatMode) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_REPEATMODE, repeatMode);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field repeatMode
	 * @param repeatMode the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified repeatMode
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByRepeatMode(java.lang.Integer repeatMode,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_REPEATMODE, repeatMode);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByStartDate(java.util.Date startDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_STARTDATE, startDate);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field startDate
	 * @param startDate the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByStartDate(java.util.Date startDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_STARTDATE, startDate);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field startDate
	 * @param startDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified startDate
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByStartDate(java.util.Date startDate,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_STARTDATE, startDate);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryBySynchId(java.lang.String synchId) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_SYNCHID, synchId);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field synchId
	 * @param synchId the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysBySynchId(java.lang.String synchId) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_SYNCHID, synchId);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field synchId
	 * @param synchId the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified synchId
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageBySynchId(java.lang.String synchId,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_SYNCHID, synchId);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByTitle(java.lang.String title) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_TITLE, title);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field title
	 * @param title the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByTitle(java.lang.String title) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_TITLE, title);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field title
	 * @param title the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified title
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByTitle(java.lang.String title,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_TITLE, title);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByUpdatedBy(java.lang.String updatedBy) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDBY, updatedBy);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field updatedBy
	 * @param updatedBy the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByUpdatedBy(java.lang.String updatedBy) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDBY, updatedBy);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field updatedBy
	 * @param updatedBy the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified updatedBy
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByUpdatedBy(java.lang.String updatedBy,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDBY, updatedBy);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByUpdatedDate(java.util.Date updatedDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDDATE, updatedDate);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field updatedDate
	 * @param updatedDate the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByUpdatedDate(java.util.Date updatedDate) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_UPDATEDDATE, updatedDate);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field updatedDate
	 * @param updatedDate the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified updatedDate
	 */
	public final CursorPage<DmMeeting, java.lang.Long> queryPageByUpdatedDate(java.util.Date updatedDate,
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
	public DmMeeting persist(		java.lang.Long id, 
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
		java.lang.String title) {

            DmMeeting domain = null;
            // if primaryKey specified, use it
            if (null != id) {
                    domain = findByPrimaryKey(id);
            }
		
            // create new?
            if (null == domain) {
                    domain = new DmMeeting();
                    // generate Id?
                    if (null != id) {
                            domain.setId(id);
                    }
                    // fields
                    domain.setActualDuration(actualDuration);
                    domain.setActualEndDate(actualEndDate);
                    domain.setActualStartDate(actualStartDate);
                    domain.setAddress(address);
                    domain.setAgendaItemSynchIds(agendaItemSynchIds);
                    domain.setAlertOffsetInMinutes(alertOffsetInMinutes);
                    domain.setAttendeeNames(attendeeNames);
                    domain.setAttendeeSynchIds(attendeeSynchIds);
                    domain.setCompanyName(companyName);
                    domain.setCompanySynchId(companySynchId);
                    domain.setDetailsNotes(detailsNotes);
                    domain.setEndDate(endDate);
                    domain.setFileNames(fileNames);
                    domain.setFileSynchIds(fileSynchIds);
                    domain.setFollowUpFileSynchIds(followUpFileSynchIds);
                    domain.setFollowUpIncludeAgenda(followUpIncludeAgenda);
                    domain.setFollowUpLastSentDate(followUpLastSentDate);
                    domain.setFollowUpNotes(followUpNotes);
                    domain.setImageUrl(imageUrl);
                    domain.setLocation(location);
                    domain.setLocationId(locationId);
                    domain.setMeetingType(meetingType);
                    domain.setNotes(notes);
                    domain.setOrganizerId(organizerId);
                    domain.setPhoneNumber(phoneNumber);
                    domain.setRepeatMode(repeatMode);
                    domain.setStartDate(startDate);
                    domain.setSynchId(synchId);
                    domain.setTitle(title);
                    // one-to-ones
                    // many-to-ones
			
                    persist(domain);
            }
            return domain;
	}



}
