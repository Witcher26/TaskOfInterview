package Home_Task_Netology.Fourteen_Коллекции_Queue.lift;

import java.util.*;

/*
Описание
Сегодня мы будем реализовывать программу для работы лифта 25-и этажного дома.
Нужно написать программу, которая считывает данные из консоли, ожидая ввода номера этажа.
После ввода каждого числа (номера этажа) добавляет значение в очередь дальнейшего перемещения лифта.
Как только пользователь введет 0, программа должна последовательно вывести список всех этажей,
на которых лифт делал остановки, в формате: "этаж 1 -> этаж 22 -> этаж 0".
Если пользователь ввел этаж вне диапазона 0-25, проигнорировать ввод таких данных.
Для реализации хранения введенных пользователем этажей отлично подойдет структура на основе интерфейса очередь (queue).
По мере ввода мы сможем добавлять в конец очереди новые значения.

Функционал программы
Ввод номеров этажей
Вывод информации о посещенных этажах в порядке добавления в формате: "этаж 1 -> этаж 22 -> этаж 0".
Пример
Ожидаю ввода этажа: (для завершения введите 0)
5 <enter>
Ожидаю ввода этажа: (для завершения введите 0)
12 <enter>
Ожидаю ввода этажа: (для завершения введите 0)
38 <enter>
Такого этажа нет в доме
Ожидаю ввода этажа: (для завершения введите 0)
0 <enter>
Лифт проследовал по следующим этажам:
этаж 5 -> этаж 12 - этаж 0
 */
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

