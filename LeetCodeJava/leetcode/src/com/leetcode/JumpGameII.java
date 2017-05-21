package com.leetcode;

/**
 * Created by qiudeyang on 01/04/17.
 */
//求到达最后一个元素的步数。
class Solution45 {
    public int jump(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        int count = 0;
        int currentMaxIndex = 0;
        int lastMaxIndex = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            currentMaxIndex = Math.max(currentMaxIndex, i + nums[i]);
            if (i == lastMaxIndex) {
                count++;
                lastMaxIndex = currentMaxIndex;
            }
        }
        return count;
    }
}

public class JumpGameII {
    public static void main(String[] args) {
        Solution45 solution45 = new Solution45();
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(solution45.jump(nums));
    }
}
