package com.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 21/10/16.
 */
class Solution238 {
    //以下是自己的解法
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]==0 && nums[j]==0){
                    return result;
                }
            }
        }
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)==0){
                list.remove(i);
                result[i]=1;
                for (int j = 0; j < list.size(); j++) {
                    result[i] *= list.get(j);
                }
                return result;
            }
        }
        result[0]=1;
        for (int i = 1; i < nums.length; i++) {
            result[0] *= nums[i];
        }
        for (int i = 1; i < result.length; i++) {
            result[i] = result[0] / nums[i] * nums[0];
        }
        return result;
    }
    //下面是别人吊炸天的做法
    public int[] productExceptSelf1(int[] nums){
        int[] result = new int[nums.length];
        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i-1] * nums[i-1];
        }
        int right = 1;
        for (int i = nums.length - 1; i >= 0 ; i--) {
            result[i] *= right;
            right *= nums[i];
        }
        return result;
    }
}

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Solution238 solution238 = new Solution238();
        int[] nums = {1, 2, 0, 4};
        int[] array = solution238.productExceptSelf1(nums);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
