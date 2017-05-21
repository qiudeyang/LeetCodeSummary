package com.test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 15/11/16.
 */
public class TestMergeLinkedList {
    public static List<Integer> testMergeLinkedList(List<Integer> list1, List<Integer> list2) {
        Collections.sort(list1);
        Collections.sort(list2);
        List<Integer> list3 = new LinkedList<Integer>();
        int i = 0;
        int j = 0;
        while (i < list1.size() && j < list2.size()){
            if (list1.get(i) < list2.get(j)){
                list3.add(list1.get(i));
                i++;
            }else{
                list3.add(list2.get(j));
                j++;
            }
        }
        if (i != list1.size()){
            for (int k = i; k < list1.size() ; k++) {
                list3.add(list1.get(k));
            }
        }
        if (j != list2.size()){
            for (int k = j; k < list2.size() ; k++) {
                list3.add(list2.get(k));
            }
        }
        return list3;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<Integer>();
        List<Integer> list2 = new LinkedList<Integer>();
        list1.add(3);
        list1.add(4);
        list1.add(1);
        list2.add(5);
        list2.add(2);
        System.out.println(testMergeLinkedList(list1, list2));
    }
}
