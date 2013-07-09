/**
 *     Copyright 2012, 2013 Golden Gekko
 *
 *     This file is part of Meetr.
 *
 *     Meetr is free software: you can use it, modify it and / or
 *     redistribute it as is or with your changes under the terms of the
 *     GNU General Public License as published by the Free Software
 *     Foundation, either version 3 of the License, or (at your option)
 *     any later version.
 *
 *     Meetr is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Meetr.  If not, see <http://www.gnu.org/licenses />.
 */
package com.goldengekko.meetr.service.local;

import com.goldengekko.meetr.domain.DmTask;
import com.goldengekko.meetr.service.domain.DsTask;
import com.wadpam.open.mvc.MardaoCrudService;
import net.sf.mardao.core.dao.Dao;

/**
 *
 * @author sosandstrom
 */
public class DatastoreTaskService extends 
        StringWrappingCrudService<DsTask, DmTask> {

    public DatastoreTaskService() {
        super(new MardaoCrudService<DmTask, Long, Dao<DmTask, Long>>() {
        });
    }

    @Override
    public DsTask convertDomain(DmTask from) {
        if (null == from) {
            return null;
        }
        return from.toStringTask();
    }

    @Override
    public DmTask convertDomain(DsTask from) {
        if (null == from) {
            return null;
        }
        DmTask to = new DmTask();
        convertDomain(from, to);
        return to;
    }

    @Override
    public void convertDomain(DmTask from, DsTask to) {
        convertLongEntity(from, to);

        to.setDueDate(from.getDueDate());
        to.setMeetingId(from.getMeetingId());
        to.setTitle(from.getTitle());
    }

    @Override
    public void convertDomain(DsTask from, DmTask to) {
        convertStringEntity(from, to);
        to.setId(from.getId());
        
        to.setDueDate(from.getDueDate());
        to.setMeetingId(from.getMeetingId());
        to.setTitle(from.getTitle());
    }

}
