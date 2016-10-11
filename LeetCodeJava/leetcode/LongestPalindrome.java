package com.leetcode;

/**
 * Created by qiudeyang on 09/10/16.
 */
import java.util.*;

class Solution409 {
    public int longestPalindrome(String s) {
        Hashtable<Character,Integer>  ht = new Hashtable<Character, Integer>();
        List<Integer> list1 = new LinkedList<Integer>();
        List<Integer> list2 = new LinkedList<Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (!ht.containsKey(s.charAt(i))){
                ht.put(s.charAt(i),1);
            }else{
                ht.put(s.charAt(i),ht.get(s.charAt(i))+1);
            }
        }
        Character key = null;
        Integer integ = null;
        Iterator iter = ht.keySet().iterator();
        while(iter.hasNext()){
            key = (Character)iter.next();
            integ = (Integer)ht.get(key);
            if (integ % 2 == 0){
                list1.add(integ);
            }else{
                list2.add(integ);
            }
        }
        int result = 0;
        for (int i = 0; i < list1.size(); i++) {
            result += list1.get(i);
        }
        if (list2.size() >= 1){
            for (int i = 0; i < list2.size(); i++) {
                result += list2.get(i);
            }
            return result - list2.size() + 1;
        }else{
            return result;
        }

    }
}
public class LongestPalindrome {
    public static void main(String[] args) {
        Solution409 solution409 = new Solution409();
        System.out.println(solution409.longestPalindrome("abccccdd"));
    }
}
