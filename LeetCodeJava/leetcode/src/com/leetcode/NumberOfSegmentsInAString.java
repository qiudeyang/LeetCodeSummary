package com.leetcode;

/**
 * Created by qiudeyang on 09/12/16.
 */
class Solution434 {
    public int countSegments(String s) {
//        String[] array = ;
        return s.trim().split(" ").length;
    }
}

public class NumberOfSegmentsInAString {
    public static void main(String[] args) {
        Solution434 solution434 = new Solution434();
        String s = " Hello, my name is John ";
        System.out.println(solution434.countSegments(s));
    }
}
