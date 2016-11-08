package com.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by qiudeyang on 07/11/16.
 */
class Solution114 {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        List<TreeNode> list = depthFirstSearch(root);
        TreeNode result = root;
        TreeNode temp = result;
        for (int i = 1; i < list.size(); i++) {
            temp.left = null;
            temp.right = list.get(i);
            temp = temp.right;
        }
        root = result;
    }

    public List<TreeNode> depthFirstSearch(TreeNode root) {
        List<TreeNode> list = new LinkedList<TreeNode>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            list.add(current);
            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }
        return list;
    }

    public void flatten1(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            if (current.right != null){
                stack.push(current.right);
            }
            if (current.left != null){
                stack.push(current.left);
            }
            if (!stack.isEmpty()){
                current.right = stack.peek();
            }
            current.left = null;
        }
    }
}

public class FlattenBinaryTreeToLinkedList {
    public static void main(String[] args) {
        Solution114 solution114 = new Solution114();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        solution114.flatten(root);
    }
}
