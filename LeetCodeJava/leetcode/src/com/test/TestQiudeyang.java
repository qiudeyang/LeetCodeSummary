package com.test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by qiudeyang on 11/02/17.
 */
public class TestQiudeyang {
    public static String[] help(String[] words){
        String[] strs = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        List<String> list = new LinkedList<String>();
        for (int i = 0; i < strs.length; i++) {
            for (char c:strs[i].toCharArray()){
                map.put(c,i);
            }
        }
        for (int i = 0; i < words.length; i++) {
            if (words[i]==" "){
                continue;
            }
            int index = map.get(words[i].toUpperCase().charAt(0));
            for (char c:words[i].toUpperCase().toCharArray()){
                if (map.get(c) != index){
                    index = -1;
                    break;
                }
            }
            if (index != -1){
                list.add(words[i]);
            }
        }
        return list.toArray(new String[0]);
    }
    public static void main(String[] args) {
        String[] result = help(new String[]{"weq","edc"});
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
