package com.leetcode;

/**
 * Created by qiudeyang on 14/12/16.
 */
class Solution172 {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n != 0){
            count += n / 5;
            n /= 5;
        }
        return count;
    }
}

public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        Solution172 solution172 = new Solution172();
        System.out.println(solution172.trailingZeroes(10));
    }
}
