//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
   String  reverseWords(String s)
   {
      String result=new String();
      int i=0;
      int n=s.length();
      
      while(i<n)
      {
          while(i<n && s.charAt(i)=='.')i++;
          if(i>=n)   break;
          int j=i+1;
          
          while(j<n   &&  s.charAt(j) !='.')j++;
          String sub=s.substring(i,j);
          if(result.length()==0)  result=sub;
          else  result=sub+"."+result;
          i=j+1;
      }
      return result;
   }
}