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

public class Problem1021 {

	/*
	 * angle between normalized vectors:
	 *   angle = acos(v1•v2)
	 * distance between points:
	 *   distance = sqrt(sqr(dx)+sqr(dy))
	 * arc length:
	 *   alength = angle*radius
	 * sum of angles in convex polygon = 2*Pi
	 * 
	 * rope length = 2*Pi*radius + sum(distance ai ai+1)
	 */
	
	static final int MAX_LIST_ELEMENTS = 50000;
	static final int DESIRED_SUM = 10000;

	public static void main(String[] args) throws IOException {
		final StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(
				System.in, "ISO-8859-1")));
		final PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));

		in.nextToken();
		int n = (int)in.nval;
		short[] list = new short[n];
		int i;
		
		// read the first list
		for (i=0;i<n;i++) {
			in.nextToken();
			list[i] = (short)in.nval;
		}
		
		in.nextToken();
		n = (int)in.nval;
		
		// read second list searching for desired sum
		int j=0, k;
		for (i=0; i<n; i++) {
			in.nextToken();
			k = (short)in.nval;
			
			while (list[j]+k < DESIRED_SUM && j<list.length-1) j++;
			while (list[j]+k > DESIRED_SUM && j>0) j--;
			if (list[j]+k == DESIRED_SUM) {
				out.print("YES");
				out.flush();
				return;
			}
		}
		
		out.print("NO");
		out.flush();
	}
}
