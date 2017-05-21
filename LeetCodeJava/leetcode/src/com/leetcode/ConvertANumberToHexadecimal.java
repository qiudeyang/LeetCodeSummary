package com.leetcode;

import java.util.HashMap;

/**
 * Created by qiudeyang on 09/10/16.
 */
class Solution405 {
    public String toHex(int num) {
        if (num == 0) return "0";
        StringBuilder res = new StringBuilder();

        while (num != 0) {
            int digit = num & 0xf;
            res.append(digit < 10 ? (char) (digit + '0') : (char) (digit - 10 + 'a'));
            num >>>= 4;
        }

        return res.reverse().toString();

    }
}

public class ConvertANumberToHexadecimal {
    public static void main(String[] args) {
        Solution405 solution405 = new Solution405();
        int num = -1;
        System.out.println(solution405.toHex(num));
    }
}
