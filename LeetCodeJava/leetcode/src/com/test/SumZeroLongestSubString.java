package com.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by qiudeyang on 17/03/17.
 */
public class SumZeroLongestSubString {
    public static int helper(int[] array) {
        if (array == null || array.length < 1) {
            return -1;
        }
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i] + array[i - 1];
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                result = result > i - map.get(array[i]) ? result : i - map.get(array[i]);
            } else {
                map.put(array[i], i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {6, -3, 2, 1, -4, 2};
        System.out.println(helper(array));
    }
}
