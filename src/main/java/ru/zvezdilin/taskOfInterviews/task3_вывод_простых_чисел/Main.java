package ru.zvezdilin.taskOfInterviews.task3_вывод_простых_чисел;

public class Main {
    public static void main(String[] args) {
        //Простое число делится только на 1  и на само себя
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 19, 29, 33};
        int tmp;
        for (int i = 0; i < numbers.length; i++) {
            tmp = numbers[i];
            if (tmp % 2 != 0 && tmp % 3 != 0) {
                System.out.println("Простое число: " + tmp);
            }
        }
    }
}



