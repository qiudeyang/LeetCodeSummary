package com.test;

import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by qiudeyang on 13/03/17.
 */
public class PrimeNumber {
    public static int primeNumber(){
        int sum = 30;
        int count = 0;
        for (int i = 1; i < sum; i++) {
            while (i%5==0){
                i /= 5;
            }
            while (i%3==0){
                i /= 3;
            }
            while (i%2==0){
                i /= 2;
            }
            if (i==1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(primeNumber());
    }
}
