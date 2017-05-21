package com.leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 21/10/16.
 */
class Solution53 {
    public int maxSubArray1(int[] nums) {
        int result = 0;
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        if (Collections.max(list) < 0){
            return Collections.max(list);
        }
        for (int i = 0; i < nums.length ; i++) {
            int currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                if (currentSum > result){
                    result = currentSum;
                }
            }
        }
        return result;
    }
    public int maxSubArray3(int[] nums) {
        int result = 0;
        int currentSum = 0;
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        if (Collections.max(list) < 0){
            return Collections.max(list);
        }
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (currentSum > result){
                result = currentSum;
            }
            if (currentSum < 0){
                currentSum = 0;
            }
        }
        return result;
    }
}
public class MaximumSubarray {
    public static void main(String[] args) {
        Solution53 solution53 = new Solution53();
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution53.maxSubArray1(array));
    }
}
