/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* His task is to color all planks the same color! But there is some magic in the winds of his small town. Whenever he colors the ith ( plank which has the color Si ) to a color P then following events happen:

if 2≤i≤N and Si=Si−1, then color of (i−1)th plank changes to P.
if 1≤i≤N−1 and Si=Si+1, then color of (i+1)th plank changes to P.

*/
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		FastReader f=new FastReader();
		
	int testCase=f.nextInt();
	while(testCase-->0){
	    int n=f.nextInt();
	    char[] arr=f.nextLine().toCharArray();
	    int count=0;
	    for(int i=0;i<arr.length-1;i++){
	        if(arr[i]==arr[i+1])continue;
	        else count++;
	    }
	    
	     if(count%2==0)
		    System.out.println(count/2);
		    else
		    System.out.println((count+1)/2);
		    
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
