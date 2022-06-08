package ru.zvezdilin.taskOfInterviews.task27_список_студентов;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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

