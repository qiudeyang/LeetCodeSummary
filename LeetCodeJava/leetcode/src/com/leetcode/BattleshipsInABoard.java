package com.leetcode;

/**
 * Created by qiudeyang on 15/11/16.
 */
class Solution419 {
    public int countBattleships(char[][] board) {
        int m = board.length;
        if (m == 0) {
            return 0;
        }
        int n = board[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'N'){
                    continue;
                }
                if (i > 0 && board[i-1][j] == 'X'){
                    continue;
                }
                if (j > 0 && board[i][j-1] == 'X'){
                    continue;
                }
                count++;
            }
        }
        return count;
    }
}

public class BattleshipsInABoard {
    public static void main(String[] args) {
        Solution419 solution419 = new Solution419();
        char[][] board = {{'X', 'N', 'N', 'X'}, {'N', 'N', 'N', 'X'}, {'N', 'N', 'N', 'X'}};
        System.out.println(solution419.countBattleships(board));
    }
}
