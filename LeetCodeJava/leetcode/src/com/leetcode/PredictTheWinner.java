package com.leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by qiudeyang on 19/03/17.
 */
class Solution486 {
    public boolean PredictTheWinner(int[] nums) {
        int[][] dp = new int[nums.length][nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i][i] = nums[i];
        }
        for (int len = 1; len < nums.length; len++) {
            for (int i = 0; i < nums.length - len; i++) {
                int j = i + len;
                dp[i][j] = Math.max(nums[i]-dp[i+1][j],nums[j]-dp[i][j-1]);
            }
        }
        return dp[0][nums.length-1]>=0;
    }
}

public class PredictTheWinner {
    public static void main(String[] args) {
        Solution486 solution486 = new Solution486();
        int[] nums = {1, 1, 5, 2};
        System.out.println(solution486.PredictTheWinner(nums));
    }
}
