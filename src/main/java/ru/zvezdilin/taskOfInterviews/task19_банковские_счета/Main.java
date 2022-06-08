package ru.zvezdilin.taskOfInterviews.task19_банковские_счета;

import ru.zvezdilin.taskOfInterviews.task19_банковские_счета.accounts.Account;
import ru.zvezdilin.taskOfInterviews.task19_банковские_счета.accounts.CheckingAccount;
import ru.zvezdilin.taskOfInterviews.task19_банковские_счета.accounts.CreditAccount;
import ru.zvezdilin.taskOfInterviews.task19_банковские_счета.accounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account accountCheck = new CheckingAccount("Расчётный счёт", 5_000);
        Account accountCredit = new CreditAccount("Кредитный счёт", 0);
        Account accountSaving = new SavingsAccount("Сберегальный счёт", 6_000);

        System.out.println(accountCheck.getBalance()); // каждый счёт имеет баланс
        System.out.println(accountCredit.getBalance());
        System.out.println(accountSaving.getBalance());
        System.out.println();

        accountSaving.pay(1_000); //со сберегательного счёта нельзя платить.
        accountSaving.transfer(accountCheck, 200); // перевод со сберегательного на расчётный
        accountSaving.addMoney(63); // пополнение сберегательного

        System.out.println(accountCheck.getBalance()); // расчётный счет после перевода
        accountSaving.transfer(accountCheck, 5001); // сберегательный не может уходить в минус

        System.out.println("--");
        System.out.println("Баланс расчётного счета: " + accountCheck.getBalance());
        System.out.println("--");

        accountCredit.pay(300); // при оплате с кредитки - она уходит в минус

        accountCredit.addMoney(350); // кредитку нельзя пополнить в плюс
        accountCredit.addMoney(250);  // остаток по кредитке -50

        System.out.println("--");
        System.out.println("Баланс расчётного счета: " + accountCheck.getBalance());
        System.out.println("--");

        accountCheck.transfer(accountCredit, 100); // перевод на кредитку, которая уйдет в плюс - false
        accountCheck.pay(5010);
    }
}
