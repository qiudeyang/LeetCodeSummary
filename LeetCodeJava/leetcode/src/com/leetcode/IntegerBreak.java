package com.leetcode;

/**
 * Created by qiudeyang on 29/10/16.
 */
class Solution343 {
    public int integerBreak(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;
        int product = 1;
        while (n > 4) {
            product *= 3;
            n -= 3;
        }
        product *= n;

        return product;
    }
}

public class IntegerBreak {
    public static void main(String[] args) {
        Solution343 solution343 = new Solution343();
        System.out.println(solution343.integerBreak(10));
    }
}
