package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by qiudeyang on 2017/8/16.
 */
class Solution657 {
    public boolean judgeCircle(String moves) {
        if (moves == null || moves.length() == 0){
            return true;
        }
        if ((moves.length() & 1) == 1){
            return false;
        }
        int countLR = 0;
        int countUD = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i)=='L'){
                countLR++;
            }else if (moves.charAt(i)=='R'){
                countLR--;
            }else if (moves.charAt(i)=='U'){
                countUD++;
            }else{
                countUD--;
            }
        }
        return countLR == 0 && countUD == 0;
    }
}

public class JudgeRouteCircle {
    public static void main(String[] args) {
        Solution657 solution657 = new Solution657();
        System.out.println(solution657.judgeCircle("UD"));
    }
}
