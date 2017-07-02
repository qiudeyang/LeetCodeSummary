package com.leetcode;

/**
 * Created by qiudeyang on 02/07/17.
 */
class Solution633 {
    public boolean judgeSquareSum(int c) {
        for (int i = 0; i <= (int) Math.sqrt(c / 2); i++) {
            if (Math.sqrt(c - i * i) - (int) Math.sqrt(c - i * i) == 0) {
                return true;
            }
        }
        return false;
    }
}

public class SumOfSquareNumbers {
    public static void main(String[] args) {
        Solution633 solution633 = new Solution633();
        System.out.println(solution633.judgeSquareSum(88888888));
    }
}
