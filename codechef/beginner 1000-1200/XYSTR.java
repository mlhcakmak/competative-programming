/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* There are N students standing in a row and numbered 1 through N from left to right. You are given a string S with length N, where for each valid i, the i-th character of S is 'x' if the i-th student is a girl or 'y' if this student is a boy. Students standing next to each other in the row are friends.

The students are asked to form pairs for a dance competition. Each pair must consist of a boy and a girl. Two students can only form a pair if they are friends. Each student can only be part of at most one pair. What is the maximum number of pairs that can be formed? */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		FastReader f=new FastReader();
	int testCase=f.nextInt();
	while(testCase-->0){
	    String str=f.nextLine();
	    int pairCount=0;
	    for(int i=0;i<str.length()-1;i++){
	        if(str.charAt(i)=='x' &&str.charAt(i+1)=='y' ){
	            pairCount++;
	            i++;
	        }
	         else if(str.charAt(i)=='y' &&str.charAt(i+1)=='x' ){
	            pairCount++;
	            i++;
	        }
	    }
	    System.out.println(pairCount);
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
