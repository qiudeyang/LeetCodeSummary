package com.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 04/11/16.
 */
class Solution78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        Arrays.sort(nums);
        backtrack(result,new LinkedList<Integer>(),nums,0);
        return result;
    }
    public void backtrack(List<List<Integer>> list,LinkedList<Integer> tempList,int[] nums,int start){
        list.add(new LinkedList<Integer>(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtrack(list,tempList,nums,i+1);
            tempList.remove(tempList.size()-1);
        }
    }
}
public class Subsets {
    public static void main(String[] args) {
        Solution78 solution78 = new Solution78();
        int[] nums  = {1,2,3};
        System.out.println(solution78.subsets(nums));
    }
}
