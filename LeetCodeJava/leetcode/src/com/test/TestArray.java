package com.test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by qiudeyang on 15/11/16.
 */
public class TestArray {
    public static void main(String[] args) {
        Integer[] array = {2,3,1,4};
        Arrays.sort(array, new java.util.Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
