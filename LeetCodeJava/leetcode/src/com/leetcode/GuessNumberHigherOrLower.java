package com.leetcode;

import java.util.Arrays;

/**
 * Created by qiudeyang on 19/10/16.
 */
class GuessGame{
    public int guess(int num){
        int picknumber = 6;
        if (num < picknumber){
            return -1;
        }else if(num > picknumber){
            return 1;
        }else{
            return 0;
        }
    }
}
class Solution374 extends GuessGame {
    public int guessNumber(int n) {
        if (guess(n) == 0){
            return n;
        }
        int i = 1;
        int j = n;
        while(i < j){
            int mid = i + (j-i)/2;
            if (guess(mid) == 0){
                return mid;
            }else if(guess(mid) > 0){
                i = mid + 1;
            }else{
                j = mid;
            }
        }
        return i;
    }
}
public class GuessNumberHigherOrLower {
    public static void main(String[] args) {
        Solution374 solution374 = new Solution374();
        System.out.println(solution374.guessNumber(10));
    }
}
