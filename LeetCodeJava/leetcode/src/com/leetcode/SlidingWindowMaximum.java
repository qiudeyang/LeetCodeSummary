package com.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by qiudeyang on 18/01/17.
 */
class Solution239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }
        int length = nums.length;
        int[] result = new int[length-k+1];
        Deque<Integer> queue = new ArrayDeque<Integer>();
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            while (!queue.isEmpty() && queue.peek() < i-k+1){
                queue.poll();
            }
            while (!queue.isEmpty() && nums[queue.peekLast()] < nums[i]){
                queue.pollLast();
            }
            queue.offer(i);
            if (i >= k - 1){
                result[index++]=nums[queue.peek()];
            }
        }
        return result;
    }
}

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        Solution239 solution239 = new Solution239();
        int[] array = {1, 3, -1, -3, 5, 3, 6, 7};
        int[] result = solution239.maxSlidingWindow(array, 3);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "\t");
        }
    }
}
