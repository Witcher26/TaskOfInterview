package ru.zvezdilin.taskOfInterviews.task6_сравнение_double;

import java.util.Scanner;
import static java.lang.System.*;

class Main {


    static Scanner scanner = new Scanner(in);

    static String colorGreen = (char) 27 + "[32m";  //  цвет консоли - зелёный.
    static String colorYellow = (char) 27 + "[33m"; // цвет консоли - жёлтый
    static String colorRed = (char) 27 + "[31m";  //Красный

    static double userNumber1;    // объявляем статические переменные
    static float userNumber2;

    // Создаём метод сравнения на больше или меньше, используя тернарную операцию.
    static String compareMethod() {
        String comparisonResult = userNumber1 > userNumber2 ? userNumber1 + " больше, чем " + userNumber2 : userNumber2 + " больше,чем " + userNumber1;
        out.println(colorYellow + comparisonResult);
        return comparisonResult;
    }
    public static void main(String[] args) {

        while (true) {    // зацикливаем все операции
            out.println(colorGreen + "Введите номер желаемой операции: \n1.Сравнить.\n2.Округлить.\n3.Отбросить дробную часть. \nЛибо введите \"end\" для выхода");
            String userValue = scanner.nextLine();
            if(userValue.equalsIgnoreCase("end")){
                out.println(colorRed+ "Game over. Вы самое слабое звено - прощайте.");
                break;
            }
            int numberOfOperation = Integer.parseInt(userValue);

            // numberOfOperation = scanner.nextInt();


            switch (numberOfOperation) {
                case 1:
                    // сравнение
                    out.print("Введите первое дробное число: ");
                    userNumber1 = Double.parseDouble(scanner.nextLine());

                    out.print("Введите второе дробное число: ");
                    userNumber2 = Float.parseFloat(scanner.nextLine());

                    // сравниваем между собой числа на равенство
                    if (Math.abs(userNumber1 - userNumber2) <= 0.00001) { //если погрешность не больше(или равна) 1=й-миллионой,то считаем числа равными
                        out.println(colorYellow + userNumber1 + " = " + userNumber2);
                        out.println("=====================================");
                        out.println();
                    } else {
                        compareMethod();
                    }
                    break;

                case 2:
                    // округление
                    out.print("Введите дробное число, которое хотите округлить: ");
                    userNumber1 = Double.parseDouble(scanner.nextLine());

                    out.println("Вы ввели след. число: " + userNumber1);

                    long roundedNumber = Math.round(userNumber1);
                    out.println(colorYellow + "Ваше округлённое число: " + roundedNumber);
                    out.println("=====================================");
                    out.println();
                    break;

                case 3:
                    //   отбросывание дробной части
                    out.print("Введите число с дробной частью: ");
                    userNumber1 = Double.parseDouble(scanner.nextLine());

                    out.println("Вы ввели след. число: " + userNumber1);

                    long wholeNumber = (long) userNumber1;
                    out.println(colorYellow + "Ваше число без дробной части: " + wholeNumber);
                    out.println("=====================================");
                    out.println();
                    break;

                default:
                    System.out.println("Такой операции нет");
            }
        }
    }
}