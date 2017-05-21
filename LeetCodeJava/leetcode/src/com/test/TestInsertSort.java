package com.test;

/**
 * Created by qiudeyang on 15/11/16.
 */
public class TestInsertSort {
    public static void testInsertSort(int[] array) {
        int i;
        int length = array.length;
        for (int j = 1; j < length; j++) {
            int key = array[j];
            i = j -1;
            while (i >= 0 && key > array[i]){
                array[i+1] = array[i];
                i--;
            }
            array[i+1] = key;
        }
        for (int j = 0; j < length; j++) {
            System.out.println(array[j]);
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 2, 4, 1};
        testInsertSort(array);
    }
}
