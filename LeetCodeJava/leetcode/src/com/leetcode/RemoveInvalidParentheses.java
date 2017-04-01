package com.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 01/04/17.
 */
class Solution301 {
    public List<String> removeInvalidParentheses(String s) {
        List<String> list = new LinkedList<String>();
        if (s == null || s.length() < 1) {
            return list;
        }
        return list;
    }
}

public class RemoveInvalidParentheses {
    public static void main(String[] args) {
        Solution301 solution301 = new Solution301();
        String s = "()())()";
        System.out.println(solution301.removeInvalidParentheses(s));
    }
}
