package com.leetcode;

/**
 * Created by qiudeyang on 08/11/16.
 */
//卡特兰数。
class Solution96 {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0]=1;//空节点
        dp[1]=1;
        for (int i = 2; i <= n ; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
}

public class UniqueBinarySearchTrees {
    public static void main(String[] args) {
        Solution96 solution96 = new Solution96();
        int n = 6;
        System.out.println(solution96.numTrees(n));
    }
}
