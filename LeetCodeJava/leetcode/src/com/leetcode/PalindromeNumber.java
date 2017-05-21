package com.leetcode;

import java.util.Scanner;

/**
 * Created by qiudeyang on 16/06/16.
 */
class Solution9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }else if(x < 10){
            return true;
        }else{
            long temp1 = 0;
            int temp2 = x;
            while(temp2 != 0){
                temp1 = temp1 * 10 + temp2 % 10;
                temp2 = temp2 / 10;
            }
            if(temp1 == x){
                return true;
            }else{
                return false;
            }

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
