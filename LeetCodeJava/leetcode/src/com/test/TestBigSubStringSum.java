package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 24/10/16.
 */
public class TestBigSubStringSum {
    public int testBigSubStringSum(int[] nums){
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        int result = 0;
        if (Collections.max(list) < 0){
            return Collections.max(list);
        }
        int currentSum = 0;
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
    public static void main(String[] args) {
        int[] nums = new int[]{2,-3,4,1,-2};
        TestBigSubStringSum tbsss = new TestBigSubStringSum();
        System.out.println(tbsss.testBigSubStringSum(nums));
        String[] nums1 = new String[]{"a","b","c"};
        System.out.println(Arrays.asList(nums));
    }
}
