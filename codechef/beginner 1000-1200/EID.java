/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Chef has N coins; let's denote the value of coin i by vi. Since today is Eid, Chef is going to give one coin to each of his two children. 

He wants the absolute value of the difference between the values of coins given to the two children to be as small as possible, so that he would be as fair as possible.

Help Chef by telling him the minimum possible difference between the values of the coins given to the two children.Of course, Chef cannot give the same coin to both children.

ilk önce arrayi sort ettim çünkü Arrays.sort(arr) o(n.logn) time complexitye sahip. sort etmeseydim 2 tane loop kullanmak zorunda kalırdım ki o da o(n'2) olurdu*/
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		FastReader f=new FastReader();
	int testCase=f.nextInt();
	while(testCase-->0){
	    int n=f.nextInt();
	    int[] arr=new int[n];
	    int min=Integer.MAX_VALUE;
	    for(int i=0;i<n;i++){
	        arr[i]=f.nextInt();
	    }
	    Arrays.sort(arr);
	    for(int i=1;i<arr.length;i++){
	        int temp=Math.abs(arr[i]-arr[i-1]);
	        if(temp<min)min=temp;
	    }
	    System.out.println(min);
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
