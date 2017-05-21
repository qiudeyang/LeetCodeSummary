package com.leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 03/11/16.
 */
class Solution396 {
    public int maxRotateFunction(int[] A) {
        if(A == null || A.length == 0){
            return 0;
        }
        int[] B = new int[2*A.length];
        for (int i = 0; i < B.length; i++) {
            if (i < A.length){
                B[i] = A[i];
            }else{
                B[i] = A[i- A.length];
            }
        }
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < A.length; i++) {
            int temp = i;
            int result = 0;
            for (int j = i; j < i+A.length; j++) {
                result += (j-temp)*B[j];
            }
            list.add(result);
        }
        return Collections.max(list);
    }
}

public class RotateFunction {
    public static void main(String[] args) {
        Solution396 solution396 = new Solution396();
        int[] A = {4, 3, 2, 6};
        System.out.println(solution396.maxRotateFunction(A));
    }
}
