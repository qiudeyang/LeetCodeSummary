package com.leetcode;

/**
 * Created by qiudeyang on 02/05/17.
 */
//Diameter：直径
class Solution543 {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return max;
    }

    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        max = Math.max(max,left+right);
        return 1+Math.max(left,right);
    }
}
public class DiameterOfBinaryTree {
    public static void main(String[] args) {
        Solution543 solution543 = new Solution543();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(solution543.diameterOfBinaryTree(root));
    }
}
