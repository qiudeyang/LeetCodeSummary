package com.test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by qiudeyang on 2017/8/20.
 */
public class TestCompleteBinaryTree {
    public static boolean isCompleteBinaryTree(TreeNode root){
        if (root == null){
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = true;
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                if (temp.left == null){
                    if (temp.right == null){
                        flag = false;
                    }else{
                        return false;
                    }
                }else{
                    queue.offer(temp.left);
                    if (temp.right == null){
                        flag = false;
                    }else{
                        queue.offer(temp.right);
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        System.out.println(isCompleteBinaryTree(root));
    }
}
