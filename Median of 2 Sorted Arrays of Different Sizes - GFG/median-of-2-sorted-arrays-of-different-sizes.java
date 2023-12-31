//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}
// } Driver Code Ends


//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int m, int n, int a[], int b[]) 
    {
        // Your Code Here
        // if(b.length < a.length)   return medianOfArrays(m, n, b, a);
        
        // int total=(n+m+1)/2;
        
        // int low=0, high=n;
        // while(low<=high)
        // {
        //     int cut1=(low+high)/2;
        //     int cut2=total-cut1;
            
        //     int left1=cut1==0 ? Integer.MIN_VALUE : a[cut1-1];
        //     int left2=cut2==0 ? Integer.MIN_VALUE : b[cut2-1];
            
        //     int right1=cut1==n ? Integer.MAX_VALUE : a[cut1];
        //     int right2=cut2==m ? Integer.MAX_VALUE : b[cut2];
            
        //     if(left1 <= right2  &&  left2 <= right1)
        //     {
        //         if((n + m)%2 ==0)
        //          return (Math.max(left1, left2)+Math.min(right1, right2))/2.0;
        //         else
        //          return Math.max(left1, left2);
        //     }
        //     else if(left1 > right2){
        //         high=cut1-1;
        //     }
        //     else{
        //         low=cut1+1;
        //     }
        // }
        // return 0.0;
        
    int[] merged = new int[m + n];
    int i = 0, j = 0, k = 0;

    while (i < m && j < n) {
        if (a[i] < b[j]) {
            merged[k++] = a[i++];
        } else {
            merged[k++] = b[j++];
        }
    }

    while (i < m) {
        merged[k++] = a[i++];
    }

    while (j < n) {
        merged[k++] = b[j++];
    }

    if ((m + n) % 2 == 0) {
        int mid1 = merged[(m + n) / 2 - 1];
        int mid2 = merged[(m + n) / 2];
        return (mid1 + mid2) / 2.0;
    } else {
        return merged[(m + n) / 2];
    }
    } 
}