package com.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by qiudeyang on 2017/7/16.
 */
class Solution637 {
    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null) {
            return null;
        }
        List<Double> list = new LinkedList();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            double sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                sum += temp.val;
                if (temp.left != null) {
                    queue.offer(temp.left);
                }
                if (temp.right != null) {
                    queue.offer(temp.right);
                }
            }
            list.add(sum/(double) size);
        }
        return list;
    }
}

public class AverageOfLevelsInBinaryTree {
    public static void main(String[] args) {
        Solution637 solution637 = new Solution637();
        TreeNode root = new TreeNode(2147483647);
        root.left = new TreeNode(2147483647);
        root.right = new TreeNode(2147483647);
//        root.right.left = new TreeNode(15);
//        root.right.right = new TreeNode(7);
        System.out.println(solution637.averageOfLevels(root));
    }
}
