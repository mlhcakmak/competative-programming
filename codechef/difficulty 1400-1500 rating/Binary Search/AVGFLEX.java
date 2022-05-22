/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* There are N students in a class, where the i-th student has a score of Ai.

The i-th student will boast if and only if the number of students scoring less than or equal Ai is greater than the number of students scoring greater than Ai.

Find the number of students who will boast.. */
class Codechef
{
	public static void main (String[] args) throws IOException
	{
	FastScanner f=new FastScanner();
	int testCase=f.nextInt();
	while(testCase-->0){
	    int n=f.nextInt();
	    int[] freq=new int[101];
	    for(int i=0;i<n;i++) freq[f.nextInt()]++;
	    int ans = 0, cnt = 0;
	    for(int i = 0; i <= 100; i++){
	        cnt+=freq[i];
	        if(cnt>n-cnt)ans+=freq[i];
	    }
	    System.out.println(ans);
	}
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
