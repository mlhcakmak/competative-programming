/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* The Professor is facing the North. Tokyo is in trouble, and she is facing the South. Professor being her guardian angel wants to help her.

So, The Professor will follow some instructions, given as a string S of length N, and will turn either left or right according to these instructions. 

He can save Tokyo only if after following a substring of instructions he will face in the same direction that Tokyo is facing.

Will the Professor be able to save Tokyo? */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	FastReader f=new FastReader();
	int testCase=f.nextInt();
	while(testCase-->0){
	    int n=f.nextInt();
	    String input=f.nextLine();
	    boolean saved = false;
		    for(int j = 0;j<n-1;j++){
		        if(input.charAt(j) == input.charAt(j+1)){
		            saved = true;
		            System.out.println("YES");
		            break;
		        }
		    }
	      if(!saved)
		    System.out.println("NO");
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
