package com.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 15/12/16.
 */
//要求：不使用额外空间，时间复杂度为O（n）。
// when find a number i, flip the number at position i-1 to negative.
// if the number at position i-1 is already negative, i is the number that occurs twice
class Solution442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new LinkedList<Integer>();
        if (nums == null || nums.length <= 1) {
            return list;
        }
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                list.add(index + 1);
            }
            nums[index] = -nums[index];
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
