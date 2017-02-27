package com.leetcode;

/**
 * Created by qiudeyang on 27/02/17.
 */
class Solution520 {
    public boolean detectCapitalUse(String word) {
        if (word == null || word.length() == 0) {
            return false;
        }
        if (word.length() == 1) {
            return true;
        }
        char first = word.charAt(0);
        if (isLowercase(first)) {
            for (int i = 1; i < word.length(); i++) {
                if (!isLowercase(word.charAt(i))) {
                    return false;
                }
            }
        } else {
            char second = word.charAt(1);
            if (isLowercase(second)) {
                for (int i = 2; i < word.length(); i++) {
                    if (!isLowercase(word.charAt(i))) {
                        return false;
                    }
                }
            } else {
                for (int i = 2; i < word.length(); i++) {
                    if (isLowercase(word.charAt(i))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean isLowercase(char c) {
        if (c <= 'z' && c >= 'a') {
            return true;
        }
        return false;
    }
}

public class DetectCapital {
    public static void main(String[] args) {
        Solution520 solution520 = new Solution520();
        System.out.println(solution520.detectCapitalUse("FlaG"));
    }
}
