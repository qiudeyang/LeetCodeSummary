package com.leetcode;

import java.util.Arrays;

/**
 * Created by qiudeyang on 03/09/17.
 */
class Solution670 {
    public int maximumSwap(int num) {
        String numStr = num + "";
        int[] nums = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            nums[i] = numStr.charAt(i) - '0';
        }
        Arrays.sort(nums);
        int[] array = new int[nums.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = nums[nums.length - 1 - i];
        }
        boolean isMax = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == nums[i]){
                i++;
            }else{
                isMax = false;
            }
        }
        int result = 0;
        if (!isMax) {
            for (int i = 0; i < nums.length; i++) {
                result = result * 10 + nums[i];
            }
            System.out.println(result);
            return result - num;
        }
        return 0;
    }
}

public class MaximumSwap {
    public static void main(String[] args) {
        Solution670 solution670 = new Solution670();
        System.out.println(solution670.maximumSwap(2736));
    }
}
