package com.leetcode;

import java.util.Stack;

/**
 * Created by qiudeyang on 04/11/16.
 */
public class BSTIterator {

    Stack<TreeNode>  stack = new Stack<TreeNode>();
    public BSTIterator(TreeNode root) {
          pushAll(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
         return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode temp = stack.pop();
        pushAll(temp.right);
        return temp.val;
    }

    public void pushAll(TreeNode root){
        while (root != null){
            stack.push(root);
            root = root.left;
        }
    }
}

