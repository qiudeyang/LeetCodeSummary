package com.test;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 29/10/16.
 */
public class TestLevelOrder {
    public List<Integer> testLevelOrder(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        if (root == null) {
            return list;
        }
        List<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        list.add(root.val);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.remove(0);
            if (temp.left != null) {
                queue.add(temp.left);
                list.add(temp.left.val);
            }
            if (temp.right != null) {
                queue.add(temp.right);
                list.add(temp.right.val);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(new TestLevelOrder().testLevelOrder(root));
    }
}
