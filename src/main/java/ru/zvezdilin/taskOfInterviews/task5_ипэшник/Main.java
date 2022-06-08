package ru.zvezdilin.taskOfInterviews.task5_ипэшник;

import java.util.Scanner;
import static java.lang.System.*;

class Main {

    static int income = 0;  // переменная для ввода доходов
    static int spendings = 0; // переменная для ввода расходов

    static String colorRed = (char) 27 + "[31m";  //Красный цвет консоли

    static Scanner scanner = new Scanner(in);

    public static void main(String[] args) {

        while (true) {

            out.println("Введите номер желаемой операции: \n1.Добавить новый доход.\n2.Добавить новый расход.\n3.Выбрать систему налогооблажения. \nЛибо введите \"end\" для выхода");
            String userNumber = scanner.nextLine();

            if(userNumber.equalsIgnoreCase("end")) {
                out.println(colorRed + "Вы завершили работу программы");
                break;
            }

            int operation = Integer.parseInt(userNumber);
            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода: ");
                    String moneyStr = scanner.nextLine();
                    int userMoney = Integer.parseInt(moneyStr);
                    income += userMoney;
                    out.println();
                    break;

                case 2:
                    System.out.println("Введите сумму расхода: ");
                    moneyStr = scanner.nextLine();
                    userMoney = Integer.parseInt(moneyStr);
                    spendings += userMoney;
                    out.println();
                    break;

                case 3:
                    int resultIncomeMinusSpending = calculateTaxIncomeMinusSpendings(income, spendings);//100
                    int resultSixPercent = calculateTaxIncome(income);//90

                    if (resultIncomeMinusSpending>=resultSixPercent) {   //если у первой системы налогов больше - рекомендуем вторую и наоборот.
                        int economy = resultIncomeMinusSpending-resultSixPercent; // экономия
                        out.println("Мы советуем вам систему: \"УСН доходы\"");
                        out.println("Ваш налог составит: " + resultSixPercent);
                        out.println("Экономия составит: " + economy);
                        out.println();
                    }
                    else {
                        out.println("Мы советуем вам систему: \"УСН доходы минус расходы\"");
                        int economy = resultSixPercent-resultIncomeMinusSpending; // экономия
                        out.println("Ваш налог составит: " + resultIncomeMinusSpending);
                        out.println("Экономия составит: " + economy);
                        out.println();
                    }
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }
    }


    public static int calculateTaxIncomeMinusSpendings(int income, int spendings) {
        int tax = (income - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }
    public static int calculateTaxIncome(int income){
        int tax = income * 6 / 100;
        return tax;
    }
}