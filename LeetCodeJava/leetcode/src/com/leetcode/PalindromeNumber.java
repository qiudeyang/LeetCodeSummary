package com.leetcode;

import java.util.Scanner;

/**
 * Created by qiudeyang on 16/06/16.
 */
class Solution9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10 && x >= 0) {
            return true;
        }
        StringBuffer sb = new StringBuffer(""+x);
        System.out.println(Integer.valueOf(sb.toString()));
        System.out.println(sb.reverse());
        System.out.println(Integer.valueOf(sb.toString()).equals(Integer.valueOf((sb.reverse()).toString())));
        if (sb.reverse().equals(sb)){
            return true;
        }else {
            return false;
        }

    }
}

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Solution9 solution9 = new Solution9();
        System.out.println(solution9.isPalindrome(a));
    }
}
