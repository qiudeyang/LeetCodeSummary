package com.leetcode;

/**
 * Created by qiudeyang on 05/04/17.
 */
class Solution64 {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length < 1) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0]=grid[0][0];
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i-1][0]+grid[i][0];
        }
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j-1]+grid[0][j];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }
        return dp[m-1][n-1];
    }
}

public class MinimumPathSum {
    public static void main(String[] args) {
        Solution64 solution64 = new Solution64();
        int[][] grid = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        System.out.println(solution64.minPathSum(grid));
    }
}
