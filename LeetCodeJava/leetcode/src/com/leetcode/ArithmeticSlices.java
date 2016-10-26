package com.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 26/10/16.
 */
class Solution413 {
    public int numberOfArithmeticSlices(int[] A) {
        if (A == null || A.length < 3) {
            return 0;
        }
        int count = 0;
        int current = 0;
        for (int i = 2; i < A.length; i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                current += 1;
                count += current;
            } else {
                current = 0;
            }
        }
        return count;

    }

    public boolean isArithmeticSlices(List<Integer> list) {
        if (list == null || list.size() < 3) {
            return false;
        }
        int diff = list.get(1) - list.get(0);
        for (int i = 2; i < list.size(); i++) {
            if (list.get(i) - list.get(i - 1) != diff) {
                return false;
            }
        }
        return true;
    }
}

public class ArithmeticSlices {
    public static void main(String[] args) {
        Solution413 solution413 = new Solution413();
        int[] A = {1, 2, 3, 4, 5};
//        System.out.println(solution413.isArithmeticSlices());
        System.out.println(solution413.numberOfArithmeticSlices(A));
    }
}
