/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Input:Begin on Road A
Right on Road B
Right on Road C
Left on Road D

Output:Begin on Road D
Right on Road C
Left on Road B
Left on Road A*/
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	FastReader f=new FastReader(); 
	int testCase=f.nextInt();
	while(testCase-->0){
	    int n=f.nextInt();
	    Stack<String> directions=new Stack<>();
	    Stack<String> streets = new Stack<>();
	    for(int i=0;i<n;i++){
	        String str=f.nextLine();
	        String[] strSplitted=str.split(" on ",0);
	        if(!strSplitted[0].equals("Begin"))directions.push(strSplitted[0].equals("Right") ? "Left" : "Right" );
	        streets.push(strSplitted[1]);
	    }
	    directions.push("Begin");
	    int k=directions.size();
	    for(int i=0;i<k;i++){
	        System.out.println(directions.pop()+" on "+streets.pop());
	    }
	    System.out.println();
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
