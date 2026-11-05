/*
 * Problem: N-Queens
 * Platform: LeetCode 51
 *
 * Description:
 * The N-Queens puzzle is the problem of placing N queens on an N×N chessboard
 * such that no two queens attack each other. Two queens can attack each other
 * if they share the same row, column, or diagonal.
 *
 * Approach:
 * - Use Backtracking to place one queen in each row.
 * - For every position, check whether placing a queen is safe.
 * - If safe, place the queen and recursively solve for the next row.
 * - If a conflict occurs, backtrack by removing the queen and try another column.
 * - Store the board configuration when all queens are placed successfully.
 *
 * Time Complexity: O(N!)
 * Space Complexity: O(N^2)
 *
 * Author: Krapi Pundhir
 */

import java.util.*;

public class N_Queens {

    public boolean isSafe(char[][] board, int row, int col) {

        // Check same column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public void helper(char[][] board, int row, List<List<String>> res) {

        // Base Case
        if (row == board.length) {
            List<String> temp = new ArrayList<>();

            for (int i = 0; i < board.length; i++) {
                temp.add(new String(board[i]));
            }

            res.add(temp);
            return;
        }

        // Try placing queen in every column
        for (int col = 0; col < board.length; col++) {

            if (isSafe(board, row, col)) {

                // Choose
                board[row][col] = 'Q';

                // Explore
                helper(board, row + 1, res);

                // Backtrack
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {

        List<List<String>> res = new ArrayList<>();

        char[][] board = new char[n][n];

        // Fill board with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        helper(board, 0, res);

        return res;
    }

    public static void main(String[] args) {

        N_Queens obj = new N_Queens();

        List<List<String>> ans = obj.solveNQueens(4);

        for (List<String> solution : ans) {

            for (String row : solution) {
                System.out.println(row);
            }

            System.out.println();
        }
    }
}