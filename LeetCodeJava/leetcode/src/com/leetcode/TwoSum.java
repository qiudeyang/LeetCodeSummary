package com.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by qiudeyang on 07/06/16.
 */
class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list = new LinkedList<Integer>();
        for(int i = 0;i< nums.length;i++){
            for(int j = i + 1;j < nums.length;j++){
                if(nums[i]+nums[j] == target){
                    list.add(i);
                    list.add(j);
                }
            }
        }
        Integer[] nums1 = list.toArray(new Integer[list.size()]);
        int[] nums2 = new int[nums1.length];
        for(int i = 0;i < nums2.length;i++){
            nums2[i] = nums1[i].intValue();
            System.out.println(nums2[i]);
        }
        return nums2;
    }
    public int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
public class TwoSum {
    public static void main(String[] args){
        Solution1 solution = new Solution1();
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println(solution.twoSum(nums,target)[0]);
    }
}
