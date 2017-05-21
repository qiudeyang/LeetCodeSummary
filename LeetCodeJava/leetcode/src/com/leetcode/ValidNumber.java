package com.leetcode;

/**
 * Created by qiudeyang on 27/12/16.
 */
class Solution65 {
    public boolean isNumber(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        return true;
    }
}

public class ValidNumber {
    public static void main(String[] args) {
        Solution65 solution65 = new Solution65();
        String s = "abc";
        System.out.println(solution65.isNumber(s));
    }
}
