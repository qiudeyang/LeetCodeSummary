package com.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by qiudeyang on 25/06/17.
 */
class Solution630 {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                } else {
                    return o1[1] - o2[1];
                }
            }
        });
        int result = 0;
        for (int i = 0; i < courses.length; i++) {
            int time = 0;
            int count = 0;
            int index = i;
            while (index < courses.length) {
                while (index < courses.length && time + courses[index][0] <= courses[index][1]) {
                    time += courses[index][0];
                    count++;
                    index++;
                }
                result = Math.max(result, count);
                index++;
            }
        }
        return result;
    }
}

public class CourseScheduleIII {
    public static void main(String[] args) {
        Solution630 solution630 = new Solution630();
        int[][] courses = {{100, 200}, {200, 1300}, {1000, 1250}, {2000, 3200}};
        int[][] courses1 = {{5, 5}, {4, 6}, {2, 6}};
        System.out.println(solution630.scheduleCourse(courses1));
    }
}
