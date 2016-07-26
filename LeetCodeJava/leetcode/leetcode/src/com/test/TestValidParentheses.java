package com.test;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by qiudeyang on 26/07/16.
 */
class TestSolution20 {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        s = s.replaceAll("[(]", "1");
        s = s.replaceAll("[)]", "-1");
        s = s.replaceAll("[{]", "2");
        s = s.replaceAll("[}]", "-2");
        s = s.replaceAll("[\\[]", "3");
        s = s.replaceAll("[\\]]", "-3");
        System.out.println(s);
        Stack<Character> stack = new Stack<Character>();
        int ch = 0;
        char[] array = s.toCharArray();
        for (Character c : array) {
            ch = (int)stack.push(c);
            System.out.println((ch+(int)(stack.push(c))));
            if((ch+(int)(stack.push(c))) != (int)98 ){
                return false;
            }
        }
        return true;
    }
}

public class TestValidParentheses {
    public static void main(String[] args) {
        TestSolution20 solution20 = new TestSolution20();
        String s = "()";
        System.out.println(solution20.isValid(s));
    }
}
