package com.leetcode;

/**
 * Created by qiudeyang on 21/05/17.
 */
class Solution593 {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        if (p1 == null || p1.length < 1 || p2 == null || p2.length < 1 ||
                p3 == null || p3.length < 1 || p4 == null || p4.length < 1) {
            return false;
        }
        long[] lengths = {length(p1, p2), length(p1, p3), length(p1, p4), length(p2, p3), length(p2, p4),length(p3,p4)};
        long max = 0;
        long noMax = 0;
        for (long len : lengths) {
            max = Math.max(len, max);
        }
        int count = 0;
        for (long len : lengths) {
            if (len == max) {
                count++;
            }else{
                noMax = len;
            }
        }
        if (count != 2) {
            return false;
        }
        for (long len : lengths) {
            if (len != max && len != noMax){
                return false;
            }
        }
        return true;
    }

    public long length(int[] p1, int[] p2) {
        return (long) Math.pow(p1[0] - p2[0], 2) + (long) Math.pow(p1[1] - p2[1], 2);
    }
}

public class ValidSquare {
    public static void main(String[] args) {
        Solution593 solution593 = new Solution593();
        int[] p1 = {0, 0};
        int[] p2 = {1, 1};
        int[] p3 = {1, 0};
        int[] p4 = {0, 1};
        System.out.println(solution593.validSquare(p1, p2, p3, p4));
    }
}
