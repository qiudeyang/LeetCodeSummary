package com.leetcode;

/**
 * Created by qiudeyang on 02/07/17.
 */
//错排公式:首先我们知道f[1]=0,f[2]=1.然后当n大于等于三的时候我们考虑他们之间的关系。
//        将各个元素标号为1到n。那么我们考虑第n个元素，它的能力在于是将自己与前面的一个换位置，
//        也就是说它的前面可以是已经完成的错排或者是有一个元素没有错排。那么有两种情况：
//        1、前面有一个元素在本身的位置，这时最后一个元素必须选择同他交换。
//        没装错的可能是任意的一个，也就是有（n-1）*f[n-2]种
//        2、前面的已经排好了，这是最后一个可以随意交换，也就是(n-1)*f[n-1]
class Solution634 {
    public int findDerangement(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        long[] dp = new long[n + 1];
        dp[2] = 1;
        for (int i = 3; i < n + 1; i++) {
            dp[i] = (i - 1) * (dp[i - 1] + dp[i - 2]);
            if (dp[i] > (long) Math.pow(10, 9) + 7) {
                dp[i] = dp[i] % (long) (Math.pow(10, 9) + 7);
            }
        }
        return (int) (dp[n] % ((long) Math.pow(10, 9) + 7));
    }
}

public class FindTheDerangementOfAnArray {
    public static void main(String[] args) {
        Solution634 solution634 = new Solution634();
        System.out.println(solution634.findDerangement(23));
    }
}
