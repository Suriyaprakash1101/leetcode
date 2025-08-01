/*
547. Number of Provinces
Solved
Medium
Topics
premium lock icon
Companies
There are n cities. Some of them are connected, while some are not. If city a is connected directly with city b, and city b is connected directly with city c, then city a is connected indirectly with city c.

A province is a group of directly or indirectly connected cities and no other cities outside of the group.

You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and the jth city are directly connected, and isConnected[i][j] = 0 otherwise.

Return the total number of provinces.

 

Example 1:


Input: isConnected = [[1,1,0],[1,1,0],[0,0,1]]
Output: 2
Example 2:


Input: isConnected = [[1,0,0],[0,1,0],[0,0,1]]
Output: 3
 

Constraints:

1 <= n <= 200
n == isConnected.length
n == isConnected[i].length
isConnected[i][j] is 1 or 0.
isConnected[i][i] == 1
isConnected[i][j] == isConnected[j][i]
*/
class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[]visited=new boolean[isConnected.length];
        int province=0;
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i]){
                dfs(isConnected,visited,i);
                province++;
            }
        }
        return province;
    }
    public static void dfs(int[][]isConnected,boolean[]visited,int city){
        visited[city]=true;
        for(int i=0;i<isConnected.length;i++){
            if(isConnected[city][i]==1&&!visited[i]){
                
                dfs(isConnected,visited,i);
            }
        }
    }
    
}
