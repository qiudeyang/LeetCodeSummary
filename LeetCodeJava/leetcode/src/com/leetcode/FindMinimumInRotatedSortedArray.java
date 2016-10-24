package com.leetcode;

import java.util.Arrays;

/**
 * Created by qiudeyang on 23/10/16.
 */
class Solution153 {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        if (nums.length == 1){
            return nums[0];
        }
        int start = 0;
        int end = nums.length -1;
        while(start < end){
            int mid = (start+end) / 2;
            if (mid > 0 && nums[mid] < nums[mid-1]){
                return nums[mid];
            }
            if (nums[start] < nums[mid] && nums[mid] > nums[end]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return nums[start];
    }
}
public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        Solution153 solution153 = new Solution153();
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(solution153.findMin(nums));
    }
}
