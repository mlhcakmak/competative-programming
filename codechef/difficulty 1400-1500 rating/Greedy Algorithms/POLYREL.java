/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws IOException
	{
	FastScanner in=new FastScanner();
	PrintWriter out=new PrintWriter(System.out);
	int testCase=in.nextInt();
	while(testCase-->0){
	   int n = in.nextInt();
	  int m = n;
	  while(n-->0)
	  {
		int a = in.nextInt();
		int b = in.nextInt();
	  }
	  long ans = 0;
	  while(m>=3)
	  {
		  ans = ans + m;
		  m = m/2;
	  }
	  out.println(ans);
	   
	}
	out.close();
	}
	
	
}
class FastScanner {
    java.io.BufferedReader br;
    java.util.StringTokenizer st;
    
    public FastScanner() {
        br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
    }

    public String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new java.util.StringTokenizer(br.readLine());
            }
            catch (java.io.IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        }
        catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
