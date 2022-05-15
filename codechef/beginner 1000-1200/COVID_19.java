/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* If two people are seated in the same row, there must be at least one empty seat between them.
If two people are seated in different rows, there must be at least one completely empty row between them. That is, 
if there are people seated in rows i and j where i<j, there must be some row k such that i<k<j and nobody is seated in row k.
Given the information about the number of rows and the number of seats in each row, find the maximum number of tickets Mr. Chef can sell. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    FastReader f=new FastReader();
	    int t=f.nextInt();
		 while(t-- > 0){
            int n = f.nextInt();
            int m = f.nextInt();
            int seats = 0;
            
            int row = ((n+1) / 2);
            
            if(m % 2 == 1)
                seats = m/2 + 1;
            else
                seats = m/2;
            
            seats = seats * row;
            System.out.println(seats);
        
        }
	}
	static class FastReader {

		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
