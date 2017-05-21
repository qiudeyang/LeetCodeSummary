package com.dp.string;

/**
 * Created by qiudeyang on 22/03/17.
 */
public class MaxSubString {
    public static boolean validInput = true;

    public static int maxSubString(int[] nums) {
        if (nums == null || nums.length < 1) {
            validInput = false;
            return 0;
        }
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = max > nums[i] ? max : nums[i];
        }
        if (max <= 0) {
            return max;
        }
        int sum = 0;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (currentSum < 0) {
                currentSum = 0;
            }
            currentSum += nums[i];
            sum = Math.max(sum, currentSum);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, -3, -5, 4, 8, -2};
        int[] nums1 = {1,4,-4,5,1,-7};
        System.out.println(maxSubString(nums));
    }
}
