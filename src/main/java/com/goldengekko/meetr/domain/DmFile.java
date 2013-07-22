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

import javax.persistence.Basic;
import javax.persistence.Entity;
import net.sf.mardao.core.domain.AbstractLongEntity;

import java.util.Collection;

/**
 *
 * @author sosandstrom
 */
@Entity
public class DmFile extends AbstractLongEntity {
    
    @Basic
    private String name;

    @Basic
    private String externalId;

    @Basic
    private String externalParentFolderId;

    @Basic
    private String externalSource;


    // Setters and getters

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getExternalSource() {
        return externalSource;
    }

    public void setExternalSource(String externalSource) {
        this.externalSource = externalSource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExternalParentFolderId() {
        return externalParentFolderId;
    }

    public void setExternalParentFolderId(String externalParentFolderId) {
        this.externalParentFolderId = externalParentFolderId;
    }
}
