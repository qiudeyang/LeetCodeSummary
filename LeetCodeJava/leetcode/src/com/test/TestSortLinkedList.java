package com.test;

import com.leetcode.IntegerBreak;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 15/11/16.
 */
public class TestSortLinkedList {
    public static ListNode testSortLinkedList(ListNode node) {
        if (node == null){
            return node;
        }
        List<Integer> list = new LinkedList<Integer>();
        ListNode current = node;
        while (current != null){
            list.add(current.val);
            current = current.next;
        }
        Collections.sort(list);
        ListNode helper = new ListNode(0);
        ListNode temp = helper;
        for (int i = 0; i < list.size(); i++) {
            temp.next = new ListNode(list.get(i));
            temp = temp.next;
        }
        return helper.next;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(3);
        node.next = new ListNode(1);
        node.next.next = new ListNode(2);
        ListNode result = testSortLinkedList(node);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
