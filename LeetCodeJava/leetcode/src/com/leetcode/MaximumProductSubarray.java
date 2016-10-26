package com.leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 23/10/16.
 */
class Solution152 {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else {
            int[][] dp = new int[nums.length + 1][2];
            for (int i = 1; i < nums.length; i++) {
                dp[i][0] = Math.max(dp[i-1][1],dp[i-1][0]);
                dp[i][1] = Math.max(dp[i-1][1] * nums[i],dp[i-1][0] * nums[i]);
            }
            return Math.max(dp[nums.length][0],dp[nums.length][1]);
        }

    }
}

public class MaximumProductSubarray {
    public static void main(String[] args) {
        Solution152 solution152 = new Solution152();
        int[] nums = {2, 3, -2, 4};
        System.out.println(solution152.maxProduct(nums));
    }
}
