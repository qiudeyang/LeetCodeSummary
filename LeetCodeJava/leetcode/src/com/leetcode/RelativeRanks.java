package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by qiudeyang on 14/02/17.
 */
//用一个hashMap来实现
class Solution506 {
    public String[] findRelativeRanks(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        int[] temp = nums.clone();
        Arrays.sort(temp);
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < temp.length; i++) {
            map.put(temp[i],temp.length-i);
        }
        String[] result = new String[nums.length];
        for (int i = 0; i < result.length; i++) {
            int rank = map.get(nums[i]);
            String rankStr= rank+"";
            if (rank==1){
                rankStr = "Gold Medal";
            }else if (rank==2){
                rankStr = "Silver Medal";
            }else if (rank==3){
                rankStr = "Bronze Medal";
            }
            result[i]=rankStr;
        }
        return result;
    }
}

public class RelativeRanks {
    public static void main(String[] args) {
        Solution506 solution506 = new Solution506();
        int[] nums = {5, 4, 3, 2, 1};
        String[] result = solution506.findRelativeRanks(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
