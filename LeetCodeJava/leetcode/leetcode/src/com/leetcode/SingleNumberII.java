package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by qiudeyang on 16/06/16.
 */
class Solution137 {
    public int singleNumber(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        int a = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], (int) map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 3) {
                a = entry.getKey();
            }
        }
        return a;

    }
}

public class SingleNumberII {
    public static void main(String[] args) {
        Solution137 solution137 = new Solution137();
        int[] nums = {3, 2, 3, 3, 2, 2, 3};
        System.out.println(solution137.singleNumber(nums));
    }
}
