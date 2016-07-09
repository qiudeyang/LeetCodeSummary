package com.leetcode;

import java.util.Scanner;

/**
 * Created by qiudeyang on 13/06/16.
 */
class Solution326 {
    public boolean isPowerOfThree(int num) {
//        for (int i = 0; i <= n/3;i++){
//            if(n == Math.pow(3,i)){
//                return true;
//            }
//        }
//        return false;
//        int maxPower = (int)Math.pow(2,(int)(Math.log(0x7fffffff)/Math.log(2)));
//        if(n <= 0){
//            return false;
//        }else{
//            return maxPower % n == 0;
//        }
        if(num <= 0){
            return false;
        }
        if((num & (num-1)) == 0){
            if((num & (0x2aaaaaaa)) == 0){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
public class PowerOfThree {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
        Solution326  pot = new Solution326();
        long t1 = System.currentTimeMillis();
        System.out.println(pot.isPowerOfThree(16));
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
    }
}
