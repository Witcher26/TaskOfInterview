package ru.zvezdilin.taskOfInterviews.task9_расчет_средней_температуры;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] temps = new int[30];
        boolean[] filledInfo = new boolean[30];

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введи два числа (день температура) или end");
            String line = scanner.nextLine(); // "15 -3" или "end"
            if (line.equals("end")) {
                break;
            }

            String[] parts = line.split(" "); // ["15", "-3"]
            int day = Integer.parseInt(parts[0]) - 1; // 15-1=14
            int temp = Integer.parseInt(parts[1]); // -3
            temps[day] = temp;
            filledInfo[day] = true;

            double sum = 0;
            for (int t : temps) {
                sum += t;
            }

            int count = 0;
            for (boolean isFilled : filledInfo) {
                if (isFilled) {
                    count++;
                }
            }

            System.out.println("Средняя: " + (sum / count));
        }
    }
}
