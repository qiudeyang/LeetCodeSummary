package com.test;


import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by qiudeyang on 14/04/17.
 */
public class JudgeCompleteBinaryTree {
    public static boolean judgeCompleteBinaryTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean flag = true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if (temp.left !=  null){
                if (flag==false){
                    return false;
                }
                queue.offer(temp.left);
                if (temp.right != null){
                    queue.offer(temp.right);
                }else{
                    flag = false;
                }
            }else{
                if (temp.right != null){
                    return false;
                }
                flag = false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(7);
        System.out.println(judgeCompleteBinaryTree(root));
    }
}
