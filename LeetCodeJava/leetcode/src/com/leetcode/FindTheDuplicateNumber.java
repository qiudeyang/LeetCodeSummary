package com.leetcode;

import java.util.Arrays;

/**
 * Created by qiudeyang on 23/10/16.
 */
class Solution287 {
    public int findDuplicate(int[] nums) {
        int low = 1;
        int high = nums.length - 1;
        while(low <= high){
            int mid = low + (high-low)/2;
            int count = 0;
            for (int a:nums){
                if (a <= mid){
                    count++;
                }
            }
            if (count <= mid){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }
}
public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        Solution287 solution287 = new Solution287();
        int[] nums = {1,2,2,3};
        System.out.println(solution287.findDuplicate(nums));
    }
}
