package com.leetcode;

import java.util.Scanner;

/**
 * Created by qiudeyang on 17/06/16.
 */
class Solution190 {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        int m = 0;
        for (int i = 0; i < 32; i++,n = n >> 1) {
            int temp = (1 & n);
            result = result | (temp << (31 - i));
        }
        return result;
    }
}
public class ReverseBits {
    public static void main(String[] args) {
        Solution190 solution190 = new Solution190();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(solution190.reverseBits(a));
    }
}
