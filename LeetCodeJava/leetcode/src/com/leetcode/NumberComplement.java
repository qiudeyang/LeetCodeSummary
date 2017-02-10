package com.leetcode;

/**
 * Created by qiudeyang on 10/02/17.
 */
class Solution476 {
    public int findComplement(int num) {
        String str = num+"";
        int length = Math.abs(num) / 2 + 1;
        int result = 0;
        for (int i = 0; i < length; i++) {
            result += ((str.charAt(i) >> i) ^ 1)*Math.pow(2,i);
        }
        return result;
    }
}

public class NumberComplement {
    public static void main(String[] args) {
        Solution476 solution476 = new Solution476();
        System.out.println(solution476.findComplement(5));
    }
}
