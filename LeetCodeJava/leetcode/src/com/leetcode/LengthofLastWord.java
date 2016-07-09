package com.leetcode;

import java.util.Scanner;

/**
 * Created by qiudeyang on 16/06/16.
 */
class Solution58 {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        String lastWord = str[str.length-1];
        char[] array = lastWord.toCharArray();
        return array.length;
    }
}
public class LengthofLastWord {
    public static void main(String[] args) {
        Solution58 solution58 = new Solution58();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solution58.lengthOfLastWord(s));
    }
}
