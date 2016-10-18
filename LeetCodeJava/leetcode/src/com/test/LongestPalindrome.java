package com.test;

/**
 * Created by qiudeyang on 09/10/16.
 */
import java.util.*;

class Solution409 {
    public int longestPalindrome(String s) {
        int[] array = new int[58];
        for (int i = 0; i < s.length(); i++) {
            array[s.charAt(i)-'A']++;
        }
        int oddNumber = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] % 2 == 1){
                oddNumber++;
            }
        }
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        if (oddNumber == 0 ||  oddNumber == 1){
            return result;
        }
        return result - oddNumber + 1;
    }
}
public class LongestPalindrome {
    public static void main(String[] args) {
        Solution409 solution409 = new Solution409();
        System.out.println(solution409.longestPalindrome("abccccdd"));
    }
}
