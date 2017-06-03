package com.leetcode;

/**
 * Created by qiudeyang on 02/06/17.
 */
//根据牛顿法
//xi+1=xi−f(xi)f′(xi)
//xi+1=xi−x2i−n2xi=xi−xi2+n2xi=xi2+n2xi
class Solution69 {
    public int mySqrt(int x) {
        double initial = 1;
        while ((initial * initial - x) != 0) {
            double next = initial / 2 + x / (2 * initial);
            if (Math.abs(next - initial) <= 1) {
                if (next < initial) {
                    return (int) next;
                } else {
                    return (int) initial;
                }
            }
            initial = next;
        }
        return (int) initial;
    }
}

public class Sqrtx {
    public static void main(String[] args) {
        Solution69 solution69 = new Solution69();
        System.out.println(solution69.mySqrt(8));
    }
}
