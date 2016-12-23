package com.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by qiudeyang on 23/12/16.
 */
class Solution179 {
    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }
        String[] s_num = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            s_num[i]=String.valueOf(nums[i]);
        }
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1+o2;
                String s2 = o2+o1;
                return s2.compareTo(s1);
            }
        };
        Arrays.sort(s_num,comp);
        if (s_num[0].charAt(0)=='0'){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s_num.length; i++) {
            sb.append(s_num[i]);
        }
        return sb.toString();
    }
}

public class LargestNumber {
    public static void main(String[] args) {
        Solution179 solution179 = new Solution179();
        int[] nums = {3, 30, 34, 5, 9};
        System.out.println(solution179.largestNumber(nums));
    }
}
