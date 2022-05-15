/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Chef has an empty N×N chessboard. He places a Queen at (X,Y) and wonders - 
What are the number of cells that are under attack by the Queen? */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		FastReader fr=new FastReader();
		int t= fr.nextInt();
		while(t-->0){
		int n=fr.nextInt();
		int x=fr.nextInt();
		int y=fr.nextInt();
		 // vertical and horizontal -----------------------
		int count=2*n-2;
		
		count+=Math.min(x-1,y-1);   //topLeft diagonal 
        count+=Math.min(x-1,n-y);   //topRight diagonal
        count+=Math.min(n-x,y-1);   //bottomLeft diagonal
        count+=Math.min(n-x,n-y);   //bottomRight diagonal
            System.out.println(count);
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
