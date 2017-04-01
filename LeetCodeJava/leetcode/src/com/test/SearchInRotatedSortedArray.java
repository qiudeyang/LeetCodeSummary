package com.test;

/**
 * Created by qiudeyang on 17/03/17.
 */
public class SearchInRotatedSortedArray {
    public static int helper(int[] nums, int target) {
        if (nums == null || nums.length < 1) {
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start+1 < end){
            int mid = (start+end)/2;
            if (nums[mid]==target){
                return mid;
            }
            if (nums[start] < nums[mid]){
                if (nums[start] <= target && target < nums[mid]){
                    end = mid;
                }else{
                    start = mid;
                }
            }else{
                if (nums[mid] < target && target <= nums[end]){
                    start = mid;
                }else{
                    end = mid;
                }
            }
        }
        if (nums[start]==target){
            return start;
        }
        if (nums[end]==target){
            return end;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(helper(nums,6));
    }
}
