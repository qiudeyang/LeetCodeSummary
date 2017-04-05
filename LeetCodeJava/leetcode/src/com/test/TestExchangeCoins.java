package com.test;

/**
 * Created by qiudeyang on 05/04/17.
 */
public class TestExchangeCoins {
    static int result = 0;

    public static int testExchangeCoins(int sum) {
        int[] coins = {5, 2, 1};
        helper(sum, 0, coins, 5);
        return result;
    }

    public static void helper(int sum, int currentSum, int[] coins, int current) {
        if (sum == currentSum) {
            result++;
            return;
        }
        if (sum < currentSum) {
            return;
        }
        for (int i = 0; i < coins.length; i++) {
            if (current>=coins[i]){
                helper(sum,currentSum+coins[i],coins,coins[i]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(testExchangeCoins(10));
    }
}
