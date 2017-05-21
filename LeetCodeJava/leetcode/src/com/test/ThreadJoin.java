package com.test;

/**
 * Created by qiudeyang on 14/07/16.
 */
class MyThread1 extends Thread{
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println(this.getName()+"线程"+i+"次执行");
        }
    }
}
public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
        myThread1.join(1);
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName()+"线程"+i+"次执行");
        }
        System.out.println(Thread.interrupted());
    }
}
