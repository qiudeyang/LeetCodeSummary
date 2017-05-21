package com.leetcode;

/**
 * Created by qiudeyang on 02/11/16.
 */
class Solution204 {
    public int countPrimes(int n) {
        int count = 0;
        int upperBoundSquareRoot = (int) Math.sqrt(n);
        boolean[] isComposite = new boolean[n+1];
        for (int m = 2; m <= upperBoundSquareRoot; m++) {
            if (!isComposite[m]) {
                count++;
                for (int k = m * m; k < n; k += m)
                    isComposite[k] = true;
            }
        }
        for (int m = upperBoundSquareRoot; m < n; m++){
            if (!isComposite[m]){
                count++;
            }
        }
        return count;
    }
}

public class CountPrimes {
    public static void main(String[] args) {
        Solution204 solution204 = new Solution204();
        System.out.println(solution204.countPrimes(4));
    }
}
