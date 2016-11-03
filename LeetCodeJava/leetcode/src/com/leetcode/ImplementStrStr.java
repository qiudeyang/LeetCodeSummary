package com.leetcode;

/**
 * Created by qiudeyang on 03/11/16.
 */
class Solution28 {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()){
            return -1;
        }
        int needleLength = needle.length();
        for (int i = 0; i <= haystack.length() - needleLength; i++) {
            if (haystack.substring(i,i+needleLength).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}

public class ImplementStrStr {
    public static void main(String[] args) {
        Solution28 solution28 = new Solution28();
        String haystack = "adabcabc";
        String needle = "abc";
        System.out.println(solution28.strStr(haystack, needle));
    }
}
