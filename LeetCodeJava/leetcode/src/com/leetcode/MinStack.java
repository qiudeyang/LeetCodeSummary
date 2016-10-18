package com.leetcode;

/**
 * Created by qiudeyang on 26/07/16.
 */

import java.util.Stack;

class MinStack123 {
    Stack<Integer> stack;
    int min;

    public MinStack123() {
        stack = new Stack<Integer>();
    }

    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push(0);
            min = x;
        } else {
            stack.push(x - min);
            if (x < min) {
                min = x;
            }
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        int pop = stack.pop();
        if (pop < 0) {
            min = min - pop;
        }
    }

    public int top() {
        int top = stack.peek();
        if (top > 0) {
            return top + min;
        } else {
            return min;
        }
    }

    public int getMin() {
        return min;
    }
}

public class MinStack {
    public static void main(String[] args) {
        MinStack123 minStack123 = new MinStack123();
        minStack123.push(-2);
        minStack123.push(0);
        minStack123.push(-3);
        System.out.println(minStack123.getMin());
        minStack123.pop();
        System.out.println(minStack123.top());
        System.out.println(minStack123.getMin());
    }
}
