package com.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by qiudeyang on 29/05/17.
 */
class Solution599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map1 = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map1.put(list1[i], i);
        }
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            if (map1.containsKey(list2[i]) && i + map1.get(list2[i]) < minSum) {
                minSum = i + map1.get(list2[i]);
            }
        }
        List<String> list = new LinkedList<>();
        for (int i = 0; i < list2.length; i++) {
            if (map1.containsKey(list2[i]) && i + map1.get(list2[i]) == minSum) {
                list.add(list2[i]);
            }
        }
        String[] result = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}

public class MinimumIndexSumOfTwoLists {
    public static void main(String[] args) {
        Solution599 solution599 = new Solution599();
        String[] list1 = {"Shogun", "KFC", "Burger King", "Qiu"};
        String[] list2 = {"KFC", "Shogun", "Burger King"};
        String[] list = solution599.findRestaurant(list1, list2);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
    }
}
