package com.leetcode;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by qiudeyang on 02/05/17.
 */
class Solution563 {
    int result = 0;
    public int findTilt(TreeNode root) {
        sum(root);
        return result;
    }

    public int sum(TreeNode root) {
        if (root == null){
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        result += Math.abs(leftSum-rightSum);
        return leftSum+rightSum+root.val;
    }
}

public class BinaryTreeTilt {
    public static void main(String[] args) {
        Solution563 solution563 = new Solution563();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(7);
        System.out.println(solution563.findTilt(root));
    }
}
