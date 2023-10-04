//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        HashMap<Character,Integer> hm=new HashMap<>();
        int n=str.length();
        hm.put('I', 1); hm.put('V', 5); hm.put('X', 10); hm.put('L', 50); hm.put('C', 100); 
        hm.put('D', 500); hm.put('M', 1000);
        
        int res=hm.get(str.charAt(n-1));
        
        for(int i=n-2; i>=0; i--)
        {
            int curr=hm.get(str.charAt(i));
            int last=hm.get(str.charAt(i+1));
            
            if(curr<last)
                res=res-curr;
                else
                res+=curr;
        }
        return res;
    }
}