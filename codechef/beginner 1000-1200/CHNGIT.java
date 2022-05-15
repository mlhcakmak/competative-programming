/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* You are given a sequence A1,A2,…,AN. You want all the elements of the sequence to be equal. In order to achieve that, you may perform zero or more moves. In each move, you must choose an index i (1≤i≤N), then choose j=i−1 or j=i+1 (it is not allowed to choose j=0 or j=N+1) and change the value of Ai to Aj — in other words, you should replace the value of one element of the sequence by one of its adjacent elements.

What is the minimum number of moves you need to make in order to make all the elements of the sequence equal?

 */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		FastReader f=new FastReader();
		int t=f.nextInt();
		while(t-->0){
		    int n=f.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++)arr[i]=f.nextInt();
		    int max_frequent=maxFrequent(arr);
		    System.out.println(n-max_frequent);
		}
	}
	static int maxFrequent(int[] arr){
	    Arrays.sort(arr);
	    int maxCount=1;
	    int currCount=1;
	    for(int i=1;i<arr.length;i++){
	        if(arr[i]==arr[i-1])currCount++;
	        else currCount=1;
	        if(currCount>maxCount)maxCount=currCount;
	    }
	    return maxCount;
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
