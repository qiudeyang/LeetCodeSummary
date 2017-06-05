package com.leetcode;

/**
 * Created by qiudeyang on 04/06/17.
 */
class Solution605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int maxPlace = 0;
        int i = 0;
        while (i < flowerbed.length) {
            if ((i - 1 < 0 || flowerbed[i - 1] == 0) && flowerbed[i] == 0 &&
                    (i + 1 > flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                maxPlace++;
                i += 2;
            } else {
                i++;
            }
        }
        return maxPlace >= n;
    }
}

public class CanPlaceFlowers {
    public static void main(String[] args) {
        Solution605 solution605 = new Solution605();
        int[] flowerbed = {1, 0, 0, 0, 0, 0, 1};
        System.out.println(solution605.canPlaceFlowers(flowerbed, 2));
    }
}
