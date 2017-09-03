package com.test;

import java.util.*;

/**
 * Created by qiudeyang on 2017/8/19.
 */
public class TestMapIterator {
    public static void main(String[] args) {
         Map<String,Integer> map = new HashMap<>();
         map.put("a",1);
         map.put("b",2);
         map.put("c",3);
         map.putIfAbsent("a",3);
         map.putIfAbsent("d",4);
         Set<String> set = map.keySet();
         for (String temp:set){
             System.out.print(temp+"\t");
         }
        System.out.println();
         Collection<Integer> collection = map.values();
         for (Integer temp:collection){
             System.out.print(temp+"\t");
         }
        System.out.println();
        System.out.println(map.isEmpty());
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> entry = (Map.Entry)iterator.next();
            System.out.println(entry.getKey()+"=="+entry.getValue());
        }
    }
}
