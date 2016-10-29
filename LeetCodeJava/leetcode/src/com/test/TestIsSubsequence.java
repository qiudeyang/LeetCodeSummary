package com.test;

/**
 * Created by qiudeyang on 29/10/16.
 */
public class TestIsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()){
            return false;
        }
        for(int i = 0; i < s.length();i++){
            int prev = t.indexOf(s.charAt(i));
            if(prev == -1){
                return false;
            }else{
                t = t.substring(prev+1);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        TestIsSubsequence tis = new TestIsSubsequence();
        System.out.println(tis.isSubsequence("abc","ahbgdc"));
    }
}
