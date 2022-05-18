/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* 1) Password must contain at least one lower case letter [a−z];

2) Password must contain at least one upper case letter [A−Z] strictly inside, i.e. not as the first or the last character;

3) Password must contain at least one digit [0−9] strictly inside;

4) Password must contain at least one special character from the set { '@', '#', '%', '&', '?' } strictly inside;

5) Password must be at least 10 characters in length, but it can be longer. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		FastReader f=new FastReader();
		
	int testCase=f.nextInt();
	while(testCase-->0){
	     boolean IsLower=false;
		    boolean IsUpper=false;
		    boolean Isnumber=false;
		    boolean Ischar=false;
		    String str = f.nextLine();
		    int x = str.length();
		    for(int i =0;i<x;i++){
		        int c = (int)str.charAt(i);
		         if(c>=97 && c<=122)
		         {
		             IsLower=true;
		             break;
		         }
		    }
		    for(int i=1;i<x-1;i++){
		        int c = (int)str.charAt(i);
		         if(c>=65 && c<=90)
		         {
		             IsUpper=true;
		             break;
		         }
		    }
		    for(int i=1;i<x-1;i++){
		        int c = (int)str.charAt(i);
		         if(c>=48 && c<=57)
		         {
		             Isnumber=true;
		             break;
		         }
		    }
		     for(int i=1;i<x-1;i++){
		        int c = (int)str.charAt(i);
		         if(c==35 || c==38 || c==37 || c==63 || c==64)
		         {
		             Ischar=true;
		             break;
		         }
		    }
		    if(Ischar && Isnumber && IsLower && IsUpper &&  x>=10){
		        System.out.println("YES");
		    }
		    else{
		         System.out.println("NO");  
		    }
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
