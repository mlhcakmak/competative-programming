/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		FastReader f=new FastReader();
		int t=f.nextInt();
		while(t-->0){
		    int a=f.nextInt();
		    int b=f.nextInt();
		    int a1=f.nextInt();
		    int b1=f.nextInt();
		    int a2=f.nextInt();
		    int b2=f.nextInt();
		    if((a==a1 && b==b1) || (a==b1 && b==a1)){
		        System.out.println("1");
		    }else if((a==a2 && b==b2) || (a==b2 && b==a2)){
		        System.out.println("2");
		    }else System.out.println("0");
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
