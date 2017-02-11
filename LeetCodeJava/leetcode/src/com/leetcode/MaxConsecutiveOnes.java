package com.leetcode;


/**
 * Created by qiudeyang on 11/02/17.
 */
//最大的连续的1。
class Solution485 {
    //以下方法是我自己想的，速度相对网上的方法更快。
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int index = 0;
        int result = 0;
        int small = 0;
        int big = 0;
        while (index < nums.length) {
            while (index < nums.length && nums[index] == 1) {
                index++;
                big = index;
            }
            result = Math.max(result, big - small);
            while (index < nums.length && nums[index] == 0) {
                index++;
                small = index;
            }
        }
        return result;
    }

    //以下方法是网上的解法，简洁精辟。
    public int findMaxConsecutiveOnes1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int maxHere = 0;
        int max = 0;
        for (int num:nums){
            max = Math.max(max,maxHere = num == 0?0:maxHere+1);
        }
        return max;
    }
}

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Solution485 solution485 = new Solution485();
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(solution485.findMaxConsecutiveOnes1(nums));
    }
}
