package com.leetcode;

import java.util.*;

/**
 * Created by qiudeyang on 16/06/16.
 */
class Solution26 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length < 2){
            return nums.length;
        }
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]){
                nums[index++]=nums[i];
            }
        }
        return index;
    }
}

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        Solution26 solution26 = new Solution26();
        int[] nums = {1, 2, 2};
        System.out.println("长度为" + solution26.removeDuplicates(nums));
    }
}
