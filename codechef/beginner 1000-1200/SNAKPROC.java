/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* snakes come in a procession, and one by one, a valid report would be something like "..H..T…HTH….T.", or "…", or "HT", whereas "T…H..H.T", "H..T..H", "H..H..T..T" would be invalid reports. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		FastReader f=new FastReader();
	int testCase=f.nextInt();
	while(testCase-->0){
	    int L=f.nextInt();
	    String str=f.nextLine();
	    boolean t=true;
	    boolean h=false;
	    boolean valid=true;
	    for(int i=0;i<str.length();i++){
	        if(str.charAt(i)=='.')continue;
	        if(str.charAt(i)=='T' ){
	            if(t==true){
	            valid=false;
	            break;
	            }
	            t=true;
	            h=false;
	        }
	        else if(str.charAt(i)=='H' ){
	            if(h==true){
	            valid=false;
	            break;
	            }
	            h=true;
	            t=false;
	        }
	    }
	   if(valid && h==false)System.out.println("Valid");
	   else if(h==true) System.out.println("Invalid");
	   else System.out.println("Invalid");
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
