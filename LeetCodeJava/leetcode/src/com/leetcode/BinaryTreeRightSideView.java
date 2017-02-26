package com.leetcode;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by qiudeyang on 07/11/16.
 */
class Solution199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        helper(root, list, 0);
        return list;
    }

    public void helper(TreeNode root, List<Integer> list, int currentDepth) {
        if (root == null){
            return;
        }
        if (currentDepth == list.size()){
            list.add(root.val);
        }
        helper(root.right,list,currentDepth+1);  //有右节点取右节点，否则取左节点
        helper(root.left,list,currentDepth+1);
    }

    public List<Integer> rightSideView2(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.add(root);
        while (true) {
            int len = queue.size();
            if (len == 0) {
                break;
            }
            int value = 0;
            while (len > 0) {
                TreeNode temp = queue.poll();
                value = temp.val;
                len--;
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
            list.add(value);
        }
        return list;
    }

    public List<Integer> rightSideView1(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                if (i == 0) {
                    list.add(current.val);
                }
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
        }
        return list;
    }
    public static List<Integer> binaryTreeRightSideView(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            TreeNode last = null;
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                if (temp.left != null) {
                    queue.offer(temp.left);
                }
                if (temp.right != null) {
                    queue.offer(temp.right);
                }
                last = temp;
            }
            list.add(last.val);
        }
        return list;
    }
}

public class BinaryTreeRightSideView {
    public static void main(String[] args) {
        Solution199 solution199 = new Solution199();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);
        System.out.println(solution199.rightSideView(root));
    }
}
