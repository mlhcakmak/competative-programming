/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws IOException
	{
	FastScanner f=new FastScanner();
	int testCase=f.nextInt();
	while(testCase-->0){
	   int n=f.nextInt();
	   int k=f.nextInt();
	   int l=f.nextInt();
	   int[] arr=new int[n];
	   int max=0;
	   for(int i=0;i<n;i++){
	       arr[i]=f.nextInt();
	       if(max<arr[i] && i<n-1)max=arr[i];
	   }
	   if(k<=0){
	       if(arr[n-1]>max)System.out.println("Yes");
	       else System.out.println("No");
	   }
	   else {
	       if(arr[n-1]+k*(l-1)>max)System.out.println("Yes");
	       else System.out.println("No");
	   }
	   
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
