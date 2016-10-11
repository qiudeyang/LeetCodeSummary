package com.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by qiudeyang on 07/06/16.
 */
class Solution169 {
    public int majorityElement(int[] nums) {
//        if(nums == null || nums.length == 0){
//             return 0;
//         }
//        int count = 1;
//        int major = nums[0];//至少有两个最多的值连在一起
//        for (int i = 1; i < nums.length; i++) {
//            if(nums[i] != major){
//                count--;
//            }else{
//                count++;
//            }
//            if(count == 0){
//                major = nums[i];
//                count = 1;
//            }
//        }
//        return major;
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        int a = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                a = entry.getKey();
            }
        }
        return a;
    }
}
public class MajorityElement {
    public static void main(String[] args){
        Solution169 solution = new Solution169();
        int[] nums = {3,2,2,2,4,2,3};
        System.out.println(solution.majorityElement(nums));
    }
}

