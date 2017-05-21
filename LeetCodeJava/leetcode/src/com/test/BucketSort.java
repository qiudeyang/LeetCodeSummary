package com.test;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 15/11/16.
 */
public class BucketSort {
    public static List<Integer> bucketSort(int[] array) {
        List<Integer> list = new LinkedList<Integer>();
        if (array == null || array.length == 0) {
            return null;
        }
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        int[] sorted = new int[max+1];
        for (int i = 0; i < array.length; i++) {
            sorted[array[i]]=array[i];
        }
        for (int i = 0; i < sorted.length; i++) {
            if (sorted[i] != 0){
                list.add(sorted[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] array = {6, 2, 4, 1, 5, 9};
        System.out.println(bucketSort(array));
    }
}
