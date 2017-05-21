package com.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by qiudeyang on 16/03/17.
 */
public class PrintZigTree {
    public static List<Integer> printZigTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        List<Integer> list = new LinkedList<Integer>();
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<TreeNode> stack2 = new Stack<TreeNode>();
        stack1.push(root);
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            while (!stack1.isEmpty()){
                TreeNode temp = stack1.pop();
                list.add(temp.val);
                if (temp.right != null){
                    stack2.push(temp.right);
                }
                if (temp.left != null){
                    stack2.push(temp.left);
                }
            }
            while (!stack2.isEmpty()){
                TreeNode temp = stack2.pop();
                list.add(temp.val);
                if (temp.left != null){
                    stack1.push(temp.left);
                }
                if (temp.right != null){
                    stack1.push(temp.right);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(printZigTree(root));
    }
}
