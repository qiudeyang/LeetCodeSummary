package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by qiudeyang on 09/02/17.
 */
class Solution496 {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        for(int num:nums){
            while (!stack.isEmpty() && stack.peek() < num){
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }
        for (int i = 0; i < findNums.length; i++) {
//            getOrDefault是jdk1.8新增的特性。
            findNums[i] = map.getOrDefault(findNums[i],-1);
        }
        return findNums;
    }
}

public class NextGreaterElementI {
    public static void main(String[] args) {
        Solution496 solution496 = new Solution496();
        int[] findNums = {2, 4};
        int[] nums = {1, 2, 3, 4};
        int[] result = solution496.nextGreaterElement(findNums, nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
