package com.test;

/**
 * Created by qiudeyang on 16/11/16.
 */
public class TestKMP1 {
    public static int testKMP1(String s,String p){
        if (s.length() < p.length()){
            return -1;
        }
        char[] array1 = s.toCharArray();
        char[] array2 = p.toCharArray();
        int i = 0;
        int j = 0;
        int[] next = getNext(p);
        while (i < array1.length && j < array2.length){
            if (j== -1 || array1[i] == array2[j]){
                i++;
                j++;
            }else{
                j = next[j];
            }
        }
        if (j == array2.length){
            return i-j;
        }else{
            return -1;
        }
    }
    public static int[] getNext(String p){
        char[] array3 = p.toCharArray();
        int[] next = new int[array3.length];
        next[0]=-1;
        int j = 0;
        int k = -1;
        while (j < p.length() -1){
            if (k == -1 || array3[j] == array3[k]){
                if (array3[++j] == array3[++k]){
                    next[j]=next[k];
                }else{
                    next[j]=k;
                }
            }else{
                k=next[k];
            }
        }
        return next;
    }
    public static void main(String[] args) {
        String s = "abnamfaldfa";
        String p = "mfad";
        System.out.println(testKMP1(s,p));
    }
}
