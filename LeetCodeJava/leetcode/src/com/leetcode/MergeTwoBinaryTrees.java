package com.leetcode;

/**
 * Created by qiudeyang on 11/06/17.
 */
class Solution617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        } else if (t1 != null && t2 == null) {
            return t1;
        } else if (t1 == null && t2 != null) {
            return t2;
        } else {
            TreeNode result = new TreeNode(t1.val + t2.val);
            result.left = mergeTrees(t1.left, t2.left);
            result.right = mergeTrees(t1.right, t2.right);
            return result;
        }
    }
}

public class MergeTwoBinaryTrees {
    public static void main(String[] args) {
        Solution617 solution617 = new Solution617();
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(3);
        t1.right = new TreeNode(2);
        t1.left.left = new TreeNode(5);
        TreeNode t2 = new TreeNode(2);
        t2.left = new TreeNode(1);
        t2.right = new TreeNode(3);
        t2.left.right = new TreeNode(4);
        t2.right.right = new TreeNode(7);
        System.out.println(solution617.mergeTrees(t1, t2).left.val);
    }
}
