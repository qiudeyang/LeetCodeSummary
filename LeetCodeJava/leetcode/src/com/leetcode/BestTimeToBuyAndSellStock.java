package com.leetcode;

/**
 * Created by qiudeyang on 25/10/16.
 */
class Solution121 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int result = 0;
        int temp = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > temp){
                result = Math.max(result,prices[i] - temp);
            }else{
                temp = prices[i];
            }
        }
        return result;

    }
}

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Solution121 solution121 = new Solution121();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(solution121.maxProfit(prices));
    }
}
