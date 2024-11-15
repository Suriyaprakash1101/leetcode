/**
103. Binary Tree Zigzag Level Order Traversal
Medium
Topics
Companies
Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]
Example 2:

Input: root = [1]
Output: [[1]]
Example 3:

Input: root = []
Output: []
 


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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>>l=new ArrayList<>();
        Deque<TreeNode>d=new LinkedList();
        if(root==null){
            return l;
        }
        d.addFirst(root);
        boolean reverse=false;
        while(!d.isEmpty()){
            int len=d.size();
            List<Integer>l1=new ArrayList<>();
            for(int i=0;i<len;i++){
                if(!reverse){
                    TreeNode current=d.pollFirst();
                    int val=current.val;
                    l1.add(val);
                    if(current.left!=null){
                        d.addLast(current.left);
                    }if(current.right!=null){
                        d.addLast(current.right);
                    }
                }else{
                    TreeNode current=d.pollLast();
                    int val=current.val;
                    l1.add(val);
                    if(current.right!=null){
                        d.addFirst(current.right);
                    }
                    if(current.left!=null){
                        d.addFirst(current.left);
                    }
                }
            }
            reverse=!reverse;
            l.add(l1);
        }
        return l;
    }
}
