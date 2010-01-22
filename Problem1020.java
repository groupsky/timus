/*
Author: Geno Roupsky
Author URI: http://geno.roupsky.tel/

Copyright 2010 by Geno Roupsky

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

import java.io.*;
import java.util.*;

public class Problem1020 {

	/*
	 * angle between normalized vectors:
	 *   angle = acos(v1•v2)
	 * distance between points:
	 *   distance = sqrt(sqr(dx)+sqr(dy))
	 * arc length:
	 *   alength = angle*radius
	 */
	
	static final int MAX_NAILS = 100; 

	public static void main(String[] args) throws IOException {
		final StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(
				System.in, "ISO-8859-1")));
		final PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));

		in.nextToken();
		int n = (int)in.nval;
		
		in.nextToken();
		double length = 2*Math.PI*in.nval;
		
		double x0, y0, x1, y1, x2, y2;
		
		in.nextToken();
		x0 = x2 = in.nval;
		in.nextToken();
		y0 = y2 = in.nval;
		for (;--n>0;) {
			x1 = x2;
			in.nextToken();
			x2 = in.nval;
			
			y1 = y2;
			in.nextToken();
			y2 = in.nval;
			
			length += Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
		}
		length += Math.sqrt(Math.pow(x0-x2, 2) + Math.pow(y0-y2, 2));
		
 		out.format("%.2f\n", length);
		
		out.flush();
	}
}
