package com.test;

/**
 * Created by qiudeyang on 04/05/17.
 */
public class MedianOfUnsortedArray {
    public static int helper(int[] nums){
        if (nums == null || nums.length < 1){
            return 0;
        }
        return partition(nums,0,nums.length-1,nums.length/2);
    }

    public static int partition(int[] nums,int start,int end,int k){
        int temp1 = start;
        int temp2 = end;
        int pivot = nums[start];
        while (start<end){
            while (start<end && nums[end] > pivot){
                end--;
            }
            nums[start]=nums[end];
            while (start<end && nums[start] < pivot){
                start++;
            }
            nums[end]=nums[start];
        }
        nums[start]=pivot;
        if (start==k){
            return nums[start];
        }else if (start < k){
            return partition(nums,start+1,temp2,k);
        }else{
            return partition(nums,temp1,start-1,k);
        }
    }
    public static void main(String[] args) {
        int[] nums = {5,3,2,6,7,1,4};
        System.out.println(helper(nums));
    }
}
