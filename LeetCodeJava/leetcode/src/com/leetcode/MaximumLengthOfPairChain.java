package com.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by qiudeyang on 2017/7/23.
 */
class Solution646 {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]){
                    return o1[0]-o2[0];
                }else{
                    return o1[1]-o2[1];
                }
            }
        });


    }
}
public class MaximumLengthOfPairChain {
    public static void main(String[] args) {
        Solution646 solution646 = new Solution646();
        int[][] pairs = {{1,2},{2,3},{3,4}};
        System.out.println(solution646.findLongestChain(pairs));
    }
}
