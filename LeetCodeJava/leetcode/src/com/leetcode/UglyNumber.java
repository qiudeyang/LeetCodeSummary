package com.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by qiudeyang on 15/06/16.
 */
class Solution263 {
    public boolean isUgly(int num) {
        List<Integer> list = new LinkedList<Integer>();
        if (num <= 0) {
            return false;
        }
        if (num == 1) {
            return true;
        }
        int m = 2;
        if (num % m == 0) {
            isUgly(num / m);
            list.add(m);
            System.out.println(m);
        } else {
            if (m > 2) {
                m += 2;
                if (num % m == 0) {
                    isUgly(num / m);
                    list.add(m);
                    System.out.println(m);
                }
            }
            else {
                m += 1;
                if (num % m == 0) {
                    isUgly(num / m);
                    list.add(m);
                    System.out.println(m);
                }
            }
        }
        if (list.size() == 0) {
            return false;
        }
        if ((list.get(list.size() - 1)) > 5) {
            System.out.println(list.get(list.size() - 1));
            return false;
        } else {
            return true;
        }
    }
}

public class UglyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Solution263 solution263 = new Solution263();
        System.out.println(solution263.isUgly(a));
    }
}
