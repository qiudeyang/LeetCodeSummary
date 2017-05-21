package com.test;

import java.util.*;

/**
 * Created by qiudeyang on 15/06/16.
 */

public class RemoveDuplicatesfromSortedList {
    public static void rd(List list) {
        Map<Integer,Integer>  map = new LinkedHashMap<Integer, Integer>();
        List<Integer>  list1 = new LinkedList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            map.put((int)list.get(i),1);
//            System.out.println(list.get(i));
        }
        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            list1.add(entry.getKey());
        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }



    public static void main(String[] args) {
        List<Integer>  list = new LinkedList<Integer>();
        list.add(2);
        list.add(1);
        list.add(2);
        Collections.sort(list);
        rd(list);
    }
}
