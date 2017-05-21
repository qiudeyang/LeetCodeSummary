package com.leetcode;

/**
 * Created by qiudeyang on 02/11/16.
 */
class Solution165 {
    public int compareVersion(String version1, String version2) {
        String[] array1 = version1.split("\\.");
        String[] array2 = version2.split("\\.");

        int max = Math.max(array1.length, array2.length);

        for (int i = 0; i < max; i++) {
            Integer v1 = i < array1.length ? Integer.parseInt(array1[i]) : 0;
            Integer v2 = i < array2.length ? Integer.parseInt(array2[i]) : 0;
            int compare = v1.compareTo(v2);
            if (compare != 0) {
                return compare;
            }
        }
        return 0;

    }
}

public class CompareVersionNumbers {
    public static void main(String[] args) {
        Solution165 solution165 = new Solution165();
        String version1 = "0.1";
        String version2 = "0.0.1";
        System.out.println(solution165.compareVersion(version1, version2));
    }
}
