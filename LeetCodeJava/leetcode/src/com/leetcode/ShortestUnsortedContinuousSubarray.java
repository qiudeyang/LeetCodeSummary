package com.leetcode;

import java.util.Arrays;

/**
 * Created by qiudeyang on 14/06/17.
 */
class Solution581 {
    public int findUnsortedSubarray(int[] nums) {
//        if (nums == null || nums.length < 1) {
//            return 0;
//        }
        int[] temp = Arrays.copyOf(nums,nums.length);
        Arrays.sort(temp);
        int start = 0;
        boolean isStart = true;
        int index = nums.length-1;
        while (index >= 0){
            if (nums[index]!=temp[index] && isStart){
                start = index;
                isStart = false;
            }
            index++;
        }
        System.out.println(start);
        System.out.println(index);
        return index-start;
    }
}

public class ShortestUnsortedContinuousSubarray {
    public static void main(String[] args) {
        Solution581 solution581 = new Solution581();
        int[] nums = {2, 6, 4, 8, 10, 9, 15};
        System.out.println(solution581.findUnsortedSubarray(nums));
    }
}
