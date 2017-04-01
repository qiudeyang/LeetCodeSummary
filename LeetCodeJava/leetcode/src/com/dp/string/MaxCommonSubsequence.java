package com.dp.string;

/**
 * Created by qiudeyang on 23/03/17.
 */
public class MaxCommonSubsequence {

    public static int maxCommonSubsequence(String s, String t) {
        if (s == null || s.length() < 1 || t == null || t.length() < 1) {
            return 0;
        }
        int[][] dp = new int[s.length()][t.length()];
        for (int i = 0; i < s.length(); i++) {
            char temp1 = s.charAt(i);
            for (int j = 0; j < t.length(); j++) {
                char temp2 = t.charAt(j);
                if (temp1==temp2){
                    if (i == 0 || j == 0){
                        dp[i][j]=1;
                    }else{
                        dp[i][j]=dp[i-1][j-1]+1;
                    }
                }else{
                    if (i==0 && j==0){
                        continue;
                    }else if (i > 0 && j > 0){
                        dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                    }else{
                        dp[i][j]=1;
                    }
                }
            }
        }
        return dp[s.length()-1][t.length()-1];
    }


    public static void main(String[] args) {
        String s = "aacedf";
        String t = "adcef";
        System.out.println(maxCommonSubsequence(s, t));
    }
}
