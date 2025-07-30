/*
1020. Number of Enclaves
Solved
Medium
Topics
premium lock icon
Companies
Hint
You are given an m x n binary matrix grid, where 0 represents a sea cell and 1 represents a land cell.

A move consists of walking from one land cell to another adjacent (4-directionally) land cell or walking off the boundary of the grid.

Return the number of land cells in grid for which we cannot walk off the boundary of the grid in any number of moves.

 

Example 1:


Input: grid = [[0,0,0,0],[1,0,1,0],[0,1,1,0],[0,0,0,0]]
Output: 3
Explanation: There are three 1s that are enclosed by 0s, and one 1 that is not enclosed because its on the boundary.
Example 2:


Input: grid = [[0,1,1,0],[0,0,1,0],[0,0,1,0],[0,0,0,0]]
Output: 0
Explanation: All 1s are either on the boundary or can reach the boundary.
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 500
grid[i][j] is either 0 or 1.
*/
class Solution {
    public int numEnclaves(int[][] grid) {
         int[][]visited=new int[grid.length][grid[0].length];
        int m=grid.length-1;
        int n=grid[0].length-1;
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<=n;i++){
            visited[0][i]=grid[0][i];
            visited[m][i]=grid[m][i];
            if(grid[0][i]==1){
                q.offer(new int[]{0,i});
            }
             if(grid[m][i]==1){
                q.offer(new int[]{m,i});
            }
            // for(int j=0;j<visited.length;j++){
            //     System.out.println(Arrays.toString(visited[j]));
            // }

        }
        //System.out.println("End of row");
        for(int i=0;i<=m;i++){
            visited[i][0]=grid[i][0];
            visited[i][n]=grid[i][n];
            if(grid[i][0]==1){
                q.offer(new int[]{i,0});
            }
             if(grid[i][n]==1){
                q.offer(new int[]{i,n});
            }
            // for(int j=0;j<visited.length;j++){
            //     System.out.println(Arrays.toString(visited[j]));
            //}
        }
        // System.out.println("End of col");
        int[]dr={1,-1,0,0};
        int[]dc={0,0,1,-1};
        while(!q.isEmpty()){
            int[]cur=q.poll();
            int row=cur[0];
            int col=cur[1];
            for(int i=0;i<4;i++){
                int newRow=row+dr[i];
                int newCol=col+dc[i];
                if(newRow>0&&newRow<m&&newCol>0&&newCol<n&&grid[newRow][newCol]==1&&visited[newRow][newCol]==0){
                    visited[newRow][newCol]=1;
                    q.offer(new int[]{newRow,newCol});
                }
            }
        }
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]!=visited[i][j]){
                    count++;
                }
            }
        }
        // for(int i=0;i<visited.length;i++){
        //     System.out.println(Arrays.toString(visited[i]));
        // }
        return count;
    }
}
