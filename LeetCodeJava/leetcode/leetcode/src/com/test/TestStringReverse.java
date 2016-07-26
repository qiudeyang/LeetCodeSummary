package com.test;

/**
 * Created by qiudeyang on 18/06/16.
 */
class Solution344{
    public String reverseString(String s){
        char[] word = s.toCharArray();
        int head = 0;
        int tail = word.length - 1;
        while (head < tail) {
            char temp = word[head];
            word[head] = word[tail];
            word[tail] = temp;
            head++;
            tail--;
        }
//        return new String(word);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < word.length; i++) {
            sb.append(word[i]);
        }
        return sb.toString();
    }
}
public class TestStringReverse {
    public static void main(String[] args) {
        Solution344 solution344 = new Solution344();
        System.out.println(solution344.reverseString("hello"));
    }
}
