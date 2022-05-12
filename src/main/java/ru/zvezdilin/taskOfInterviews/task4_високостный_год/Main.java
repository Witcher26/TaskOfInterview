package ru.zvezdilin.taskOfInterviews.task4_високостный_год;


import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

class Main {
    public static void main(String[] args) {
        String color = (char) 27 + "[32m";

        Scanner scanner = new Scanner(in);
        out.println(color + "Введите год в формате: 'yyyy'");
        int year = scanner.nextInt();

        String years = (year % 4 == 0 && !(year % 100 == 0)) ? "Количество дней 366" : "Количество дней 365";
        out.println(years);
    }
}

