package com.test;

/**
 * Created by qiudeyang on 11/02/17.
 */
public class TypeTransfer {
    public static void main(String[] args) {
        System.out.println(Math.pow(2,31));
        System.out.println((int)Math.pow(2,31));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Math.pow(-2,33));
        System.out.println((int)Math.pow(-2,33));
        System.out.println(Integer.MIN_VALUE);
    }
}
