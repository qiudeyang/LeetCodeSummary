package com.test;

/**
 * Created by qiudeyang on 16/03/17.
 */
public class ReverseLinkNode {
    public static ListNode reverseListNode(ListNode node) {
        if (node == null || node.next == null){
            return node;
        }
        ListNode current = node;
        ListNode nextNode;
        ListNode reverseHead = null;
        while (current != null){
            nextNode = current.next;
            current.next = reverseHead;
            reverseHead = current;
            current = nextNode;
        }
        return reverseHead;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        ListNode temp = reverseListNode(node);
        while (temp != null) {
            System.out.print(temp.val + "\t");
            temp = temp.next;
        }
    }
}
