package com.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 15/10/16.
 */
class Solution412 {
    public List<String> fizzBuzz(int n) {
        List<String> list = new LinkedList<String>();
        for(int i = 1 ; i <= n;i++){
            if(i % 15 == 0){
                list.add("FizzBuzz");
            }else if(i % 3 == 0){
                list.add("Fizz");
            }else if(i % 5 == 0){
                list.add("Buzz");
            }else{
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}

public class FizzBuzz {
    public static void main(String[] args) {
        Solution412 solution412 = new Solution412();
        System.out.println(solution412.fizzBuzz(15));
    }
}
