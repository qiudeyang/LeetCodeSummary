package com.leetcode;

/**
 * Created by qiudeyang on 03/06/17.
 */
class Solution583 {
    public int minDistance(String word1, String word2) {
        if (word1 == null || word1.length() < 1) {
            return word2.length();
        }
        if (word2 == null || word2.length() < 1) {
            return word1.length();
        }
        return word1.length() + word2.length() - 2 * longestCommonSubsequence(word1, word2);
    }

    public int longestCommonSubsequence(String s, String t) {
        if (s == null || s.length() < 1 || t == null || t.length() < 1) {
            return 0;
        }
        int[][] dp = new int[s.length() + 1][t.length() + 1];
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= t.length(); j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[s.length()][t.length()];
    }
}

public class DeleteOperationForTwoStrings {
    public static void main(String[] args) {
        Solution583 solution583 = new Solution583();
        System.out.println(solution583.minDistance("sea", "eat"));
    }
}
