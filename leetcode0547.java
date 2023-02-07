/*547.There are n cities. Some of them are connected, while some are not. If city a is connected directly with city b, and city b is connected directly with city c, then city a is connected indirectly with city c.
A province is a group of directly or indirectly connected cities and no other cities outside of the group.*/

class Solution {
    private static void dfs(int node,ArrayList<ArrayList<Integer>> adjLs, boolean vis[]){
        vis[node]=true;
        for(int i : adjLs.get(node)){
            if(vis[i]==false){
                vis[i]=true;
                dfs(i,adjLs,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adjLs= new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<isConnected.length;i++){
            adjLs.add(new ArrayList<Integer>());
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected.length;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i);
                }
            }
        }
        boolean vis[]=new boolean[isConnected.length];
        int count=0;
        for(int i=0;i<isConnected.length;i++){
            if(vis[i]==false){
                count+=1;
                dfs(i,adjLs,vis);
            }
        }
        return count;
    }
}
