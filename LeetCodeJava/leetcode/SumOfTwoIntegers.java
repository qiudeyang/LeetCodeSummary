package com.leetcode;

/**
 * Created by qiudeyang on 04/07/16.
 */
class Solution371 {
    public int getSum(int a, int b) {
        if(b == 0){
            return a;
        }
        int middlea;
        int middleb;
        middlea = a ^ b;
        middleb = (a & b)<<1;
        return getSum(middlea,middleb);
    }
}

public class SumOfTwoIntegers {
    public static void main(String[] args) {
        Solution371 solution371 = new Solution371();
        System.out.println(solution371.getSum(20, 30));
    }
}
