package com.leetcode;

import java.util.*;

/**
 * Created by qiudeyang on 06/04/17.
 */
class Solution40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        helper(result, new ArrayList<Integer>(), target, 0, candidates, candidates[0]);
        return result;
    }

    public static void helper(List<List<Integer>> result, ArrayList<Integer> list, int target, int currentSum, int[] candidates, int current) {
        if (currentSum == target) {
            result.add(new ArrayList<>(list));
            return;
        }
        if (currentSum > target) {
            return;
        }
        for (int i = 0; i < candidates.length; i++) {
            if (current >= candidates[i]) {
                list.add(candidates[i]);
                helper(result, list, target, currentSum + candidates[i], candidates, candidates[i]);
                list.remove(list.size() - 1);
            }
        }
    }
}

public class CombinationSumII {
    public static void main(String[] args) {
        Solution40 solution40 = new Solution40();
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        Arrays.sort(candidates);
        int start = 0;
        int end = candidates.length - 1;
        while (start < end) {
            int temp = candidates[start];
            candidates[start] = candidates[end];
            candidates[end] = temp;
            start++;
            end--;
        }
        List<List<Integer>> result = solution40.combinationSum2(candidates, 8);
        Set temp = new HashSet();
        for (int i = 0; i < result.size(); i++) {
            temp.add(result.get(i));
        }
        System.out.println(temp);
    }
}
