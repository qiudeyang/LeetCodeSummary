package com.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by qiudeyang on 19/04/17.
 */
class Solution23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length < 1) {
            return null;
        }
        Queue<ListNode> queue = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                if (o1.val < o2.val) {
                    return -1;
                } else if (o1.val == o2.val) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });
        for (ListNode list : lists) {
            if (list != null) {
                queue.add(list);
            }
        }
        ListNode result = new ListNode(0);
        ListNode temp = result;
        while (!queue.isEmpty()) {
            temp.next = queue.poll();
            temp = temp.next;
            if (temp.next != null) {
                queue.offer(temp.next);
            }
        }
        return result.next;
    }
}

public class MergekSortedLists {
    public static void main(String[] args) {
        Solution23 solution23 = new Solution23();
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);
        ListNode[] lists = {list1, list2};
        ListNode result = solution23.mergeKLists(lists);
        while (result != null){
            System.out.print(result.val+"\t");
            result = result.next;
        }
    }
}
