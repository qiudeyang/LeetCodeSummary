package com.leetcode;

/**
 * Created by qiudeyang on 26/10/16.
 */
class Solution357 {
    public int countNumbersWithUniqueDigits1(int n) {
        if (n == 0) {
            return 1;
        }
        int result = 10;
        int uniqueNumber = 9;
        int availableNumber = 9;
        while(n-- > 1 && availableNumber > 0){
            uniqueNumber = uniqueNumber * availableNumber;
            result += uniqueNumber;
            availableNumber--;
        }
        return result;
    }

    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 10;
        } else if (n >= 10) {
            return countNumbersWithUniqueDigits(10);
        } else {
            int[] array = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                array[i] = everyNumbersWithUniqueDigits(i);
            }
            int[] result = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                result[i] += result[i - 1] + array[i];
            }
            return result[n] + 1;
        }
    }

    public int everyNumbersWithUniqueDigits(int n) {
        int result = 9;
        for (int i = 11 - n; i < 10; i++) {
            result *= i;
        }
        return result;
    }

}

public class CountNumbersWithUniqueDigits {
    public static void main(String[] args) {
        Solution357 solution357 = new Solution357();
        System.out.println(solution357.countNumbersWithUniqueDigits1(2));
    }
}
