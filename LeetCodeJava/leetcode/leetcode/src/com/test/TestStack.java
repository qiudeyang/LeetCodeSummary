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
        List<Integer>  list = new LinkedList<Integer>();
        System.out.println(stack.empty());
        System.out.println(stack.push(2));
        System.out.println(stack.push(3));
        while(!stack.empty()){
            list.add(stack.pop());
        }
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
//        System.out.println(stack);
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.empty());
//        System.out.println(stack.search(2));
//        System.out.println(stack);


    }
}
