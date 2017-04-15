package com.test;

/**
 * Created by qiudeyang on 14/04/17.
 */
public class ReverseListNode {
    public static ListNode reverseHeadRecurivly(ListNode node){
        if (node == null || node.next == null){
            return node;
        }
        ListNode nextNode = node.next;
        node.next = null;
        ListNode result = reverseHeadRecurivly(nextNode);
        nextNode.next = node;
        return result;
    }
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        ListNode result = reverseHeadRecurivly(node);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
