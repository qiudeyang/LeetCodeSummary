package com.test;

/**
 * Created by qiudeyang on 16/11/16.
 */
public class TestKMP {
    public static int testKMP(String str,String subStr){
        if (str.length() < subStr.length()){
            return -1;
        }
        char[] array1 = str.toCharArray();
        char[] array2 = subStr.toCharArray();
        int i = 0;
        int j = 0;
        while (i < array1.length && j < array2.length){
            if (array1[i] == array2[j]){
                i++;
                j++;
            }else{
                i = i - j + 1;
                j = 0;
            }
        }
        if (j == array2.length){
            return i-j;
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        String str = "abcdads";
        String subStr = "adsa";
        System.out.println(testKMP(str,subStr));
    }
}
