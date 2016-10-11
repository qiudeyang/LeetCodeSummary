package com.leetcode;

import java.util.Arrays;

/**
 * Created by qiudeyang on 10/10/16.
 */
class Solution338 {
    public int[] countBits(int num) {
        int temp = 0;
        int[] array = new int[num+1];
        for(int i = 0; i <= num;i++){
            while(i != 0){
                if((i & 1) == 1){
                    temp++;
                }
                i = i >> 1;
                System.out.println(i);
            }
            array[i] = temp;
            temp = 0;
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
