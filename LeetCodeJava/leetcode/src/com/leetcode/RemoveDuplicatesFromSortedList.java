package com.leetcode;

/**
 * Created by qiudeyang on 03/04/17.
 */
class Solution83{
    public ListNode deleteDuplicates(ListNode head){
        ListNode current = head;
        while (current != null){
            ListNode nextNode = current.next;
            if (nextNode == null){
                break;
            }else{
                while (nextNode != null && nextNode.val == current.val){
                    nextNode = nextNode.next;
                }
                if (nextNode == null){
                    current.next = nextNode;
                }
                if (nextNode != null && nextNode.val != current.val){
                    current.next = nextNode;
                }
                current = nextNode;
            }
        }
        return head;
    }
}
public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        Solution83 solution83 = new Solution83();
        ListNode result = solution83.deleteDuplicates(head);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
