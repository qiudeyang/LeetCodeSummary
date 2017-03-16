package com.test;

/**
 * Created by qiudeyang on 15/03/17.
 */
public class BreakTrackingCoins {
    static int count;
    public static int exchangeCoins(int sum){
        int[] array = {5,2,1};
        exchangeCoins(sum,0,array,5);
        return count;
    }

    public static void exchangeCoins(int sum,int currentSum,int[] array,int current){
        if (sum==currentSum){
            count++;
            return;
        }
        if (sum < currentSum){
            return;
        }
        for (int i = 0; i < array.length; i++) {
            if (current >= array[i]){
                exchangeCoins(sum,currentSum+array[i],array,array[i]);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(exchangeCoins(100));
    }
}
