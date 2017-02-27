package com.leetcode;

/**
 * Created by qiudeyang on 27/02/17.
 */
class Solution504 {
    //    以下是自己的解法，直接。
    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        boolean isMinus = false;
        if (num < 0) {
            isMinus = true;
        }
        num = Math.abs(num);
        while (num >= 7) {
            sb.append(num % 7);
            num /= 7;
        }
        sb.append(num);
        if (isMinus) {
            sb.append('-');
        }
        return sb.reverse().toString();
    }

    //    以下是Leetcode上的解法，利用递归。
    public String convertToBase(int num) {
        if (num < 0) {
            return "-"+convertToBase(-num);
        }
        if (num < 7){
            return num+"";
        }
        return convertToBase(num/7)+num%7;
    }
}

public class Base7 {
    public static void main(String[] args) {
        Solution504 solution504 = new Solution504();
        System.out.println(solution504.convertToBase7(-7));
        System.out.println(solution504.convertToBase(-7));
    }
}
