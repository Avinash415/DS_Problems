//{ Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        long max=arr[0];
        long min=arr[0];
        long res=arr[0];
        
        for(int i=1; i<n; i++)
        {
            if(arr[i]==0)
            {
                max=1;
                min=1;
                continue;
            }
            
            long temp1=arr[i]*max;
            long temp2=arr[i]*min;
            max=Math.max(temp1,temp2);
            max=Math.max(max,arr[i]);
            min=Math.min(temp1, temp2);
            min=Math.min(min, arr[i]);
            res=Math.max(res, max);
        }
        return res;
    }
}