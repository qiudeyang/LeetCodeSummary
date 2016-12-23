package com.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 15/12/16.
 */
class Solution442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new LinkedList<Integer>();
        if (nums == null || nums.length == 0) {
            return list;
        }
        return list;
    }
}

public class FindAllDuplicatesInAnArray {
    public static void main(String[] args) {
        Solution442 solution442 = new Solution442();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(solution442.findDuplicates(nums));
    }
}
