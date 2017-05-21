package com.leetcode;

/**
 * Created by qiudeyang on 03/11/16.
 */
class Solution28 {
    //    这种方法还是不够本质
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }
        int needleLength = needle.length();
        for (int i = 0; i <= haystack.length() - needleLength; i++) {
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    //    这种方法很直接
    public int strStr1(String haystack, String needle) {
        if (needle.length() < 1) {
            return 0;
        }
        if (haystack == null || needle == null || haystack.length() < needle.length()) {
            return -1;
        }
        int i = 0;
        int j = 0;
        while (i < haystack.length()){
            if (haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            }else{
                i = i - (j-1);
                j = 0;
            }
            if (j==needle.length()){
                return i-j;
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
        System.out.println(solution28.strStr1(haystack, needle));
    }
}
