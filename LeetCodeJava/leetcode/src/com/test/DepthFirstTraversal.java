package com.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by qiudeyang on 16/03/17.
 */
public class DepthFirstTraversal {
    public static List<Integer> depthFirstTraversal(TreeNode root){
        List<Integer> list = new LinkedList<Integer>();
        if (root == null){
            return list;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            list.add(temp.val);
            if (temp.right != null){
                stack.push(temp.right);
            }
            if (temp.left != null){
                stack.push(temp.left);
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
        System.out.println(depthFirstTraversal(root));
    }
}
