package com.leetcode;

/**
 * Created by qiudeyang on 16/03/17.
 */
class Solution33 {
    public int search(int[] nums, int target) {
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
                if (nums[start] <= target && target <= nums[mid]){
                    end = mid;
                }else{
                    start = mid;
                }
            }else{
                if (nums[mid] <= target && target <= nums[end]){
                    start = mid;
                }else{
                    end = mid;
                }
            }
        }
        if (nums[start]==target){
            return start;
        }
        if (nums[end] == target){
            return end;
        }
        return -1;
    }
}

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        Solution33 solution33 = new Solution33();
        int[] nums = {3,1};
        System.out.println(solution33.search(nums, 1));
    }
}
