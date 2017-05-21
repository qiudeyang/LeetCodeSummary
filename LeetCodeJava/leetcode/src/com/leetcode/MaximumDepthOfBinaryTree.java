package com.leetcode;

/**
 * Created by qiudeyang on 16/10/16.
 */
import com.leetcode.BinaryTree;
class Solution104 {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }else{
            return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
        }

    }
}
public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        Solution104 solution104 = new Solution104();
        TreeNode root1 = new TreeNode(8);
        root1.left = new TreeNode(4);
        root1.right = new TreeNode(10);
        root1.left.left = new TreeNode(2);
        root1.right.left = new TreeNode(9);

        System.out.println(solution104.maxDepth(root1));
    }
}
