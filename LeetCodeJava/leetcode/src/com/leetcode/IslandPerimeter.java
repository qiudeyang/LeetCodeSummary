package com.leetcode;

/**
 * Created by qiudeyang on 14/02/17.
 */
//计算陆地的周长。
class Solution463 {
    public int islandPerimeter(int[][] grid) {
        int countOfIslands = 0;
        int countOfNeighbor = 0;
        if (grid == null || grid.length == 0) {
            return 0;
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    countOfIslands++;
                    if (i<grid.length-1 && grid[i][j] == grid[i+1][j]){
                        countOfNeighbor++;
                    }
                    if (j<grid[0].length-1 && grid[i][j] == grid[i][j+1]){
                        countOfNeighbor++;
                    }
                }
            }
        }
        return 4 * countOfIslands - 2 * countOfNeighbor;
    }
}

public class IslandPerimeter {
    public static void main(String[] args) {
        Solution463 solution463 = new Solution463();
        int[][] grid = {{0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}};
        System.out.println(solution463.islandPerimeter(grid));
    }
}
