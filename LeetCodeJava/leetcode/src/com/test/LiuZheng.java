package com.test;

/**
 * Created by qiudeyang on 09/12/16.
 */
public class LiuZheng {
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
    public static void main(String[] args) {
        int[] array = {6,3,1,5,4};
        System.out.println(getKth(array,0,array.length-1,2));
    }
}
