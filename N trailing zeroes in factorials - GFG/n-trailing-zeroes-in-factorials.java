//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int  N = Integer.parseInt(input_line[0]);
            Solution ob = new Solution();
            int ans = ob.countZeroes(N);
            System.out.println(ans);
        }
    }
}



// } Driver Code Ends


//User function Template for Java

class Solution{
    int countZeroes(int n){
        // code here
        int l=0, h=n*5;
        while(l<=h){
            int mid=(l+h)/2;
            int zeros=countZeros(mid);
            
            if(zeros==n)  return 5;
            else if(zeros < n)   l=mid+1;
            else h=mid-1;
        }
        return 0;
    }
    
    int countZeros(int n){
        int zeros=0;
        while(n!=0){
            zeros+=(n/5);
            n=n/5;
        }
        return zeros;
    }
}
