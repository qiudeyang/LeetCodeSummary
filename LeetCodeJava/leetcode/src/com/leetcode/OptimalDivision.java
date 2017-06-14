package com.leetcode;

/**
 * Created by qiudeyang on 14/06/17.
 */
class Solution553 {
    public String optimalDivision(int[] nums) {
        if (nums == null || nums.length < 1) {
            return " ";
        }
        if (nums.length == 1) {
            return nums[0]+"";
        }
        if (nums.length == 2){
            return nums[0]+"/"+nums[1];
        }
        StringBuilder sb = new StringBuilder();
        sb.append(nums[0]).append("/").append("(");
        for (int i = 1; i < nums.length-1; i++) {
            sb.append(nums[i]);
            sb.append("/");
        }
        sb.append(nums[nums.length-1]).append(")");;
        return sb.toString();
    }
}

public class OptimalDivision {
    public static void main(String[] args) {
        Solution553 solution553 = new Solution553();
        int[] nums = {1000, 100, 10, 2};
        System.out.println(solution553.optimalDivision(nums));
    }
}
