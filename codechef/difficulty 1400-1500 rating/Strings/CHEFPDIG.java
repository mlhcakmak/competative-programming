/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/*  the number 65 corresponds to 'A', 66 to 'B' and so on till 90 for 'Z'. Chef is only interested in finding which of the characters in the range 'A' to 'Z' can possibly be picked this way. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		FastReader f=new FastReader();
		
	int testCase=f.nextInt();
	while(testCase-->0){
	    StringBuilder sb=new StringBuilder();
	    char[] s=f.nextLine().toCharArray();
	    int[] d=new int[10];
	    for(char ch:s){
	        d[ch-'0']++;
	    }
	    for(int i=65;i<=90;i++){
                int d1 = i%10;
                int d2 = i/10;
                if(d1!=d2){
                    if(d[d1]>0 && d[d2]>0){
                        sb.append((char)(i));
                    }
                }
                else{
                    if(d[d1]>1){
                        sb.append((char)i);
                    }
                }
            }
            sb.append("\n");
	    
	    System.out.print(sb);
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
