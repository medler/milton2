/*  * Copyright (c) 2005 Brian Wellington (bwelling@xbill.org)  *   * Copied from the DnsJava project  *  * This program is free software: you can redistribute it and/or modify  * it under the terms of the GNU Affero General Public License as published by  * the Free Software Foundation, either version 3 of the License, or  * (at your option) any later version.  * This program is distributed in the hope that it will be useful,  * but WITHOUT ANY WARRANTY; without even the implied warranty of  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the  * GNU General Public License for more details.  * You should have received a copy of the GNU General Public License  * along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

package io.milton.dns.record;

import io.milton.dns.Name;

import java.util.*;

/**
 * Sender Policy Framework (RFC 4408, experimental)
 *
 * @author Brian Wellington
 */

public class SPFRecord extends TXTBase {

private static final long serialVersionUID = -2100754352801658722L;

SPFRecord() {}

Record
getObject() {
	return new SPFRecord();
}

/**
 * Creates a SPF Record from the given data
 * @param strings The text strings
 * @throws IllegalArgumentException One of the strings has invalid escapes
 */
public
SPFRecord(Name name, int dclass, long ttl, List strings) {
	super(name, Type.SPF, dclass, ttl, strings);
}

/**
 * Creates a SPF Record from the given data
 * @param string One text string
 * @throws IllegalArgumentException The string has invalid escapes
 */
public
SPFRecord(Name name, int dclass, long ttl, String string) {
	super(name, Type.SPF, dclass, ttl, string);
}

}
