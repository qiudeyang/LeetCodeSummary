package com.leetcode;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by qiudeyang on 28/10/16.
 */
class Solution230 {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;
        int count = 0;
        while (current != null || !stack.empty()) {
            if (stack.size() == k) {
                return stack.peek().val;
            }
            if (current.left != null) {
                stack.push(current.left);
            }
            current = current.left;
        }
        return 1;
    }

}

public class KthSmallestElementInABST {
    public static void main(String[] args) {
        Solution230 solution230 = new Solution230();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        System.out.println(solution230.kthSmallest(root, 4));
    }
}
