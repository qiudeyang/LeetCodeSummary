package com.leetcode;

/**
 * Created by qiudeyang on 26/07/16.
 */
import java.util.Queue;
import java.util.LinkedList;
class MyStack {
        Queue<Integer>  list1 = new LinkedList<Integer>();
        Integer topOfElement = null;
// Push element x onto stack.
public void push(int x) {
        topOfElement = x;
        list1.offer(x);
        }

// Removes the element on top of the stack.
public void pop() {
        Integer element = null;
        for(int i = 0,size = list1.size()-1;i < size;i++){
        element = list1.poll();
        list1.offer(element);
        }
        topOfElement = element;
        list1.poll();
        }

// Get the top element.
public int top() {
        return topOfElement;
        }

// Return whether the stack is empty.
public boolean empty() {
        return list1.size() == 0;
        }
        }
public class ImplementStackUsingQueues {
    public static void main(String[] args) {

    }
}
