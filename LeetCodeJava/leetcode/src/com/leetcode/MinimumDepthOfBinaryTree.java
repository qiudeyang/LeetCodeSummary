package com.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by qiudeyang on 16/10/16.
 */
class Solution111 {
    public int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int leftTree = minDepth(root.left);
        int rightTree = minDepth(root.right);
        return (leftTree == 0 || rightTree == 0)?leftTree+rightTree+1:Math.min(leftTree,rightTree)+1;
    }
}
public class MinimumDepthOfBinaryTree {
    public static void main(String[] args) {
        Solution111 solution111 = new Solution111();
        TreeNode root1 = new TreeNode(8);
        root1.left = new TreeNode(4);
        root1.right = new TreeNode(10);
        root1.left.left = new TreeNode(2);
        System.out.println(solution111.minDepth(root1));
    }
}
