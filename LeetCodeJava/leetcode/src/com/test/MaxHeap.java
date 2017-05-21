package com.test;

import java.util.Arrays;

/**
 * Created by qiudeyang on 13/03/17.
 */
public class MaxHeap {
    int[] array;
    int heapsize;

    public void heapSort(int[] array) {
        if (array == null || array.length < 1){
            return;
        }
        buildMaxHeap(array);
        for (int i = array.length - 1; i > 0 ; i--) {
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;
            heapsize--;
            maxHeapify(0);
        }
    }

    public void buildMaxHeap(int[] array){
        this.array = array;
        this.heapsize = array.length;
        for (int i = parent(heapsize-1); i >= 0 ; i--) {
            maxHeapify(i);
        }
    }

    public void maxHeapify(int i){
        int left = left(i);
        int right = right(i);
        int largest = i;
        if (left < heapsize && array[left] > array[largest]){
            largest = left;
        }
        if (right < heapsize && array[right] > array[largest]){
            largest = right;
        }
        if (largest != i){
            int temp = array[largest];
            array[largest] = array[i];
            array[i] = temp;
            maxHeapify(largest);
        }
    }
    public int parent(int i){
        return (i-1)/2;
    }

    public int left(int i){
        return 2*i+1;
    }

    public int right(int i){
        return 2*i+2;
    }

    public static void main(String[] args) {
        int[] array = {7, 3, 8, 2, 1, 5, 6, 4};
        MaxHeap maxHeap = new MaxHeap();
        maxHeap.heapSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
