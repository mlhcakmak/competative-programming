/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* You are given two arrays A and B containing N numbers each, denoting the height of boys and girls in the group. You have to form N couples, where each couple will consist of 1 boy and 1 girl.

Each couple has a LIKENESS VALUE, where

LIKENESS VALUE = height of girl in the couple + height of boy in that couple.
You have to form N couples in such a way that the maximum of LIKENESS VALUE of all the couples is minimum. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		FastReader f=new FastReader();
	int testCase=f.nextInt();
	while(testCase-->0){
	    int n=f.nextInt();
	    int[] boys=new int[n];
	    int[] girls=new int[n];
	    int maxSum=0;
	    for(int i=0;i<n;i++){
	        boys[i]=f.nextInt();
	    }
	    for(int i=0;i<n;i++){
	        girls[i]=f.nextInt();
	    }
	    Arrays.sort(boys);
	    Arrays.sort(girls);
        int sum=0;
	    for(int i=0;i<n;i++){
	        sum=boys[i]+girls[n-1-i];
	        if(sum>maxSum)maxSum=sum;
	    }
	    System.out.println(maxSum);
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
