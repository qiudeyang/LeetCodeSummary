package com.test;

/**
 * Created by qiudeyang on 05/04/17.
 */
public class TestReversePairs {
    public static int testReversePairs(String[] input) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("A")) {
                sum += b + c + d;
            } else if (input[i].equals("B")) {
                b++;
                sum += c + d;
            } else if (input[i].equals("C")) {
                c++;
                sum += d;
            } else {
                d++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] input = {"C", "D", "A", "C", "B"};
        System.out.println(testReversePairs(input));
    }
}
