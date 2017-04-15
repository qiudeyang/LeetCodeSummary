package com.leetcode;

import java.util.*;

/**
 * Created by qiudeyang on 05/03/17.
 */
class Solution77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        helper(result,new ArrayList<>(),1,n,k);
        return result;
    }
    public void helper(List<List<Integer>> result,ArrayList<Integer> list,int start,int n,int k){
        if(k==0){
            result.add(new ArrayList<>(list));
        }
        for(int i = start;i <= n;i++){
            list.add(i);
            helper(result,list,i+1,n,k-1);
            list.remove(list.size()-1);
        }
    }
}

public class Combinations {
    public static void main(String[] args) {
        Solution77 solution77 = new Solution77();
        System.out.println(solution77.combine(4, 2));
    }
}
