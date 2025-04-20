/*
337. House Robber III
Solved
Medium
Topics
Companies
The thief has found himself a new place for his thievery again. There is only one entrance to this area, called root.

Besides the root, each house has one and only one parent house. After a tour, the smart thief realized that all houses in this place form a binary tree. It will automatically contact the police if two directly-linked houses were broken into on the same night.

Given the root of the binary tree, return the maximum amount of money the thief can rob without alerting the police.

 

Example 1:


Input: root = [3,2,3,null,3,null,1]
Output: 7
Explanation: Maximum amount of money the thief can rob = 3 + 3 + 1 = 7.
Example 2:


Input: root = [3,4,5,1,3,null,1]
Output: 9
Explanation: Maximum amount of money the thief can rob = 4 + 5 = 9.
 

Constraints:

The number of nodes in the tree is in the range [1, 104].
0 <= Node.val <= 104
*/
class Solution {
    public int rob(TreeNode root) {
        int[]options=find(root);
        return Math.max(options[0],options[1]);
    }
    public static int[] find(TreeNode root){
        if(root==null){
            return new int[2];
        }
        int[]left_node=find(root.left);
        int[]right_node=find(root.right);
        int[]option=new int[2];
        option[0]=root.val+left_node[1]+right_node[1];
        option[1]=Math.max(left_node[0],left_node[1])+Math.max(right_node[0],right_node[1]);
        return option;
    }
}
