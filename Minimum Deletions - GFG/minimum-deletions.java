//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String S = read.readLine();

            Solution ob = new Solution();
            
            System.out.println(ob.minimumNumberOfDeletions(S));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int minimumNumberOfDeletions(String S) {
        //your code here
        int n=S.length();
        StringBuilder s=new StringBuilder(S);
        s.reverse();
        String s2=s.toString();
        
        int arr[][]=new int[n+1][n+1];
        
        for(int i=n; i>=0; i--){
            for(int j=n; j>=0; j--){
                if(i==n  ||  j==n)    arr[i][j]=0;
                else if(S.charAt(i)==s2.charAt(j))    arr[i][j]=1+arr[i+1][j+1];
                else  arr[i][j]=Math.max(arr[i][j+1], arr[i+1][j]);
            }
        }
        // arr[0][0]=lps length
        // min removal so that lps 
        return n-arr[0][0];
    }
}