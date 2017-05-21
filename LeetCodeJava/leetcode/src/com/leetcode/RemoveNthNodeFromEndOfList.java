package com.leetcode;

/**
 * Created by qiudeyang on 19/10/16.
 */
class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n == 0){
            return head;
        }
        if (head.next == null && n == 1){
            return null;
        }
        ListNode first = head;
        ListNode second = head;
        ListNode current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        if (n == 1){
            ListNode third = head;
            for (int i = 0; i < count - 2; i++) {
                third = third.next;
            }
            third.next = null;
            return head;
        }
        System.out.println("hello");
        for (int i = 0; i < n - 1; i++) {
            second = second.next;
        }
        while(second.next != null){
            first = first.next;
            second = second.next;
        }
        if (n == 2){
            first.val = first.next.val;
            first.next = null;
        }
        if(first.next != null && first.next.next != null){
            first.val = first.next.val;
            first.next = first.next.next;
        }
        return head;
    }
}
public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        Solution19 solution19 = new Solution19();
        LinkList list = new LinkList();
        for (int i = 1; i < 3; i++) {
            list.add(i);
        }
        ListNode head = solution19.removeNthFromEnd(list.head,1);
        ListNode current = head;
        while(current != null){
            System.out.println(current.val);
            current = current.next;
        }
//        System.out.println(solution19.removeNthFromEnd(list.head,2).val);
    }
}
