package com.leetcode;

import java.util.*;

/**
 * Created by qiudeyang on 23/10/16.
 */
class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        List<Integer> list = new LinkedList<Integer>();
        for(int i = 0; i < nums.length;i++){
            list.add(nums[i]);
        }
        Collections.sort(list, Collections.<Integer>reverseOrder());
        return list.get(k-1);
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
        if (nums == null || nums.length == 0){
            return Integer.MAX_VALUE;
        }
        return findKthLargest(nums,0,nums.length-1,nums.length - k);
    }
    public int findKthLargest(int[] nums,int start,int end,int k){   //方法重载
        if (start > end){
            return Integer.MAX_VALUE;
        }
        int pivot = nums[end];
        int left = start;
        for (int i = start; i < end; i++) {
            if (nums[i] <= pivot){
                swap(nums,left++,i);
            }
        }
        swap(nums,left,end);
        if (left == k){
            return nums[left];
        }else if (left < k){
            return findKthLargest(nums,left+1,end,k);
        }else{
            return findKthLargest(nums,start,left-1,k);
        }
    }

    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
public class KthLargestElementInAnArray {
    public static void main(String[] args) {
        Solution215 solution215 = new Solution215();
        int[] nums = {3,2,1,5,6,4};
        System.out.println(solution215.findKthLargest2(nums,2));
    }
}
