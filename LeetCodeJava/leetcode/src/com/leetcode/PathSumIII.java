package com.leetcode;

import java.util.HashMap;

/**
 * Created by qiudeyang on 08/11/16.
 */
class Solution437 {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        return findPath(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    public int findPath(TreeNode root, int sum) {
        int result = 0;
        if (root == null) {
            return result;
        }
        if (root.val == sum){
            result++;
        }
        result += findPath(root.left,sum-root.val);
        result += findPath(root.right,sum-root.val);
        return result;
    }
//    public int pathSum1(TreeNode root, int sum) {
//        HashMap<Integer, Integer> preSum = new HashMap();
//        preSum.put(0,1);
//        return helper(root, 0, sum, preSum);
//    }
//
//    public int helper(TreeNode root, int sum, int target, HashMap<Integer, Integer> preSum) {
//        if (root == null) {
//            return 0;
//        }
//
//        sum += root.val;
//        int res = preSum.getOrDefault(sum - target, 0);  //map.getOrDefault()是jdk1.8的api
//        preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
//
//        res += helper(root.left, sum, target, preSum) + helper(root.right, sum, target, preSum);
//        preSum.put(sum, preSum.get(sum) - 1);
//        return res;
//    }

}

public class PathSumIII {
    public static void main(String[] args) {
        Solution437 solution437 = new Solution437();
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        root.right.right = new TreeNode(11);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-2);
        root.left.right.right = new TreeNode(1);
        int sum = 8;
        System.out.println(solution437.pathSum(root, sum));
    }
}
