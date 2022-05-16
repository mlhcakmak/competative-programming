/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* You are given a sorted list A of size N.You have to make a new list B such that B[i] is equal to the number of elements strictly greater than A[i] in the list A.

Print the new  list */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	FastReader f=new FastReader();
	int testCase=f.nextInt();
	while(testCase-->0){
	    int n=f.nextInt();
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++) arr[i]=f.nextInt();
	    for(int i=0;i<n;i++){
	        int count=0;
	        for(int j=i;j<n-1;j++){
	            if(arr[i]!=arr[j+1])count++;
	            
	        }
	        arr[i]=count;
	    }
	    for(int x:arr){
	        System.out.print(" " + x);
	    }
	    System.out.println("");
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
