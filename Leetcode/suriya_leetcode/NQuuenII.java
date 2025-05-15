/*
52. N-Queens II
Hard
Topics
Companies
The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

Given an integer n, return the number of distinct solutions to the n-queens puzzle.

 

Example 1:


Input: n = 4
Output: 2
Explanation: There are two distinct solutions to the 4-queens puzzle as shown.
Example 2:

Input: n = 1
Output: 1
 

Constraints:

1 <= n <= 9
*/
class Solution {
    public int totalNQueens(int n) {
        return queen(new int[n][n],0);
    }
    public static int queen(int[][]a,int row){
        if(row==a.length){
            return 1;
        }
        int count=0;
        for(int i=0;i<a.length;i++){
            if(checkposition(a,row,i)){
                a[row][i]=1;
                count+=queen(a,row+1);
                a[row][i]=0;
            }
        }
        return count;
    }
    public static boolean checkposition(int[][]a,int row,int col){
        for(int i=0;i<col;i++){
            if(a[row][i]==1){
                return false;
            }
        }
        for(int i=0;i<row;i++){
            if(a[i][col]==1){
                return false;
            }
        }
        int c=col-1;
        int r=row-1;
        //left diagonal
        while(c>=0&&r>=0){
            if(a[r][c]==1){
                return false;
            }
            else{
                r--;
                c--;
            }
        }
        //right diagonal
        r=row-1;
        c=col+1;
        while(c<a.length&&r>=0){
            if(a[r][c]==1){
                return false;
            }
            else{
                c++;
                r--;
            }
        }
        return true;
    }
}
