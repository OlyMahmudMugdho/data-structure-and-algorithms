import java.util.Arrays;

public class EightQueen {

    public static final int N = 8;

    public static boolean isSafe(int[][] board, int row, int column) {
        for(int x = 0; x < column; x++) {
            if(board[row][x] == 1) {
                return false;
            }
        }

        for(int x = row, y = column; x >= 0 && y >= 0; x--, y--) {
            if(board[x][y] == 1) {
                return false;
            }
        }

        for(int x = row, y = column; x < N && y >= 0; x++, y--) {
            if(board[x][y] == 1) {
                return false;
            }
        }

        return true;

    }


    public static boolean solveNQueen(int[][] board, int column) {
        if(column == N) {
            for(int[] row : board) {
                System.out.println(Arrays.toString(row));
            }
            return true;
        }

        for(int i = 0; i < N; i++) {
            if(isSafe(board, i, column)){
                board[i][column] = 1;
                if(solveNQueen(board, column + 1)) {
                    return true;
                }
                board[i][column] = 0;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] board = new int[N][N];

        if(!solveNQueen(board, 0)){
            System.out.println("No solution found");
        }
    }
}