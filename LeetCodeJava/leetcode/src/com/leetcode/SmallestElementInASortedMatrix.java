package com.leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 21/10/16.
 */
class Solution378 {
    public int kthSmallest(int[][] matrix, int k) {
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                 list.add(matrix[i][j]);
            }
        }
        Collections.sort(list);
        return list.get(k-1);
    }
    public int kthSmallest1(int[][] matrix, int k) {
        List<Integer> list = new LinkedList<Integer>();
        if (k == 1){
            return matrix[0][0];
        }
        list.add(matrix[0][0]);
        for (int i = 0; i < matrix.length - 1;) {
            for (int j = 0; j < matrix[i].length - 1; ) {
                if (matrix[i][j+1]<matrix[i+1][j]){
                    list.add(matrix[i][j+1]);
                    j++;
                    if (list.size() == k){
                        return list.get(list.size()-1);
                    }
                }else{
                    list.add(matrix[i+1][j]);
                    i++;
                    if (list.size() == k){
                        return list.get(list.size()-1);
                    }
                }
            }
        }
        return list.get(list.size()-1);
    }
}
public class SmallestElementInASortedMatrix {
    public static void main(String[] args) {
        Solution378 solution378 = new Solution378();
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        System.out.println(solution378.kthSmallest1(matrix,8));
    }
}
