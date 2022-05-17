/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* In a world of superheroes each person is either a superhero or a villain. It is well known that every superhero has a name ending with either “man” or “woman”,

 If at point of time, there are two more superheroes than villains in the fight, superheroes will win the fight immediately, as they can overwhelm villains with their powers. On the other hand, 
 
 if there are 3 more villains than superheroes at any time, they will win, because they use dirty tricks to defeat the superheroes.*/
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		FastReader f=new FastReader(); 
	int testCase=f.nextInt();
	while(testCase-->0){
	int n=f.nextInt();
	String[] fighter=new String[n];
	int hero=1,villain=1,flag=0;
	for(int i=0;i<n;i++){
	    fighter[i]=f.nextLine();
	}
	for(int i=0;i<n;i++){
	    String s=fighter[i];
	    if(s.endsWith("man"))hero++;
	    else villain++;
	    if(hero>villain+1){
	        flag=1;
	        break;
	    }
	    else if(villain>hero+2){
	        flag=2;
	        break;
	    }
	}
	if(flag==1)System.out.println("superheroes");
	if(flag==2)System.out.println("villains");
	if(flag==0)System.out.println("draw");
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
