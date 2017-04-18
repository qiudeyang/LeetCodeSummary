package com.leetcode;

/**
 * Created by qiudeyang on 17/04/17.
 */
class Solution11 {
    public int maxArea(int[] height) {
        if (height == null || height.length < 1) {
            return 0;
        }
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}

public class ContainerWithMostWater {
    public static void main(String[] args) {
        Solution11 solution11 = new Solution11();
        int[] height = {0,1, 2, 3, 4, 5, 6};
        System.out.println(solution11.maxArea(height));
    }
}
