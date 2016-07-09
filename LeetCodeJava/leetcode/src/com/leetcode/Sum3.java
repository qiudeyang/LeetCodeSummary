package com.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 07/06/16.
 */
class Solution15{
    public List<List<Integer>> threeSum(int[] nums){
        List<Integer>  list = new LinkedList<Integer>();
        List<List<Integer>>  list1 = new LinkedList<List<Integer>>();
        for(int i = 0;i < nums.length;i++){
            for(int j = i+1;j < nums.length;j++){
                for (int k = j+1 ; k < nums.length;k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list1.add(list);
                        for(int m = 0;m < list.size();m++){
                            System.out.println(list.get(m));
                        }
                    }
                }

            }
        }
        list.clear();
        return list1;
    }
}
public class Sum3 {
    public static void main(String[] args){
        Solution15  solution = new Solution15();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        solution.threeSum(nums);
    }
}
