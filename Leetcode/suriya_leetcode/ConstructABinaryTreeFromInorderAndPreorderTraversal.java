/*
105. Construct Binary Tree from Preorder and Inorder Traversal
Solved
Medium
Topics
premium lock icon
Companies
Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is the inorder traversal of the same tree, construct and return the binary tree.

 

Example 1:


Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
Output: [3,9,20,null,null,15,7]
Example 2:

Input: preorder = [-1], inorder = [-1]
Output: [-1]
 

Constraints:

1 <= preorder.length <= 3000
inorder.length == preorder.length
-3000 <= preorder[i], inorder[i] <= 3000
preorder and inorder consist of unique values.
Each value of inorder also appears in preorder.
preorder is guaranteed to be the preorder traversal of the tree.
inorder is guaranteed to be the inorder traversal of the tree.

*/
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return recursion(inorder,0,inorder.length-1,preorder,0,preorder.length-1,map);
    }
    public static TreeNode recursion(int[]inorder,int is,int ie,int[]preorder,int ps,int pe,HashMap<Integer,Integer>map){
        if(is>ie||ps>pe){
            return null;
        }
        TreeNode node=new TreeNode(preorder[ps]);
        int num=map.get(preorder[ps]);
        int num_between=num-is;
        node.left=recursion(inorder,is,num-1,preorder,ps+1,ps+num,map);
        node.right=recursion(inorder,num+1,ie,preorder,ps+num_between+1,pe,map);
        return node;
    }
}
