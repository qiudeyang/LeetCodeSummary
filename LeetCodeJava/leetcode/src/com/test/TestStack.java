package com.test;

/**
 * Created by qiudeyang on 26/07/16.
 */
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        for (Integer x:stack) {
            System.out.println(x);
        }
        while(!stack.empty()){
            System.out.println(stack.pop());
        }


    }
}
