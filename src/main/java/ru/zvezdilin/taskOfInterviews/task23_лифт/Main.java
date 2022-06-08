package ru.zvezdilin.taskOfInterviews.task23_лифт;

import java.util.*;

public class Main {
    private static int userValue = 0;
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
                //return;// return - возврат к тому же шагу, break  - выход из цикла, в данном случае return не работает.
            }

            if (userValue == 0) {
                getAllFloor(queue);
                break;
            }
            if (userValue < 26)
                queue.add(userValue);
        }
    }

    public static void getAllFloor(Queue<Integer> queue) {
        System.out.println("Лифт проследовал по следующим этажам: ");
        while (!queue.isEmpty()) {
            System.out.print("этаж: " + queue.poll() + " ->" + " ");
        }
        System.out.print("- этаж:0");
    }
}

