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
            int N = Integer.parseInt(in.readLine());
            int graph[][] = new int[N][N];
            
            for(int i = 0;i < N;i++)
                {String a[] = in.readLine().trim().split("\\s+");
                for(int j=0;j<N;j++)
                graph[i][j] = Integer.parseInt(a[j]);}
            
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.transitiveClosure(N, graph);
            for(int i = 0;i < N;i++)
               { for(int j = 0;j < ans.get(i).size();j++)
                    System.out.print(ans.get(i).get(j) + " ");
            System.out.println();}
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static ArrayList<ArrayList<Integer>> transitiveClosure(int N, int graph[][])
    {
        // code here
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();
        for(int i=0; i<N; i++)
        {
            ArrayList<Integer> vis= new ArrayList<Integer>(Collections.nCopies(N,0));
            dfs(i, graph, vis, N);
            list.add(vis);
        }
        return list;
    }
    static void dfs(int i, int[][] graph, ArrayList<Integer> list, int N){
        list.set(i, 1);
        for(int j=0; j<N; j++){
            if(graph[i][j]==1  &&  list.get(j)==0)   dfs(j, graph, list, N);
        }
    }
}