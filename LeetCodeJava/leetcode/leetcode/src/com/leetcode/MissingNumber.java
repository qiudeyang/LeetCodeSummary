package com.leetcode;

import java.util.Arrays;

/**
 * Created by qiudeyang on 16/06/16.
 */
class Solution268 {
    public int missingNumber(int[] nums) {
        if (nums.length == 0 || nums == null){
            return 0;
        }
        int a = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i){
                a = i;
                break;
            }else{
                a = nums.length;
            }
        }
        return a;
    }
}
public class MissingNumber {
    public static void main(String[] args) {
        Solution268  solution268 = new Solution268();
        int[] nums = {0,1,2};
        System.out.println(solution268.missingNumber(nums));
    }
}
