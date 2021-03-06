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

public class Problem1001 {

	// max input size is 256KB, min size per number is 1 byte + 1 byte separator
	static final int MAX_ITEMS = 131072; 

	public static void main(String[] args) throws IOException {
		final StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(
				System.in, "ISO-8859-1")));
		final PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));

		double[] data = new double[MAX_ITEMS];
		int count = 0;

		// read all numbers and store them in memory
		while (in.nextToken() != StreamTokenizer.TT_EOF)
			data[count++] = Math.sqrt((long) in.nval);
		
		// print all results in reverse order
 		for (;count-->0;)
 			out.format("%.4f\n", data[count]);
		
		out.flush();
	}
}
