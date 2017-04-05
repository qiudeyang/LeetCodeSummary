package com.leetcode;

/**
 * Created by qiudeyang on 03/04/17.
 */
class Solution82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null){
            return head;
        }
        ListNode current = head;
        if (current.next != null && current.val == current.next.val){
            while (current.next != null && current.val == current.next.val){
                current = current.next;
            }
            return deleteDuplicates(current.next);
        }else{
            current.next = deleteDuplicates(current.next);
        }
        return head;
    }

}

public class RemoveDuplicatesFromSortedListII {
    public static void main(String[] args) {
        Solution82 solution82 = new Solution82();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);
        ListNode result = solution82.deleteDuplicates(head);
        while (result != null) {
            System.out.print(result.val + "\t");
            result = result.next;
        }
    }
}
