package com.leetcode;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by qiudeyang on 16/06/16.
 */
class Solution136 {
    public int singleNumber(int[] nums) {
        if (nums.length == 0 || nums == null){
            return 0;
        }
        int a = 0;
        Map<Integer,Integer>  map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                map.put(nums[i],(int)map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            if (entry.getValue() == 1){
                a = entry.getKey();
            }
        }
        return a;


    }
}
public class SingleNumber {
    public static void main(String[] args) {
        Solution136  solution136 = new Solution136();
        int[] nums = {1,2,3,3,2};
        System.out.println(solution136.singleNumber(nums));
    }
}
