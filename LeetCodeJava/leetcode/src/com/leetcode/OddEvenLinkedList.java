package com.leetcode;

/**
 * Created by qiudeyang on 18/10/16.
 */

import com.leetcode.LinkList;
import com.leetcode.ListNode;

class Solution328 {
    public ListNode oddEvenList(ListNode head) {
        if (head != null) {

            ListNode odd = head, even = head.next, evenHead = even;

            while (even != null && even.next != null) {
                odd.next = odd.next.next;
                even.next = even.next.next;
                odd = odd.next;
                even = even.next;
            }
            odd.next = evenHead;
        }
        return head;
    }
}

public class OddEvenLinkedList {
    public static void main(String[] args) {
        Solution328 solution328 = new Solution328();
        LinkList list = new LinkList();
        for (int i = 1; i < 6; i++) {
            list.add(i);
        }
        ListNode newNode = solution328.oddEvenList(list.head);
        ListNode current = newNode;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }

    }
}
