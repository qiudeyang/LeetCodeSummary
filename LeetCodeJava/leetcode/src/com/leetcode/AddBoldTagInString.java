package com.leetcode;

/**
 * Created by qiudeyang on 11/06/17.
 */
class Solution616 {
    public String addBoldTag(String s, String[] dict) {
        if (dict == null || dict.length == 0) {
            return s;
        }
        boolean[] bold = new boolean[s.length()];
        for (int i = 0, end = 0; i < s.length(); i++) {
            for (String word : dict) {
                if (s.startsWith(word, i)) {
                    end = Math.max(end, i + word.length());
                }
            }
            bold[i] = end > i;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!bold[i]) {
                result.append(s.charAt(i));
                continue;
            }
            int j = i;
            while (j < s.length() && bold[j]) {
                j++;
            }
            result.append("<b>" + s.substring(i, j) + "</b>");
            i = j-1;
        }
        return result.toString();
    }
}

public class AddBoldTagInString {
    public static void main(String[] args) {
        Solution616 solution616 = new Solution616();
        String s = "aaabbcc";
        String[] dict = {"aaa", "aab", "bc"};
        System.out.println(solution616.addBoldTag(s, dict));
    }
}
