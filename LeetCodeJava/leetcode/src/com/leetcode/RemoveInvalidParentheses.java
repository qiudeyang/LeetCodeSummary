package com.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 01/04/17.
 */
class Solution301 {
    public List<String> removeInvalidParentheses(String s) {
        List<String> list = new LinkedList<String>();
        if (s == null || s.length() < 1) {
            return list;
        }
        char[] array = {'(',')'};
        remove(s,list,0,0,array);
        return list;
    }

    public void remove(String s,List<String> list,int last_i,int last_j,char[] array){
        for (int i = last_i,stack = 0; i < s.length() ; i++) {
            if (s.charAt(i)==array[0]){
                stack++;
            }
            if (s.charAt(i)==array[1]){
                stack--;
            }
            if (stack>=0){
                continue;
            }
            for (int j = last_j; j <= i ; j++) {
                if (s.charAt(j)==array[1] && (j==last_j || s.charAt(j-1) != array[1])){
                    remove(s.substring(0,j)+s.substring(j+1,s.length()),list,i,j,array);
                }
            }
            return;
        }
        String reversed = new StringBuilder(s).reverse().toString();
        if (array[0] =='('){
            char[] temp = {')','('};
            remove(reversed,list,0,0,temp);
        }else{
            list.add(reversed);
        }
    }
}

public class RemoveInvalidParentheses {
    public static void main(String[] args) {
        Solution301 solution301 = new Solution301();
        String s = "()())()";
        System.out.println(solution301.removeInvalidParentheses(s));
    }
}
