package Home_Task_Netology.Eight8.Допиливаем_крестики_нолики;


//задача от Сани

public class Sania {
    public static final int SIZE = 5;
    public static final char EMPTY = '-';
    public static final char CROSS = 'X';
    public static final char ZERO = 'O';

    public static void main(String[] args) {

        char[][] testVariant = new char[][]{
                {CROSS, CROSS, ZERO, CROSS, ZERO},
                {CROSS, EMPTY, EMPTY, CROSS, ZERO},
                {EMPTY, EMPTY, EMPTY, EMPTY, ZERO},
                {EMPTY, CROSS, ZERO, EMPTY, ZERO},
                {CROSS, CROSS, CROSS, CROSS, CROSS},
        };
        System.out.println(isWin(testVariant, CROSS)); //true

        char[][] testVariant2 = new char[][]{
                {CROSS, CROSS, ZERO, CROSS, ZERO},
                {CROSS, EMPTY, EMPTY, CROSS, ZERO},
                {EMPTY, EMPTY, EMPTY, CROSS, ZERO},
                {EMPTY, CROSS, ZERO, CROSS, ZERO},
                {CROSS, ZERO, ZERO, CROSS, CROSS},
        };
        System.out.println(isWin(testVariant2, CROSS)); //true

        char[][] testVariant3 = new char[][]{
                {CROSS, CROSS, ZERO, ZERO, ZERO},
                {CROSS, CROSS, EMPTY, ZERO, ZERO},
                {EMPTY, EMPTY, CROSS, ZERO, ZERO},
                {EMPTY, CROSS, ZERO, CROSS, ZERO},
                {CROSS, ZERO, ZERO, CROSS, CROSS},
        };
        System.out.println(isWin(testVariant3, CROSS)); //true

        char[][] testVariant4 = new char[][]{
                {CROSS, CROSS, ZERO, ZERO, CROSS},
                {CROSS, ZERO, EMPTY, CROSS, ZERO},
                {EMPTY, EMPTY, CROSS, ZERO, ZERO},
                {EMPTY, CROSS, ZERO, ZERO, ZERO},
                {CROSS, ZERO, ZERO, CROSS, CROSS},
        };
        System.out.println(isWin(testVariant4, CROSS)); //true

        char[][] testVariant5 = new char[][]{
                {CROSS, CROSS, ZERO, ZERO, ZERO},
                {CROSS, ZERO, EMPTY, CROSS, ZERO},
                {EMPTY, EMPTY, CROSS, ZERO, ZERO},
                {EMPTY, CROSS, ZERO, ZERO, ZERO},
                {CROSS, ZERO, ZERO, CROSS, CROSS},
        };
        System.out.println(isWin(testVariant5, CROSS)); //false
    }

    public static boolean isWin(char[][] field, char player) {
        //Счетчик по строкам и колонкам
        int checkRow = 0;
        int checkColumn = 0;
        //Счетчик по диагоналям
        int checkLeftDiagonal = 0;
        int checkRightDiagonal = 0;

        for (int i = 0; i < field.length; i++) {
            checkColumn = 0; //Обнуляем счетчики по строкам и строкам
            checkRow = 0;
            if (field[i][i] == player)
                checkRightDiagonal++;
            if (field[SIZE - i - 1][i] == player)
                checkLeftDiagonal++;
            if (checkLeftDiagonal == SIZE || checkRightDiagonal == SIZE)
                return true;

            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == player)
                    checkRow++;
                if (field[j][i] == player)
                    checkColumn++;
                if (checkRow == SIZE || checkColumn == SIZE)
                    return true;
            }
        }
        return false;
    }
}
