package com.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by qiudeyang on 15/06/16.
 */
class Solution263 {
    public boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        return num == 1;
    }
}

public class UglyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Solution263 solution263 = new Solution263();
        System.out.println(solution263.isUgly(a));
    }
}
