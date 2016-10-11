package com.leetcode;

import java.util.Stack;

/**
 * Created by qiudeyang on 25/07/16.
 */
class MyQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    // Push element x to the back of queue.
    public void push(int x) {
       while(!stack1.empty()){
           stack2.push(stack1.pop());
       }
        stack1.push(x);
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }
    }

    // Removes the element from in front of queue.
    public void pop() {
        stack1.pop();
    }

    // Get the front element.
    public int peek() {
        return stack1.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack1.empty();
    }
}
public class ImplementQueueUsingStacks {
    public static void main(String[] args) {

    }
}
