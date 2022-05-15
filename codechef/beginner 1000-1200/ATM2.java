/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* There is an ATM machine. Initially, it contains a total of K units of money. N people (numbered 1 through N) want to withdraw money; for each valid i, the i-th person wants to withdraw Ai units of money.

The people come in and try to withdraw money one by one, in the increasing order of their indices. Whenever someone tries to withdraw money, if the machine has at least the required amount of money, it will give out the required amount. Otherwise, it will throw an error and not give out anything; in that case, this person will return home directly without trying to do anything else.

For each person, determine whether they will get the required amount of money or not. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	FastReader f=new FastReader();
	int testCase=f.nextInt();
	while(testCase-->0){
	    int n=f.nextInt();
	    int k=f.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=f.nextInt();
	    }
	    String str="";
	    for(int i:arr){
	        if(i<=k){
	            k=k-i;
	            str=str+"1";
	        }
	        else str+="0";
	    }
	    System.out.println(str);
	    
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
