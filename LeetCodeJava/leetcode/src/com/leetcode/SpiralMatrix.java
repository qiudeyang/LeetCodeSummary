package com.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiudeyang on 22/12/16.
 */
class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new LinkedList<Integer>();
        int row = matrix.length;
        if(matrix == null || row == 0){
            return list;
        }
        int column = matrix[0].length;
        int start = 0;
        while(row > 2*start && column > 2*start){
            list = printClockwisely(matrix,row,column,start,list);
            start++;
        }
        return list;
    }
    public List<Integer> printClockwisely(int[][] matrix,int row,int column,int start,List<Integer> list){
        int endX = row - start - 1;
        int endY = column - start - 1;
        for(int i = start;i <= endY;i++){
            list.add(matrix[start][i]);
        }
        if(endX > start){
            for(int i = start+1;i <= endX;i++){
                list.add(matrix[i][endY]);
            }
        }
        if(endX > start && endY > start){
            for(int i = endY-1;i >= start;i--){
                list.add(matrix[endX][i]);
            }
        }
        if(endX > start + 1 && endY > start){
            for(int i = endX-1;i > start;i--){
                list.add(matrix[i][start]);
            }
        }
        return list;
    }
}
public class SpiralMatrix {
    public static void main(String[] args) {
        Solution54 solution54 = new Solution54();
        int[][] matrix = {
                {1,2,3,4},
                {12,13,14,5},
                {11,16,15,6},
                {10,9,8,7}};
        System.out.println(solution54.spiralOrder(matrix));
    }
}
