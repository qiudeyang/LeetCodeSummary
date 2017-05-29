package com.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by qiudeyang on 29/05/17.
 */
//数组嵌套
class Solution565 {
    public int arrayNesting(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int size = 0;
            for (int k = i; nums[k] >= 0; size++) {
                int numsK = nums[k];
                nums[k] = -1;
                k = numsK;
            }
            result = Math.max(result, size);
        }
        return result;
    }
}

public class ArrayNesting {
    public static void main(String[] args) {
        Solution565 solution565 = new Solution565();
        int[] nums = {5, 4, 0, 3, 1, 6, 2};
        System.out.println(solution565.arrayNesting(nums));
    }
}
