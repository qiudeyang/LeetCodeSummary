package com.leetcode;

/**
 * Created by qiudeyang on 23/10/16.
 */
class Solution75 {
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int temp1 = 0;
        int temp2 = 0;
        for (int i = 0; i <= end; i++) {
            while(nums[i]==2 && i < end){
                temp1 = nums[end--];
                nums[end--] = 2;
                nums[i] = temp1;
            }
            while(nums[i]==0 && i > start){
                temp2 = nums[start++];
                nums[start++] = 0;
                nums[i] = temp2;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}

public class SortColors {
    public static void main(String[] args) {
        Solution75 solution75 = new Solution75();
        int[] nums = {0, 1, 2, 2, 1, 1, 0};
        solution75.sortColors(nums);
    }
}
