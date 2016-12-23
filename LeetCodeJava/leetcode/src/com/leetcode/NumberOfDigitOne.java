package com.leetcode;

/**
 * Created by qiudeyang on 14/12/16.
 */
class Solution233 {
    public int countDigitOne(int n) {
        if (n <= 0) {
            return 0;
        }
        int q = n;
        int x = 1;
        int result = 0;
        while (q > 0){
            int digit = q % 10;
            q /= 10;
            result += q * x;
            if (digit == 1){
                result += n % x + 1;
            }
            if (digit > 1){
                result += x;
            }
            x *= 10;
        }
        return result;
    }
}

public class NumberOfDigitOne {
    public static void main(String[] args) {
        Solution233 solution233 = new Solution233();
        System.out.println(solution233.countDigitOne(13));
    }
}
