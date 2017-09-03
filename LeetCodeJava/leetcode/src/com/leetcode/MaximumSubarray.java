package com.leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 21/10/16.
 */
class Solution53 {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length < 1){
            return 0;
        }
        int result = Integer.MIN_VALUE;
        int subSum = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (subSum < 0){
                subSum = 0;
            }
            subSum += nums[i];
            result = Math.max(result,subSum);
        }
        return result;
    }
}
public class MaximumSubarray {
    public static void main(String[] args) {
        Solution53 solution53 = new Solution53();
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution53.maxSubArray(array));
    }
}
