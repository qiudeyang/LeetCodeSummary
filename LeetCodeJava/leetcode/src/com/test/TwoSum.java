package com.test;

/**
 * Created by qiudeyang on 10/10/16.
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;

    }
}
public class TwoSum {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] array = {3,2,4};
        System.out.println(Arrays.toString(solution1.twoSum(array,6)));
    }
}
