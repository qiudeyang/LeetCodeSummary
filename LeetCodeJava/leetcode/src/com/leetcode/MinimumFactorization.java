package com.leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 18/06/17.
 */
class Solution625 {
    public int smallestFactorization(int a) {
        List<Integer> list = new LinkedList<>();
        while (a>=10){
            int prevCur = a;
            for (int i = 9; i >= 1 ; i--) {
                if (a%i==0){
                    list.add(i);
                    a = a/i;
                    break;
                }
            }
            if (prevCur==a){
                return 0;
            }
        }
        list.add(a);
        Collections.sort(list);
        long result = 0;
        for (int i = 0; i < list.size(); i++) {
            result = result*10+list.get(i);
        }
        if (result>Integer.MAX_VALUE){
            return 0;
        }
        return (int)result;
    }
}

public class MinimumFactorization {
    public static void main(String[] args) {
        Solution625 solution625 = new Solution625();
        System.out.println(solution625.smallestFactorization(48));
    }
}
