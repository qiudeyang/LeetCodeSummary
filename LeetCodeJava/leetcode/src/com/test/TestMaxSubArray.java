package com.test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/**
 * Created by qiudeyang on 07/11/16.
 */
public class TestMaxSubArray {
    public static int maxSubArray(int[] nums){
        if (nums == null || nums.length == 0){
            return 0;
        }
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        if (Collections.max(list) <= 0){
            return Collections.max(list);
        }
        int maxSum = 0;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (currentSum < 0){
                currentSum = 0;
            }
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-5,3,-2,1,5,-2};
        System.out.println(maxSubArray(nums));
    }
}
