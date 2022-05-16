/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Given an array of N elements A1, A2, ..., AN, each applier was asked to insert any K integers he wants to this array. 

Eventually, each applier will be asked to write down the median among all the elements in his resulting array.

Many appliers asked for your help to determine what is the greatest median they can get after inserting any K elements they want?

constraints : k<n */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		FastReader f=new FastReader();
	int testCase=f.nextInt();
	while(testCase-->0){
	    int n=f.nextInt();
	    int k=f.nextInt();
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++)arr[i]=f.nextInt();
	    Arrays.sort(arr);
	    int mid=(k+n)/2;
	    System.out.println(arr[mid]);
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
