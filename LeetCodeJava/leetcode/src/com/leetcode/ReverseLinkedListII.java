package com.leetcode;

/**
 * Created by qiudeyang on 19/10/16.
 */
class Solution92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0); // create a dummy node to mark the head of this list
        dummy.next = head;
        ListNode pre = dummy; // make a pointer pre as a marker for the node before reversing
        for(int i = 0; i<m-1; i++) pre = pre.next;

        ListNode start = pre.next; // a pointer to the beginning of a sub-list that will be reversed
        ListNode then = start.next; // a pointer to a node that will be reversed

        // 1 - 2 -3 - 4 - 5 ; m=2; n =4 ---> pre = 1, start = 2, then = 3
        // dummy-> 1 -> 2 -> 3 -> 4 -> 5

        for(int i=0; i<n-m; i++)
        {
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }

        // first reversing : dummy->1 - 3 - 2 - 4 - 5; pre = 1, start = 2, then = 4
        // second reversing: dummy->1 - 4 - 3 - 2 - 5; pre = 1, start = 2, then = 5 (finish)

        return dummy.next;
    }
}
public class ReverseLinkedListII {
    public static void main(String[] args) {
        Solution92 solution92 = new Solution92();
        LinkList list = new LinkList();
        for (int i = 1; i < 6; i++) {
            list.add(i);
        }
        ListNode temp = solution92.reverseBetween(list.head,2,4);
        ListNode current = temp;
        while(current != null){
            System.out.println(current.val);
            current = current.next;
        }
    }
}
