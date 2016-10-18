package com.test;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 17/10/16.
 */
public class TestLinkedList {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        List<Integer> list = new LinkedList<>();
        int count = 0;
        while(l1 != null){
            System.out.println(l1.val);
            list.add(l1.val);
            l1 = l1.next;
            count++;
        }
        ListNode l2 = null;
        for (int i = list.size()-1; i >= 0 ; i--) {
            l2 = new ListNode(list.get(i));
            l2 = l2.next;
        }

//        System.out.println(count);
//        int k = 3;
//        System.out.println(new ListNode(list.get(list.size()-k)));

    }
}
