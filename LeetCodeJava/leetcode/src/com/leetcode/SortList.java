package com.leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 15/11/16.
 */
class Solution148 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode fast = head.next.next;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode h2 = sortList(slow.next);
        slow.next = null;
        return merge(sortList(head),h2);
    }
    public ListNode merge(ListNode h1,ListNode h2){
        ListNode node = new ListNode(0);
        ListNode current = node;
        while (h1 != null && h2 != null) {
            if (h1.val < h2.val) {
                current.next = h1;
                h1 = h1.next;
            } else {
                current.next = h2;
                h2 = h2.next;
            }
            current = current.next;
        }
            if (h1 != null){
                current.next = h1;
                h1 = h1.next;
            }
            if (h2 != null){
                current.next = h2;
                h2 = h2.next;
            }
        return node.next;
    }
}

public class SortList {
    public static void main(String[] args) {
        Solution148 solution148 = new Solution148();
        ListNode node = new ListNode(4);
        node.next = new ListNode(3);
        node.next.next = new ListNode(2);
        ListNode result = solution148.sortList(node);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
