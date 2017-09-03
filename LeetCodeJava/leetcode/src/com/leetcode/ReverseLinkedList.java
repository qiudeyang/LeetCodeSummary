package com.leetcode;

import java.util.LinkedList;
import java.util.List;

class Solution206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode reverseHead = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = reverseHead;
            reverseHead = current;
            current = next;
        }
        return reverseHead;
    }
}

public class ReverseLinkedList {

    public static void main(String[] args) {
        Solution206 solution206 = new Solution206();
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        ListNode reverseHead = solution206.reverseList(node);
        while (reverseHead != null) {
            System.out.println(reverseHead.val);
            reverseHead = reverseHead.next;
        }
    }

}
