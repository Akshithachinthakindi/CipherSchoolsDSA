package Lecture9;

public class l92 {
    public class Main
    {
        public static boolean placeQueens (int[][] board, int row) {
            for(int currentCellIndex = 0; currentCellIndex < board.length; currentCellIndex++) {
                if (isSafeToplace (board, row, currentCellIndex)) {
                    board [row] [currentCellIndex] = 1;

                    boolean canPlaceQueens = placeQueens (board,row + 1);
                    if (canPlaceQueens) {
                        return true;
                    }
                    board [row] [currentCellIndex] = 1;
                }
            }
        }
        private static boolean isSafeToplace(int[] [] board, int currentRow, int currentCellIndex) {
            for (int row = 0;row<currentRow; row++) {
                if (board [row] [currentCellIndex] == 1) {
                    return false;
                }
            }
        }
    }
}
