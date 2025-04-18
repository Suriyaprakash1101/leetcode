/*
120. Triangle
Attempted
Medium
Topics
Companies
Given a triangle array, return the minimum path sum from top to bottom.

For each step, you may move to an adjacent number of the row below. More formally, if you are on index i on the current row, you may move to either index i or index i + 1 on the next row.

 

Example 1:

Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
Output: 11
Explanation: The triangle looks like:
   2
  3 4
 6 5 7
4 1 8 3
The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).
Example 2:

Input: triangle = [[-10]]
Output: -10
 

Constraints:

1 <= triangle.length <= 200
triangle[0].length == 1
triangle[i].length == triangle[i - 1].length + 1
-104 <= triangle[i][j] <= 104
*/
//one approach(Recursion)
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        return recur(triangle,0,0);
    }
    public static int recur(List<List<Integer>>triangle,int col,int row){
        if(row==triangle.size()-1){
            return triangle.get(row).get(col);
        }
        int left=triangle.get(row).get(col)+recur(triangle,col,row+1);
        int right=triangle.get(row).get(col)+recur(triangle,col+1,row+1);
        return Math.min(left,right);
    }
}
//another approach(Dynamic programming)
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][]a=new int[triangle.size()+1][triangle.size()+1];
        for(int i=triangle.size()-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                a[i][j]=triangle.get(i).get(j)+Math.min(a[i+1][j],a[i+1][j+1]);
            }
        }
        return a[0][0];
    }
}
