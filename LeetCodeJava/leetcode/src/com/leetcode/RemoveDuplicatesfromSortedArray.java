package com.leetcode;

import java.util.*;

/**
 * Created by qiudeyang on 16/06/16.
 */
class Solution26 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        List<Integer> list = new LinkedList<Integer>();
        Map<Integer,Integer> map = new LinkedHashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            list.add(entry.getKey());
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return list.size();
    }
}
public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        Solution26  solution26 = new Solution26();
        int[] nums = {1,2,2};
        System.out.println("长度为"+solution26.removeDuplicates(nums));
    }
}
