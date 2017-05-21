package com.dp;

/**
 * Created by qiudeyang on 25/10/16.
 */
public class TestFeibonaqi {
    public int testFeibonaqi(int n){
        if (n==1 || n == 2){
            return 1;
        }
        return testFeibonaqi(n-1)+testFeibonaqi(n-2);
    }
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(new TestFeibonaqi().testFeibonaqi(40));
        System.out.println(System.currentTimeMillis() - a);
    }
}
