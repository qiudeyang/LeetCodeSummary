package com.leetcode;

import java.util.Scanner;

/**
 * Created by qiudeyang on 13/06/16.
 */
public class NimGame {
    public static boolean solution(int b){
        return b % 4 != 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(NimGame.solution(a));
    }
}
