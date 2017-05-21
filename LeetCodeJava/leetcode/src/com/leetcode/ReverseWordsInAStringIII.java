package com.leetcode;

/**
 * Created by qiudeyang on 17/04/17.
 */
class Solution557 {
    public String reverseWords(String s) {
        if (s == null || s.length() < 1){
            return s;
        }
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            str[i]=new StringBuilder(str[i]).reverse().toString();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length-1; i++) {
            sb.append(str[i]);
            sb.append(" ");
        }
        sb.append(str[str.length-1]);
        return sb.toString();
    }
}

public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        Solution557 solution557 = new Solution557();
        System.out.println(solution557.reverseWords("Let's take LeetCode contest"));
    }
}
