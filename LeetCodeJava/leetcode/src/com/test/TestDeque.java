package com.test;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by qiudeyang on 12/10/16.
 */
public class TestDeque {

    public static void main(String[] args) {
        Deque<Integer>  deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        System.out.println(deque);
        System.out.println(deque.contains(2));
    }
}
