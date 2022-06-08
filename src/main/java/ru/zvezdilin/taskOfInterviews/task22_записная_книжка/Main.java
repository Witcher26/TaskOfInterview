package ru.zvezdilin.taskOfInterviews.task22_записная_книжка;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        // while (true){
        System.out.println("1. Добавить задачу");
        System.out.println("2. Вывести список задач");
        System.out.println("3. Удалить задачу");
        System.out.println("0. Выход");

        int userValue = Integer.parseInt(scanner.nextLine());
        if (userValue == 1) {
            System.out.println("Введите задачу для планирования");
            list.add(scanner.nextLine());
        }
        if (userValue == 2) {
            System.out.println("Список задач:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(i + 1 + list.get(i));
            }
        }

        if (userValue == 3) {
            System.out.println("Напишите номер задачи, которую хотите удалить:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(i + 1 + list.get(i));
            }
        }
    }
}
