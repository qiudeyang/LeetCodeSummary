package com.dp.string;

/**
 * Created by qiudeyang on 23/03/17.
 */
public class MaxCommonSubString {

    public static String maxCommonSubString(String s, String t) {
        if (s == null || s.length() < 1 || t == null || t.length() < 1) {
            return "";
        }
        int[][] dp = new int[s.length()][t.length()];
        int maxLength = 0;
        int maxIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            char temp1 = s.charAt(i);
            for (int j = 0; j < t.length(); j++) {
                char temp2 = t.charAt(j);
                if (temp1 == temp2) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    }
                    if (i > 0 && j > 0) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    }
                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        maxIndex = i + 1 - maxLength;
                    }
                }
            }
        }
        return s.substring(maxIndex, maxIndex + maxLength);
    }

    public static void main(String[] args) {
        String s = "aaced";
        String t = "acef";
        System.out.println(maxCommonSubString(s, t));
    }
}
