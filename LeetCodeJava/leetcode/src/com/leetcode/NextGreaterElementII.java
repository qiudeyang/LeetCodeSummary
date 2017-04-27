package com.leetcode;

/**
 * Created by qiudeyang on 20/04/17.
 */
class Solution503 {
    public int[] nextGreaterElements(int[] nums) {
        int[] helper = new int[2 * nums.length];
        for (int i = 0; i < helper.length; i++) {
            if (i < nums.length) {
                helper[i] = nums[i];
            } else {
                helper[i] = nums[i - nums.length];
            }
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int temp = -1;
            for (int j = i + 1; j < i + nums.length; j++) {
                if (nums[i] < helper[j]) {
                    temp = helper[j];
                    break;
                }
            }
            result[i] = temp;
        }
        return result;
    }
}

public class NextGreaterElementII {
    public static void main(String[] args) {
        Solution503 solution503 = new Solution503();
        int[] nums = {1, 2, 1};
        int[] result = solution503.nextGreaterElements(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "\t");
        }
    }
}
