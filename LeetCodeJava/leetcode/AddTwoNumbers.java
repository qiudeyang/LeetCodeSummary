package com.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 08/10/16.
 */
class Solution2 {
    public LinkedList addTwoNumbers(LinkedList l1, LinkedList l2) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < l1.size(); i++) {
            a += (int)l1.get(i) * (int)Math.pow(10,i);
        }
        for (int i = 0; i < l2.size(); i++) {
            b += (int)l2.get(i) * (int)Math.pow(10,i);
        }
        int c = a+b;
        System.out.println(c);
        LinkedList l3 = new LinkedList();
        char[] array = (c+"").toCharArray();
        for (int i = array.length-1; i >= 0; i--) {
            l3.add(array[i]);
        }
        return l3;
    }
}
public class AddTwoNumbers {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        list1.add(2);
        list1.add(4);
        list1.add(3);
        list2.add(5);
        list2.add(6);
        list2.add(4);
        System.out.println( solution2.addTwoNumbers(list1,list2));
    }
}
