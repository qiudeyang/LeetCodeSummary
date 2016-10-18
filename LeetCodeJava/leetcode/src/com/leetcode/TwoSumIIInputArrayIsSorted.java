package com.leetcode;

import java.util.Arrays;

/**
 * Created by qiudeyang on 10/10/16.
 */
class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        if (numbers == null || numbers.length < 2){
            return result;
        }
        int head = 0;
        int tail = numbers.length - 1;
        while(head < tail){
            int temp = numbers[head]+numbers[tail];
            if (temp == target){
                result[0] = head + 1;
                result[1] = tail + 1;
                break;
            }else if (temp > target){
                tail--;
            }else{
                head++;
            }
        }
        return result;
    }
}

public class TwoSumIIInputArrayIsSorted {
    public static void main(String[] args) {
        Solution167 solution167 = new Solution167();
        int[] numbers = {2, 7, 11, 15};
        System.out.println(Arrays.toString(solution167.twoSum(numbers, 18)));
    }
}
