package com.leetcode;

/**
 * Created by qiudeyang on 29/05/17.
 */
class Solution598 {
    public int maxCount(int m, int n, int[][] ops) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (ops == null || ops.length < 1) {
            return m * n;
        }
        int minRow = Integer.MAX_VALUE;
        int minCol = Integer.MAX_VALUE;
        for (int i = 0; i < ops.length; i++) {
            minRow = Math.min(minRow, ops[i][0]);
            minCol = Math.min(minCol, ops[i][1]);
        }
        minRow = Math.min(minRow, m);
        minCol = Math.min(minCol, n);
        return minCol * minRow;
    }
}

public class RangeAdditionII {
    public static void main(String[] args) {
        Solution598 solution598 = new Solution598();
        int[][] ops = {{2, 2}, {3, 3}};
        System.out.println(solution598.maxCount(3, 3, ops));
    }
}
