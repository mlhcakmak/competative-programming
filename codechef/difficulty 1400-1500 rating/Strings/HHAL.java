/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int testCase=Integer.parseInt(br.readLine().trim());
	while(testCase-->0){
	    String s=br.readLine();
	    StringBuilder sb=new StringBuilder(s);
	    String temp=sb.reverse().toString();
	    if(s.equals(temp))System.out.println(1);
	    else System.out.println(2);
	    
	}
	
	}
	
	
}
