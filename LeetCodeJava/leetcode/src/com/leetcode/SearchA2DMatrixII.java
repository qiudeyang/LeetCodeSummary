package com.leetcode;

import java.util.Arrays;

/**
 * Created by qiudeyang on 05/11/16.
 */
class Solution240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null){
            return false;
        }
        int i = 0;
        int j = 0;
        while (i < matrix.length && j < matrix[0].length){
            if (matrix[i][j] == target){
                return true;
            }
            if (matrix[i][j] > target){
                return false;
            }
            if (matrix[i][j+1] < matrix[i+1][j]){
                j += 1;
            }else{
                i += 1;
            }
        }
        return false;
    }
    public boolean searchMatrix1(int[][] matrix, int target) {
        if (matrix == null){
            return false;
        }
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0){
            if (target == matrix[row][col]){
                return true;
            }else if(target > matrix[row][col]){
                row++;
            }else{
                col--;
            }
        }
        return false;
    }
}
public class SearchA2DMatrixII {
    public static void main(String[] args) {
        Solution240 solution240 = new Solution240();
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 27;
        System.out.println(solution240.searchMatrix1(matrix,target));
        Arrays.sort(matrix);

    }
}
