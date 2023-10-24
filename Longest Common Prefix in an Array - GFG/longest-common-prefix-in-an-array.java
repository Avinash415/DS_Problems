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
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String compare(String a, String b){
        int i=0, j=0;
        String ret="";
        
        while(i<a.length() && j<b.length()){
            if(a.charAt(i) == b.charAt(j)){
                ret +=String.valueOf(a.charAt(i));
            }
            else{
                return ret;
            }
            i++; j++;
        }
        return ret;
    }
    String longestCommonPrefix(String arr[], int n){
        // code here
        String ans=arr[0];
        
        for(int i=0; i<n-1; i++){
            String x=compare(ans, arr[i+1]);  // compare & returns the common prefix..
            
            if(x.equals("")){
                return "-1";
            }
            ans=x;
        }
        return ans;
    }
}