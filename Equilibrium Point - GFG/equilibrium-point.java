//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        // 1st approach
        // if(n==1)  return 1;
        // long sum=0;
        // for(long x: arr)
        // {
        //     sum+=x;
        // }
        
        // long sum1=arr[0];
        // sum=sum-arr[0];
        
        // for(int i=1; i<n; i++)
        // {
        //     sum=sum-arr[i];
        //     if(sum==sum1)   return i+1;
        //     sum1= sum1+arr[i];
            
        // }
        
        // return -1;
        
        // 2nd aproach
        
        if(n==1)  return 1;
        long s1=arr[0], s2=arr[n-1];
        
        int i=1, j=n-2;
        while(i<=j)
        {
            if(s1==s2 && i==j)  return i+1;
            if(s1<s2)  s1+=arr[i++];
            else s2+=arr[j--];
        }
        return -1;
    }
}
