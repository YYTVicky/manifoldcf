/* $Id$ */

/**
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements. See the NOTICE file distributed with
* this work for additional information regarding copyright ownership.
* The ASF licenses this file to You under the Apache License, Version 2.0
* (the "License"); you may not use this file except in compliance with
* the License. You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package org.apache.manifoldcf.core.interfaces;

import java.util.*;

public class MultiClause implements ClauseDescription
{
  public static final String _rcsid = "@(#)$Id$";

  protected String columnName;
  protected List values;
  
  /** Construct */
  public MultiClause(String columnName, List values)
  {
    this.columnName = columnName;
    this.values = values;
  }
  
  public MultiClause(String columnName, Object[] values)
  {
    this.columnName = columnName;
    this.values = new ArrayList();
    for (int i = 0 ; i < values.length ; i++)
    {
      this.values.add(values[i]);
    }
  }
  
  /** Get the column name */
  public String getColumnName()
  {
    return columnName;
  }
  
  /** Get the operation string */
  public String getOperation()
  {
    return "=";
  }
  
  /** Get the individual values */
  public List getValues()
  {
    return values;
  }
  
  /** Get the join column name */
  public String getJoinColumnName()
  {
    return null;
  }
}
