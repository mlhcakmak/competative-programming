/* package codechef; // don't place package name! */

import java.util.*;
import java.util.stream.IntStream;
import java.lang.*;
import java.io.*;

/* input: chef output:cehf 
00 01 10 11 
expl:01 10 birbirinin tersi olduğu için h ve e yer değişti*/
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		FastReader f=new FastReader();
	int testCase=f.nextInt();
	while(testCase-->0){
	    int k=f.nextInt();
	    String str=f.next();
		char[] arr=str.toCharArray();
		boolean[] vis=new boolean[arr.length];
		for(int i=0;i<arr.length;i++){
		    if(!vis[i]){
		        String s=Integer.toBinaryString(i);
		        int len=s.length();
		        if(len<k){
		            for(int j=0;j<k-len;j++){
		                s='0'+s;
		            }
		        }
		        StringBuilder sb=new StringBuilder(s);
		        sb=sb.reverse();
		        int num=Integer.parseInt(sb.toString(),2);
		        vis[i]=true;
		        vis[num]=true;
		        char temp=arr[i];
		        arr[i]=arr[num];
		        arr[num]=temp;
		    }
		}
		System.out.println(arr);
		
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
