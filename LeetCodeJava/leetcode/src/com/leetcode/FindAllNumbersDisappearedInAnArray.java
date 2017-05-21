package com.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 15/12/16.
 */
class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new LinkedList<Integer>();
        if (nums == null || nums.length == 0){
            return list;
        }
        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i])-1;
            if (nums[val] > 0){
                nums[val]=-nums[val];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0){
                list.add(i+1);
            }
        }
        return list;
    }
}

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        Solution448 solution448 = new Solution448();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(solution448.findDisappearedNumbers(nums));
    }
}
