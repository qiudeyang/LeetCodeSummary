package com.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by qiudeyang on 18/10/16.
 */
class Solution141 {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode first = head;
        ListNode second = head;
        while(second != null && second.next != null){
            first = first.next;
            second = second.next.next;
            if(first == second){
                return true;
            }
        }
        return false;
    }
    //以下是用集合来判断是否有环，不过空间复杂度为n
    public boolean hasCycle1(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        Set<ListNode> set = new HashSet<ListNode>();
        ListNode current = head;
        while(current != null){
            if (set.contains(current)){
                return true;
            }else{
                set.add(current);
            }
            current = current.next;
        }
        return false;
    }

}
public class LinkedListCycle {
    public static void main(String[] args) {
        Solution141 solution141 = new Solution141();
        LinkList list = new LinkList();
        for (int i = 0; i < 3; i++) {
            list.add(i);
        }
        list.add(list.head);
        System.out.println(solution141.hasCycle1(list.head));
    }
}
