/*
36. Valid Sudoku
Solved
Medium
Topics
Companies
Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.
 

Example 1:


Input: board = 
[["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: true
Example 2:

Input: board = 
[["8","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: false
Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
 

Constraints:

board.length == 9
board[i].length == 9
board[i][j] is a digit 1-9 or '.'.
*/
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]!='.'){
                    boolean b=validrow(board,board[i][j],i)&&validcol(board,board[i][j],j)&&validbox(board,board[i][j],i,j);
                    if(!b){
                        return false;
                    }
                }
            }
        }
        return true;
        
    }
    public static boolean validrow(char[][] board, char c,int row){
        int count=0;
        for(int i=0;i<board[row].length;i++){
            if(board[row][i]==c){
                count++;
            }
        }
        return count==1?true:false;
    }
    public static boolean validcol(char[][]board,char c,int col){
        int count=0;
        for(int i=0;i<board.length;i++){
            if(board[i][col]==c){
                count++;
            }
        }
        return count==1?true:false;

    }
    public static boolean validbox(char[][]board,char c,int row,int col){
        int localrow=row-row%3;
        int localcol=col-col%3;
        int count=0;
        for(int i=localrow;i<localrow+3;i++){
            for(int j=localcol;j<localcol+3;j++){
                if(board[i][j]==c){
                    count++;
                }
            }
        }
        return count==1?true:false;
    }
}
