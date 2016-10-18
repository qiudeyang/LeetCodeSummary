package com.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 13/10/16.
 */
public class PathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.right.right = new TreeNode(1);

        BinaryTree bTree = new BinaryTree();
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.clear();
        bTree.preOrderTreeWalk(root,list);
        System.out.println(list);
        list.clear();
        bTree.midOrderTreeWalk(root,list);
        System.out.println(list);
        list.clear();
        bTree.postOrderTreeWalk(root,list);
        System.out.println(list);
    }
}
