package com.leetcode;

import java.util.Arrays;

/**
 * Created by qiudeyang on 03/11/16.
 */
class Solution35 {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        if (target <= nums[0]){
            return 0;
        }
        if (target > nums[nums.length-1]){
            return nums.length;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == target){
                return i;
            }
            if (nums[i] < target && target < nums[i+1]){
                return i+1;
            }
        }
        return nums.length - 1;  //这个是target等于最后一个元素的情况
    }
    public int searchInsert1(int[] nums, int target) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        if (nums.length == 1){
            return target > nums[0] ? 1:0;
        }
        if (target < nums[0]){
            return 0;
        }
        int result = Arrays.binarySearch(nums,target);
        if (result >= 0 && result < nums.length){
            return result;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < target && nums[i+1] > target ){
                return i+1;
            }
        }
        return nums.length;
    }
    public int searchInsert2(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high){
            int mid = (low + high) / 2;
            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}

public class SearchInsertPosition {
    public static void main(String[] args) {
        Solution35 solution35 = new Solution35();
        int[] nums = {1,3,5};
        int target = 2;
        long a = System.currentTimeMillis();
        System.out.println(solution35.searchInsert1(nums, target));
        System.out.println(System.currentTimeMillis() - a);
    }
}
