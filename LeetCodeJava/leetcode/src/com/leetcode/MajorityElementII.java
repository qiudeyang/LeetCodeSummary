package com.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/**
 * Created by qiudeyang on 13/06/16.
 */
class Solution229 {
    public List<Integer> majorityElement(int[] nums) {
         List<Integer> list = new LinkedList<Integer>();
         Map<Integer,Integer> map = new HashMap<Integer,Integer>();
         if(nums.length == 0 || nums == null){
             return list;
         }
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            if(entry.getValue() > nums.length / 3){
                list.add(entry.getKey());
            }

        }
        return list;
    }
}
public class MajorityElementII {
    public static void main(String[] args) {
        Solution229 solution229 = new Solution229();
        int[] nums = {4,4,3,3,3,4,4};
        System.out.println(solution229.majorityElement(nums));
    }
}
