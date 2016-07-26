package com.test;

/**
 * Created by qiudeyang on 26/07/16.
 */
public class TestReverse {
    public static void main(String[] args) {
        String s = "qiu de yang";
        StringBuffer sb = null;
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            sb = new StringBuffer(str[i]);
            sb.reverse();
            str[i] = sb.toString();
        }
        s = "";
        for (int i = 0; i < str.length; i++) {
             s += str[i]+" ";
        }
        System.out.println(s);
    }
}
