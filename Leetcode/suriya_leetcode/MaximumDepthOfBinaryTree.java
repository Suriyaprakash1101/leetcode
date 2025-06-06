/*
104. Maximum Depth of Binary Tree
Solved
Easy
Topics
Companies
Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: 3
Example 2:

Input: root = [1,null,2]
Output: 2
 

Constraints:

The number of nodes in the tree is in the range [0, 104].
-100 <= Node.val <= 100
*/

class Solution {
    public int maxDepth(TreeNode root) {
        int[]a=new int[1];
        recursion(root,a,0);
        return a[0];
    }
    public static void recursion(TreeNode n,int[]a,int count){
        if(n==null){
            a[0]=Math.max(a[0],count);
            return;
        }
        recursion(n.left,a,count+1);
        recursion(n.right,a,count+1);
    }
}`
