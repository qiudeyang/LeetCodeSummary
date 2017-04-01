package com.leetcode;

import java.util.Stack;

/**
 * Created by qiudeyang on 26/07/16.
 */
class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        if ((s.length() & 2) == 1) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }else if(s.charAt(i) == ')' && !stack.empty() && stack.peek() == '('){
                stack.pop();
            }else if(s.charAt(i) == ']' && !stack.empty() && stack.peek() == '['){
                stack.pop();
            }else if(s.charAt(i) == '}' && !stack.empty() && stack.peek() == '{'){
                stack.pop();
            }else {
                return false;
            }
        }
        return stack.empty();

    }
}

public class ValidParentheses {
    public static void main(String[] args) {
        Solution20 solution20 = new Solution20();
        String s = "()";
        System.out.println(solution20.isValid(s));
    }
}
