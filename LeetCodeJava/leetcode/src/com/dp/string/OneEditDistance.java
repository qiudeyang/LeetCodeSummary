package com.dp.string;

/**
 * Created by qiudeyang on 23/03/17.
 */
public class OneEditDistance {
    public static boolean isOneEditDistance(String s, String t) {
        if (Math.abs(s.length() - t.length()) > 1) {
            return false;
        }else if (s.length()==t.length()){
            return equalHelper(s,t);
        }else if (s.length()-t.length()==1){
            return oneEdit(t,s);
        }else{
            return oneEdit(s,t);
        }
    }

    public static boolean equalHelper(String s,String t){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)){
                count++;
            }
        }
        return count == 1;
    }

    public static boolean oneEdit(String s,String t){
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)){
                return s.substring(i).equals(t.substring(i+1));
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abc";
        System.out.println(isOneEditDistance(s,t));
    }
}
