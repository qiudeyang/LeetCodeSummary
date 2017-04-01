package com.leetcode;

import java.util.Stack;

/**
 * Created by qiudeyang on 01/04/17.
 */
class Solution32 {
    public int longestValidParentheses(String s) {
        if (s == null || s.length() < 2) {
            return 0;
        }
        int[] dp = new int[s.length()];
        int open = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='('){
                open++;
            }
            if (s.charAt(i)==')' && open > 0){
                dp[i]=dp[i-1]+2;
                if (i > dp[i]){
                    dp[i]+=dp[i-dp[i]];
                }
                open--;
            }
            if (max<dp[i]){
                max = dp[i];
            }
        }
        return max;
    }
}

public class LongestValidParentheses {
    public static void main(String[] args) {
        Solution32 solution32 = new Solution32();
        String s = "(()";
        String s1 = ")()())";
        System.out.println(solution32.longestValidParentheses(s));
    }
}
