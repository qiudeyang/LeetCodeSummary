package com.leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by qiudeyang on 18/06/17.
 */
class Solution624 {
    public int maxDistance(int[][] arrays) {
        if (arrays == null || arrays.length < 1) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arrays.length; i++) {
            min = Math.min(min, arrays[i][0]);
            max = Math.max(max, arrays[i][arrays[i].length - 1]);
        }
        List<Integer> minList = new LinkedList<>();
        List<Integer> maxList = new LinkedList<>();
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i][0]==min){
                minList.add(i);
            }
            if (arrays[i][arrays[i].length-1]==max){
                maxList.add(i);
            }
        }
        if (minList.size() >1 || maxList.size()>1 || minList.get(0)!=maxList.get(0)) {
            return max - min;
        }
        int secondMin = Integer.MAX_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i][0]>min){
                secondMin = Math.min(secondMin, arrays[i][0]);
            }
            if (arrays[i][arrays[i].length-1]<max){
                secondMax = Math.max(secondMax, arrays[i][arrays[i].length - 1]);
            }
        }
        return max-secondMin>secondMax-min?max-secondMin:secondMax-min;
    }
}

public class MaximumDistanceInArrays {
    public static void main(String[] args) {
        Solution624 solution624 = new Solution624();
        int[][] arrays = {{1, 2, 3}, {4, 5}, {1, 2, 3}};
        System.out.println(solution624.maxDistance(arrays));
    }
}
