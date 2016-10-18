package com.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 08/10/16.
 */
class Solution389 {
    public char findTheDifference(String s, String t) {
       char[] array1 = s.toCharArray();
        char[] array2 = t.toCharArray();
        List<Integer> list = new LinkedList<Integer>();
        int c = 0;
        for (int i = 0; i < array1.length; i++) {
            list.add(array1[i]-'a');
        }
        for (int i = 0; i < array2.length; i++) {
            list.add(array2[i]-'a');
        }
        for (int i = 0; i < list.size(); i++) {
            c = c ^ list.get(i);
        }
        System.out.println(c);
        return (char) (c-0+'a');

    }
}
public class FindTheDifference {
    public static void main(String[] args) {
        Solution389 solution389 = new Solution389();
        String s = "abcd";
        String t = "abcde";
        System.out.println(solution389.findTheDifference(s,t));
    }
}
