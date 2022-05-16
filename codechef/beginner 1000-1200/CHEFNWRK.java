/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Chef has N small boxes arranged on a line from 1 to N. For each valid i, the weight of the i-th box is Wi. Chef wants to bring them to his home, which is at the position 0. He can hold any number of boxes at the same time; 

however, the total weight of the boxes he's holding must not exceed K at any time, and he can only pick the ith box if all the boxes between Chef's home and the ith box have been either moved or picked up in this trip.

Therefore, Chef will pick up boxes and carry them home in one or more round trips. Find the smallest number of round trips he needs or determine that he cannot bring all boxes home.

 */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	FastReader f=new FastReader();
	int testCase=f.nextInt();
	while(testCase-->0){
	   int n=f.nextInt(); 
	   int k=f.nextInt();
	   int[] arr =new int[n];
	   for(int i=0;i<n;i++){
	       arr[i]=f.nextInt();
	   }
	  int currentTrip = 0,totalTrips=1;
	  for(int i=0;i<n;i++){
	      if(arr[i]>k){
	          totalTrips=-1;
	          break;
	      }
	      
	     if(currentTrip+arr[i]<=k)currentTrip+=arr[i];
	     else{
	        currentTrip=arr[i];
	        totalTrips++;
	     }
	  }
	   System.out.println(totalTrips);
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
