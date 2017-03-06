package com.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 28/02/17.
 */
class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> list = new LinkedList<String>();
        helper(list, "", 0, 0, n);
        return list;
    }

    public void helper(List<String> list, String str, int open, int close, int max) {
        if (str.length() == 2 * max) {
            list.add(str);
            return;
        }
        if (open < max) {
            helper(list, str + "(", open + 1, close, max);
        }
        if (close < open) {
            helper(list, str + ")", open, close + 1, max);
        }
    }

}

public class GenerateParentheses {
    public static void main(String[] args) {
        Solution22 solution22 = new Solution22();
        System.out.println(solution22.generateParenthesis(3));
    }
}
