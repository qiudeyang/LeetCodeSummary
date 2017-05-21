package com.leetcode;

import java.util.*;

/**
 * Created by qiudeyang on 23/10/16.
 */
class Solution414 {
    public int thirdMax(int[] nums) {
       Set<Integer> set = new HashSet<Integer>();
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (Integer a:set) {
            list.add(a);
        }
        Collections.sort(list,Collections.<Integer>reverseOrder());
        System.out.println(list);
        if (list.size() < 3){
            return list.get(0);
        }else {
            return list.get(2);
        }
    }
}
public class ThirdMaximumNumber {
    public static void main(String[] args) {
        Solution414 solution414 = new Solution414();
        int[] nums = {3,2,1};
        System.out.println(solution414.thirdMax(nums));
    }
}
