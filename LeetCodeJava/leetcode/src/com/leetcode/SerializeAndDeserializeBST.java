package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by qiudeyang on 08/11/16.
 */
class Codec {
    private static final String Seq = ",";
    private static final String Null = null;

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return null;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            sb.append(temp.val).append(Seq);
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
        return sb.toString();
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals(Null)) {
            return null;
        }
        String[] str = data.split(Seq);
        Queue<Integer> queue = new LinkedList<Integer>();
        for(String q:str){
            queue.offer(Integer.parseInt(q));
        }
        return getNode(queue);
    }

    public TreeNode getNode(Queue<Integer> q){
        if (q == null){
            return null;
        }
        TreeNode root = new TreeNode(q.poll());
        Queue<Integer> smallerQueue = new LinkedList<Integer>();
        while (!q.isEmpty() && q.peek() < root.val){
            smallerQueue.offer(q.poll());
        }
        root.left = getNode(smallerQueue);
        root.right = getNode(q);
        return root;
    }

}

public class SerializeAndDeserializeBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        Codec codec = new Codec();
        System.out.println(codec.serialize(root));
        TreeNode root1 = codec.deserialize(codec.serialize(root));
        System.out.println(root1.val);
        System.out.println(root1.left.val);
        System.out.println(root1.right.val);
    }
}
