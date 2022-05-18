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
	int testCase=f.nextInt();
	StringBuilder sb=new StringBuilder();
	while(testCase-->0){
	    String s=f.nextLine();
	    if(s.length()!=5){
	        sb.append("Error\n");
	        continue;
	    }
	    if(s.charAt(0)>104||s.charAt(0)<97||s.charAt(3)>104||s.charAt(3)<97||s.charAt(2)!='-'||s.charAt(1)<49||s.charAt(1)>56||s.charAt(4)<49||s.charAt(4)>56){
	        sb.append("Error\n");
	        continue;
	    }
	    int d1=Math.abs(s.charAt(3)-s.charAt(0));
	        int d2=Math.abs(s.charAt(4)-s.charAt(1));
	        if(d1>0&&d2>0&&d1+d2==3)
	        sb.append("Yes\n");
	        else
	        sb.append("No\n");
	        
	        
	}
	System.out.print(sb);
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
