package com.leetcode;

/**
 * Created by qiudeyang on 15/06/16.
 */

import java.util.*;

class Solution219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        if (nums == null || nums.length <= 1) {
            return false;
        }
        Set<Integer>  set = new  HashSet<Integer>();
        for (int i = 0; i < nums.length ; i++) {
            if (!set.add(nums[i])){
                if (i <= k){
                    return true;
                }else{
                    for(int j = i - k;j < i;j++){
                        if (nums[j] == nums[i]){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}

public class ContainsDuplicateII {
    public static void main(String[] args) {
        Solution219 solution217 = new Solution219();
        int[] nums = {1, 3, 4, 3, 3, 5};
        System.out.println(solution217.containsNearbyDuplicate(nums, 1));
    }
}
