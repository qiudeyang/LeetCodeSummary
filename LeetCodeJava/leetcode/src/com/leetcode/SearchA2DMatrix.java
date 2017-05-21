package com.leetcode;

import java.util.Arrays;

/**
 * Created by qiudeyang on 05/11/16.
 */
class Solution74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null){
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target){
                    return true;
                }
                if (matrix[i][j] > target){
                    return false;
                }
            }
        }
        return false;
    }
    public boolean searchMatrix1(int[][] matrix, int target) {
        if (matrix == null){
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (Arrays.binarySearch(matrix[i],target) >= 0 && Arrays.binarySearch(matrix[i],target) < matrix[i].length){
                return true;
            }
        }
        return false;
    }
    public boolean searchMatrix2(int[][] matrix, int target) {
        if (matrix == null){
            return false;
        }
        int rowlength = matrix.length;
        int columnlength = matrix[0].length;
        int first = 0;
        int last = rowlength * columnlength - 1;
        while(first <= last){
            int mid = (first + last) / 2;
            int midvalue = matrix[mid/columnlength][mid%columnlength];
            if(midvalue == target){
                return true;
            }else if(midvalue < target){
                first = mid + 1;
            }else{
                last = mid - 1;
            }
        }
        return false;
    }
    public boolean searchMatrix3(int[][] matrix, int target) {
        if (matrix == null){
            return false;
        }
        int i = 0;
        int j = matrix[0].length - 1;
        while(i < matrix.length && j >= 0){
            if(target == matrix[i][j]){
                return true;
            }else if(target > matrix[i][j]){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}

public class SearchA2DMatrix {
    public static void main(String[] args) {
        Solution74 solution74 = new Solution74();
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        int target = 3;
        System.out.println(solution74.searchMatrix1(matrix, target));
    }
}
