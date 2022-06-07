package ru.zvezdilin.taskOfInterviews.task12_поворот_матрицы;

import java.util.Random;

public class Main {
    private static final int SIZE = 8;

    private static int[][] matrix = new int[SIZE][SIZE];
    private static int[][] matrixNew = new int[SIZE][SIZE];

    public static void main(String[] args) {
        createMatrix(matrix);

        System.out.println("Вывод исходной матрицы: ");
        printMatrix(matrix);

        System.out.println("Поворот матрицы на 90 градусов: ");
        printMatrix(rotateMatrix90(matrix));

        System.out.println("Поворот матрицы на 180 градусов: ");
        printMatrix(rotateMatrix180(matrix));

        System.out.println("Поворот матрицы на 270 градусов: ");
        printMatrix(rotateMatrix270(matrix));
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.printf("%5d", cell);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void createMatrix(int[][] matrix) {
        Random random = new Random();

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrix[i][j] = random.nextInt(256);
            }
        }
    }

    private static int[][] rotateMatrix90(int[][] matrix) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrixNew[i][j] = matrix[SIZE - 1 - j][i];
            }
        }
        return matrixNew;
    }

    private static int[][] rotateMatrix180(int[][] matrix) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrixNew[i][j] = matrix[SIZE - 1 - i][SIZE - 1 - j];
            }
        }
        return matrixNew;
    }

    private static int[][] rotateMatrix270(int[][] matrix) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrixNew[i][j] = matrix[j][SIZE - i - 1];
            }
        }
        return matrixNew;
    }
}

