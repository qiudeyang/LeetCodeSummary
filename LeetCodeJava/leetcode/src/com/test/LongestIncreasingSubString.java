package com.test;

/**
 * Created by qiudeyang on 16/03/17.
 */
//最长的递增子序列长度
public class LongestIncreasingSubString {
    public static int lis(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int result = 1;
        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;  //设定初始值
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            result = result > dp[i] ? result : dp[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 2, 8, 1, 6, 7};
        System.out.println(lis(nums));
    }
}
