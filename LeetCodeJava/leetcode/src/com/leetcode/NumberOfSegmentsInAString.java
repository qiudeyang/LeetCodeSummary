package com.leetcode;

/**
 * Created by qiudeyang on 09/12/16.
 */
class Solution434 {
    public int countSegments(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) !=' ' && (i==0 || s.charAt(i-1) == ' ')){
                result++;
            }
        }
        return result;
    }
}

public class NumberOfSegmentsInAString {
    public static void main(String[] args) {
        Solution434 solution434 = new Solution434();
        String s = " Hello, my name is John ";
        System.out.println(solution434.countSegments(s));
    }
}
