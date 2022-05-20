package Home_Task_Netology.Eleven.Банковские_счета;

import Home_Task_Netology.Eleven.Банковские_счета.accounts.Account;
import Home_Task_Netology.Eleven.Банковские_счета.accounts.CheckingAccount;
import Home_Task_Netology.Eleven.Банковские_счета.accounts.CreditAccount;
import Home_Task_Netology.Eleven.Банковские_счета.accounts.SavingsAccount;

/*
Описание
Часто в проектировании программ нам удобно опираться на понятия, которые не представлены в реальном мире,
но служат удобной "опорой" для объединения нескольких классов.

Так, например, в банковском деле нет абстрактного понятия "Счет".
Каждый счет в банке имеет четкое назначение: сберегательный, кредитный, расчетный.
Но банковская программа работает с общими для счетов операциями как с одинаковыми объектами,
и выполняет их, обращаясь к общему типу "Счет", хотя его и невозможно явно инстанцировать в программе.
Реализуйте этот сценарий, опираясь на механизмы полиморфизма.

Функционал программы
Создайте несколько классов — различных счетов на основе общего интерфейса:
Сберегательный счет (SavingsAccount)
Кредитный счет (CreditAccount)
Расчетный счет (CheckingAccount)
Выполните перевод с одного счета на другой в методе public static void main.
 */
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
