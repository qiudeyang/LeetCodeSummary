package com.leetcode;

/**
 * Created by qiudeyang on 08/11/16.
 */
class Solution96 {
    public int numTrees(int n) {
        int[] G = new int[n + 1];
        G[0] = 1;
        G[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                G[i] += G[j - 1] * G[i - j];
            }
        }
        return G[n];
    }
}

public class UniqueBinarySearchTrees {
    public static void main(String[] args) {
        Solution96 solution96 = new Solution96();
        int n = 3;
        System.out.println(solution96.numTrees(n));
    }
}
