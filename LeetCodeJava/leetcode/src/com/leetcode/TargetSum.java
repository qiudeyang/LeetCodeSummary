package com.leetcode;

/**
 * Created by qiudeyang on 19/04/17.
 */
class Solution494 {
    public int findTargetSumWays(int[] nums, int S) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        char[] symbol = {'+', '-'};
        for (int i = 0; i < nums.length; i++) {
            int result = 0;
            for (int j = 0; j < symbol.length; j++) {
//                if ()
            }
        }
        return 1;
    }
}

public class TargetSum {
    public static void main(String[] args) {
        Solution494 solution494 = new Solution494();
        int[] nums = {1, 1, 1, 1, 1};
        System.out.println(solution494.findTargetSumWays(nums, 3));
    }
}
