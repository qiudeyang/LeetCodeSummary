package com.test;

import java.util.Arrays;

/**
 * Created by qiudeyang on 07/11/16.
 */
public class Test3 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.asList(matrix[i]));
        }
    }
}
