package com.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 23/10/16.
 */
class Solution162 {
    public int findPeakElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return nums[1] > nums[0] ? nums[1] : nums[0];
        }
        int mid = 0;
        int low = 0;
        int high = nums.length - 1;
        while(low < high){
            mid = (low+high)/2;
            if (nums[mid] > nums[mid+1]){
                high = mid;
            }
            if (nums[mid] < nums[mid+1]){
                low = mid + 1;
            }
        }
        return low;
    }
}

public class FindPeakElement {
    public static void main(String[] args) {
        Solution162 solution162 = new Solution162();
        int[] nums = {1, 2, 3, 1, 4, 2, 3, 1};
        System.out.println(solution162.findPeakElement(nums));
    }
}
