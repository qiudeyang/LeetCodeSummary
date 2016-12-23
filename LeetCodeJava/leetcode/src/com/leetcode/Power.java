package com.leetcode;

/**
 * Created by qiudeyang on 20/12/16.
 */
class Solution50 {
    public double myPow(double x, int n) {
        boolean validInput = true;
        if (isEqual(x,0.0) && n < 0){
            validInput = false;
            return 0.0;
        }
        int unsignedN = Math.abs(n);
        double result = powerUnsigned(x,unsignedN);
        if (n < 0){
            result = 1 / result;
        }
        return result;
    }
    public boolean isEqual(double num1,double num2){
        if (Math.abs(num1-num2)<0.000001){
            return true;
        }else{
            return false;
        }
    }
    public double powerUnsigned(double x,int unsignedN){
        if (unsignedN == 0){
            return 1.0;
        }
        if (unsignedN == 1){
            return x;
        }
        double result = powerUnsigned(x,unsignedN>>1);//递归调用，用位运算比除2更快
        result *= result;
        if ((unsignedN & 1) == 1){   //位运算判断奇数更快
            result *= x;
        }
        return result;
    }
}

public class Power {
    public static void main(String[] args) {
        Solution50 solution50 = new Solution50();
        System.out.println(solution50.myPow(2, 3));
    }
}
