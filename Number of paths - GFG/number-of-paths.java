//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GfG { 
    
	public static void main (String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int M = Integer.parseInt(inputLine[0]);
		    int N = Integer.parseInt(inputLine[1]);
		    Solution ob = new Solution();
		    System.out.println(ob.numberOfPaths(M, N));
		}
	}
}




// } Driver Code Ends


class Solution{
    
    long numberOfPaths(int M, int N) {
        // Code Here
        int t=M+N-2;
        int r=M-1;
        long res=1;
        final int MOD=1000000007;
        
        for(int i=1; i<=r; i++){
            res=(res*(t-r + i)%MOD) * modInverse(i, MOD)%MOD;
        }
        return res;
    }
    long modInverse(int a, int m){
        long m0=m;
        long x0=0;
        long x1=1;
        
        while(a>1){
            long q=a/m;
            long t=m;
            
            m=a%m;
            a=(int)t;
            
            t=x0;
            x0=x1-q*x0;
            x1=t;
        }
        if(x1<0){
            x1+=m0;
        }
        return x1;
    }
    
}