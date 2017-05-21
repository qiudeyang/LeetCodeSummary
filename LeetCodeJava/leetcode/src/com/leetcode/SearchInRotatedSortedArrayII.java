package com.leetcode;

/**
 * Created by qiudeyang on 16/03/17.
 */
//最坏情况的数据是 [1,1,1,1... 1] 里有一个0即可。考虑最差的情况.
class Solution81 {
    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length < 1) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target){
                return true;
            }
        }
        return false;
    }
}

public class SearchInRotatedSortedArrayII {
    public static void main(String[] args) {
        Solution81 solution81 = new Solution81();
        int[] nums = {1,1,3,1};
        System.out.println(solution81.search(nums, 3));
    }
}
