package com.test;

/**
 * Created by qiudeyang on 23/04/17.
 */
public class StartOfLoop {
    public static ListNode startOfLoop(ListNode node) {
        if (node == null) {
            return node;
        }
        ListNode slow = node;
        ListNode fast = node;
        while (fast != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                break;
            }
        }
        ListNode current = node;
        while (slow != null){
            if (current == slow){
                return current;
            }
            current = current.next;
            slow = slow.next;
        }
        return current;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = node;
//        node.next.next = new ListNode(3);
//        node.next.next.next = new ListNode(4);
//        node.next.next.next.next = node.next;
        System.out.println(startOfLoop(node).val);
    }
}
