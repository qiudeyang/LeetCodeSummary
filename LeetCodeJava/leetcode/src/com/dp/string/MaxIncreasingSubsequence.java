package com.dp.string;

/**
 * Created by qiudeyang on 23/03/17.
 */
public class MaxIncreasingSubsequence {
    public static int maxIncreasingSubsequennce(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int[] dp = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }
        int result = 1;
        for (int i = 0; i < dp.length; i++) {
            result = result > dp[i] ? result : dp[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 0, 4, 5};
        System.out.println(maxIncreasingSubsequennce(nums));
    }
}
