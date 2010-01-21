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

public class Problem1000
{

   final boolean oj = System.getProperty("ONLINE_JUDGE") != null;

   public static void main(String[] args) throws IOException
   {
      new Problem1000().run();
   }

   final StreamTokenizer in;
   final PrintWriter out;

   public Problem1000() throws IOException {
      in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1")));
      out = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));
   }

   int nextInt() throws IOException
   {
      in.nextToken();
      return (int)in.nval;
   }

   void run() throws IOException
   {
      solve();
      out.flush();
   }

   void solve() throws IOException
   {
      out.print(nextInt()+nextInt());
   }
}

