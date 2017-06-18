package com.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by qiudeyang on 18/06/17.
 */
class Solution623 {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (root == null) {
            return null;
        }
        TreeNode result;
        if (d == 1) {
            result = new TreeNode(v);
            result.left = root;
            return result;
        }
        List<TreeNode> list = new LinkedList<>();
        int depth = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            if (depth == d-1){
                while (!queue.isEmpty()){
                    TreeNode temp = queue.poll();
                    list.add(temp);
                }
                break;
            }else{
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode temp = queue.poll();
                    if (temp.left != null){
                        queue.offer(temp.left);
                    }
                    if (temp.right != null){
                        queue.offer(temp.right);
                    }
                }
                depth++;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            TreeNode leftTree = list.get(i).left;
            TreeNode rightTree = list.get(i).right;
            list.get(i).left = new TreeNode(v);
            list.get(i).right = new TreeNode(v);
            list.get(i).left.left = leftTree;
            list.get(i).right.right = rightTree;
        }
        return root;
    }
}

public class AddOneRowToTree {
    public static void main(String[] args) {
        Solution623 solution623 = new Solution623();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(1);
        root.right.left = new TreeNode(5);
        TreeNode result = solution623.addOneRow(root, 1, 3);
        System.out.println(result.left.left.val);
        System.out.println(result.right.right.val);
    }
}
