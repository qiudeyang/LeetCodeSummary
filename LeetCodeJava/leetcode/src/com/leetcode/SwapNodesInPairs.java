package com.leetcode;

/**
 * Created by qiudeyang on 18/10/16.
 */
class Solution24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode swapPairsHead = head.next;
        head.next = swapPairs(head.next.next);
        swapPairsHead.next = head;
        return swapPairsHead;
    }
}

public class SwapNodesInPairs {
    public static void main(String[] args) {
        Solution24 solution24 = new Solution24();
        LinkList list = new LinkList();
        for (int i = 0; i < 4; i++) {
            list.add(i);
        }
        ListNode node = solution24.swapPairs(list.head);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
