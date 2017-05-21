package com.leetcode;

import java.util.Stack;

/**
 * Created by qiudeyang on 12/05/17.
 */
class Solution85 {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length < 1) {
            return 0;
        }
        int[][] height = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0) {
                    height[i][j] = matrix[i][j] == '1' ? 1 : 0;
                } else {
                    height[i][j] += (matrix[i][j] == '1' ? height[i - 1][j] + 1 : 0);
                }
            }
        }
        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            Stack<Integer> stack = new Stack<Integer>();
            for (int j = 0; j < matrix[0].length; j++) {
                while (!stack.isEmpty() && height[i][j] < height[i][stack.peek()]) {
                    int pos = stack.peek();
                    stack.pop();
                    result = Math.max(result, height[i][pos] * (stack.isEmpty() ? j : j - stack.peek() - 1));
                }
                stack.push(j);
            }
            while (!stack.isEmpty()) {
                int pos = stack.peek();
                stack.pop();
                result = Math.max(result, height[i][pos] * (stack.isEmpty() ? matrix[0].length : matrix[0].length - stack.peek() - 1));
            }
        }
        return result;
    }
}

public class MaximalRectangle {
    public static void main(String[] args) {
        Solution85 solution85 = new Solution85();
        char[][] matrix = {{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
        System.out.println(solution85.maximalRectangle(matrix));
    }
}
