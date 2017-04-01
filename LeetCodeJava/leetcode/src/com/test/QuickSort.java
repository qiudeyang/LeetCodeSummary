package com.test;

/**
 * Created by qiudeyang on 16/03/17.
 */
public class QuickSort {
    public static void quickSort(int[] array) {
        if (array == null || array.length < 1) {
            return;
        }
        quickSort(array,0,array.length-1);
    }
    public static void quickSort(int[] array,int start,int end){
        if (start > end){
            return;
        }
        int pos = helper(array,start,end);
        quickSort(array,start,pos-1);
        quickSort(array,pos+1,end);
    }

    public static int helper(int[] array,int start,int end){
        if (start > end){
            return -1;
        }
        int pivot = array[start];
        while (start < end){
            while (start < end && array[end] >= pivot){
                end--;
            }
            array[start] = array[end];
            while (start < end && array[start] <= pivot){
                start++;
            }
        }
        array[start]=pivot;
        return start;
    }

    public static void main(String[] args) {
        int[] array = {1,3,2,5,4};
        quickSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
