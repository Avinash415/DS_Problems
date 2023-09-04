//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(a[0]);
            int m = Integer.parseInt(a[1]);
            char mat[][] = new char[n][m];
            for(int i=0; i<n; i++)
            {
                String S[] = in.readLine().trim().split(" ");
                for(int j=0; j<m; j++)
                {
                    mat[i][j] = S[j].charAt(0);
                }
            }
            
            Solution ob = new Solution();
            char[][] ans = ob.fill(n, m, mat);
            for(int i = 0;i < n;i++) {
                for(int j = 0;j < m;j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
     static int[] row={-1, 0, 1, 0};
        static int[] col={0, 1, 0, -1};
    static char[][] fill(int n, int m, char a[][])
    {
        // code here
       int arr[][] = new int[n][m];
       for(int i=0; i<n; i++)
       {
           for(int j=0; j<m; j++)
           {
               if((i==0 || i==n-1 || j==0 || j==m-1) && a[i][j]=='O' && arr[i][j]==0)
               {
               makeOne(i, j, n, m, a, arr);
               }
           }
       }
       for(int i=0; i<n; i++)
       {
           for(int j=0; j<m; j++)
           {
               if(arr[i][j]==0)  a[i][j]='X';
           }
       }
       return a;
        
    }
    
    static void makeOne(int i, int j, int n, int m, char a[][], int [][] arr)
    {
        arr[i][j]=1;
        for(int k=0; k<4; k++)
        {
            int r=i+row[k];
            int c=j+col[k];
            
            if(r>=0 && r<n && c>=0 && c<m && a[r][c]=='O' && arr[r][c]==0)
            {
                makeOne(r,c,n,m,a,arr);
            }
        }
    }
}