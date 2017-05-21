package com.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by qiudeyang on 16/03/17.
 */
class Solution103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return null;
        }
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<TreeNode> stack2 = new Stack<TreeNode>();
        stack1.push(root);
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            List<Integer> temp1 = new LinkedList<Integer>();
            while (!stack1.isEmpty()) {
                TreeNode node = stack1.pop();
                temp1.add(node.val);
                if (node.left != null) {
                    stack2.push(node.left);
                }
                if (node.right != null) {
                    stack2.push(node.right);
                }
            }
            list.add(new LinkedList<>(temp1));
            List<Integer> temp2 = new LinkedList<Integer>();
            while (!stack2.isEmpty()) {
                TreeNode node = stack2.pop();
                temp2.add(node.val);
                if (node.right != null) {
                    stack1.push(node.right);
                }
                if (node.left != null) {
                    stack1.push(node.left);
                }
            }
            if (temp2.size() > 0){
                list.add(new LinkedList<>(temp2));
            }
        }
        return list;
    }
}

public class BinaryTreeZigzagLevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        Solution103 solution103 = new Solution103();
        System.out.println(solution103.zigzagLevelOrder(root));
    }
}
