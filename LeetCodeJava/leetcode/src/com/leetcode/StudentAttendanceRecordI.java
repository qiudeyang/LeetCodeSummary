package com.leetcode;

/**
 * Created by qiudeyang on 28/04/17.
 */
class Solution551 {
    public boolean checkRecord(String s) {
        if (s == null || s.length() < 2) {
            return true;
        }
        int countA = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='A'){
                countA++;
                if (countA > 1){
                    return false;
                }
            }
            if (s.charAt(i)=='L'){
                if (i < s.length()-2  && s.substring(i,i+3).equals("LLL")){
                    return false;
                }
            }
        }
        return true;
    }
}

public class StudentAttendanceRecordI {
    public static void main(String[] args) {
        Solution551 solution551 = new Solution551();
        String s = "PPALLP";
        System.out.println(solution551.checkRecord(s));
    }
}
