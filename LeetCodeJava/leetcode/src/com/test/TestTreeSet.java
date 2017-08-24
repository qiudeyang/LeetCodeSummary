package com.test;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by qiudeyang on 2017/8/20.
 */
class ExtendsThread extends Thread{
    public void run(){
        System.out.println("extends thread");
    }
}
class ImplementsRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("implements runnable");
    }
}
public class TestTreeSet {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1,10,5, TimeUnit.SECONDS,new LinkedBlockingDeque<>());
        threadPoolExecutor.execute(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        }));
        Thread thread = new ExtendsThread();
        Thread thread1  = new Thread(new ImplementsRunnable());
        thread.start();
        thread1.start();
    }
}
