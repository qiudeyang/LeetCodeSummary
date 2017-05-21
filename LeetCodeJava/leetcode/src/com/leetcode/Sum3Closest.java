package com.leetcode;

import java.util.Arrays;

/**
 * Created by qiudeyang on 19/04/17.
 */
class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            return target;
        }
        int difference = Integer.MAX_VALUE;
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int lo = i + 1;
            int hi = nums.length - 1;
            while (lo < hi) {
                if (nums[i] + nums[lo] + nums[hi] == target) {
                    return target;
                } else if (nums[i] + nums[lo] + nums[hi] < target) {
                    if (target - nums[i] - nums[lo] - nums[hi] < difference) {
                        difference = target - nums[i] - nums[lo] - nums[hi];
                        result = nums[i] + nums[lo] + nums[hi];
                    }
                    lo++;
                } else {
                    if (nums[i] + nums[lo] + nums[hi] - target < difference) {
                        difference = nums[i] + nums[lo] + nums[hi] - target;
                        result = nums[i] + nums[lo] + nums[hi];
                    }
                    hi--;
                }
            }
        }
        return result;
    }
}

public class Sum3Closest {
    public static void main(String[] args) {
        Solution16 solution16 = new Solution16();
        int[] nums = {0, 0, 0};
        System.out.println(solution16.threeSumClosest(nums, 1));
    }
}
