package com.leetcode;

/**
 * Created by qiudeyang on 27/02/17.
 */
class Solution516 {
    //    使用动态规划
    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()][s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < s.length(); j++) {
                 if (s.charAt(i)==s.charAt(j)){
                     dp[i][j]=dp[i+1][j-1]+2;
                 }else{
                     dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                 }
            }
        }
        return dp[0][s.length()-1];
    }
}

public class LongestPalindromicSubsequence {
    public static void main(String[] args) {
        Solution516 solution516 = new Solution516();
        System.out.println(solution516.longestPalindromeSubseq("bbbab"));
    }
}
