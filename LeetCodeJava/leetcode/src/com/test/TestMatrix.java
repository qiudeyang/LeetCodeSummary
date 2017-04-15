package com.test;

/**
 * Created by qiudeyang on 15/04/17.
 */
//给定一个矩阵m*n，开始节点在左上角，只能往右走或往下走，求到右下角有多少条路径。
public class TestMatrix {
    public static int norecurive(int m,int n){
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0]=1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j]=1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
    public static int recurive(int m,int n){
        if (m==1||n==1){
            return 1;
        }
        return recurive(m-1,n)+recurive(m,n-1);
    }
    public static void main(String[] args) {
        int m = 8;
        int n = 6;
        System.out.println(recurive(m,n));
        System.out.println(norecurive(m,n));
        System.out.println();
    }
}
