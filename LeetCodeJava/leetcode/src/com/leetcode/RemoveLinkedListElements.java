package com.leetcode;

/**
 * Created by qiudeyang on 19/10/16.
 */
class Solution203 {
    //这是递归的解法
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        head.next = removeElements(head.next,val);
        return head.val == val ?head.next:head;
    }
    //这是遍历的解法
    public ListNode removeElements1(ListNode head,int val){
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode curr = head, prev = fakeHead;
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = prev.next;
            }
            curr = curr.next;
        }
        return fakeHead.next;
    }
}
public class RemoveLinkedListElements {
    public static void main(String[] args) {
        Solution203 solution203 = new Solution203();
        LinkList list = new LinkList();
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(5);
        list.add(6);
        ListNode current = solution203.removeElements1(list.head,6);
        while(current != null){
            System.out.println(current.val);
            current = current.next;
        }
    }
}
