package com.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 05/03/17.
 */
class Solution77 {
    public List<List<Integer>> combine(int n, int k) {
        if (n < k) {
            return null;
        }
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        breaktracking(result, new LinkedList<Integer>(), 1, n, k);
        return result;
    }

    public void breaktracking(List<List<Integer>> result, LinkedList<Integer> list, int start, int n, int k) {
        if (k == 0) {
            result.add(new LinkedList<>(list));
            return;
        }
        for (int i = start; i <= n; i++) {
            list.add(i);
            breaktracking(result, list, i + 1, n, k - 1);
            list.remove(list.size() - 1);
        }
    }
}

public class Combinations {
    public static void main(String[] args) {
        Solution77 solution77 = new Solution77();
        System.out.println(solution77.combine(4, 2));
    }
}
