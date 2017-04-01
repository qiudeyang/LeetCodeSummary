package com.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 16/03/17.
 */
//使用中序遍历法
class Solution530 {
    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return -1;
        }
        List<Integer> list = new LinkedList<Integer>();
        helper(root, list);
        int result = list.get(1) - list.get(0);
        for (int i = 2; i < list.size(); i++) {
            result = result < list.get(i) - list.get(i - 1) ? result : list.get(i) - list.get(i - 1);
        }
        return result;
    }

    public void helper(TreeNode root, List<Integer> list) {
        if (root == null){
            return;
        }
        helper(root.left,list);
        list.add(root.val);
        helper(root.right,list);
    }
}

public class MinimumAbsoluteDifferenceInBST {
    public static void main(String[] args) {
        Solution530 solution530 = new Solution530();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(2);
        System.out.println(solution530.getMinimumDifference(root));
    }
}
