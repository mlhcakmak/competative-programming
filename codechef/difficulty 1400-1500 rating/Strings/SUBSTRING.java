/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Shefin gives you a string S and you have to find a non-empty string P such that:

P is a substring of S.
No non-empty substring of P is a prefix of S.
No non-empty substring of P is a suffix of S.
For all such possible strings, find the length of the longest string satisfying all the conditions. If no such string is possible, print −1.*/
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	FastReader f=new FastReader(); 
	int testCase=f.nextInt();
	while(testCase-->0){
		  String s= f.nextLine();
		  int max= Integer.MIN_VALUE;
		  int cnt=0; char a= s.charAt(0); char b= s.charAt(s.length()-1);
		  
		  for(int i=1; i<s.length()-1; i++){
		      if(s.charAt(i)!=a && s.charAt(i)!=b){
		          cnt++;
		      }
		      else{
		          max= Math.max(max,cnt);
		          cnt=0;
		      }
		  }
		  max= Math.max(max,cnt);
		  if(max>=1){
		  System.out.println(max);
		  }
		  else{
		      System.out.println(-1);
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
