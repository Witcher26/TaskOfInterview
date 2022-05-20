package Home_Task_Netology.FifteenHashMapHashSet.ListOfStudents;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Описание
Вы разрабатываете систему учета студентов. Для каждого студента нужно хранить следующие данные – ФИО, номер группы,
номер студенческого билета. Уникальным идентификатором является номер студенческого билета.
Пользователь вводит данные студентов в бесконечном цикле до ввода команды "end".
По окончании ввода программа должна вывести список студентов. Структура данных, куда сохраняются студенты,
должна отбрасывать ввод студента с уже существующим в базе id и писать об этом пользователю. Учитывайте,
что имена у людей могут быть одинаковыми, а номера документов – нет.

Функционал программы
Ввод информации о студентах;
Вывод списка студентов.
Пример
Введите информацию о студенте: "ФИО, номер группы, номер студенческого билета"
Иванов Петр Николаевич, 1243-Б, 31231343 <enter>
Введите информацию о студенте (для завершения работы программы введите "end")
Петрова Татьяна Михайловна, 1243-Б, 43221343 <enter>
Введите информацию о студенте (для завершения работы программы введите "end")
end <enter>
Список студентов:
  - Иванов Петр Николаевич, 1243-Б, 31231343
  - Петрова Татьяна Михайловна, 1243-Б, 43221343
Реализация
Создайте класс Student с полями name, group, studentId. Тип каждого поля – String.
Переопределите методы hashcode и equals для класса Student так, чтобы нельзя было сохранить двух студентов с одинаковым номером студенческого билета.
Продемонстрируйте добавление объектов класса в HashSet (его создайте в Main), ошибку при добавлении студентов
с одинаковым номером, возможность существования студентов с одинаковыми именами (но разными id).
 */
public class Main {
    private static Set<Student> storage = new HashSet<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String messageStart = "Введите через запятую информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"";
        String messageNext = "Введите информацию о студенте (для завершения работы программы введите \"end\")";

        while (true) {
            System.out.println(storage.isEmpty() ? messageStart : messageNext);
            String userValue = scanner.nextLine();
            if (userValue.equals("end")) {
                //TODO вывод информации о студентах
                printStudents();
                break;
            }

            String[] value = userValue.split(", ");
            Student studentTmp = new Student();

            studentTmp.setName(value[0]);
            studentTmp.setGroup(value[1]);
            studentTmp.setStudentId(value[2]);

            String message = addStudent(studentTmp) ? "Студент добавлен" : "Такой студент уже есть";
            System.out.println(message);

        }
    }

    public static void printStudents() {
        System.out.println("Список всех студентов");
        for (Student student : storage) {
            System.out.println(student.toString());
        }
    }

    public static boolean addStudent(Student student) {
        return storage.add(student);
    }
}

