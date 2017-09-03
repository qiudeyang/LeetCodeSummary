package com.leetcode;

/**
 * Created by qiudeyang on 2017/8/20.
 */
class Solution661 {
    public int[][] imageSmoother(int[][] M) {
        if (M == null || M.length < 1){
            return null;
        }
        int rowLength = M.length;
        int colLength = M[0].length;
        int[][] result = new int[rowLength][colLength];
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {

            }
        }
        return result;
    }

    public int helper(int i,int j,int[][] M){
        int sum = 0;
        int count = 0;
        if (i>=0){
            sum += M[i-1][j];
        }
        return 1;
    }
}
public class ImageSmoother {
    public static void main(String[] args) {
        Solution661 solution661 = new Solution661();
        int[][] M = {{1,1,1},{1,0,1},{1,1,1}};
        System.out.println(solution661.imageSmoother(M));
    }
}
