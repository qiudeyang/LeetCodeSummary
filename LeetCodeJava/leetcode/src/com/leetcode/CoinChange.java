package com.leetcode;

import java.util.*;

/**
 * Created by qiudeyang on 05/04/17.
 */
class Solution322 {
    public int coinChange(int[] coins, int amount) {
        if (amount < 1 || coins == null || coins.length < 1){
            return 0;
        }
        int[] dp = new int[amount+1];
        int index = 0;
        while (++index<=amount){
            int min = -1;
            for (int coin:coins){
                if (index>=coin && dp[index-coin] != -1){
                    int temp = dp[index-coin]+1;
                    min = min < 0 ?temp:temp<min?temp:min;
                }
            }
            dp[index]=min;
        }
        return dp[amount];
    }
}
public class CoinChange {
    public static void main(String[] args) {
        Solution322 solution322 = new Solution322();
        int[] coins = {1,2,5};
        System.out.println(solution322.coinChange(coins,11));
    }
}
