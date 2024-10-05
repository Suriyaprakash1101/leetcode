/*
Given the root of a binary tree, return the bottom-up level order traversal of its nodes' values. (i.e., from left to right, level by level from leaf to root).

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[15,7],[9,20],[3]]
Example 2:

Input: root = [1]
Output: [[1]]
Example 3:

Input: root = []
Output: []
 

Constraints:

The number of nodes in the tree is in the range [0, 2000].
-1000 <= Node.val <= 1000
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode>queue=new LinkedList<>();
        if(root==null){
            return list;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int len=queue.size();
            ArrayList<Integer>l=new ArrayList<>();
            for(int i=0;i<len;i++){
                TreeNode current=queue.poll();
                int value=current.val;
                l.add(value);
                if(current.right!=null){
                    queue.offer(current.right);
                }
                if(current.left!=null){
                    queue.offer(current.left);
                }
            }
            Collections.reverse(l);
            list.add(l);
        }
        Collections.reverse(list);
        return list;
    }
}
