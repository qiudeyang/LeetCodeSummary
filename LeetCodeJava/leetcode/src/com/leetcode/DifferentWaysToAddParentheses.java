package com.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 05/11/16.
 */
class Solution241 {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> list = new LinkedList<Integer>();
        if (input == null) {
            return list;
        }
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String a = input.substring(0, i); //左开右闭
                String b = input.substring(i + 1);
                List<Integer> list1 = diffWaysToCompute(a);
                List<Integer> list2 = diffWaysToCompute(b);
                for (Integer temp1 : list1) {
                    for (Integer temp2 : list2) {
                        if (c == '+') {
                            list.add(temp1 + temp2);
                        } else if (c == '-') {
                            list.add(temp1 - temp2);
                        } else {
                            list.add(temp1 * temp2);
                        }
                    }
                }
            }

        }
        if (list.size() == 0) {
            list.add(Integer.valueOf(input));
        }
        return list;
    }
}

public class DifferentWaysToAddParentheses {
    public static void main(String[] args) {
        Solution241 solution241 = new Solution241();
        String input = "2*3-4*5";
        System.out.println(solution241.diffWaysToCompute(input));
    }
}
