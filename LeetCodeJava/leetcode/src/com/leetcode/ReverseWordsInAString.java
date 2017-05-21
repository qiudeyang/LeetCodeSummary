package com.leetcode;

/**
 * Created by qiudeyang on 25/12/16.
 */
class Solution151 {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String[] s1 = s.trim().split("\\s+");
        for (int i = s1.length - 1; i > 0; i--) {
            sb.append(s1[i]);
            sb.append(" ");
        }
        return sb.append(s1[0]).toString();
    }
}

public class ReverseWordsInAString {
    public static void main(String[] args) {
        Solution151 solution151 = new Solution151();
        String s = " the sky is blue ";
        System.out.println(solution151.reverseWords(s));
    }
}
