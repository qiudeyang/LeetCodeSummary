package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qiudeyang on 06/04/17.
 */
public class TestCombination {
    public static void main(String[] args) {
        List<List<Integer>> result = new TestCombination().combine(4, 2);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        helper(n, k, result, new ArrayList<>());
        return result;
    }

    public static void helper(int n, int k, List<List<Integer>> result, ArrayList<Integer> list) {
        if (list.size() == k) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = 1; i <= n; i++) {
            list.add(i);
            helper(n, k, result, list);
            list.remove(list.size() - 1);
        }
    }
}
