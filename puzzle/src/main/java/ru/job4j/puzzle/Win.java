package ru.job4j.puzzle;

public class Win {

    public static boolean checkRow(int[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell < board[row].length; cell++) {
            if (board[row][cell] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean checkColumn(int[][] board, int column) {
        boolean result = true;
        for (int[] row : board) {
            if (row[column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (checkRow(board, i) || checkColumn(board, i))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }
}
