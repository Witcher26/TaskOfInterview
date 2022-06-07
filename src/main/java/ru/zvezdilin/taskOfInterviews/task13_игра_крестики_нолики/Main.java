package ru.zvezdilin.taskOfInterviews.task13_игра_крестики_нолики;

public class Main {
    public static final int SIZE = 5;

    private static final char CROSS = 'X';
    private static final char ZERO = '0';
    private static final char EMPTY = '-';

    public static void main(String[] args) {

        char[][] variantRow = new char[][]{
                {CROSS, CROSS, CROSS, CROSS, CROSS},
                {CROSS, EMPTY, EMPTY, CROSS, ZERO},
                {EMPTY, EMPTY, EMPTY, EMPTY, ZERO},
                {EMPTY, CROSS, ZERO, EMPTY, ZERO},
                {ZERO, CROSS, CROSS, CROSS, CROSS},
        };

        char[][] variantColumn = new char[][]{
                {CROSS, CROSS, ZERO, CROSS, ZERO},
                {CROSS, EMPTY, EMPTY, CROSS, ZERO},
                {EMPTY, EMPTY, EMPTY, CROSS, ZERO},
                {EMPTY, CROSS, ZERO, CROSS, ZERO},
                {CROSS, ZERO, ZERO, CROSS, CROSS},
        };

        char[][] variantDiagonalMain = new char[][]{
                {CROSS, CROSS, ZERO, ZERO, ZERO},
                {CROSS, CROSS, EMPTY, ZERO, ZERO},
                {EMPTY, EMPTY, CROSS, ZERO, ZERO},
                {EMPTY, CROSS, ZERO, CROSS, ZERO},
                {CROSS, ZERO, ZERO, CROSS, CROSS},
        };

        char[][] variantDiagonalSide = new char[][]{
                {CROSS, CROSS, ZERO, ZERO, CROSS},
                {CROSS, ZERO, EMPTY, CROSS, ZERO},
                {EMPTY, EMPTY, CROSS, ZERO, ZERO},
                {EMPTY, CROSS, ZERO, ZERO, ZERO},
                {CROSS, ZERO, ZERO, CROSS, CROSS},
        };

        char[][] variantRandom = new char[][]{
                {CROSS, CROSS, ZERO, ZERO, ZERO},
                {CROSS, ZERO, EMPTY, CROSS, ZERO},
                {EMPTY, EMPTY, CROSS, ZERO, ZERO},
                {EMPTY, CROSS, ZERO, ZERO, ZERO},
                {CROSS, ZERO, ZERO, CROSS, CROSS},
        };

        // проверка
        System.out.println("Совпадение по строке: " + isWinForAll(variantRow, CROSS));
        System.out.println("Совпадение по столбцу: " + isWinForAll(variantColumn, CROSS));
        System.out.println("Совпадение по главной диагонали: " + isWinForAll(variantDiagonalMain, CROSS));
        System.out.println("Совпадение по побочной диагонали: " + isWinForAll(variantDiagonalSide, CROSS));
        System.out.println("Без совпадения: " + isWinForAll(variantRandom, CROSS));

    }

    public static boolean isWinForAll(char[][] field, char player) {
        int countRow = 0;
        int countColumn = 0;
        int countDiagonalMain = 0;
        int countDiagonalSide = 0;

        boolean isTrue = false;

        for (int row = 0; row < SIZE; row++) {
            countRow = 0;  //обнуляем счётчики при каждой итерации 1-го уровня; все манипуляции проводим с column
            countColumn = 0;
            countDiagonalMain = 0;
            countDiagonalSide = 0;

            for (int column = 0; column < SIZE; column++) {
                if (field[row][column] == player) {
                    countRow++;
                }
                if (field[column][row] == player) {
                    countColumn++;
                }
                if (field[column][column] == player) {
                    countDiagonalMain++;
                }
                if (field[SIZE - 1 - column][column] == player) {
                    countDiagonalSide++;
                }
            }
            if (countRow == SIZE || countColumn == SIZE || countDiagonalMain == SIZE || countDiagonalSide == SIZE)
                isTrue = true;
        }
        return isTrue;
    }
}

