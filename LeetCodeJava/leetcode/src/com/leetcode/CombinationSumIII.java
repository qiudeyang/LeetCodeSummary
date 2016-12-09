package com.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 09/12/16.
 */
class Solution216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new LinkedList<>();
        combination(ans,new LinkedList<Integer>(),k,1,n);
        return ans;
    }
    public void combination(List<List<Integer>> ans,List<Integer> comb,int k,int start,int n){
        if(comb.size() > k || n < 0 ){
            return;
        }
        if (comb.size() == k && n == 0){
            List<Integer> li = new LinkedList<Integer>(comb);
            ans.add(li);
            return;
        }
        for (int i = start; i <= 9; i++) {
            comb.add(i);
            combination(ans,comb,k,i+1,n-i);
            comb.remove(comb.size()-1);
        }
    }
}
public class CombinationSumIII {
    public static void main(String[] args) {
        Solution216 solution216 = new Solution216();
        int k = 1;
        int n = 2;
        System.out.println(solution216.combinationSum3(k,n));
    }
}
