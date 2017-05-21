package com.leetcode;

import java.util.Arrays;

/**
 * Created by qiudeyang on 28/04/17.
 */
class Solution561 {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length < 2){
            return 0;
        }
        Arrays.sort(nums);
        int result = 0;
        for(int i = 0; i < nums.length;i+=2){
            result += nums[i];
        }
        return result;
    }
}
public class ArrayPartitionI {
    public static void main(String[] args) {
        Solution561 solution561 = new Solution561();
        int[] nums = {1,4,3,2};
        System.out.println(solution561.arrayPairSum(nums));
    }
}
