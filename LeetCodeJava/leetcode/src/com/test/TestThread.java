package com.test;

/**
 * Created by qiudeyang on 17/04/17.
 */

public class TestThread {
    int a = 1;
    public static void main(String[] args) throws InterruptedException{
        new TestThread().helper();

    }
    public void helper()throws InterruptedException{
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        threadB.start();

        threadA.start();

        Thread.sleep(1000);
        System.out.println(a);
    }
    class ThreadA extends Thread{
        @Override
        public void run() {
           a = 2;
        }
    }
    class ThreadB extends Thread{
        @Override
        public void run() {
            a = a * 2;
        }
    }

}
