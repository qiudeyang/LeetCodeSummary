package com.leetcode;

/**
 * Created by qiudeyang on 29/12/16.
 */
class Solution477 {
    public int totalHammingDistance(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                count += count1OfBits(nums[i] ^ nums[j]);
            }
        }

        return count;
    }

    public int count1OfBits(int x) {
        int count = 0;
        while (x != 0) {
            count++;
            x = x & (x - 1);
        }
        return count;
    }
}

public class TotalHammingDistance {
    public static void main(String[] args) {
        Solution477 solution477 = new Solution477();
        int[] nums = {4, 14, 2};
        System.out.println(solution477.totalHammingDistance(nums));
    }
}
