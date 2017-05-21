package com.test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 16/06/16.
 */
public class RemoveDuplicatesList {
    public static void removeDuplicatesList(List list){
        List<Integer> list1 = new LinkedList<Integer>();
        for (Object i:list){
            if (Collections.frequency(list,i) < 1){
                list1.add(Integer.parseInt(i.toString()));
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }
    public static void main(String[] args) {
        RemoveDuplicatesList  rdl = new RemoveDuplicatesList();
        List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(2);
        rdl.removeDuplicatesList(list);
    }
}
