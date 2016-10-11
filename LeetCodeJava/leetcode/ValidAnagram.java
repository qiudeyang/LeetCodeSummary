package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by qiudeyang on 25/07/16.
 */
class Solution242 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] array = new int[26];
        for (int i = 0; i < s.length(); i++) {
            array[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            array[t.charAt(i)-'a']--;
            if (array[t.charAt(i)-'a'] < 0){
                return false;
            }
        }
        for(int i:array){
            if (i != 0){
                return false;
            }
        }
        return true;
    }
}
public class ValidAnagram {
    public static void main(String[] args) {
        Solution242 solution242 = new Solution242();
        String s = "aacc";
        String t = "ccac";
        System.out.println(solution242.isAnagram(s,t));
        System.out.println((4+"").length());
    }
}
