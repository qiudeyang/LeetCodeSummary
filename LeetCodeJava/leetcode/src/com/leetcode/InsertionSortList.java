package com.leetcode;

/**
 * Created by qiudeyang on 19/10/16.
 */
class Solution147 {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode helper = new ListNode(0);
        ListNode current = head;
        ListNode pre = helper;
        ListNode next = null;
        while (current != null){
            next = current.next;
            while (pre.next != null && pre.next.val < current.val){
                pre = pre.next;
            }
            current.next = pre.next;
            pre.next = current;
            pre=helper;
            current = next;
        }
        return helper.next;
    }
}

public class InsertionSortList {
    public static void main(String[] args) {
        Solution147 solution147 = new Solution147();
        LinkList list = new LinkList();
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(3);
        ListNode current = solution147.insertionSortList(list.head);
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }
}
