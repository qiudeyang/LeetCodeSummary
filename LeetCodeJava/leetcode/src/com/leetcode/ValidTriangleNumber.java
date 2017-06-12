package com.leetcode;

import java.util.Arrays;

/**
 * Created by qiudeyang on 12/06/17.
 */
class Solution611 {
    public int triangleNumber(int[] nums) {
        if (nums == null || nums.length < 3) {
            return 0;
        }
        int result = 0;
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            int start = 0;
            int end = i - 1;
            while (start < end) {
                if (nums[start] + nums[end] > nums[i]) {
                    result += end - start;
                    end--;
                } else {
                    start++;
                }
            }
        }
        return result;
    }
}

public class ValidTriangleNumber {
    public static void main(String[] args) {
        Solution611 solution611 = new Solution611();
        int[] nums = {0, 1, 0};
        System.out.println(solution611.triangleNumber(nums));
    }
}
