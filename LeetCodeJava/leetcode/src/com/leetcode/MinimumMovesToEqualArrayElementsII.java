package com.leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by qiudeyang on 09/12/16.
 */
class Solution462 {
    public int minMoves2(int[] nums) {
        int sum = 0;
        int privot = getKth(nums,0,nums.length-1,nums.length/2+1);
        System.out.println(privot);
        for (int i = 0; i < nums.length; i++) {
            sum += Math.abs(privot-nums[i]);
        }
        return sum;
    }
    public static int getKth(int[] nums, int start, int end, int target) {
        int privot = nums[end];
        int left = start;
        int right = end;
        while (true) {
            while (nums[left] < privot && right > left) {
                left++;
            }
            while (nums[right] >= privot && right > left) {
                right--;
            }
            if (left >= right) break;
            swap(nums, left, right);
        }
        swap(nums, left, end);
        if (target == left + 1) {
            return privot;
        } else if (target > left + 1) {
            return getKth(nums, left + 1, end, target);
        } else return getKth(nums, start, left - 1, target);
    }
    public static void swap(int[] nums, int start, int end) {
        int tmp = nums[start];
        nums[start] = nums[end];
        nums[end] = tmp;
    }
    public int minMoves3(int[] nums) {
        int sum = 0;
        Queue<Integer> queue = new PriorityQueue<Integer>();
        for (int i = 0; i < nums.length; i++) {
            queue.add(nums[i]);
            if (queue.size() > nums.length/2 + 1){
                queue.poll();
            }
        }
        System.out.println(queue);
        int average = queue.peek();
        for (int i = 0; i < nums.length; i++) {
            sum += Math.abs(average-nums[i]);
        }
        return sum;
    }
}

public class MinimumMovesToEqualArrayElementsII {
    public static void main(String[] args) {
        Solution462 solution462 = new Solution462();
        int[] array = {1, 2, 3};
        System.out.println(solution462.minMoves3(array));
    }
}
