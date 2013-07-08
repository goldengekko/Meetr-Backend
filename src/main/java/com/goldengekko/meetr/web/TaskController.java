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

import com.goldengekko.meetr.domain.DmTask;
import com.goldengekko.meetr.json.JTask;
import com.wadpam.open.mvc.CrudController;
import com.wadpam.open.mvc.CrudService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author sosandstrom
 */
@Controller
@RequestMapping("{domain}/task")
public class TaskController extends CrudController<JTask, DmTask, Long, CrudService<DmTask, Long>> {

    public TaskController() {
        super(JTask.class);
    }
    
    @Override
    public void convertDomain(DmTask from, JTask to) {
        convertLongEntity(from, to);
        to.setDueDate(toLong(from.getDueDate()));
        to.setMeetingId(from.getMeetingId());
        to.setTitle(from.getTitle());
    }

    @Override
    public void convertJson(JTask from, DmTask to) {
        convertJLong(from, to);
        to.setDueDate(toDate(from.getDueDate()));
        to.setMeetingId(from.getMeetingId());
        to.setTitle(from.getTitle());
    }

}
