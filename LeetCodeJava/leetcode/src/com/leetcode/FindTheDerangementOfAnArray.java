package com.leetcode;

/**
 * Created by qiudeyang on 02/07/17.
 */
//���Ź�ʽ:��������֪��f[1]=0,f[2]=1.Ȼ��n���ڵ�������ʱ�����ǿ�������֮��Ĺ�ϵ��
//        ������Ԫ�ر��Ϊ1��n����ô���ǿ��ǵ�n��Ԫ�أ��������������ǽ��Լ���ǰ���һ����λ�ã�
//        Ҳ����˵����ǰ��������Ѿ���ɵĴ��Ż�������һ��Ԫ��û�д��š���ô�����������
//        1��ǰ����һ��Ԫ���ڱ����λ�ã���ʱ���һ��Ԫ�ر���ѡ��ͬ��������
//        ûװ��Ŀ����������һ����Ҳ�����У�n-1��*f[n-2]��
//        2��ǰ����Ѿ��ź��ˣ��������һ���������⽻����Ҳ����(n-1)*f[n-1]
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
