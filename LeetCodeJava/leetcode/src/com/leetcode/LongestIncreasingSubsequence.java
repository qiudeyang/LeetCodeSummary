package com.leetcode;

/**
 * Created by qiudeyang on 15/12/16.
 */
class Solution300 {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int result = 1;
        int[] LIS = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            LIS[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i] && LIS[j]+1 > LIS[i]){
                    LIS[i] = LIS[j]+1;
                }
            }
        }
        for (int i = 0; i < LIS.length; i++) {
            result = result>LIS[i]?result:LIS[i];
        }
        return result;
    }
}

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Solution300 solution300 = new Solution300();
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(solution300.lengthOfLIS(nums));
    }
}
