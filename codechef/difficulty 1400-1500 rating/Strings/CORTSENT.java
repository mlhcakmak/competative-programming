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
	    String[] s=br.readLine().trim().split(" ");
	    int k= Integer.parseInt(s[0]);
	    int flag1=1;
	    for(int i=1;i<s.length;i++){
	        String str=s[i];
	        int low=0;
	        int up=0;
	        int out=0;
	        int flag2=1;
	        for(int j=0;j<str.length();j++){
	            char ch = str.charAt(j);
	            if((ch>='a' && ch<='m')){
	                low++;
	            }
	            else if((ch>='N' && ch<='Z')){
	                up++;
	            }
	            else out++;
	        }
	        if(out>0 || (low>0 && up>0)){
	            flag2=0;
	            flag1=0;
	            System.out.println("NO");
	            break;
	        }
	    }
	   if(flag1==1){
	       System.out.println("YES");
	   } 
	}
	
	}
	
	
}
