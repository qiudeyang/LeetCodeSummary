package com.leetcode;

/**
 * Created by qiudeyang on 10/02/17.
 */
//计算有符号数字的补码，比如5，101补码是010，就返回2.
class Solution476 {
    public int findComplement(int num) {
        int index = 0;
        while (Math.pow(2,index) <= num){
            index++;
        }
        if (index == 31){
            return Integer.MAX_VALUE ^ num;
        }
        return ((int) Math.pow(2,index)-1)^num;
    }
}

public class NumberComplement {
    public static void main(String[] args) {
        Solution476 solution476 = new Solution476();
        System.out.println(solution476.findComplement(2147483647));
        System.out.println((int)Math.pow(2,31));
        System.out.println((int)Math.pow(-2,33));
        System.out.println(((int)Math.pow(2,31))^2147483647);
    }
}
