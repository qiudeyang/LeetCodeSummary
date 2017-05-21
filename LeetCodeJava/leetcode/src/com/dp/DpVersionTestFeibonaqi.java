package com.dp;

/**
 * Created by qiudeyang on 25/10/16.
 */
public class DpVersionTestFeibonaqi {
    public int testFeibonaqi(int n){
        if (n == 0){
            return 0;
        }else if (n == 1 || n == 2){
            return 1;
        }else{
            int[] feibonaqi = new int[n+1];
            feibonaqi[0]=0;
            feibonaqi[1]=1;
            feibonaqi[2]=1;
            for (int i = 3; i <=n ; i++) {
                feibonaqi[i]=feibonaqi[i-1]+feibonaqi[i-2];
            }
            return feibonaqi[n];
        }
    }
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(new TestFeibonaqi().testFeibonaqi(50));
        System.out.println(System.currentTimeMillis() - a);

    }
}
