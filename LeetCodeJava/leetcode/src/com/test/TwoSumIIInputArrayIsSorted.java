package com.test;

import java.util.Arrays;

/**
 * Created by qiudeyang on 10/10/16.
 */
class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for (int i = 0; i < numbers.length -1 ; i++) {
            if ((target % 2 == 0) && (Arrays.binarySearch(numbers,target / 2) >= 0) && numbers[Arrays.binarySearch(numbers,target / 2)+1] == target / 2 ){
                result[0]=Arrays.binarySearch(numbers,target / 2)+1;
                result[1]=Arrays.binarySearch(numbers,target / 2)+2;
                return result;
            }
        }
        for (int i = 0; i < numbers.length; i++) {

            if (Arrays.binarySearch(numbers,target-numbers[i]) > i){
                result[0] = i+1;
                result[1] = Arrays.binarySearch(numbers,target-numbers[i])+1;
            }
        }
        return result;
    }
}
public class TwoSumIIInputArrayIsSorted {
    public static void main(String[] args) {
        Solution167 solution167 = new Solution167();
        int[] numbers = {1,2,3,4,4,9,56,90};
        System.out.println(Arrays.toString(solution167.twoSum(numbers,8)));
    }
}

