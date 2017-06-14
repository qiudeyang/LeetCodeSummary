package com.leetcode;

/**
 * Created by qiudeyang on 14/06/17.
 */
class Solution537 {
    public String complexNumberMultiply(String a, String b) {
        int temp1 = a.indexOf('+')==0?0:Integer.parseInt(a.substring(0,a.indexOf('+')));
        int temp2 = a.indexOf('+')==-1?0:Integer.parseInt(a.substring(a.indexOf('+')+1,a.length()-1));
        int temp3 = b.indexOf('+')==0?0:Integer.parseInt(b.substring(0,b.indexOf('+')));
        int temp4 = b.indexOf('+')==-1?0:Integer.parseInt(b.substring(b.indexOf('+')+1,b.length()-1));
        return (temp1*temp3-temp2*temp4)+"+"+(temp1*temp4+temp2*temp3)+"i";
    }
}
public class ComplexNumberMultiplication {
    public static void main(String[] args) {
        Solution537 solution537 = new Solution537();
        System.out.println(solution537.complexNumberMultiply("1+1i","1+1i"));
    }
}
