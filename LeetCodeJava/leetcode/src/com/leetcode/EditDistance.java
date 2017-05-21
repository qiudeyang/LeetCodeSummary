package com.leetcode;

/**
 * Created by qiudeyang on 10/03/17.
 */
//动态规划，Levenshtein Distance（编辑距离）算法，通过增删改从一个字符串变到另一个字符串。
class Solution72 {
    public int minDistance(String word1, String word2) {
        if (word1 == null || word1.length() == 0){
            return word2.length();
        }
        if (word2 == null || word2.length() == 0){
            return word1.length();
        }
        int word1Length = word1.length();
        int word2Length = word2.length();
        int[][] dp = new int[word1Length+1][word2Length+1];
        for (int i = 0; i <= word1Length; i++) {
            dp[i][0]= i;
        }
        for (int i = 0; i <= word2Length; i++) {
            dp[0][i]= i;
        }
        char char1;
        char char2;
        int cost;
        for (int i = 1; i <= word1Length ; i++) {
            char1 = word1.charAt(i-1);
            for (int j = 1; j <= word2Length; j++) {
                char2 = word2.charAt(j-1);
                if (char1 == char2){
                    cost = 0;
                }else{
                    cost = 1;
                }
                dp[i][j] = Math.min(Math.min(dp[i][j-1]+1,dp[i-1][j]+1),dp[i-1][j-1]+cost);
            }
        }
        return dp[word1Length][word2Length];
    }
}

public class EditDistance {
    public static void main(String[] args) {
        Solution72 solution72 = new Solution72();
        String word1 = "cafe";
        String word2 = "coffee";
        System.out.println(solution72.minDistance(word1, word2));
    }
}
