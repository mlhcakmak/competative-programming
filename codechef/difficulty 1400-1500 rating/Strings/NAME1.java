/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* If N children, with names C1,C2,...,CN, are born to parents with names A and B, and you consider C to be the concatenation of all the names of the children,

i.e. C=C1+C2+...+CN (where + is concatenation operator), then C should be a substring of one of the permutations of A+B. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		FastReader f=new FastReader();
	int testCase=f.nextInt();
	while(testCase-->0){
	   boolean flag=true;
	   String parent=f.nextLine();
	   HashMap<Character,Integer> hmap=new HashMap<>();
	   char[] toChar=parent.toCharArray();
	   for(char ch:toChar){
	       if(hmap.containsKey(ch))hmap.put(ch,hmap.get(ch)+1);
	       else hmap.put(ch,1);
	   }
	   int n=f.nextInt();
	   while(n-->0){
	       String child=f.nextLine();
	       toChar=child.toCharArray();
	       for(char ch:toChar){
	           if(hmap.containsKey(ch)&&hmap.get(ch)>0){
	               hmap.put(ch,hmap.get(ch)-1);
	           }
	           else{
	               flag=false;
	               break;
	           }
	       }
	   }
	   if(flag)System.out.println("YES");
	   else System.out.println("NO");
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
