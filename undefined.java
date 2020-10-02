/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		try {
		    
		    int testCase=sc.nextInt();
		while(testCase>0){
		    int n = sc.nextInt();
		    int[] a = new int[n];
		    for (int i=0;i<n;i++ ){
		        a[i]=sc.nextInt();
		    }
		int ps=0;
            int ns=0;
            Set<Integer> s= new HashSet<>();
            for(int i=0; i<n; i++){
                if(!s.contains(a[i])){
                if(a[i]>=0){
                    ps+=a[i];
                }
                else{
                    ns+=a[i];
                }
            }
                s.add(a[i]);
            }
            System.out.println(ps+" "+ns);	
		    
		    
		    
		    
		    testCase--;
		}
		    
		} catch(Exception e) {
		}
		
	
	}
}
