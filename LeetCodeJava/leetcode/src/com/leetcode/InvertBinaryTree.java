package com.leetcode;

/**
 * Created by qiudeyang on 12/10/16.
 */

class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
           return root;
        }
        TreeNode node = root;
        TreeNode left = node.left;
        node.left = node.right;
        node.right = left;
        return node;
    }
}
public class InvertBinaryTree {
    public static void main(String[] args) {
        Solution226  solution226 = new Solution226();
        int[] data = {4,2,7,1,3,6,9};
        BinaryTree bTree = new BinaryTree();
        bTree.createBinaryTree(data);
        TreeNode root = bTree.getRoot();
        System.out.println(solution226.invertTree(root));

    }
}
