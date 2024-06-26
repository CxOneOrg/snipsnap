﻿/*
 * This file is part of "SnipSnap Wiki/Weblog".
 *
 * Copyright (c) 2002 Stephan J. Schmidt, Matthias L. Jugel
 * All Rights Reserved.
 *
 * Please visit http://snipsnap.org/ for updates and contact.
 *
 * --LICENSE NOTICE--
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 * --LICENSE NOTICE--
 */

package org.snipsnap.util.log;

import org.radeox.util.logging.Logger;

import java.sql.SQLException;

/**
 * Concrete Logger that knows how to log SQLExceptions
 *
 * @author stephan
 * @version $Id: SQLLogger.java,v 1.2 2003/12/11 13:24:57 leo Exp $
 */

public class SQLLogger extends Logger {
  public static void warn(String output, SQLException e) {
    System.err.println(output);
    while (null != e) {
      System.err.println("  "+e.getErrorCode()+" "+e.getSQLState());
      e = e.getNextException();
    }
  }
}
