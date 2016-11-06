package com.test;

/**
 * Created by qiudeyang on 06/11/16.
 */
public class TestInteger {
    public static void main(String[] args) {
        String a = "1,2,3";
        String[] array = a.split(",");
        int s = 0;
        for (int i = 0; i < array.length;i++) {
            s = s * 10  + Integer.parseInt(array[i]);
        }
        System.out.println(s);
    }
}
