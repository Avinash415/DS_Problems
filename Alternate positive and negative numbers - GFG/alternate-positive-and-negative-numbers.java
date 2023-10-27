//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        // code here
        
     ArrayList<Integer> listPositive=new ArrayList<>();
        ArrayList<Integer> listNegative=new ArrayList<>();
        
        for(int i=0; i<n; i++){
            if(arr[i]>=0){
                listPositive.add(arr[i]);
            }
            else{
                listNegative.add(arr[i]);
            }
        }
        // rearraangenment of Array..
        
        int pos=0;
        int neg=0;
        int index=0;
        while(pos<listPositive.size() && neg < listNegative.size()){
           arr[index++]=listPositive.get(pos++);
           arr[index++]=listNegative.get(neg++);
        }
        
        while(pos < listPositive.size() && index<n){
            arr[index++]=listPositive.get(pos++);
        }
        
        while(neg < listNegative.size() && index<n){
            arr[index++]=listNegative.get(neg++);
        }

    }
}