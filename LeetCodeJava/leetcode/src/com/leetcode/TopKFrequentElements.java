package com.leetcode;

import java.util.*;

/**
 * Created by qiudeyang on 10/10/16.
 */
class Solution347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> list = new LinkedList<Integer>();
        Hashtable<Integer,Integer> table = new Hashtable<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!table.containsValue(nums[i])){
                table.put(nums[i],1);
            }else{
                table.put(nums[i],table.get(nums[i])+1);
            }
        }
        LinkedList<Integer>  arr1 = new LinkedList<Integer>(table.values());
        Collections.sort(arr1,Collections.<Integer>reverseOrder());
        int count = 0;
        for (int i = 0; i < arr1.size(); i++) {
            for (Integer getKey:table.keySet()) {
                if (table.get(getKey).equals(arr1.get(i))){
                    list.add(getKey);
                    count++;
                }
            }
            if (count == k){
                break;
            }
        }
        return list;
    }
}
public class TopKFrequentElements {
    public static void main(String[] args) {
        Solution347 solution347 = new Solution347();
        int[] nums = {1,1,1,2,2,3};
        System.out.println(solution347.topKFrequent(nums,2));
    }
}
