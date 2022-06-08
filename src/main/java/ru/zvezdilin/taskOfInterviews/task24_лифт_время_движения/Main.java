package ru.zvezdilin.taskOfInterviews.task24_лифт_время_движения;

import java.util.*;

public class Main {
    private static int userValue;
    private static int waitDoorsInSeconds = 10; //закрытие/открытие дверей
    private static int waitMoveInSeconds = 5; // движение между этажами
    private static int totalSeconds = 0; //всего потрачено времени на движение и остановку лифтом
    private static int previousFloor = -1; //переменная для хранения предыдущей остановки.

    public static void main(String[] args) throws Exception {
        Queue<Integer> queue = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ожидаю ввода этажа: (для завершения введите 0): ");

            try {
                userValue = Integer.parseInt(scanner.nextLine());
                if (userValue > 25 || userValue < 0) {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException ex) {
                System.out.println("Такого этажа в доме ещё нет");
            } catch (Exception ex) {
                System.out.println("Уппсс..что - то пошло не так");
            }

            if (userValue == 0) {
                getAllFloor(queue);
                System.out.println();
                getTimeMoveLift(queue);
                break;
            }
            if (userValue < 26) {
                previousFloor = userValue;
                queue.add(userValue);
            }
        }
    }

    public static void getAllFloor(Queue<Integer> queue) {
        System.out.println("Лифт проследовал по следующим этажам: ");
        for (Integer integer : queue) {
            System.out.print("этаж: " + integer + " ->" + " ");
        }
        System.out.print("- этаж:0");
    }

    public static void getTimeMoveLift(Queue<Integer> queue) {
        int currentFloor = 0;

        if (previousFloor != -1) {

            while (!queue.isEmpty()) {
                previousFloor = currentFloor;
                currentFloor = queue.poll();

                totalSeconds += Math.abs(previousFloor - currentFloor) * waitMoveInSeconds;
                totalSeconds += waitDoorsInSeconds;
            }
            System.out.println("Время затраченное лифтом на маршрут =: " + totalSeconds + " с.");

        } else
            System.out.println("Лифт не двигался по этажам");
    }
}
