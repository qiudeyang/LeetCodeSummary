package com.leetcode;

/**
 * Created by qiudeyang on 26/10/16.
 */
class Solution70 {
    public int climbStairs(int n) {
          if (n == 0 || n == 1|| n == 2){
              return n;
          }else{
              int[] array = new int[n+1];
              array[0] = 0;
              array[1] = 1;
              array[2] = 2;
              for (int i = 3; i <= n ; i++) {
                  array[i] = array[i-1] + array[i-2];
              }
              return array[n];
          }
    }
}
public class ClimbingStairs {
    public static void main(String[] args) {
        Solution70 solution70 = new Solution70();
        System.out.println(solution70.climbStairs(5));
    }
}
