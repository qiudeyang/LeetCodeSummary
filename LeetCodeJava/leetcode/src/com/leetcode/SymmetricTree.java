package com.leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by qiudeyang on 28/10/16.
 */
class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return isSymmetricTree(root.left,root.right);
    }
    public boolean isSymmetricTree(TreeNode node1,TreeNode node2){
        if(node1 == null && node2 == null){
            return true;
        }
        if(node1 == null || node2 == null){
            return false;
        }
        return (node1.val == node2.val) && isSymmetricTree(node1.right,node2.left) && isSymmetricTree(node1.left,node2.right);
    }
}

public class SymmetricTree {
    public static void main(String[] args) {
        Solution101 solution101 = new Solution101();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
//        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
//        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        System.out.println(solution101.isSymmetric(root));
    }
}
