package com.leetcode;

import java.util.Arrays;

/**
 * Created by qiudeyang on 03/09/17.
 */
class Solution518 {
    int count = 0;

//    回溯法
    public int change(int amount, int[] coins) {
        if (amount == 0) {
            return 1;
        }
        if (coins == null || coins.length < 1){
            return 0;
        }
        Arrays.sort(coins);
        int[] array = new int[coins.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = coins[array.length - 1 - i];
        }
        helper(array,amount,0,array[0]);
        return count;
    }

    public void helper(int[] array,int amount,int sum,int current){
        if (amount==sum){
            count++;
            return;
        }
        if (amount < sum){
            return;
        }
        for (int i = 0; i < array.length; i++) {
            if (current>=array[i]){
                helper(array,amount,sum+array[i],array[i]);
            }
        }
    }
    // 动态规划法

    public int change1(int amount,int[] coins){
        int[] dp = new int[amount+1];
        dp[0]=1;
        for (int coin:coins){
            for (int i=coin;i<=amount;i++){
                dp[i] += dp[i-coin];
            }
        }
        return dp[amount];
    }
}

public class CoinChange2 {
    public static void main(String[] args) {
        Solution518 solution518 = new Solution518();
//        System.out.println(solution518.change(3, new int[]{2}));
        System.out.println(solution518.change1(3,new int[]{2}));
    }
}
