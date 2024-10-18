/*
Given the root of a Binary Search Tree (BST), return the minimum difference between the values of any two different nodes in the tree.

 

Example 1:


Input: root = [4,2,6,1,3]
Output: 1
Example 2:


Input: root = [1,0,48,null,null,12,49]
Output: 1
 

Constraints:

The number of nodes in the tree is in the range [2, 100].
0 <= Node.val <= 105
 

Note: This question is the same as 530: https://leetcode.com/problems/minimum-absolute-difference-in-bst/
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDiffInBST(TreeNode root) {
        ArrayList<Integer>l=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null){
            return 0;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int len=q.size();
            for(int i=0;i<len;i++){
                TreeNode current=q.poll();
                l.add(current.val);
                if(current.left!=null){
                    q.offer(current.left);
                }
                if(current.right!=null){
                    q.offer(current.right);
                }
            }
        }
       

        int mind=dif(l);
        return mind;
    }
    public static int dif(ArrayList<Integer>l){
        int mindif=Math.abs(l.get(0)-l.get(1));
        for(int i=0;i<l.size();i++){
            for(int j=0;j<l.size();j++){
                if(j==i){
                    continue;
                }
                int dif=Math.abs(l.get(i)-l.get(j));
                if(dif<mindif){
                    mindif=dif;
                }
            }
        }
        return mindif;
    }
}
