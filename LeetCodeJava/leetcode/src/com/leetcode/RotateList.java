package com.leetcode;

/**
 * Created by qiudeyang on 17/04/17.
 */
class Solution61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        int length = lengthOfListNode(head);
        k = k % length;
        if (k == 0) {
            return head;
        }
        int constant = length - k;
        ListNode current = head;
        int count = 1;
        while (current != null) {
            if (count == constant) {
                break;
            }
            current = current.next;
            count++;
        }
        ListNode lastNode = current;
        ListNode firstNode = current.next;
        while (current.next != null) {
            current = current.next;
        }
        lastNode.next = null;
        current.next = head;
        return firstNode;
    }

    public int lengthOfListNode(ListNode head) {
        ListNode current = head;
        int length = 0;
        while (current != null) {
            current = current.next;
            length++;
        }
        return length;
    }
}

public class RotateList {
    public static void main(String[] args) {
        Solution61 solution61 = new Solution61();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode result = solution61.rotateRight(head, 2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
