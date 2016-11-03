package com.leetcode;


/**
 * Created by qiudeyang on 03/11/16.
 */
class Solution80 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n:nums) {
            if (i < 2 || n > nums[i-2]){
                nums[i++] = n;
            }
        }
        return i;
    }

}

public class RemoveDuplicatesfromSortedArrayII {
    public static void main(String[] args) {
        Solution80 solution80 = new Solution80();
        int[] nums = {1,1,1,1};
        System.out.println(solution80.removeDuplicates(nums));
    }
}
