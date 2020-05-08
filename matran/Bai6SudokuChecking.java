package matran;

public class Bai6SudokuChecking {
    static boolean sudokuChecking(char[][] grid) {
        if (grid == null ||  grid.length != 9 || grid[0].length != 9)
        for (int i = 0; i < 9; i++) {
            char[] check = new char[9];
            int tempCheck = 0;

            for (int j = 0; j < 9; j++) {
                if (grid[i][j] != '.') {
                    check[tempCheck] = grid[i][j];
                    tempCheck++;

                }
            }
            if (!checkEquals(check)) {
                return false;
            }

        }


        for (int i = 0; i < 9; i++) {
            char[] check = new char[9];
            int tempCheck = 0;


            for (int j = 0; j < 9; j++) {
                if (grid[j][i] != '.') {
                    check[tempCheck] = grid[j][i];
                    tempCheck++;

                }
            }
            if (!checkEquals(check)) {
                return false;
            }


        }


        int rows = 0, collums = 0, maxRows = 3, maxCol = 3;
        for (int i = 0; i < 9; i++) {
            char[] check = new char[9];
            int tempCheck = 0;


            for (int j = rows; j < maxRows; j++) {
                for (int z = collums; z < maxCol; z++) {
                    if (grid[j][z] != '.') {
                        check[tempCheck] = grid[j][z];
                        tempCheck++;

                    }
                }
                if (tempCheck != 0) {
                    break;
                }
            }

            if (!checkEquals(check)) {
                return false;
            }


            if (i == 0) {
                collums = 0;
                maxCol = 3;
            } else if (i == 2 || i == 5) {
                collums = -3;
                maxCol = 0;
            }

            if (i < 2) {
                rows = 0;
                maxRows = 3;
                collums += 3;
                maxCol += 3;
            } else if (i >= 2 && i < 5) {
                rows = 3;
                maxRows = 6;
                collums += 3;
                maxCol += 3;
            } else {
                rows = 6;
                maxRows = 9;
                collums += 3;
                maxCol += 3;
            }

        }

        return true;
    }

    static boolean checkEquals(char[] numberChar) {
        for (int i = 0; i < 9; i++) {
            if ((int) numberChar[i] == 0) {
                break;
            }
            for (int j = i + 1; j < 9; j++) {
                if ((int) numberChar[j] == 0) {
                    break;
                } else {
                    if (numberChar[i] == numberChar[j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] a = {{'.', '.', '.', '1', '4', '.', '.', '2', '.'},
                {'.', '.', '6', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '1', '.', '.', '.', '.', '.', '.'},
                {'.', '6', '7', '.', '.', '.', '.', '.', '9'},
                {'.', '.', '.', '.', '.', '.', '8', '1', '.'},
                {'.', '3', '.', '.', '.', '.', '.', '.', '6'},
                {'.', '.', '.', '.', '.', '7', '.', '.', '.'},
                {'.', '.', '.', '5', '.', '.', '.', '7', '.'}};
        char[][] grid = {{'.', '.', '.', '.', '2', '.', '.', '9', '.'},
                {'.', '.', '.', '.', '6', '.', '.', '.', '.'},
                {'7', '1', '.', '.', '7', '5', '.', '.', '.'},
                {'.', '7', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '8', '3', '.', '.', '.'},
                {'.', '.', '8', '.', '.', '7', '.', '6', '.'},
                {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
                {'.', '1', '.', '2', '.', '.', '.', '.', '.'},
                {'.', '2', '.', '.', '3', '.', '.', '.', '.'}};
        System.out.println(sudokuChecking(a));
        System.out.println(sudokuChecking(grid));
    }
}
