package com.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by qiudeyang on 07/11/16.
 */
public class TestTraverse {
    public void preTraverse(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
//        System.out.println(list);
//        System.out.println("root.val" + root.val);
        preTraverse(root.left, list);
        System.out.println(root.val);
        preTraverse(root.right,list);
    }

    public List<Integer> midTraverse(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            TreeNode temp = stack.pop();
            list.add(temp.val);
            current = temp.right;
        }
        return list;
    }

    public List<String> traverseAllPath(TreeNode root) {
        List<String> list = new LinkedList<String>();
        test(root, "", list);
        return list;
    }

    public void test(TreeNode root, String path, List<String> list) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            list.add(path + root.val);
        }
        test(root.left, path + root.val, list);
        test(root.right, path + root.val, list);
    }


    public int pathSum(TreeNode root) {
        int s = 0;
        return sum(root, s);
    }

    public int sum(TreeNode root, int s) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return s * 10 + root.val;
        }
        return sum(root.left, s * 10 + root.val) + sum(root.right, s * 10 + root.val);
    }

    public boolean existPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null && root.val == sum) {
            return true;
        }
        return existPathSum(root.left, sum - root.val) || existPathSum(root.right, sum - root.val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<Integer> list = new LinkedList<Integer>();

        TestTraverse tt = new TestTraverse();
//        tt.preTraverse(root,list);
//        System.out.println(list);
//        System.out.println(tt.midTraverse(root));
//        System.out.println(tt.traverseAllPath(root));
//        System.out.println(tt.pathSum(root));
        System.out.println(tt.existPathSum(root, 15));
    }
}
