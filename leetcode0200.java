/*200.Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
You may assume all four edges of the grid are all surrounded by water.*/

//solution1
 class Pair{
     int first;
     int second;
     public Pair(int first,int second){
         this.first=first;
         this.second=second;
     }
 }
class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis= new int[n][m];
        int count=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0&&grid[i][j]==1){
                    count+=1;
                    bfs(i,j,vis,grid);
                }
            }
        }
        return count;
    }

    private void bfs(int r,int c,int[][]vis,char[][] grid){
        vis[r][c]=1;
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(r,c));
        int n=grid.length;
        int m=grid[0].length;

        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            q.remove();

            for(int delrow=-1;delrow<=1;delrow++){
                for(int delcol=-1;delcol<=1;delcol++){
                    int r1=row+delrow;
                    int c1=col+delcol;
                    if(r1>=0&&r1<n && c1>=0&&c1<m && grid[r1][c1]=='1' &&vis[r1][c1]==0){
                        vis[r1][c1]=1;
                        q.add(new Pair(r1,c1));
                    }
                }
            }
        }
       
    }
}



//solution2
public class Solution {

		private int n;
		private int m;

	public int numIslands(char[][] grid) {
			int count = 0;
			n = grid.length;
			if (n == 0) return 0;
			m = grid[0].length;
			
			for (int i = 0; i < n; i++){
				for (int j = 0; j < m; j++)
					if (grid[i][j] == '1') {
						DFSMarking(grid, i, j);
						++count;
					}
			}    
			return count;
		}

	private void DFSMarking(char[][] grid, int i, int j) {
		
			if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1') return;
			
			grid[i][j] = '0';
			
			DFSMarking(grid, i + 1, j);
			DFSMarking(grid, i - 1, j);
			DFSMarking(grid, i, j + 1);
			DFSMarking(grid, i, j - 1);
		}
}
