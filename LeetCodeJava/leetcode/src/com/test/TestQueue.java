package com.test;

/**
 * Created by qiudeyang on 26/07/16.
 */
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.ArrayDeque;

public class TestQueue {
    public static void main(String[] args) {
        Queue<Integer>  queue = new LinkedList<>();
        System.out.println(queue.add(1));
        System.out.println(queue.offer(2));
//        System.out.println(queue);
        for(Integer x:queue){
            System.out.println(x);
        }
        while(queue.poll() != null){
            System.out.println(queue.peek());
        }

    }
}
