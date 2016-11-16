package com.leetcode;

import java.util.*;

/**
 * Created by qiudeyang on 15/11/16.
 */
class Solution274 {
    public int hIndex(int[] citations) {
        int length = citations.length;
        if (length == 0){
            return 0;
        }
        int[] array = new int[length+1];
        for (int i = 0; i < length; i++) {
            if (citations[i] > length){
                array[length] += 1;
            }else{
                array[citations[i]] += 1;
            }
        }
        int temp = 0;
        for (int i = length; i >= 0 ; i--) {
            temp += array[i];
            if (temp >= i){
                return i;
            }
        }
        return 0;
    }
}

public class HIndex {
    public static void main(String[] args) {
        Solution274 solution274 = new Solution274();
        int[] citations = {0};
        System.out.println(solution274.hIndex(citations));
    }
}
