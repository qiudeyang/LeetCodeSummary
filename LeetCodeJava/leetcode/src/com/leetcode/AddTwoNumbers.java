package com.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by qiudeyang on 08/10/16.
 */
class Solution2 {
    //方法1使用了O(n)空间消耗
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null){
            return null;
        }
        List<Integer> list = new LinkedList<Integer>();
        int flag = 0;
        while (l1 != null && l2 != null){
            int result = l1.val + l2.val +flag;
            list.add(result%10);
            if (result >= 10){
                flag = 1;
            }else{
                flag = 0;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null){
            int result = l1.val+flag;
            list.add(result%10);
            if (result >= 10){
                flag = 1;
            }else{
                flag = 0;
            }
            l1 = l1.next;
        }
        while (l2 != null){
            int result = l2.val +flag;
            list.add(result%10);
            if (result >= 10){
                flag = 1;
            }else{
                flag = 0;
            }
            l2 = l2.next;
        }
        ListNode result = new ListNode(list.get(0));
        ListNode temp = result;
        for (int i = 1; i < list.size(); i++) {
            temp.next = new ListNode(list.get(i));
            temp = temp.next;
        }
        if (flag == 1){
            temp.next = new ListNode(1);
        }
        return result;
    }
    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null){
            return null;
        }
        int flag = 0;
        ListNode result = new ListNode(0);
        ListNode temp = result;
        while (l1 != null && l2 != null){
            int temp1 = l1.val + l2.val +flag;
            temp.next = new ListNode(temp1%10);
            temp = temp.next;
            if (temp1 >= 10){
                flag = 1;
            }else{
                flag = 0;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null){
            int temp1 = l1.val+flag;
            temp.next = new ListNode(temp1%10);
            temp = temp.next;
            if (temp1 >= 10){
                flag = 1;
            }else{
                flag = 0;
            }
            l1 = l1.next;
        }
        while (l2 != null){
            int temp1 = l2.val +flag;
            temp.next = new ListNode(temp1%10);
            temp = temp.next;
            if (temp1 >= 10){
                flag = 1;
            }else{
                flag = 0;
            }
            l2 = l2.next;
        }
        if (flag == 1){
            temp.next = new ListNode(1);
        }
        return result.next;
    }
}

public class AddTwoNumbers {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        ListNode list1 = new ListNode(5);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(3);
        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(6);
        list2.next.next = new ListNode(4);
        ListNode list3 = solution2.addTwoNumbers1(list1, list2);
        while (list3 != null) {
            System.out.print(list3.val + "->");
            list3 = list3.next;
        }
    }
}
