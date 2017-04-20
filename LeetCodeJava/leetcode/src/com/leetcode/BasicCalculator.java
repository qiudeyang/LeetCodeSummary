package com.leetcode;

import java.util.Stack;

/**
 * Created by qiudeyang on 20/04/17.
 */
class Solution224 {
    public int calculate(String s) {
        if (s == null || s.length() < 1) {
            return 0;
        }
        int result = 0;
        int number = 0;
        int sign = 1;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c <= '9' && c >= '0') {
                number = number * 10 + (s.charAt(i) - '0');
            } else if (c == '+') {
                result += sign * number;
                number = 0;
                sign = 1;
            } else if (c == '-') {
                result += sign * number;
                number = 0;
                sign = -1;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                sign = 1;
                result = 0;
            } else if (c == ')') {
                result += sign*number;
                number=0;
                result *= stack.pop();
                result += stack.pop();
            }
        }
        if (number != 0){
            result += sign*number;
        }
        return result;
    }
}

public class BasicCalculator {
    public static void main(String[] args) {
        Solution224 solution224 = new Solution224();
        String s = "(1+(4+5+2)-3)+(6+8)";
        System.out.println(solution224.calculate(s));
    }
}
