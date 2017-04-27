package com.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by qiudeyang on 22/04/17.
 */
class Solution354 {
    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes == null || envelopes.length < 1 || envelopes[0] == null || envelopes[0].length != 2) {
            return 0;
        }
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] arr1, int[] arr2) {
                if (arr1[0] ==arr2[0]){
                    return arr1[1]-arr2[1];
                }else{
                    return arr1[0]-arr2[0];
                }
            }
        });
        int[] dp = new int[envelopes.length];
        int len = 0;
        for (int[] envelope:envelopes){
            int index = Arrays.binarySearch(dp,0,len,envelope[1]);
            if (index<0){
                index = -(index+1);
            }
            dp[index]=envelope[1];
            if (len == index){
                len++;
            }
        }
        return len;
    }
}

public class RussianDollEnvelopes {
    public static void main(String[] args) {
        Solution354 solution354 = new Solution354();
        int[][] envelopes = {{5, 4}, {6, 4}, {6, 7}, {2, 3}};
        System.out.println(solution354.maxEnvelopes(envelopes));
    }
}
