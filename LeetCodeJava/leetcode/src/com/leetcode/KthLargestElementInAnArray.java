package com.leetcode;

import java.util.*;

/**
 * Created by qiudeyang on 23/10/16.
 */
class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        if(nums == null || nums.length < 1 || nums.length < k){
            return -1;
        }
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
    //以下是使用优先队列求解
    public int findKthLargest1(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<Integer>();
        for (int i = 0; i < nums.length ; i++) {
            queue.add(nums[i]);
            if (queue.size() > k){
                queue.poll();
            }
        }
        return queue.peek();
    }
    //以下是使用快速排序来求解
    public int findKthLargest2(int[] nums, int k) {
        if (nums == null || nums.length == 0 || nums.length < k){
            return -1;
        }
        return findKthLargest(nums,0,nums.length-1,nums.length - k);
    }
    public int findKthLargest(int[] nums,int start,int end,int k){   //方法重载
        if (start > end){
            return -1;
        }
        int pos = helper(nums,start,end);
        if (pos == k){
            return nums[pos];
        }else if (pos < k){
            return findKthLargest(nums,pos+1,end,k);
        }else{
            return findKthLargest(nums,start,pos-1,k);
        }
    }

    public int helper(int[] nums,int start,int end){
        int pivot = nums[start];
        while (start < end){
            while (start < end && nums[end] >= pivot){
                end--;
            }
            nums[start] = nums[end];
            while (start < end && nums[start] <= pivot){
                start++;
            }
            nums[end] = nums[start];
        }
        nums[start] = pivot;
        return start;
    }

}
public class KthLargestElementInAnArray {
    public static void main(String[] args) {
        Solution215 solution215 = new Solution215();
        int[] nums = {3,2,1,5,6,4};
        System.out.println(solution215.findKthLargest2(nums,2));
    }
}
