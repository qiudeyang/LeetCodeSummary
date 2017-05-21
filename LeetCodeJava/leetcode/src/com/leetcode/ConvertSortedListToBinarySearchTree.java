package com.leetcode;

/**
 * Created by qiudeyang on 01/04/17.
 */
class Solution109 {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        return helper(head, null);
    }

    public TreeNode helper(ListNode head, ListNode tail) {
        ListNode fast = head;
        ListNode slow = head;
        if (head == tail) {
            return null;
        }
        while (fast != tail && fast.next != tail) {
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode result = new TreeNode(slow.val);
        result.left = helper(head, slow);
        result.right = helper(slow.next, tail);
        return result;
    }
}

public class ConvertSortedListToBinarySearchTree {
    public static void main(String[] args) {
        Solution109 solution109 = new Solution109();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println(solution109.sortedListToBST(head).val);
    }
}
