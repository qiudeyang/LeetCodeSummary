package com.leetcode;

/**
 * Created by qiudeyang on 16/03/17.
 */
class Solution541 {
    public String reverseStr(String s, int k) {
        if (s == null || s.length() < 1 || k <= 1) {
            return s;
        }
        int i = 0;
        char[] array = s.toCharArray();
        while (i < array.length) {
            helper(i, array, k);
            i += 2 * k;
        }
        return new String(array);
    }

    public void helper(int i, char[] array, int k) {
        int j = i;
        if (i + k > array.length) {
            j = array.length - 1;
        } else {
            j = i + k - 1;
        }
        while (i < j) {
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}

public class ReverseStringII {
    public static void main(String[] args) {
        Solution541 solution541 = new Solution541();
        System.out.println(solution541.reverseStr("abcdefg", 2));
    }
}
