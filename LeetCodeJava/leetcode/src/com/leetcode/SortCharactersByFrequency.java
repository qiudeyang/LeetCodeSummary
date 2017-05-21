package com.leetcode;

import java.util.*;

/**
 * Created by qiudeyang on 02/11/16.
 */
class Solution451 {
    public String frequencySort(String s) {
        Map<Character,Integer>  map = new Hashtable<Character,Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        List<Character>  keyList = new ArrayList<>(map.keySet());
        List<Integer>  valueList = new ArrayList<>(map.values());
        Collections.sort(valueList,Collections.<Integer>reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (Integer v:valueList){
            for (Character c:keyList) {
                if (map.get(c) == v){
                    for (int i = 0; i < v; i++) {
                         sb.append(c);
                    }
                    map.remove(c);
                    break;
                }
            }
        }
        return sb.toString();
    }
}

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        Solution451 solution451 = new Solution451();
        String input = "Aabb";
        System.out.println(solution451.frequencySort(input));
    }
}
