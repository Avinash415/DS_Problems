//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
            for(int i = 0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++){
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
            }
            Solution obj = new Solution();
            int ans = obj.findMotherVertex(V, adj);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to find a Mother Vertex in the Graph.
    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        int arr[] =new int[V];
        int lastNode=0;
        
        for(int i=0; i<V; i++)
        {
            if(arr[i]==0)
            {
                dfs(adj, i, arr);
                lastNode=i;
            }
        }
        Arrays.fill(arr, 0);
        dfs(adj, lastNode, arr);
        for(int x: arr)
        {
            if(x==0)
            return -1;
        }
        return lastNode;
    }
        void dfs(ArrayList<ArrayList<Integer>>adj, int k, int[] arr)
        {
            arr[k]=1;
            for(int x: adj.get(k))
            {
                if(arr[x]==0)
                {
                    dfs(adj, x, arr);
                }
            }
    }
}