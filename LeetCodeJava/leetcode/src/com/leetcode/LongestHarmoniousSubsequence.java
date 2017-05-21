package com.leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by qiudeyang on 21/05/17.
 */
class Solution594 {
    public int findLHS(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int result = 0;
        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry entry = (Map.Entry)iter.next();
            if (map.containsKey((int)(entry.getKey())+1)){
                result = Math.max(result,(int)entry.getValue()+map.get((int)(entry.getKey())+1));
            }
        }
        return result;
    }
}

public class LongestHarmoniousSubsequence {
    public static void main(String[] args) {
        Solution594 solution594 = new Solution594();
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        System.out.println(solution594.findLHS(nums));
    }
}
