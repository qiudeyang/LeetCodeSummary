package com.leetcode;

/**
 * Created by qiudeyang on 27/02/17.
 */
class Solution424 {
    public int characterReplacement(String s, int k) {
        if (s == null || s.length() <= 0) {
            return 0;
        }
        return 1;
    }
}

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        Solution424 solution424 = new Solution424();
        System.out.println(solution424.characterReplacement("AABABBA", 1));
    }
}
