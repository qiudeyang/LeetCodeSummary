package com.leetcode;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 24/10/16.
 */
class Solution438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new LinkedList<Integer>();
        if (s == null || s.length() < p.length()) {
            return list;
        }
        int pLength = p.length();
        for (int i = 0; i < s.length() - pLength + 1; i++) {
            String temp = s.substring(i, i + pLength);
            if (validAnagram(temp,p)){
                list.add(i);
            }
        }
        return list;

    }

    public boolean validAnagram(String s, String p) {
        Hashtable<Character,Integer>  table1 = new Hashtable<Character,Integer>();
        Hashtable<Character,Integer>  table2 = new Hashtable<Character,Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (table1.containsKey(s.charAt(i))){
                table1.put(s.charAt(i),table1.get(s.charAt(i))+1);
            }else{
                table1.put(s.charAt(i),1);
            }
        }
        for (int i = 0; i < p.length(); i++) {
            if (table2.containsKey(p.charAt(i))){
                table2.put(p.charAt(i),table2.get(p.charAt(i))+1);
            }else{
                table2.put(p.charAt(i),1);
            }
        }
        if (table1.equals(table2)){
            return true;
        }else{
            return false;
        }
    }
}

public class FindAllAnagramsInAString {
    public static void main(String[] args) {
        Solution438 solution438 = new Solution438();
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(solution438.findAnagrams(s, p));
    }
}
