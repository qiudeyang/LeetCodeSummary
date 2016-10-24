package com.leetcode;

import java.util.*;

/**
 * Created by qiudeyang on 24/10/16.
 */
class Solution187 {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set = new HashSet<String>();
        Set<String> repeated = new HashSet<String>();
        for (int i = 0; i < s.length() - 9; i++) {
            String temp = s.substring(i,i+10);
            if (!set.add(temp)){
                repeated.add(temp);
            }
        }
        return new LinkedList<>(repeated);
    }
}

public class RepeatedDNASequences {
    public static void main(String[] args) {
        Solution187 solution187 = new Solution187();
        String s = "AAAAAAAAAAAA";
        String s1 = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println((solution187.findRepeatedDnaSequences(s)));
    }
}
