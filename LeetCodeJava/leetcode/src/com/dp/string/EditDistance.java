package com.dp.string;

/**
 * Created by qiudeyang on 23/03/17.
 */
public class EditDistance {

    public static int editDistance(String word1, String word2) {
        if (word1 == null || word1.length() < 1) {
            return word2.length();
        }
        if (word2 == null || word2.length() < 1) {
            return word1.length();
        }
        int[][] dp = new int[word1.length()+1][word2.length()+1];
        for (int i = 0; i <= word1.length() ; i++) {
            dp[i][0]=i;
        }
        for (int i = 0; i <= word2.length() ; i++) {
            dp[0][i]=i;
        }
        for (int i = 1; i < word1.length()+1; i++) {
            char temp1 = word1.charAt(i-1);
            for (int j = 1; j < word2.length()+1; j++) {
                char temp2 = word2.charAt(j-1);
                int cost = 1;
                if (temp1==temp2){
                    cost = 0;
                }
                dp[i][j]=Math.min(dp[i-1][j-1]+cost,Math.min(dp[i-1][j]+1,dp[i][j-1]+1));
            }
        }
        return dp[word1.length()][word2.length()];
    }

    public static void main(String[] args) {
        String s = "a";
        String t = "ab";
        System.out.println(editDistance(s, t));
    }
}
