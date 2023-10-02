//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long ans;
        static void merge(long arr[], int l, int m, int r)
        {
            long[] c=new long[r-l+1];
            
            int i=l, j=m+1;
            int k=0;
            while(i<=m && j<=r)
            {
                if(arr[i]>arr[j])
                {
                    ans+=m-i+1;
                    c[k++]=arr[j++];
                }
                else
                {
                    c[k++]=arr[i++];
                }
            }
            while(i<=m)
            {
                c[k++]=arr[i++];
            }
            while(j<=r)
            {
                c[k++]=arr[j++];
            }
            
            int t=0;
            for(int t1=l; t1<=r; t1++)
            {
                arr[t1]=c[t++];
            }
        }
        static void mergeSort(long arr[], int l, int r)
        {
            if(l==r)
            {
                return;
            }
            int mid=(l+r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        ans=0;
        mergeSort(arr, 0, (int)(N-1));
        return ans;
        
    }
}