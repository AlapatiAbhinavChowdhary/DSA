import java.util.ArrayList;
import java.util.List;

public class nqueen {

    // check in all 8 directions
    public boolean isSafe(int row, int col, char[][] board) {
        int n = board.length;

        // vertical up
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        // vertical down
        for (int i = row + 1; i < n; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        // horizontal left
        for (int j = 0; j < col; j++) {
            if (board[row][j] == 'Q')
                return false;
        }

        // horizontal right
        for (int j = col + 1; j < n; j++) {
            if (board[row][j] == 'Q')
                return false;
        }

        // upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        // upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        // lower-left diagonal
        for (int i = row + 1, j = col - 1; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        // lower-right diagonal
        for (int i = row + 1, j = col + 1; i < n && j < n; i++, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    public void saveBoard(char[][] board, List<List<String>> allBoards) {
        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                row.append(board[i][j]);
            }
            newBoard.add(row.toString());
        }
        allBoards.add(newBoard);
    }

    public void helper(char[][] board, List<List<String>> allBoards, int col) {
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.'; // backtrack
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        // initialize board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        helper(board, allBoards, 0);
        return allBoards;
    }

    public static void main(String[] args) {
        nqueen obj = new nqueen();
        int n = 4; // change n as needed
        List<List<String>> solutions = obj.solveNQueens(n);

        int count = 1;
        for (List<String> sol : solutions) {
            System.out.println("Solution " + count++ + ":");
            for (String row : sol) {
                System.out.println(row);
            }
            System.out.println();
        }

        System.out.println("Total Solutions: " + solutions.size());
    }
}
