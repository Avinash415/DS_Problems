//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int Arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxSumIS(Arr,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
	public int maxSumIS(int arr[], int n)  
	{  
	    //code here.
	    int msis[]=new int[n]; msis[0]=arr[0];
	    int res=msis[0];
	    
	    for(int i=1; i<n; i++)
	    {
	        msis[i]=arr[i];
	        for(int j=0; j<i; j++)
	        {
	            if(arr[j] < arr[i] && msis[i] < msis[j]+ arr[i])
	            {
	                msis[i]=msis[j]+arr[i];
	            }
	        }
	        res=Math.max(res, msis[i]);
	    }
	    return res;
	}  
}