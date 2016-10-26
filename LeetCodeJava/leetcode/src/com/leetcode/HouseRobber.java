package com.leetcode;

/**
 * Created by qiudeyang on 26/10/16.
 */
class Solution198 {
    public int rob(int[] nums) {
        int[][] dp = new int[nums.length+1][2];
        for (int i = 1; i <= nums.length; i++) {
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]);
            dp[i][1]=nums[i-1]+dp[i-1][0];
        }
        return Math.max(dp[nums.length][0],dp[nums.length][1]);
    }
}

public class HouseRobber {
    public static void main(String[] args) {
        Solution198 solution198 = new Solution198();
        int[] nums = {3, 2, 5, 1, 0, 6};
        System.out.println(solution198.rob(nums));
    }
}
