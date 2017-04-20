package com.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 20/04/17.
 */
class Solution95 {
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> list = new LinkedList<>();
        if(n < 1){
            return list;
        }
        return helper(1, n);
    }

    public List<TreeNode> helper(int start, int end) {
        List<TreeNode> list = new LinkedList<>();
        if (start > end) {
            list.add(null);
            return list;
        }
        if (start == end) {
            list.add(new TreeNode(start));
            return list;
        }
        List<TreeNode> left;
        List<TreeNode> right;
        for (int i = start; i <= end; i++) {
            left = helper(start, i - 1);
            right = helper(i + 1, end);
            for (TreeNode temp1 : left) {
                for (TreeNode temp2 : right) {
                    TreeNode root = new TreeNode(i);
                    root.left = temp1;
                    root.right = temp2;
                    list.add(root);
                }
            }

        }
        return list;
    }
}

public class UniqueBinarySearchTreesII {
    public static void main(String[] args) {
        Solution95 solution95 = new Solution95();
        System.out.println(solution95.generateTrees(3));
    }
}
