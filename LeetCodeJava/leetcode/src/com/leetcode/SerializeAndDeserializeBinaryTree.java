package com.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by qiudeyang on 18/01/17.
 */
public class SerializeAndDeserializeBinaryTree {
    // Encodes a tree to a single string.
    private static final String spliter = ",";
    private static final String NN = "X";

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildString(root, sb);//对象传递
        return sb.toString();
    }

    public void buildString(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append(NN).append(spliter);
        } else {
            sb.append(root.val).append(spliter);
            buildString(root.left, sb);//递归先序遍历
            buildString(root.right, sb);//递归先序遍历
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> queue = new LinkedList<String>();
        queue.addAll(Arrays.asList(data.split(spliter)));
        return buildTree(queue);
    }

    public static TreeNode buildTree(Queue<String> queue) {
        String val = queue.poll();
        if (val.equals(NN)) {
            return null;
        } else {
            TreeNode node = new TreeNode(Integer.parseInt(val));
            node.left = buildTree(queue);
            node.right = buildTree(queue);
            return node;
        }

    }

    public static void main(String[] args) {
        SerializeAndDeserializeBinaryTree s = new SerializeAndDeserializeBinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(s.serialize(root));
    }
}
