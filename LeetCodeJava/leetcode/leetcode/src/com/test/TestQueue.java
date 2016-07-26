package com.test;

/**
 * Created by qiudeyang on 26/07/16.
 */
import java.util.Queue;
import java.util.ArrayDeque;

public class TestQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<Integer>();
        System.out.println(queue.offer(2));
        System.out.println(queue.offer(3));
//        System.out.println(queue);
//        System.out.println(queue.toArray().toString());
//        System.out.println(queue.size());
        System.out.println(queue.element());
//        System.out.println(queue.poll());
//        System.out.println(queue.peek());
//        System.out.println(queue.remove());
//        System.out.println(queue.isEmpty());


    }
}
