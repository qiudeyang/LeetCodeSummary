package com.test;

import java.util.Stack;

/**
 * Created by qiudeyang on 08/10/16.
 */

class Solution7 {
    public int reverseInteger(int x) {
        Stack stack = new Stack();
        Stack stack1 = new Stack();
        if (x > 0){
            char[] array = String.valueOf(x).toCharArray();
            for (int i = 0; i < array.length ; i++) {
                stack.push(array[i]);
            }
            System.out.println(stack);
            System.out.println(stack.size());
            while(!stack.empty()){
                stack1.push(stack.pop());
            }
            System.out.println(stack1);
        }
        return 0;
    }
}

public class ReverseInteger {
    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        int a = 123;
        System.out.println(solution7.reverseInteger(1534236469));
    }
}
