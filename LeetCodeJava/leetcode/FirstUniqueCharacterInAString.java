package com.leetcode;

import java.util.*;

/**
 * Created by qiudeyang on 09/10/16.
 */
class Solution387 {
    public int firstUniqChar(String s) {
        if(s == null || s.length() == 0){
            return -1;
        }
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        List<Character> list1 = new LinkedList<Character>();
        List<Integer> list2 = new LinkedList<Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),0);
            }
        }
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if (entry.getValue()==1){
                list1.add(entry.getKey());
            }
        }
        if (list1.size() >= 1){
            for (int i = 0; i < s.length(); i++) {
                if (list1.contains(s.charAt(i))){
                    list2.add(i);
                }
            }
            Collections.sort(list2);
            return list2.get(0);
        }
        return -1;
    }
}
public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        Solution387 solution387 = new Solution387();
        String s = "loveleetcode";
        System.out.println(solution387.firstUniqChar(s));
    }
}
