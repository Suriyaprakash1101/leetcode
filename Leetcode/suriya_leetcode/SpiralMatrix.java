/*
54. Spiral Matrix
Solved
Medium
Topics
Companies
Hint
Given an m x n matrix, return all elements of the matrix in spiral order.

 

Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:


Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100
*/
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer>l=new ArrayList<>();
        int rows=0;
        int rowe=matrix.length-1;
        int cols=0;
        int cole=matrix[0].length-1;
        while(rows<=rowe&&cols<=cole){
            for(int i=cols;i<=cole;i++){
                l.add(matrix[rows][i]);
            }
            rows++;
            for(int i=rows;i<=rowe;i++){
                l.add(matrix[i][cole]);
            }
            cole--;
            if(rows<=rowe){
                for(int i=cole;i>=cols;i--){
                    l.add(matrix[rowe][i]);
                }
            }
            
            rowe--;
            if(cols<=cole){
                for(int i=rowe;i>=rows;i--){
                    l.add(matrix[i][cols]);
                }
            }
            cols++;
        }
        return l;
    }
}
