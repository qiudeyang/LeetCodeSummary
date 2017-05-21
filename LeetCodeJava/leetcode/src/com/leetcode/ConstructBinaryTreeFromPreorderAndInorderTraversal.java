package com.leetcode;

/**
 * Created by qiudeyang on 07/11/16.
 */
class Solution105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0,0,inorder.length-1,preorder,inorder);
    }
    public TreeNode helper(int preStart,int inStart,int inEnd,int[] preorder,int[] inorder){
        if (preStart > preorder.length - 1 || inStart > inEnd){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int inIndex = 0;
        for (int i = inStart; i <= inEnd ; i++) {
            if (inorder[i] == root.val){
                inIndex = i;
            }
        }
        root.left = helper(preStart+1,inStart,inIndex-1,preorder,inorder);
        root.right = helper(preStart+inIndex-inStart+1,inIndex+1,inEnd,preorder,inorder);
        return root;
    }
}

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public static void main(String[] args) {
        Solution105 solution105 = new Solution105();
        int[] preorder = {1, 2, 4, 5, 3, 6, 7};
        int[] inorder = {4, 2, 5, 1, 6, 3, 7};
        System.out.println(solution105.buildTree(preorder, inorder));
    }
}
