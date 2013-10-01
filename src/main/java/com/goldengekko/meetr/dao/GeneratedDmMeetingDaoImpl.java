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
 * Generated on 2013-09-30T18:18:09.100+0200.
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
        else if (COLUMN_NAME_AGENDAITEMIDS.equals(name)) {
            value = domain.getAgendaItemIds();
        }
        else if (COLUMN_NAME_ALERTOFFSETINMINUTES.equals(name)) {
            value = domain.getAlertOffsetInMinutes();
        }
        else if (COLUMN_NAME_ATTENDEEIDS.equals(name)) {
            value = domain.getAttendeeIds();
        }
        else if (COLUMN_NAME_ATTENDEENAMES.equals(name)) {
            value = domain.getAttendeeNames();
        }
        else if (COLUMN_NAME_COMPANYADDRESS.equals(name)) {
            value = domain.getCompanyAddress();
        }
        else if (COLUMN_NAME_COMPANYID.equals(name)) {
            value = domain.getCompanyId();
        }
        else if (COLUMN_NAME_COMPANYLOCATION.equals(name)) {
            value = domain.getCompanyLocation();
        }
        else if (COLUMN_NAME_COMPANYNAME.equals(name)) {
            value = domain.getCompanyName();
        }
        else if (COLUMN_NAME_COMPANYPHONENUMBER.equals(name)) {
            value = domain.getCompanyPhoneNumber();
        }
        else if (COLUMN_NAME_CREATEDBY.equals(name)) {
            value = domain.getCreatedBy();
        }
        else if (COLUMN_NAME_CREATEDDATE.equals(name)) {
            value = domain.getCreatedDate();
        }
        else if (COLUMN_NAME_ENDDATE.equals(name)) {
            value = domain.getEndDate();
        }
        else if (COLUMN_NAME_FOLLOWUPFILEIDS.equals(name)) {
            value = domain.getFollowUpFileIds();
        }
        else if (COLUMN_NAME_FOLLOWUPINCLUDESAGENDA.equals(name)) {
            value = domain.getFollowUpIncludesAgenda();
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
        else if (COLUMN_NAME_LOCATIONID.equals(name)) {
            value = domain.getLocationId();
        }
        else if (COLUMN_NAME_MEETINGFILEIDS.equals(name)) {
            value = domain.getMeetingFileIds();
        }
        else if (COLUMN_NAME_MEETINGFILENAMES.equals(name)) {
            value = domain.getMeetingFileNames();
        }
        else if (COLUMN_NAME_MEETINGNOTES.equals(name)) {
            value = domain.getMeetingNotes();
        }
        else if (COLUMN_NAME_MEETINGPLANNINGNOTES.equals(name)) {
            value = domain.getMeetingPlanningNotes();
        }
        else if (COLUMN_NAME_MEETINGTYPE.equals(name)) {
            value = domain.getMeetingType();
        }
        else if (COLUMN_NAME_ORGANIZERID.equals(name)) {
            value = domain.getOrganizerId();
        }
        else if (COLUMN_NAME_REPEATMODE.equals(name)) {
            value = domain.getRepeatMode();
        }
        else if (COLUMN_NAME_STARTDATE.equals(name)) {
            value = domain.getStartDate();
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
        else if (COLUMN_NAME_AGENDAITEMIDS.equals(name)) {
            clazz = java.util.Collection.class;
        }
        else if (COLUMN_NAME_ALERTOFFSETINMINUTES.equals(name)) {
            clazz = java.lang.Integer.class;
        }
        else if (COLUMN_NAME_ATTENDEEIDS.equals(name)) {
            clazz = java.util.Collection.class;
        }
        else if (COLUMN_NAME_ATTENDEENAMES.equals(name)) {
            clazz = java.util.Collection.class;
        }
        else if (COLUMN_NAME_COMPANYADDRESS.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_COMPANYID.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_COMPANYLOCATION.equals(name)) {
            clazz = net.sf.mardao.core.geo.DLocation.class;
        }
        else if (COLUMN_NAME_COMPANYNAME.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_COMPANYPHONENUMBER.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_CREATEDBY.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_CREATEDDATE.equals(name)) {
            clazz = java.util.Date.class;
        }
        else if (COLUMN_NAME_ENDDATE.equals(name)) {
            clazz = java.util.Date.class;
        }
        else if (COLUMN_NAME_FOLLOWUPFILEIDS.equals(name)) {
            clazz = java.util.Collection.class;
        }
        else if (COLUMN_NAME_FOLLOWUPINCLUDESAGENDA.equals(name)) {
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
        else if (COLUMN_NAME_LOCATIONID.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_MEETINGFILEIDS.equals(name)) {
            clazz = java.util.Collection.class;
        }
        else if (COLUMN_NAME_MEETINGFILENAMES.equals(name)) {
            clazz = java.util.Collection.class;
        }
        else if (COLUMN_NAME_MEETINGNOTES.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_MEETINGPLANNINGNOTES.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_MEETINGTYPE.equals(name)) {
            clazz = java.lang.Long.class;
        }
        else if (COLUMN_NAME_ORGANIZERID.equals(name)) {
            clazz = java.lang.String.class;
        }
        else if (COLUMN_NAME_REPEATMODE.equals(name)) {
            clazz = java.lang.Integer.class;
        }
        else if (COLUMN_NAME_STARTDATE.equals(name)) {
            clazz = java.util.Date.class;
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
        else if (COLUMN_NAME_AGENDAITEMIDS.equals(name)) {
            domain.setAgendaItemIds((java.util.Collection) value);
        }
        else if (COLUMN_NAME_ALERTOFFSETINMINUTES.equals(name)) {
            domain.setAlertOffsetInMinutes((java.lang.Integer) value);
        }
        else if (COLUMN_NAME_ATTENDEEIDS.equals(name)) {
            domain.setAttendeeIds((java.util.Collection) value);
        }
        else if (COLUMN_NAME_ATTENDEENAMES.equals(name)) {
            domain.setAttendeeNames((java.util.Collection) value);
        }
        else if (COLUMN_NAME_COMPANYADDRESS.equals(name)) {
            domain.setCompanyAddress((java.lang.String) value);
        }
        else if (COLUMN_NAME_COMPANYID.equals(name)) {
            domain.setCompanyId((java.lang.String) value);
        }
        else if (COLUMN_NAME_COMPANYLOCATION.equals(name)) {
            domain.setCompanyLocation((net.sf.mardao.core.geo.DLocation) value);
        }
        else if (COLUMN_NAME_COMPANYNAME.equals(name)) {
            domain.setCompanyName((java.lang.String) value);
        }
        else if (COLUMN_NAME_COMPANYPHONENUMBER.equals(name)) {
            domain.setCompanyPhoneNumber((java.lang.String) value);
        }
        else if (COLUMN_NAME_CREATEDBY.equals(name)) {
            domain.setCreatedBy((java.lang.String) value);
        }
        else if (COLUMN_NAME_CREATEDDATE.equals(name)) {
            domain.setCreatedDate((java.util.Date) value);
        }
        else if (COLUMN_NAME_ENDDATE.equals(name)) {
            domain.setEndDate((java.util.Date) value);
        }
        else if (COLUMN_NAME_FOLLOWUPFILEIDS.equals(name)) {
            domain.setFollowUpFileIds((java.util.Collection) value);
        }
        else if (COLUMN_NAME_FOLLOWUPINCLUDESAGENDA.equals(name)) {
            domain.setFollowUpIncludesAgenda((java.lang.Boolean) value);
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
        else if (COLUMN_NAME_LOCATIONID.equals(name)) {
            domain.setLocationId((java.lang.String) value);
        }
        else if (COLUMN_NAME_MEETINGFILEIDS.equals(name)) {
            domain.setMeetingFileIds((java.util.Collection) value);
        }
        else if (COLUMN_NAME_MEETINGFILENAMES.equals(name)) {
            domain.setMeetingFileNames((java.util.Collection) value);
        }
        else if (COLUMN_NAME_MEETINGNOTES.equals(name)) {
            domain.setMeetingNotes((java.lang.String) value);
        }
        else if (COLUMN_NAME_MEETINGPLANNINGNOTES.equals(name)) {
            domain.setMeetingPlanningNotes((java.lang.String) value);
        }
        else if (COLUMN_NAME_MEETINGTYPE.equals(name)) {
            domain.setMeetingType((java.lang.Long) value);
        }
        else if (COLUMN_NAME_ORGANIZERID.equals(name)) {
            domain.setOrganizerId((java.lang.String) value);
        }
        else if (COLUMN_NAME_REPEATMODE.equals(name)) {
            domain.setRepeatMode((java.lang.Integer) value);
        }
        else if (COLUMN_NAME_STARTDATE.equals(name)) {
            domain.setStartDate((java.util.Date) value);
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

        public String getGeoLocationColumnName() {
            return COLUMN_NAME_COMPANYLOCATION;
        }

        public DLocation getGeoLocation(DmMeeting domain) {
            if (null == domain) {
                return null;
            }
            return domain.getCompanyLocation();
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
	public final CursorPage<DmMeeting> queryPageByActualDuration(java.lang.Long actualDuration,
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
	public final CursorPage<DmMeeting> queryPageByActualEndDate(java.util.Date actualEndDate,
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
	public final CursorPage<DmMeeting> queryPageByActualStartDate(java.util.Date actualStartDate,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ACTUALSTARTDATE, actualStartDate);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByAgendaItemIds(java.lang.Object agendaItemIds) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_AGENDAITEMIDS, agendaItemIds);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field agendaItemIds
	 * @param agendaItemIds the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByAgendaItemIds(java.lang.Object agendaItemIds) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_AGENDAITEMIDS, agendaItemIds);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field agendaItemIds
	 * @param agendaItemIds the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified agendaItemIds
	 */
	public final CursorPage<DmMeeting> queryPageByAgendaItemIds(java.lang.Object agendaItemIds,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_AGENDAITEMIDS, agendaItemIds);
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
	public final CursorPage<DmMeeting> queryPageByAlertOffsetInMinutes(java.lang.Integer alertOffsetInMinutes,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ALERTOFFSETINMINUTES, alertOffsetInMinutes);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByAttendeeIds(java.lang.Object attendeeIds) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ATTENDEEIDS, attendeeIds);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field attendeeIds
	 * @param attendeeIds the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByAttendeeIds(java.lang.Object attendeeIds) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ATTENDEEIDS, attendeeIds);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field attendeeIds
	 * @param attendeeIds the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified attendeeIds
	 */
	public final CursorPage<DmMeeting> queryPageByAttendeeIds(java.lang.Object attendeeIds,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ATTENDEEIDS, attendeeIds);
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
	public final CursorPage<DmMeeting> queryPageByAttendeeNames(java.lang.Object attendeeNames,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ATTENDEENAMES, attendeeNames);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByCompanyAddress(java.lang.String companyAddress) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_COMPANYADDRESS, companyAddress);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field companyAddress
	 * @param companyAddress the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByCompanyAddress(java.lang.String companyAddress) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_COMPANYADDRESS, companyAddress);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field companyAddress
	 * @param companyAddress the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified companyAddress
	 */
	public final CursorPage<DmMeeting> queryPageByCompanyAddress(java.lang.String companyAddress,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_COMPANYADDRESS, companyAddress);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByCompanyId(java.lang.String companyId) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_COMPANYID, companyId);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field companyId
	 * @param companyId the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByCompanyId(java.lang.String companyId) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_COMPANYID, companyId);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field companyId
	 * @param companyId the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified companyId
	 */
	public final CursorPage<DmMeeting> queryPageByCompanyId(java.lang.String companyId,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_COMPANYID, companyId);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByCompanyLocation(net.sf.mardao.core.geo.DLocation companyLocation) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_COMPANYLOCATION, companyLocation);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field companyLocation
	 * @param companyLocation the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByCompanyLocation(net.sf.mardao.core.geo.DLocation companyLocation) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_COMPANYLOCATION, companyLocation);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field companyLocation
	 * @param companyLocation the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified companyLocation
	 */
	public final CursorPage<DmMeeting> queryPageByCompanyLocation(net.sf.mardao.core.geo.DLocation companyLocation,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_COMPANYLOCATION, companyLocation);
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
	public final CursorPage<DmMeeting> queryPageByCompanyName(java.lang.String companyName,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_COMPANYNAME, companyName);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByCompanyPhoneNumber(java.lang.String companyPhoneNumber) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_COMPANYPHONENUMBER, companyPhoneNumber);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field companyPhoneNumber
	 * @param companyPhoneNumber the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByCompanyPhoneNumber(java.lang.String companyPhoneNumber) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_COMPANYPHONENUMBER, companyPhoneNumber);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field companyPhoneNumber
	 * @param companyPhoneNumber the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified companyPhoneNumber
	 */
	public final CursorPage<DmMeeting> queryPageByCompanyPhoneNumber(java.lang.String companyPhoneNumber,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_COMPANYPHONENUMBER, companyPhoneNumber);
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
	public final CursorPage<DmMeeting> queryPageByCreatedBy(java.lang.String createdBy,
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
	public final CursorPage<DmMeeting> queryPageByCreatedDate(java.util.Date createdDate,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_CREATEDDATE, createdDate);
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
	public final CursorPage<DmMeeting> queryPageByEndDate(java.util.Date endDate,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ENDDATE, endDate);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByFollowUpFileIds(java.lang.Object followUpFileIds) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_FOLLOWUPFILEIDS, followUpFileIds);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field followUpFileIds
	 * @param followUpFileIds the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByFollowUpFileIds(java.lang.Object followUpFileIds) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_FOLLOWUPFILEIDS, followUpFileIds);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field followUpFileIds
	 * @param followUpFileIds the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified followUpFileIds
	 */
	public final CursorPage<DmMeeting> queryPageByFollowUpFileIds(java.lang.Object followUpFileIds,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_FOLLOWUPFILEIDS, followUpFileIds);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByFollowUpIncludesAgenda(java.lang.Boolean followUpIncludesAgenda) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_FOLLOWUPINCLUDESAGENDA, followUpIncludesAgenda);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field followUpIncludesAgenda
	 * @param followUpIncludesAgenda the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByFollowUpIncludesAgenda(java.lang.Boolean followUpIncludesAgenda) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_FOLLOWUPINCLUDESAGENDA, followUpIncludesAgenda);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field followUpIncludesAgenda
	 * @param followUpIncludesAgenda the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified followUpIncludesAgenda
	 */
	public final CursorPage<DmMeeting> queryPageByFollowUpIncludesAgenda(java.lang.Boolean followUpIncludesAgenda,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_FOLLOWUPINCLUDESAGENDA, followUpIncludesAgenda);
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
	public final CursorPage<DmMeeting> queryPageByFollowUpLastSentDate(java.util.Date followUpLastSentDate,
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
	public final CursorPage<DmMeeting> queryPageByFollowUpNotes(java.lang.String followUpNotes,
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
	public final CursorPage<DmMeeting> queryPageByImageUrl(java.lang.String imageUrl,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_IMAGEURL, imageUrl);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByLocationId(java.lang.String locationId) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_LOCATIONID, locationId);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field locationId
	 * @param locationId the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByLocationId(java.lang.String locationId) {
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
	public final CursorPage<DmMeeting> queryPageByLocationId(java.lang.String locationId,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_LOCATIONID, locationId);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByMeetingFileIds(java.lang.Object meetingFileIds) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_MEETINGFILEIDS, meetingFileIds);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field meetingFileIds
	 * @param meetingFileIds the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByMeetingFileIds(java.lang.Object meetingFileIds) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_MEETINGFILEIDS, meetingFileIds);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field meetingFileIds
	 * @param meetingFileIds the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified meetingFileIds
	 */
	public final CursorPage<DmMeeting> queryPageByMeetingFileIds(java.lang.Object meetingFileIds,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_MEETINGFILEIDS, meetingFileIds);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByMeetingFileNames(java.lang.Object meetingFileNames) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_MEETINGFILENAMES, meetingFileNames);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field meetingFileNames
	 * @param meetingFileNames the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByMeetingFileNames(java.lang.Object meetingFileNames) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_MEETINGFILENAMES, meetingFileNames);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field meetingFileNames
	 * @param meetingFileNames the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified meetingFileNames
	 */
	public final CursorPage<DmMeeting> queryPageByMeetingFileNames(java.lang.Object meetingFileNames,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_MEETINGFILENAMES, meetingFileNames);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByMeetingNotes(java.lang.String meetingNotes) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_MEETINGNOTES, meetingNotes);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field meetingNotes
	 * @param meetingNotes the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByMeetingNotes(java.lang.String meetingNotes) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_MEETINGNOTES, meetingNotes);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field meetingNotes
	 * @param meetingNotes the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified meetingNotes
	 */
	public final CursorPage<DmMeeting> queryPageByMeetingNotes(java.lang.String meetingNotes,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_MEETINGNOTES, meetingNotes);
            return queryPage(false, pageSize, null, null, null, false, null, false, cursorString, filter);
        }

	 
	/**
         * {@inheritDoc}
	 */
	public final Iterable<DmMeeting> queryByMeetingPlanningNotes(java.lang.String meetingPlanningNotes) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_MEETINGPLANNINGNOTES, meetingPlanningNotes);
            return queryIterable(false, 0, -1, null, null, null, false, null, false, filter);
	}
	
	/**
	 * query-key-by method for attribute field meetingPlanningNotes
	 * @param meetingPlanningNotes the specified attribute
	 * @return an Iterable of keys to the DmMeetings with the specified attribute
	 */
	public final Iterable<java.lang.Long> queryKeysByMeetingPlanningNotes(java.lang.String meetingPlanningNotes) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_MEETINGPLANNINGNOTES, meetingPlanningNotes);
            return queryIterableKeys(0, -1, null, null, null, false, null, false, filter);
	}

	/**
	 * query-page-by method for field meetingPlanningNotes
	 * @param meetingPlanningNotes the specified attribute
         * @param pageSize the number of domain entities in the page
         * @param cursorString non-null if get next page
	 * @return a Page of DmMeetings for the specified meetingPlanningNotes
	 */
	public final CursorPage<DmMeeting> queryPageByMeetingPlanningNotes(java.lang.String meetingPlanningNotes,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_MEETINGPLANNINGNOTES, meetingPlanningNotes);
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
	public final CursorPage<DmMeeting> queryPageByMeetingType(java.lang.Long meetingType,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_MEETINGTYPE, meetingType);
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
	public final CursorPage<DmMeeting> queryPageByOrganizerId(java.lang.String organizerId,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_ORGANIZERID, organizerId);
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
	public final CursorPage<DmMeeting> queryPageByRepeatMode(java.lang.Integer repeatMode,
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
	public final CursorPage<DmMeeting> queryPageByStartDate(java.util.Date startDate,
            int pageSize, String cursorString) {
            final Filter filter = createEqualsFilter(COLUMN_NAME_STARTDATE, startDate);
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
	public final CursorPage<DmMeeting> queryPageByTitle(java.lang.String title,
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
	public final CursorPage<DmMeeting> queryPageByUpdatedBy(java.lang.String updatedBy,
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
	public final CursorPage<DmMeeting> queryPageByUpdatedDate(java.util.Date updatedDate,
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
                    domain.setAgendaItemIds(agendaItemIds);
                    domain.setAlertOffsetInMinutes(alertOffsetInMinutes);
                    domain.setAttendeeIds(attendeeIds);
                    domain.setAttendeeNames(attendeeNames);
                    domain.setCompanyAddress(companyAddress);
                    domain.setCompanyId(companyId);
                    domain.setCompanyLocation(companyLocation);
                    domain.setCompanyName(companyName);
                    domain.setCompanyPhoneNumber(companyPhoneNumber);
                    domain.setEndDate(endDate);
                    domain.setFollowUpFileIds(followUpFileIds);
                    domain.setFollowUpIncludesAgenda(followUpIncludesAgenda);
                    domain.setFollowUpLastSentDate(followUpLastSentDate);
                    domain.setFollowUpNotes(followUpNotes);
                    domain.setImageUrl(imageUrl);
                    domain.setLocationId(locationId);
                    domain.setMeetingFileIds(meetingFileIds);
                    domain.setMeetingFileNames(meetingFileNames);
                    domain.setMeetingNotes(meetingNotes);
                    domain.setMeetingPlanningNotes(meetingPlanningNotes);
                    domain.setMeetingType(meetingType);
                    domain.setOrganizerId(organizerId);
                    domain.setRepeatMode(repeatMode);
                    domain.setStartDate(startDate);
                    domain.setTitle(title);
                    // one-to-ones
                    // many-to-ones
			
                    persist(domain);
            }
            return domain;
	}



}
