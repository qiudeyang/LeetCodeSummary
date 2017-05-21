package com.test;

import java.util.Arrays;

/**
 * Created by qiudeyang on 25/07/16.
 */
public class TestValidAnagram {
    public static boolean solution(String s){
//       StringBuffer sb = new StringBuffer(s);
//        sb.reverse();
//        String s1 = sb.toString();
//        return s.equals(s1);
//        char[] array1 = s.toCharArray();
//        char[] array2 = new char[array1.length];
        String s1 = "" ;
        for (int i = s.length()-1; i >= 0; i--) {
            s1 += s.charAt(i);
            System.out.println(s.charAt(i));
        }
        System.out.println(s1);
        if (s1.equals(s)){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(TestValidAnagram.solution("cbc"));
//        int[] array1 = {1,3,2};
//        int[] array2 = {1,3,2};
//        System.out.println(Arrays.equals(array1,array2));

    }
}
