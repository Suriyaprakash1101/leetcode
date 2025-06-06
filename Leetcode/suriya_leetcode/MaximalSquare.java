/*
221. Maximal Square
Solved
Medium
Topics
Companies
Given an m x n binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.

 

Example 1:


Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
Output: 4
Example 2:


Input: matrix = [["0","1"],["1","0"]]
Output: 1
Example 3:

Input: matrix = [["0"]]
Output: 0
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 300
matrix[i][j] is '0' or '1'.
*/
class Solution {
    public int maximalSquare(char[][] matrix) {
        int[][]dp=new int[matrix.length][matrix[0].length];
        int max=0;
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                if(i==0||j==0){
                    dp[i][j]=matrix[i][j]-'0';
                    max=Math.max(max,dp[i][j]);
                }
                else if(matrix[i][j]=='1'){
                    dp[i][j]=Math.min(dp[i][j-1],Math.min(dp[i-1][j],dp[i-1][j-1]))+1;
                    max=Math.max(max,dp[i][j]);

                }
                else{
                    dp[i][j]=0;
                    
                }
            }
        }
        return max*max;
    }
}
