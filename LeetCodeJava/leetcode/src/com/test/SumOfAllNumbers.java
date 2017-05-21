package com.test;

/**
 * Created by qiudeyang on 17/10/16.
 */
public class SumOfAllNumbers {
    public static int findSumOfAllNumbers(int n){
        n = Math.abs(n);
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n = n / 10;
        }
        if (sum >=0 && sum <= 9){
            return sum;
        }else{
            int temp = sum;
            findSumOfAllNumbers(temp);
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 876;
        System.out.println(findSumOfAllNumbers(n));
    }
}
