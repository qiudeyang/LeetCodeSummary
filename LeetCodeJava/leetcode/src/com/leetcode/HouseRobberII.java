package com.leetcode;

/**
 * Created by qiudeyang on 08/05/17.
 */
class Solution213 {
    public int rob(int[] nums) {
        if (nums == null || nums.length < 1){
            return 0;
        }
        if (nums.length==1){
            return nums[0];
        }
        return Math.max(helper(nums,0, nums.length-2),helper(nums,1,nums.length-1));
    }

    public int helper(int[] nums,int start,int end){
        if (start==end){
            return nums[start];
        }
        if (start+1==end){
            return Math.max(nums[start],nums[start+1]);
        }
        int[] dp = new int[end-start+1];
        dp[0]=nums[start];
        dp[1]=Math.max(nums[start],nums[start+1]);
        for (int i = 2; i < end-start+1; i++) {
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i+start]);
        }
        return dp[end-start];
    }
}

public class HouseRobberII {
    public static void main(String[] args) {
        Solution213 solution213 = new Solution213();
        int[] nums = {1, 2, 3, 5, 2};
        System.out.println(solution213.rob(nums));
    }
}
