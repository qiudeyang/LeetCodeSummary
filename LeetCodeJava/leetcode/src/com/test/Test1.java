package com.test;

import java.util.Arrays;

/**
 * Created by qiudeyang on 08/10/16.
 */
class Solution1891 {
    public void rotate(int[] nums, int k) {
        if (k >= nums.length) {
            k = k - k / nums.length * nums.length;
        }
        int[] temp = new int[nums.length];
        for (int i = 0; i < k; i++) {
            temp[i] = nums[i + nums.length - k];
        }
        for (int i = k; i < nums.length; i++) {
            temp[i] = nums[i - k];
        }
        System.arraycopy(temp, 0, nums, 0, temp.length);


        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
}

public class Test1 {
    public static void main(String[] args) {
        int[] nums = {1, 2};
        int k = 1;
        Solution1891 solution1891 = new Solution1891();
        solution1891.rotate(nums, k);
//        int[] nums1;
//        nums1=Arrays.copyOfRange(nums,0,nums.length);
//        for (int i = 0; i < nums1.length; i++) {
//            System.out.println(nums1[i]);
//        }
    }
}


