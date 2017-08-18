package com.test;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by qiudeyang on 2017/8/6.
 */
public class TestDfs {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        int depth = 0;
        while(!queue.isEmpty()){
            depth++;
            System.out.println(depth);
            int size = queue.size();
            System.out.println(depth);
            for(int i = 0; i < size;i++){
                TreeNode temp = queue.poll();
                if(temp.left == null && temp.right == null){
                    return depth;
                }
                if(temp.left != null){
                    queue.offer(temp.left);
                }
                if(temp.right != null){
                    queue.offer(temp.right);
                }
            }
        }
        return depth;
    }
    public void dfs(TreeNode root){
        if(root == null){
            System.out.println("empty tree");
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.println("temp val is: "+temp.val);
            if (temp.right != null){
                stack.push(temp.right);
            }
            if (temp.left != null){
                stack.push(temp.left);
            }
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(7);
        System.out.println(new TestDfs().minDepth(root));
        new TestDfs().dfs(root);
    }
}
