package com.leetcode;

/**
 * Created by qiudeyang on 2017/7/16.
 */
class Solution643 {
    public double findMaxAverage(int[] nums, int k) {
        int[] temp = new int[nums.length];
        temp[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            temp[i] = temp[i-1]+nums[i];
        }
        int result = Integer.MIN_VALUE;
        for (int i = k; i < temp.length; i++) {
            result = Math.max(result,temp[i]-temp[i-k]);
        }
        return (double) Math.max(result,temp[k-1])/k;
    }
}

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        Solution643 solution643 = new Solution643();
        int[] nums = {1, 12, -5, -6, 50, 3};
        System.out.println(solution643.findMaxAverage(nums, 4));
    }
}
