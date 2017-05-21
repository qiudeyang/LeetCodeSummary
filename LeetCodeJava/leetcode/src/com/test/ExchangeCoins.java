package com.test;

/**
 * Created by qiudeyang on 12/03/17.
 */
public class ExchangeCoins {
    static int count;
    public static int exchangeCoins(int sum){
        int[] array = {5,2,1};
        exchangeCoins(sum,0,array,5);
        return count;
    }

    public static void exchangeCoins(int sum,int currentSum,int[] array,int current){
        if (currentSum == sum){
            count++;
            return;
        }
        if (currentSum > sum){
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
