package com.test;

/**
 * Created by qiudeyang on 19/10/16.
 */
public class InsertSort {
    public void insertSort(int[] array) {
        int length = array.length;
        int j;
        int i;
        int key;
        for (j = 1; j < length; j++) {
            key = array[j];
            i = j - 1;
            while (i >= 0 && key < array[i]) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 1, 3};
        InsertSort is = new InsertSort();
        is.insertSort(array);
        for (Integer i : array) {
            System.out.println(i);
        }
    }
}
