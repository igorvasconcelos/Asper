/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.type;

import java.util.Set;
import java.util.HashSet;
import java.io.StringWriter;

/**
 * Represents a wildcard as a parameter.
 */
public class WildcardParameter implements NumberSetParameter
{
    private static final long serialVersionUID = -9199568581677973415L;

    public boolean isWildcard(int min, int max)
    {
        return true;
    }

    public Set<Integer> getValuesInRange(int min, int max)
    {
        Set<Integer> result = new HashSet<Integer>();
        for (int i = min; i <= max; i++)
        {
            result.add(i);
        }
        return result;
    }

    public boolean containsPoint(int point) {
        return true;
    }

    public String formatted() {
        return "*";
    }
}
