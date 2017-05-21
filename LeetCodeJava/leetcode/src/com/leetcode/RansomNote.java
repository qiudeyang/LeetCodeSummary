package com.leetcode;

import java.util.Hashtable;

/**
 * Created by qiudeyang on 15/10/16.
 */
class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if ((ransomNote == null && magazine == null) || (ransomNote.length() == 0 && magazine.length() == 0)){
            return true;
        }
        if (magazine == null || magazine.length() == 0 || magazine.length() < ransomNote.length()){
            return false;
        }
        Hashtable<Character,Integer> table = new Hashtable<Character, Integer>();
        for (int i = 0; i < magazine.length(); i++) {
            if (!table.containsKey(magazine.charAt(i))){
                table.put(magazine.charAt(i),1);
            }else{
                table.put(magazine.charAt(i),table.get(magazine.charAt(i))+1);
            }
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (table.containsKey(ransomNote.charAt(i))){
                table.put(ransomNote.charAt(i),table.get(ransomNote.charAt(i))-1);
                if (table.get(ransomNote.charAt(i)) < 0){
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }
}
public class RansomNote {
    public static void main(String[] args) {
        Solution383 solution383 = new Solution383();
        String ransomNote = "";
        String magazine = "";
        System.out.println(ransomNote.length());
        System.out.println(solution383.canConstruct(ransomNote,magazine));
    }
}
