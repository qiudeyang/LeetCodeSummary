package com.leetcode;

import java.util.Stack;

/**
 * Created by qiudeyang on 11/12/16.
 */
class Solution445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        while(temp1 != null){
            stack1.push(temp1.val);
            temp1 = temp1.next;
        }
        while(temp2 != null){
            stack2.push(temp2.val);
            temp2 = temp2.next;
        }
        int sum = 0;
        ListNode list = new ListNode(0);
        while (!stack1.isEmpty() || !stack2.isEmpty()){
            if (!stack1.isEmpty()){
                sum += stack1.pop();
            }
            if (!stack2.isEmpty()){
                sum += stack2.pop();
            }
            list.val = sum % 10;
            ListNode header = new ListNode(sum / 10);
            header.next = list;
            list = header;
            sum /= 10;
        }
        return list.val == 0 ? list.next:list;
    }
}

public class AddTwoNumbersII {
    public static void main(String[] args) {
        Solution445 solution445 = new Solution445();
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode current = solution445.addTwoNumbers(l1, l2);
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
