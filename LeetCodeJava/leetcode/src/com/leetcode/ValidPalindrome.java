package com.leetcode;

/**
 * Created by qiudeyang on 25/07/16.
 */
class Solution125 {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0){
            return true;
        }
        s = s.replaceAll("[^0-9a-zA-Z]","");
        s = s.toLowerCase();
        System.out.println(s);
        int head = 0;
        int tail = s.length()-1;
        char[] array = s.toCharArray();
        while(head < tail){
            if(array[head] != array[tail]){
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }
}
public class ValidPalindrome {
    public static void main(String[] args) {
        Solution125 solution125 = new Solution125();
        String s = "A man, a plan, a canal: Panama";
        String s1 ="a2c";
        System.out.println(solution125.isPalindrome(s));
//        String s = "364";
//        for (int i = 0; i < s.length(); i++) {
//            if(!(s.charAt(i) - '0' <= 9 && s.charAt(i) -'0' >= 0)){
//                System.out.println("false");
//            }
//        }
    }
}
