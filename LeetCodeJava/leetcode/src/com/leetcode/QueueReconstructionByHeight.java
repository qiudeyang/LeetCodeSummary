package com.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 14/06/17.
 */
class Solution406 {
    public int[][] reconstructQueue(int[][] people) {
        if (people == null || people.length < 1) {
            return null;
        }
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]==o2[0]){
                    return o1[1]-o2[1];
                }else{
                    return o2[0]-o1[0];
                }
            }
        });
        List<int[]> resultList = new LinkedList<>();
        for (int[] temp:people){
            resultList.add(temp[1],temp);
        }
        return resultList.toArray(new int[people.length][people[0].length]);
    }
}

public class QueueReconstructionByHeight {
    public static void main(String[] args) {
        Solution406 solution406 = new Solution406();
        int[][] people = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        int[][] result = solution406.reconstructQueue(people);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
