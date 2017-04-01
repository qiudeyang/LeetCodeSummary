package com.leetcode;

/**
 * Created by qiudeyang on 01/04/17.
 */
//核心思想：遍历数组求最大能到达的下标。
class Solution55 {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length < 2) {
            return true;
        }
        int length = nums.length;
        int i = 0;
        for (int reach = 0; i < length && reach >= i ; i++) {
            reach = Math.max(reach,i+nums[i]);
        }
        return i==length;
    }
}

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        int[] nums1 = {3, 2, 1, 0, 4};
        Solution55 solution55 = new Solution55();
        System.out.println(solution55.canJump(nums1));
    }
}
