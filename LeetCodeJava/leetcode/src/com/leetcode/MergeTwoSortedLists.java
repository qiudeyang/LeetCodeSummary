package com.leetcode;

/**
 * Created by qiudeyang on 17/10/16.
 */
class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null){
            return null;
        }
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }
        ListNode l3 = null;
        ListNode current = null;
        if (l1.val <= l2.val){
            l3 = l1;
            current = l1;
            l1 = l1.next;
        }else{
            l3 = l2;
            current = l2;
            l1 = l2.next;
        }
        while(l1 != null && l2 != null){
            if (l1.val <= l2.val){
                current.next = l1;
                current = current.next;
                l1 = l1.next;
            }else{
                current.next = l2;
                current = current.next;
                l2 = l2.next;
            }
        }
        if (l1 != null){
            current.next = l1;
        }
        if (l2 != null){
            current.next = l2;
        }
        return l3;
    }
}
public class MergeTwoSortedLists {
    public static void main(String[] args) {
        Solution21 solution21 = new Solution21();
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(3);
        node1.next.next = new ListNode(5);

        ListNode node2 = new ListNode(2);
        node2.next = new ListNode(4);
        node2.next.next = new ListNode(6);

        System.out.println(solution21.mergeTwoLists(node1,node2));

    }
}
