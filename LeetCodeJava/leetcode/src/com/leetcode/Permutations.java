package com.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 04/11/16.
 */
class Solution46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if (nums == null || nums.length == 0){
            return result;
        }
        List<Integer> list = new LinkedList<Integer>();
        list.add(nums[0]);
        result.add(list);
        for (int i = 1; i < nums.length; i++) {
            List<List<Integer>> temp = new LinkedList<List<Integer>>();
            for (int j = 0; j <=i ; j++) {
                for(List<Integer> l:result){
                    List<Integer> temp_l = new LinkedList<Integer>(l);
                    temp_l.add(j,nums[i]);
                    temp.add(temp_l);
                }
            }
            result = temp;
        }
        return result;
    }
    //以下是回溯法
    public List<List<Integer>> permute1(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        backtrack(result,new LinkedList<Integer>(),nums);
        return result;
    }
    public void backtrack(List<List<Integer>> list,List<Integer> templist,int[] nums){
        if (templist.size() == nums.length){
            list.add(new LinkedList<Integer>(templist));
        }else{
            for (int i = 0; i < nums.length; i++) {
                if (templist.contains(nums[i])){
                    continue;
                }
                templist.add(nums[i]);
                backtrack(list,templist,nums);
                templist.remove(templist.size()-1);
            }
        }

    }
}

public class Permutations {
    public static void main(String[] args) {
        Solution46 solution46 = new Solution46();
        int[] nums = {1, 2, 3};
        System.out.println(solution46.permute1(nums));
    }
}
