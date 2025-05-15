/*
51. N-Queens
Solved
Hard
Topics
Companies
The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.

Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.

 

Example 1:


Input: n = 4
Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above
Example 2:

Input: n = 1
Output: [["Q"]]
 

Constraints:

1 <= n <= 9
*/
class Solution {
    public List<List<String>> solveNQueens(int n) {
        int[][]a=new int[n][n];
        List<List<String>>l=new ArrayList<>();
        queen(a,0,n,l);
        return l;
    }
     public static void queen(int [][]a,int row,int n,List<List<String>>l){
        if(row==n){
            Append(a,l);
            return;
        }
        for(int i=0;i<a.length;i++){
            if(checkposition(a,row,i,n)){
                a[row][i]=1;
                queen(a,row+1,n,l);
                a[row][i]=0;
            }
        }
    }
    public static boolean checkposition(int[][]a,int row,int col,int n){
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
        while(c<n&&r>=0){
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
    public static void Append(int[][]a,List<List<String>>l){
        List<String>list=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<a.length;j++){
                if(a[i][j]==1){
                    sb.append("Q");
                }
                else{
                    sb.append(".");
                }
            }
            list.add(sb.toString());
        }
        l.add(list);
    }
}
