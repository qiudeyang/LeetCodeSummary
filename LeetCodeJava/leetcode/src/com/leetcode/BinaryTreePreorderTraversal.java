package com.leetcode;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by qiudeyang on 28/10/16.
 */
class Solution144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        if (root == null){
            return list;
        }
        list.add(root.val);
        list.addAll(preorderTraversal(root.left));
        list.addAll(preorderTraversal(root.right));
        return list;
    }
    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        if (root == null){
            return list;
        }
        Stack<TreeNode>  stack = new Stack<TreeNode>();
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

}
public class BinaryTreePreorderTraversal {
    public static void main(String[] args) {
        Solution144 solution144 = new Solution144();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(solution144.preorderTraversal1(root));

    }
}
