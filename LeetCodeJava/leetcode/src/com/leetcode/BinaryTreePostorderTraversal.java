package com.leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by qiudeyang on 03/11/16.
 */
class Solution145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        if (root == null) {
            return list;
        }
        list.addAll(postorderTraversal(root.left));
        list.addAll(postorderTraversal(root.right));
        list.add(root.val);
        return list;
    }

    public List<Integer> postorderTraversal1(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if (root == null){
            return list;
        }
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode current = stack.pop();
            list.add(current.val);
            if (current.left != null){
                stack.push(current.left);
            }
            if (current.right != null){
                stack.push(current.right);
            }
        }
        Collections.reverse(list);
        return list;
    }
}

public class BinaryTreePostorderTraversal {
    public static void main(String[] args) {
        Solution145 solution145 = new Solution145();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(solution145.postorderTraversal1(root));
    }
}
