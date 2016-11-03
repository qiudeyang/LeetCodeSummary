package com.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 03/11/16.
 */
class Solution234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null){
            return true;
        }
        ListNode mid = findMid(head);
        ListNode pre = reverse(mid.next);
        while (pre != null){
            if (head.val != pre.val){
                return false;
            }
            head = head.next;
            pre = pre.next;
        }
        return true;

    }
    public ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (slow != null && slow.next != null && fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode current = head;
        while (current != null){
            ListNode next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }
}
public class PalindromeLinkedList {
    public static void main(String[] args) {
        Solution234 solution234 = new Solution234();
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(1);
        System.out.println(solution234.isPalindrome(node));
    }
}
