package com.leetcode;

/**
 * Created by qiudeyang on 02/05/17.
 */
class Solution566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int rows = nums.length;
        int columns = nums[0].length;
        if (rows * columns != r * c) {
            return nums;
        }
        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j]=nums[(i*c+j)/columns][(i*c+j)%columns];
            }
        }
        return result;
    }
}

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        Solution566 solution566 = new Solution566();
        int[][] nums = {{1, 2}, {3, 4}};
        int[][] result = solution566.matrixReshape(nums, 2, 4);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
