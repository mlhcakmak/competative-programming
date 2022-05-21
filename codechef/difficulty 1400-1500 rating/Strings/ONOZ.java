/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/*  where an hour lasts M minutes and a day lasts H hours Can you tell how many minutes during a day will the digital clock have identical digits displayed on it? */
class Codechef
{
	public static void main (String[] args) throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int testCase=Integer.parseInt(br.readLine().trim());
	while(testCase-->0){
	    String[] s=br.readLine().trim().split(" ");
	    int H=Integer.parseInt(s[0]);
	    int M=Integer.parseInt(s[1]);
	    int counter=1;
	    for(int i=1;i<10;i++){
	        int hour=i;
	        while(hour<H){
	            int minute=i;
	            while(minute<M){
	                counter++;
	                minute=(minute*10)+i;
	            }
	            hour=(hour*10)+i;
	        }
	    }
	    System.out.println(counter);
	}
	
	}
	
	
}
