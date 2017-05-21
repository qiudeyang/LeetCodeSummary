package com.leetcode;

/**
 * Created by qiudeyang on 18/10/16.
 */
class Solution142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode first = head;
        ListNode second = head;
        boolean flag = false;
        ListNode temp = null;
        int cycleLength = 0;
        int length = 0;
        while (second != null && second.next != null) {
            first = first.next;
            second = second.next.next;
            if (first == second) {
                flag = true;
                temp = first;
                break;
            }
        }
        while (temp != null) {
            temp = temp.next;
            cycleLength++;
            if (temp == first) {
                length = cycleLength;
                break;
            }
        }
        if (flag) {
            ListNode first1 = head;
            ListNode second1 = head;
            for (int i = 0; i < length; i++) {
                second1 = second1.next;
            }
            if (first1 == second1) {
                return first1;
            }
            while (first1 != null && second1 != null) {
                first1 = first1.next;
                second1 = second1.next;
                if (first1 == second1) {
                    return first1;
                }
            }
        }
        return null;
    }

    //以下是leetcode推荐的做法
    public ListNode detectCycle1(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                ListNode temp = head;
                while (temp != slow) {
                    slow = slow.next;
                    temp = temp.next;
                }
            }
            return slow;
        }
        return null;
    }

}

public class LinkedListCycleII {
    public static void main(String[] args) {
        Solution142 solution142 = new Solution142();
        LinkList list = new LinkList();
        for (int i = 0; i < 3; i++) {
            list.add(i);
        }
        list.add(list.head.next);
        System.out.println(solution142.detectCycle1(list.head).val);
    }
}
