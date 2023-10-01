//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            
            int i = 0;
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();
              
            int[] s = new Solution().calculateSpan(a, n);
            
            for(i = 0; i < n; i++)
            {
                System.out.print(s[i] + " ");
            }
            
            System.out.println();
        }
    }
    
    
    
}
// } Driver Code Ends



class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int stocks[], int n)
    {
        // Your code here
         Stack<Integer> s=new Stack<>();
         int span[]=new int[stocks.length];    // previousIndex,  ans[i]=i-preIndex[i];
        int ans[]=new int[n];

        for(int i=0; i<stocks.length; i++)
        {
            while(!s.isEmpty() && stocks[s.peek()] <= stocks[i])
            {
                s.pop();
            } 
            if(s.isEmpty())
            {
                span[i]=-1;
            }
            else {
            
                span[i]=s.peek();
            }
            s.push(i);
        }
        for(int i=0; i<n; i++)
        {
            ans[i]=i-span[i];
        }
        return ans;
    }
    
}