//https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1?page=2&curated[]=5&sortBy=submissions

class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[]=new boolean[V+1];
        vis[0]=true;
        ArrayList<Integer> ls=new ArrayList<>();
        dfs(0,vis,adj,ls);
        return ls;
        
        
    }
    public static void dfs(int node,boolean vis[],ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls){
        vis[node]=true;
        ls.add(node);
        
        for(Integer i : adj.get(node)){
            if(vis[i]==false){
                dfs(i,vis,adj,ls);
            }
        }
    }
}
