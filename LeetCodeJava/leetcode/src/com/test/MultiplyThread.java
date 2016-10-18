package com.test;

/**
 * Created by qiudeyang on 14/07/16.
 */
class MyThread extends Thread{
    public MyThread(String name,int pro){
        super(name);
        this.setPriority(pro);
    }
    public void run(){
        for (int i = 0; i < 30; i++) {
            System.out.println(this.getName()+"线程第"+i+"次执行！");
            if (i % 5 == 0){
                Thread.yield();
            }
        }
    }
}
public class MultiplyThread {
    public static void main(String[] args) throws InterruptedException {
        new MyThread("低级",1).start();
        new MyThread("中级",5).start();
        new MyThread("高级",10).start();
//        for (int i = 0; i < 10; i++) {
//            Thread.sleep(1000);
//            System.out.println("main"+i);
//        }
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());
//        System.out.println(Thread.MAX_PRIORITY);
//        System.out.println(Thread.MIN_PRIORITY);
//        System.out.println(Thread.NORM_PRIORITY);
//        Thread  thread = new Thread();
//        thread.start();
//        try {
//            thread.sleep(3000);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        thread.start();
//        System.out.println("hello world");

    }
}
