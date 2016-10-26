package com.leetcode;

import java.util.Arrays;

/**
 * Created by qiudeyang on 10/10/16.
 */
class Solution338 {
    public int[] countBits(int num) {
        int[] array = new int[num+1];
        for (int i = 1; i <=num ; i++) {
            array[i] = array[i >> 1] + (1 & i);
        }
        return array;
    }
}
public class CountingBits {
    public static void main(String[] args) {
        Solution338 solution338 = new Solution338();
        System.out.println(Arrays.toString(solution338.countBits(5)));
    }
}
