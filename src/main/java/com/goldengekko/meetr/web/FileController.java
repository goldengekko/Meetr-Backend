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
package com.goldengekko.meetr.web;

import com.goldengekko.meetr.domain.DmFile;
import com.goldengekko.meetr.json.JFile;
import com.wadpam.open.mvc.CrudController;
import com.wadpam.open.mvc.CrudService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author sosandstrom
 */
@Controller
@RequestMapping("{domain}/file")
public class FileController extends CrudController<JFile, DmFile, Long, CrudService<DmFile, Long>> {

    public FileController() {
        super(JFile.class);
    }

    @Override
    public void convertDomain(DmFile from, JFile to) {
        convertLongEntity(from, to);
        to.setExtRef(from.getExtRef());
        to.setName(from.getName());
    }

    @Override
    public void convertJson(JFile from, DmFile to) {
        convertJLong(from, to);
        to.setExtRef(from.getExtRef());
        to.setName(from.getName());
    }

}
