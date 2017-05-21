package com.leetcode;

/**
 * Created by qiudeyang on 19/03/17.
 */
class Solution540 {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int length = nums.length;
        int end = length/2;
        while (start < end){
            int mid = (start+end)/2;
            if (nums[2*mid] != nums[2*mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return nums[2*start];
    }
}

public class SingleElementInASortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int[] nums2 = {3, 3, 7, 7, 10, 11, 11};
        Solution540 solution540 = new Solution540();
        System.out.println(solution540.singleNonDuplicate(nums2));
    }
}
