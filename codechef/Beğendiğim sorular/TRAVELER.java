/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int t=Integer.parseInt(br.readLine());
	String[] s=br.readLine().split(" ");
	List<String> list =Arrays.asList(s);
	int n=Integer.parseInt(br.readLine());
	HashMap<String,Integer> hmap=new HashMap<>();
	for(int i=0;i<n;i++){
	    String[] city=br.readLine().split(" ");
	    hmap.put(city[0]+" "+city[1],Integer.parseInt(city[2]));
	}
	int testCase=Integer.parseInt(br.readLine());
	while(testCase-->0){
	    String[] tour =br.readLine().split(" ");
	    HashSet<String> hset=new HashSet<>();
	    int tmp=0;
	    int road=0;
	    for(int i=1;i<tour.length;i++){
	       if(!list.contains(tour[i])){
	           System.out.println("ERROR"); tmp=1;
	           break;
	       }
	       hset.add(tour[i]);
	    }
	    if(tmp==0){
	        if(hset.size()!=tour.length-1){
	            System.out.println("ERROR");
	        }
	        else{
	            int flag=0;
	            for(int i=1;i<tour.length-1;i++){
	                String str=tour[i]+" "+tour[i+1];
	                if(!hmap.containsKey(str)){
	                    System.out.println("ERROR");
	                    flag=1;
	                    break;
	                }
	                else road+=hmap.get(str);
	            }
	            if(flag==0)System.out.println(road);
	        }
	    }
	    
	} 
	
	}
	
}
