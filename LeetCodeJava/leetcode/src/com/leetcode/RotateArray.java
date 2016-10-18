package com.leetcode;

/**
 * Created by qiudeyang on 07/10/16.
 */
class Solution189 {
    public void rotate(int[] nums, int k) {
//        if (k >= nums.length) {
//            k = k - k / nums.length * nums.length;
//        }
//        int[] temp = new int[2 * nums.length];
//        for (int i = 0; i < temp.length; i++) {
//            if (i < nums.length) {
//                temp[i] = nums[i];
//            } else {
//                temp[i] = nums[i-nums.length];
//            }
//        }
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = temp[i + nums.length - k];
//
//        }
        for (int i = 0; i < nums.length ; i++) {
            System.out.println(nums[i]);
        }

    }
}

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        Solution189 solution189 = new Solution189();
        solution189.rotate(nums,k);

    }
}
