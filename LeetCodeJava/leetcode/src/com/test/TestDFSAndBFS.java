package com.test;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by qiudeyang on 06/11/16.
 */
public class TestDFSAndBFS {
    public void depthFirstTraversal(TreeNode root){
        if (root == null){
            System.out.println("empty tree");
            return;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode current = stack.pop();
            System.out.print(current.val+"  ");
            if (current.right != null){
                stack.push(current.right);
            }
            if (current.left != null){
                stack.push(current.left);
            }
        }
        System.out.println();
    }
    public void broadthFirstTraversal(TreeNode root){
        if (root == null){
            System.out.println("empty tree");
            return;
        }
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode current = queue.poll();
            System.out.print(current.val+"  ");
            if (current.left != null){
                queue.offer(current.left);
            }
            if (current.right != null){
                queue.offer(current.right);
            }
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        TestDFSAndBFS testDFSAndBFS = new TestDFSAndBFS();
        testDFSAndBFS.depthFirstTraversal(root);
        testDFSAndBFS.broadthFirstTraversal(root);
    }
}
