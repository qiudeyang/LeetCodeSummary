package com.test;

import java.util.*;

/**
 * Created by qiudeyang on 07/11/16.
 */
class Solution347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new Hashtable<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        List<Integer> keyList = new LinkedList<Integer>(map.keySet());
        List<Integer> valueList = new LinkedList<Integer>(map.values());
        List<Integer> list = new LinkedList<Integer>();
        Collections.sort(valueList,Collections.<Integer>reverseOrder());
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (map.get(nums[j]) == valueList.get(i)){
                    list.add(nums[j]);
                    map.remove(nums[j]);
                }
            }
        }
        return list;
    }
}
public class TestTopKFrequentElements {
    public static void main(String[] args) {
        Solution347 solution347 = new Solution347();
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(solution347.topKFrequent(nums,k));
    }
}
