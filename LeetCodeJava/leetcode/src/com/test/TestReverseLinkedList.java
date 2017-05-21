package com.test;

/**
 * Created by qiudeyang on 07/11/16.
 */
public class TestReverseLinkedList {
    public static ListNode reverseLinkedList(ListNode node) {
        if (node == null) {
            return null;
        }
        ListNode reverseHead = null;
        ListNode current = node;
        while (current != null){
            ListNode temp = current.next;
            current.next = reverseHead;
            reverseHead = current;
            current = temp;
        }
        return reverseHead;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);

        ListNode result = reverseLinkedList(node);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }
}
