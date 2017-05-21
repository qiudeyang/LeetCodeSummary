package com.leetcode;

/**
 * Created by qiudeyang on 02/11/16.
 */
class Solution441 {
    public int arrangeCoins(int n) {
        int result = 0;
        int temp = n;
        for (int i = 0; i <= n; i++) {
            temp -= i;
            if (temp <= i){
                return i;
            }
        }
        return result;
    }
    public int arrangeCoins1(int n) {
        int x = (int)Math.sqrt((long)2*n);
        return x*(x+1)<= 2*n?x:x-1;
    }
}

public class ArrangingCoins {
    public static void main(String[] args) {
        Solution441 solution441 = new Solution441();
        System.out.println(solution441.arrangeCoins1(10));
    }
}
