package com.leetcode;

import java.util.Arrays;

/**
 * Created by qiudeyang on 25/06/17.
 */
class Solution628 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        return nums[0]*nums[1]*nums[length-1]>nums[length-1]*nums[length-2]*nums[length-3]
                ?nums[0]*nums[1]*nums[length-1]:nums[length-1]*nums[length-2]*nums[length-3];
    }
}
public class MaximumProductOfThreeNumbers {
    public static void main(String[] args) {
        Solution628 solution628 = new Solution628();
        int[] nums = {0,5,7,-8,-6,4};
        System.out.println(solution628.maximumProduct(nums));
    }
}
