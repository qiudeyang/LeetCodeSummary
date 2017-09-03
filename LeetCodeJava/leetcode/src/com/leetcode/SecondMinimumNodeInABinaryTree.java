package com.leetcode;

import java.util.*;

/**
 * Created by qiudeyang on 03/09/17.
 */
class Solution671 {
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null || root.left == null) {
            return -1;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        Set<Integer> set = new TreeSet<>();
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            set.add(temp.val);
            if (temp.left != null && temp.right != null) {
                queue.offer(temp.left);
                queue.offer(temp.right);
            }
        }
        if (set.size() >= 2) {
            int count = 1;
            for (Integer a : set) {
                if (count == 2) {
                    return a;
                }
                count++;
            }
        }
        return -1;
    }
}

public class SecondMinimumNodeInABinaryTree {
    public static void main(String[] args) {
        Solution671 solution671 = new Solution671();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        System.out.println(solution671.findSecondMinimumValue(root));
    }
}
