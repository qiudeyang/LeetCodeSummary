package com.leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 23/10/16.
 */
class Solution152 {
    public int maxProduct(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        List<Integer> list = new LinkedList<Integer>();
//        for (int i = 0; i < nums.length; i++) {
//            int temp = 1;
//            for (int j = i; j < nums.length; j++) {
//                temp *= nums[j];
//            }
//            list.add();
//        }
        list.add(nums[0]);
        list.add(nums[nums.length-1]);
        return Collections.max(list);
    }
}
public class MaximumProductSubarray {
    public static void main(String[] args) {
        Solution152 solution152 = new Solution152();
        int[] nums = {2};
        System.out.println(solution152.maxProduct(nums));
    }
}
