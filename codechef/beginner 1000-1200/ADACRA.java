/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Ada has an array of N crayons, some crayons are pointing upwards and some downwards. Ada thinks that an array of crayons is beautiful if all the crayons are pointing in the same direction.

In one step you can flip any segment of consecutive crayons. After flipping a segment, all crayons pointing downwards will point upwards and visceversa

What is the minimum number of steps to make the array of crayons beautiful */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	FastReader f=new FastReader();
	int testCase=f.nextInt();
	while(testCase-->0){
	    String str=f.nextLine();
	    int uCount=0,dCount=0;
	    char c1=str.charAt(0);
	    if(c1=='U')uCount=1;
	    else if(c1=='D')dCount=1;
	    for(int i=1;i<str.length();i++){
	        char c2= str.charAt(i);
	        if(c2!=c1){
	          if(c2=='U')uCount++;
	        else if(c2=='D')dCount++;      
	        }
	      c1=c2;
	    }
	    if(uCount>dCount)System.out.println(dCount);
	    else System.out.println(uCount);
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
