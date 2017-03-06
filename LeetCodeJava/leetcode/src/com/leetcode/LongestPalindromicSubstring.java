package com.leetcode;

/**
 * Created by qiudeyang on 27/02/17.
 */
class Solution5 {
    public int lo;
    public int maxLength;

    public String longestPalindrome(String s) {
        int length = s.length();
        if (length < 2) {
            return s;
        }
        for (int i = 0; i < length - 1; i++) {
            helper(s, i, i);//assume odd length
            helper(s, i, i + 1);//assume even length
        }
        return s.substring(lo, lo + maxLength);
    }

    public void helper(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        if (maxLength < j - i - 1) {
            lo = i + 1;
            maxLength = j - i - 1;
        }
    }
}

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        System.out.println(solution5.longestPalindrome("babad"));
    }
}
