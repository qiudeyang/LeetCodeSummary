package com.test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 07/10/16.
 */
class Solution189 {
    public void rotate(int[] nums, int k) {
        if (k >= nums.length) {
            k = k - k / nums.length * nums.length;
        }
        int[] temp = new int[2 * nums.length];
        for (int i = 0; i < temp.length; i++) {
            if (i < nums.length) {
                temp[i] = nums[i];
            } else {
                temp[i] = nums[i - nums.length];
            }
        }
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = temp[i + nums.length - k];
//
//        }
//        nums = Arrays.copyOfRange(temp,nums.length-k,2*nums.length-k);
//        System.arraycopy(temp,nums.length-k,nums,0,nums.length);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
}

public class Test {
    public static void main(String[] args) {
        int[] nums = {1, 2};
        int k = 1;
        Solution189 solution189 = new Solution189();
        solution189.rotate(nums, k);
//        int[] nums1;
//        nums1=Arrays.copyOfRange(nums,0,nums.length);
//        for (int i = 0; i < nums1.length; i++) {
//            System.out.println(nums1[i]);
//        }
    }
}

