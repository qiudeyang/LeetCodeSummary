package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by qiudeyang on 05/05/17.
 */
class Solution560 {
    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int currentSum = 0;
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (map.containsKey(currentSum-k)){
                result += map.get(currentSum-k);
            }
            map.put(currentSum,map.getOrDefault(currentSum,0)+1);
        }
        return result;
    }
}

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        Solution560 solution560 = new Solution560();
        int[] nums = {1, 1, 1};
        System.out.println(solution560.subarraySum(nums, 2));
    }
}
