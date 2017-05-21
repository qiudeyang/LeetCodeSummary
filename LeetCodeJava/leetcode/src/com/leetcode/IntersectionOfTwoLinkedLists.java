package com.leetcode;

/**
 * Created by qiudeyang on 02/11/16.
 */
class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null){
            return null;
        }
        int lengthA = length(headA);
        int lengthB = length(headB);
        int lengthDiff = 0;
        ListNode longHead;
        ListNode shortHead;
        if (lengthA > lengthB){
            longHead = headA;
            shortHead = headB;
            lengthDiff = lengthA - lengthB;
        }else{
            longHead = headB;
            shortHead = headA;
            lengthDiff = lengthB - lengthA;
        }
        for (int i = 0; i < lengthDiff; i++) {
            longHead = longHead.next;
        }
        while (longHead != null && shortHead != null){
            if (longHead == shortHead){
                return longHead;
            }
            longHead = longHead.next;
            shortHead = shortHead.next;
        }
        return null;

    }
    public int length(ListNode node){
        int count = 0;
        ListNode current = node;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }
}
public class IntersectionOfTwoLinkedLists {
    public static void main(String[] args) {
        Solution160 solution160 = new Solution160();
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);
        headA.next.next.next = new ListNode(4);
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(2);
        headB.next.next = new ListNode(3);
        headB.next.next.next = new ListNode(4);
        System.out.println(solution160.getIntersectionNode(headA,headB).val);
    }
}
