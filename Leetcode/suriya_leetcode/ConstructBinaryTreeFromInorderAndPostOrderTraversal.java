/*
106. Construct Binary Tree from Inorder and Postorder Traversal
Solved
Medium
Topics
premium lock icon
Companies
Given two integer arrays inorder and postorder where inorder is the inorder traversal of a binary tree and postorder is the postorder traversal of the same tree, construct and return the binary tree.

 

Example 1:


Input: inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
Output: [3,9,20,null,null,15,7]
Example 2:

Input: inorder = [-1], postorder = [-1]
Output: [-1]
 

Constraints:

1 <= inorder.length <= 3000
postorder.length == inorder.length
-3000 <= inorder[i], postorder[i] <= 3000
inorder and postorder consist of unique values.
Each value of postorder also appears in inorder.
inorder is guaranteed to be the inorder traversal of the tree.
postorder is guaranteed to be the postorder traversal of the tree.
*/
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return recursion(inorder,0,inorder.length-1,postorder,0,postorder.length-1,map);
    }
    public static TreeNode recursion(int[]inorder,int is,int ie,int[]postorder,int ps,int pe,HashMap<Integer,Integer>map){
        if(ps>pe||is>ie){
            return null;
        }
        TreeNode node=new TreeNode(postorder[pe]);
        int numIndex=map.get(postorder[pe]);
        int num_between=numIndex-is;
        node.left=recursion(inorder,is,numIndex-1,postorder,ps,ps+num_between-1,map);
        node.right=recursion(inorder,numIndex+1,ie,postorder,ps+num_between,pe-1,map);
        return node;


    }
}
