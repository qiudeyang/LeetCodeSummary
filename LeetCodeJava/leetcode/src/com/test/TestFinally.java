package com.test;

/**
 * Created by qiudeyang on 18/10/16.
 */
public class TestFinally {
    public void test1(){
        try{
            System.out.println("try block");
            System.exit(0);
        }catch (Exception e){
            System.out.println("catch block");
        }finally {
            System.out.println("finally block");
        }
    }
    public static void main(String[] args) {
        if (1==1){
            return;
        }
        new TestFinally().test1();
    }
}
