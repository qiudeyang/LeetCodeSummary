package com.leetcode;

import java.util.Hashtable;

/**
 * Created by qiudeyang on 07/11/16.
 */
class Solution106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length != postorder.length){
            return null;
        }
        Hashtable<Integer,Integer> ht = new Hashtable<Integer, Integer>();
        for (int i = 0; i < inorder.length; i++) {
            ht.put(inorder[i],i);
        }
        return helper(inorder,0,inorder.length-1,postorder,0,postorder.length-1,ht);
    }
    public TreeNode helper(int[] inorder, int is, int ie, int[] postorder, int ps, int pe, Hashtable<Integer,Integer> ht){
        if (is > ie || ps > pe){
            return null;
        }
        TreeNode root = new TreeNode(postorder[pe]);
        int index = ht.get(root.val);
        root.left = helper(inorder,is,index-1,postorder,ps,ps+index-is-1,ht);
        root.right = helper(inorder,index+1,ie,postorder,ps+index-is,pe-1,ht);
        return root;
    }
}

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public static void main(String[] args) {
        Solution106 solution106 = new Solution106();
        int[] inorder = {4, 2, 5, 1, 6, 3, 7};
        int[] postorder = {4, 5, 2, 6, 7, 3, 1};
        System.out.println(solution106.buildTree(inorder, postorder).val);
    }
}
