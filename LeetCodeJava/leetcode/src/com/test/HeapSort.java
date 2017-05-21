package com.test;

/**
 * Created by qiudeyang on 27/04/17.
 */
public class HeapSort {
    int heapSize;
    int[] array;
    public void heapSort(int[] array){
        buildMaxHeap(array);
        for (int i = array.length-1; i > 0 ; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapSize--;
            maxifyHeap(0);
        }
    }

    public void buildMaxHeap(int[] array){
        this.array = array;
        this.heapSize = array.length;
        for (int i = parent(heapSize-1); i >= 0 ; i--) {
            maxifyHeap(i);
        }
    }

    public void maxifyHeap(int i){
        int left = left(i);
        int right = right(i);
        int largest = i;
        if (left<=heapSize-1 && array[left]>array[largest]){
            largest=left;
        }
        if (right<=heapSize-1 && array[right]>array[largest]){
            largest=right;
        }
        if (i != largest){
            int temp = array[largest];
            array[largest] = array[i];
            array[i] = temp;
            maxifyHeap(largest);
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
        int[] array = {1,3,5,2,4,6};
        new HeapSort().heapSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
    }
}
