package com.leetcode;

/**
 * Created by qiudeyang on 14/02/17.
 */
//求技能的累计时间
class Solution495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries == null || timeSeries.length == 0 || duration <= 0) {
            return 0;
        }
        int begin = timeSeries[0];
        int result = 0;
        for (int t:timeSeries){
            result += t < begin+duration?t-begin:duration;
            begin = t;
        }
        return result+duration;
    }
}

public class TeemoAttacking {
    public static void main(String[] args) {
        Solution495 solution495 = new Solution495();
        int[] timeSeries = {1,2,3,4,5,6,7,8,9};
        System.out.println(solution495.findPoisonedDuration(timeSeries, 5));
    }
}
