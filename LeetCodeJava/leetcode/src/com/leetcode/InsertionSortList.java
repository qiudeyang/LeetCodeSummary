package com.leetcode;

/**
 * Created by qiudeyang on 19/10/16.
 */
class Solution147 {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode nextNode = head.next;
        while(current != null){
            int currentval = current.val;
            int nextval = current.next.val;
            if (currentval > nextval){

            }
        }
        return head;
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
        while(current != null){
            System.out.println(current.val);
            current = current.next;
        }
    }
}
