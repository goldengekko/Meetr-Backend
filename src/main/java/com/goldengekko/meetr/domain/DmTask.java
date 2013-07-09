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
package com.goldengekko.meetr.domain;

import com.goldengekko.meetr.service.domain.DsTask;
import com.goldengekko.meetr.service.domain.LongEntity;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author sosandstrom
 */
@Entity
public class DmTask extends DsTask implements LongEntity {
    
    @Id
    private Long longId;
    
    @Override
    public Long getLongId() {
        return longId;
    }

    @Override
    public void setLongId(Long longId) {
        this.longId = longId;
    }

    public DsTask toStringTask() {
        setId(null == longId ? null : Long.toString(longId));
        return this;
    }
}
