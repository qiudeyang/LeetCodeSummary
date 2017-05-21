package com.leetcode;

/**
 * Created by qiudeyang on 13/10/16.
 */

import java.util.LinkedList;

public class TestBinaryTree {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);

        BinaryTree bTree = new BinaryTree();
        LinkedList<Integer> list = new LinkedList<Integer>();
        bTree.preOrderTreeWalk(root1,list);
        System.out.println(list);
        list.clear();
        bTree.midOrderTreeWalk(root1,list);
        System.out.println(list);
        list.clear();
        bTree.postOrderTreeWalk(root1,list);
        System.out.println(list);
    }
}
