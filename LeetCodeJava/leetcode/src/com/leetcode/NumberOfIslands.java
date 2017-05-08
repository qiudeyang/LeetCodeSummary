package com.leetcode;

/**
 * Created by qiudeyang on 08/05/17.
 */
class Solution200 {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length < 1){
            return 0;
        }
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                result += dfs(grid,i,j);
            }
        }
        return result;
    }

    public int dfs(char[][] grid,int i,int j){
        if (i<0||j<0||i==grid.length||j==grid[0].length||grid[i][j]=='0'){
            return 0;
        }
        grid[i][j]='0';
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
        return 1;
    }
}

public class NumberOfIslands {
    public static void main(String[] args) {
        Solution200 solution200 = new Solution200();
        char[][] grid = {{1, 1, 1, 1, 0}, {1, 1, 0, 1, 0}, {1, 1, 0, 0, 0}, {0, 0, 0, 0, 0}};
        System.out.println(solution200.numIslands(grid));
    }
}
