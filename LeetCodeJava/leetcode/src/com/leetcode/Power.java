package com.leetcode;

/**
 * Created by qiudeyang on 20/12/16.
 */
class Solution50 {
    //用全局变量来表征输入的合法性
    boolean validInput = true;
    public double myPow(double x, int n) {
        if (isEqual(x,0.0) && n < 0){
            validInput = false;
            return 0.0;
        }
        if (n == 0){
            return 1.0;
        }
        if (n == Integer.MIN_VALUE){
            x = x * x;
            n = n >> 1;
        }
        if (n < 0){
            n = -n;
            x = 1/x;
        }
        if ((n & 1) == 1){
            return x*myPow(x*x,n>>1);
        }else{
            return myPow(x*x,n>>1);
        }
    }
    public boolean isEqual(double num1,double num2){
        if (Math.abs(num1-num2)<0.000001){
            return true;
        }else{
            return false;
        }
    }
}

public class Power {
    public static void main(String[] args) {
        Solution50 solution50 = new Solution50();
        System.out.println(solution50.myPow(2.00000,-2147483648));
    }
}
