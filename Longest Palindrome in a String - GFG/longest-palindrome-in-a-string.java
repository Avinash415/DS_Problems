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
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String S){
        // code here
        int n=S.length();
        int len=0;
        String ans="";
        for(int i=0; i<n; i++)
        {
            String curr=help(S,i,i);
            if(curr.length()>len)
            {
                ans=curr;
                len=curr.length();
            }
            curr=help(S,i,i+1);
            if(curr.length()>len)
            {
                ans=curr;
                len=curr.length();
            }
        }
        return ans;
    }
    static String help(String s, int st, int end)
    {
        int n=s.length();
        while(st>=0 && end<n)
        {
            if(s.charAt(st)==s.charAt(end))
            {
                st--; end++;
            }
            else break;
        }
        return s.substring(st+1, end);
    }
}