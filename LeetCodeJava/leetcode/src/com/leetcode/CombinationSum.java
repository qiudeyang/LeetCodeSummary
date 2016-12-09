package com.leetcode;

import java.util.*;

/**
 * Created by qiudeyang on 09/12/16.
 */
class Solution39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new LinkedList<>();
        Arrays.sort(candidates);
        backtrack(list,new LinkedList<Integer>(),candidates,target,0);
        return list;
    }
    public void backtrack(List<List<Integer>> list,LinkedList<Integer> tempList,int[] candidates,int target,int start){
        if(target < 0){
            return;
        }else if(target == 0){
            list.add(new LinkedList<>(tempList));
        }else{
            for(int i = start; i < candidates.length;i++){
                tempList.add(candidates[i]);
                backtrack(list,tempList,candidates,target-candidates[i],i);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
public class CombinationSum {
    public static void main(String[] args) {
        Solution39 solution39 = new Solution39();
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(solution39.combinationSum(candidates,target));
    }
}
