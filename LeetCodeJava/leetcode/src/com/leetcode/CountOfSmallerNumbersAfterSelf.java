package com.leetcode;

import java.util.*;

/**
 * Created by qiudeyang on 14/06/17.
 */
class Solution315 {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> list = new LinkedList<>();
        if (nums == null || nums.length < 1) {
            return list;
        }
        return list;
    }
}

public class CountOfSmallerNumbersAfterSelf {
    public static void main(String[] args) {
        Solution315 solution315 = new Solution315();
        int[] nums = {5, 2, 6, 1};
        System.out.println(solution315.countSmaller(nums));
    }
}
