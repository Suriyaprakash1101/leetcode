/*
59. Spiral Matrix II
Solved
Medium
Topics
Companies
Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

 

Example 1:


Input: n = 3
Output: [[1,2,3],[8,9,4],[7,6,5]]
Example 2:

Input: n = 1
Output: [[1]]
 

Constraints:

1 <= n <= 20
*/
class Solution {
    public int[][] generateMatrix(int n) {
        int[][]a=new int[n][n];
        int rows=0;
        int cols=0;
        int rowe=n-1;
        int cole=n-1;
        int num=1;
        while(rows<=rowe&&cols<=cole){
            for(int i=rows;i<=rowe;i++){
                a[rows][i]=num;
                num++;
            }
            rows++;
            for(int i=rows;i<=rowe;i++){
                a[i][cole]=num;
                num++;
            }
            cole--;
            if(rows<=rowe){
                for(int i=cole;i>=cols;i--){
                    a[rowe][i]=num;
                    num++;
                }
            }
            rowe--;
            if(cols<=cole){
                for(int i=rowe;i>=rows;i--){
                    a[i][cols]=num;
                    num++;
                }
            }
            cols++;

        }
        return a;
    }
}
