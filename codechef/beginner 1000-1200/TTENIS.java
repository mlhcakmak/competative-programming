/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Chef likes to play table tennis. He found some statistics of matches which described who won the points in order. A game shall be won by the player first scoring 11 points except in the case when both players have 10 points each, 

then the game shall be won by the first player subsequently gaining a lead of 2 points. Could you please help the Chef find out who the winner was from the given statistics? */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		FastReader f=new FastReader();
	int testCase=f.nextInt();
	while(testCase-->0){
	    String str=f.nextLine();
	    int opponent=0;
	    int chef=0;
	    for(int i=0;i<str.length();i++){
	    if(str.charAt(i)=='0'){
	        opponent++;
	    }
	    else if(str.charAt(i)=='1'){
	        chef++;
	    }
	    if(opponent==11 && chef<10)System.out.println("LOSE");
	    if(chef==11 && opponent<10)System.out.println("WIN");
	    else if(opponent>=10 && chef>=10){
	        if(opponent>chef+1)System.out.println("LOSE");
	        else if(chef>opponent+1)System.out.println("WIN");
	    }
	    }
	    
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
