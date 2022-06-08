package Home_Task_Netology.Thirteen_Коллекции_List.Записная_книга;

import java.util.*;

public class Main {

    /*Напишем программу, представляющую собой менеджер списка дел. Списки дел можно хранить в массивах и списках.
    Массивы имеют фиксированную длину, и после того как массив создан, он не может расти или уменьшаться.
    ArrayList (одна из имплементаций списка) может менять свой размер во время исполнения программы,
    при этом необязательно указывать размерность при создании объекта. Кроме того, вы без проблем можете вставить
    новый элемент в середину коллекции, а также спокойно удалить элемент из любого места. Поэтому очень удобно
    использовать List для ведения списка дел, ведь часто бывает, что нужно добавить какие-то дела в середине
    дня или же что-то удалить.

    Реализация

    Функционал программы
Запрос списка задач/дел у пользователя;
Возможность добавить задачу в список;
Возможность удалить задачу из списка;
Возможность вывода всех задач с их номерами (для пользователя нумеровать с 1).

Выберите действие:
1. Добавить задачу
2. Вывести список задач
3. Удалить задачу
0. Выход
1 <enter>
Введите задачу для планирования:
Почитать про ArrayList

Выберите действие:
1. Добавить задачу
2. Вывести список задач
3. Удалить задачу
0. Выход
1 <enter>
Введите задачу для планирования:
Повторить примитивные типы данных

Выберите действие:
1. Добавить задачу
2. Вывести список задач
3. Удалить задачу
0. Выход
2 <enter>
Список задач:
1. Почитать про ArrayList
2. Повторить примитивные типы данных

Выберите действие:
1. Добавить задачу
2. Вывести список задач
3. Удалить задачу
0. Выход
0 <enter>

Процесс реализации
Создать объект имплементирующей List стандартной коллекции со значениями типа String для хранения списка дел
Используя Scanner scanner = new Scanner(System.in), в бесконечном цикле необходимо выводить меню, считывать
операцию и сопутствующие ей данные
Реализуйте операции над списком задач через методы коллекций.
Для удаления элемента списка по индексу используйте remove(int index), не перепутайте его с remove(T e)
(где T это тип элементов списка), который удаляет ячейку в которой лежит элемент e.
     */

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
       // while (true){
            System.out.println("1. Добавить задачу");
            System.out.println("2. Вывести список задач");
            System.out.println("3. Удалить задачу");
            System.out.println("0. Выход");

            int userValue = Integer.parseInt(scanner.nextLine());
            if(userValue==1){
                System.out.println("Введите задачу для планирования");
                list.add(scanner.nextLine());
            }
            if(userValue==2){
                System.out.println("Список задач:");
                for(int i =0; i<list.size();i++){
                    System.out.println(i+1 + list.get(i));
                }
            }

            if(userValue==3){
                System.out.println("Напишите номер задачи, которую хотите удалить:");
                for(int i =0; i<list.size();i++){
                    System.out.println(i+1 + list.get(i));
                }

            }



        //}


    }
}
