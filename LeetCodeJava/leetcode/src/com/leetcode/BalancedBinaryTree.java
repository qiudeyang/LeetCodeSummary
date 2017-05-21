package com.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 06/11/16.
 */
class Solution110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null){
            return true;
        }
        int left = heightBinaryTree(root.left);
        int right = heightBinaryTree(root.right);
        return Math.abs(left-right) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    public boolean isBalanced1(TreeNode root) {
        List<TreeNode> list = new LinkedList<TreeNode>();
        preOrder(root,list);
        for (int i = 0; i < list.size(); i++) {
            if (!isBalancedBinaryTree(list.get(i))){
                return false;
            }
        }
        return true;
    }

    public void preOrder(TreeNode root,List<TreeNode> list){
        if (root == null){
            return;
        }
        list.add(root);
        preOrder(root.left,list);
        preOrder(root.right,list);
    }
    public boolean isBalancedBinaryTree(TreeNode root){
        if (root == null){
            return true;
        }
        if (Math.abs(heightBinaryTree(root.left)-heightBinaryTree(root.right))<=1){
            return true;
        }else{
            return false;
        }
    }
    public int heightBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = heightBinaryTree(root.left);
        int rightHeight = heightBinaryTree(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

//    以下是leetcode推荐的解法，基于DFS，返回DFS递归的当前结点高度，当当前结点的子树是平衡时，返回一个非负的数，否则返回-1，时间复杂度O（n）
    public boolean isBalanced3(TreeNode root){
        return dfsHeight(root) != -1;
    }
    public int dfsHeight(TreeNode root){
//        树为空
        if (root == null){
            return 0;
        }
//        左子树不为平衡树
        int leftHeight = dfsHeight(root.left);
        if (leftHeight == -1){
            return -1;
        }
//        右子树不为平衡树
        int rightHeight = dfsHeight(root.right);
        if (rightHeight == -1){
            return -1;
        }
//        左右子树高度差大于1，不为平衡树
        if (Math.abs(leftHeight-rightHeight) > 1){
            return -1;
        }
//        root为平衡树，返回一个非负的树高度。
        return Math.max(leftHeight,rightHeight)+1;
    }
}

public class BalancedBinaryTree {
    public static void main(String[] args) {
        Solution110 solution110 = new Solution110();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(15);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        System.out.println(solution110.isBalanced3(root));
    }
}
