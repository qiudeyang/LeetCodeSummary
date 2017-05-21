package com.test;

/**
 * Created by qiudeyang on 17/03/17.
 */
public class JosephCircle {
    public static int helper(int n, int m) {
        if (n < 1 || m < 1) {
            return -1;
        }
        int last = 0;
        for (int i = 2; i <= n ; i++) {
            last = (last+m)%i;
        }
        return last;
    }

    public static void main(String[] args) {
        System.out.println(helper(40,3));
    }
}
