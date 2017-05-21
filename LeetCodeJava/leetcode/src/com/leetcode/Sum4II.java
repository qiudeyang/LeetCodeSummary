package com.leetcode;

import java.util.Arrays;

/**
 * Created by qiudeyang on 19/04/17.
 */
class Solution454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        Arrays.sort(D);
        int length = A.length;
        int result = 0;

        return result;
    }
}

public class Sum4II {
    public static void main(String[] args) {
        Solution454 solution454 = new Solution454();
        int[] A = {1, 2};
        int[] B = {-2, -1};
        int[] C = {-1, 2};
        int[] D = {0, 2};
        System.out.println(solution454.fourSumCount(A, B, C, D));
    }
}
