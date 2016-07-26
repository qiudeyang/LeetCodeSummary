package com.leetcode;

/**
 * Created by qiudeyang on 05/07/16.
 */
class Solution66 {
    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0){
            return digits;
        }
        int plusone = 1;
        for (int i = digits.length-1; i >= 0 ; i--) {
            int digit = (digits[i]+plusone)%10;
            plusone = (digits[i]+plusone)/10;
            digits[i]=digit;
            if (plusone == 0){
                return digits;
            }

        }
        int[] result = new int[digits.length+1];
        result[0]=1;
        return result;
    }
}
public class PlusOne {
    public static void main(String[] args) {
        Solution66 solution66 = new Solution66();
        int[] input = {2,3,1};
        System.out.println(solution66.plusOne(input));
    }
}
