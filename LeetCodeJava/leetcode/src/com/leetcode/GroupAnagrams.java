package com.leetcode;

import java.util.*;

/**
 * Created by qiudeyang on 24/10/16.
 */
class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new LinkedList<List<String>>();
        }
        Map<String, List<String>> map = new Hashtable<String, List<String>>();
        for (String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String keyStr = String.valueOf(ch);
            if (!map.containsKey(keyStr)) {
                map.put(keyStr, new LinkedList<String>());
            } else {
                map.get(keyStr).add(s);
            }
        }
        return new LinkedList<List<String>>(map.values());
//        for (int i = 0; i < temp.size() - 1 ; i++) {
//            for (int j = i+1; j < temp.size(); j++) {
//                if (isAnagram(temp.get(i),temp.get(j)) && temp.get(j) != null){
//                    list.add(temp.get(j));这句话为何会报空指针异常
//                    if (j == temp.size() - 1){
//                        list.add(temp.get(i));
//                    }
//                }
//            }
//            result.add(list);
//            list = null;
//        }

    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] array1 = new int[26];
        int[] array2 = new int[26];
        for (int i = 0; i < s.length(); i++) {
            array1[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            array2[t.charAt(i) - 'a']++;
        }
        if (Arrays.equals(array1, array2)) {
            return true;
        } else {
            return false;
        }
    }
}

public class GroupAnagrams {
    public static void main(String[] args) {
        Solution49 solution49 = new Solution49();
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(solution49.groupAnagrams(str));
    }
}
