package com.leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 29/10/16.
 */
class Solution107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        levelMaker(list,root,0);
        return list;
    }
    public void levelMaker(List<List<Integer>> list,TreeNode root,int level){
        if (root == null){
            return;
        }
        if (level >= list.size()){
            list.add(0,new LinkedList<Integer>());
        }
        levelMaker(list,root.left,level+1);
        levelMaker(list,root.right,level+1);
        list.get(list.size()-level-1).add(root.val);
    }
}

public class BinaryTreeLevelOrderTraversalII {
    public static void main(String[] args) {
        Solution107 solution107 = new Solution107();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(solution107.levelOrderBottom(root));
    }
}
