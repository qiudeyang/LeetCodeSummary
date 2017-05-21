package com.leetcode;

import java.util.*;

/**
 * Created by qiudeyang on 10/10/16.
 */
class Solution347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result = new LinkedList<>();
        if (nums == null || nums.length < 1) {
            return result;
        }
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        Queue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>((a,b) -> (b.getValue()-a.getValue()));
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            queue.offer(entry);
        }
        while (result.size() < k){
            Map.Entry<Integer,Integer> temp = queue.poll();
            result.add(temp.getKey());
        }
        return result;
    }
}

public class TopKFrequentElements {
    public static void main(String[] args) {
        Solution347 solution347 = new Solution347();
        int[] nums = {1, 1, 1, 2, 2, 3};
        System.out.println(solution347.topKFrequent(nums, 2));
    }
}
