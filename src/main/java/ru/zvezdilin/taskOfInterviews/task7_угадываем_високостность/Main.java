package ru.zvezdilin.taskOfInterviews.task7_угадываем_високостность;

import java.util.Scanner;

import static java.lang.System.*;

class Main {
    public static void main(String[] args) {
        String color = (char) 27 + "[32m";

        Scanner scanner = new Scanner(in);
        int result = 0;
        while (true) {
            out.println(color + "Введите год в формате: 'yyyy' и количество дней в формате: 'n'");

            int year = scanner.nextInt();
            int days = scanner.nextInt();

            int checkDaysOfYear = daysOfYear(year);
            if (checkDaysOfYear == days) {
                result++;
            } else {
                out.println("Неправильно! В этом году " + checkDaysOfYear + " дней!");
                out.println("Набрано очков: " + result);
                break;
            }
        }
    }

    public static int daysOfYear(int year) {
        int daysOfYear = (year % 4 == 0 && !(year % 100 == 0)) ? 366 : 365;
        return daysOfYear;
    }
}
