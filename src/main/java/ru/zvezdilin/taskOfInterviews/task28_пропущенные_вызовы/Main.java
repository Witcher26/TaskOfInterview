package ru.zvezdilin.taskOfInterviews.task28_пропущенные_вызовы;

import ru.zvezdilin.taskOfInterviews.task28_пропущенные_вызовы.phoneBook.Contact;
import ru.zvezdilin.taskOfInterviews.task28_пропущенные_вызовы.phoneBook.MissedCalls;
import ru.zvezdilin.taskOfInterviews.task28_пропущенные_вызовы.phoneBook.PhoneBook;

import java.time.LocalDateTime;

public class Main {
    public static final long MAX = 999_999_99_99L;
    public static final long MiN = 900_000_00_00L;

    public static void main(String[] args) throws InterruptedException {
        PhoneBook phoneBook = new PhoneBook();
        MissedCalls missedCalls111 = new MissedCalls();

        //TODO создание группы
        System.out.println("Создание группы: ");
        phoneBook.createGroup("Family");
        System.out.println("----------------------");

        //TODO Создание контакта;
        Contact fedor = new Contact("+79851816294", "Федор", "Гвинятин");
        Contact money = new Contact("8(800)-555-35-35", "Money", "Fast");
        System.out.println("----------------------");

        System.out.println("Добавление контактов в группу");

        phoneBook.addContact(fedor, "Family");
        phoneBook.addContact(money, "Family");
        System.out.println("----------------------");

        //TODO генерация пропущенных вызовов;
        System.out.println("Генеральция пропущенных вызовов: ");
        missedCalls111.addMissedContact(new MissedCalls(LocalDateTime.now(), getRandomNumber()));
        Thread.sleep(300);
        missedCalls111.addMissedContact(new MissedCalls(LocalDateTime.now(), getRandomNumber()));
        Thread.sleep(300);
        missedCalls111.addMissedContact(new MissedCalls(LocalDateTime.now(), fedor.getPhoneNumber()));
        Thread.sleep(300);
        missedCalls111.addMissedContact(new MissedCalls(LocalDateTime.now(), getRandomNumber()));
        Thread.sleep(300);
        missedCalls111.addMissedContact(new MissedCalls(LocalDateTime.now(), money.getPhoneNumber()));
        Thread.sleep(300);
        System.out.println("----------------------");

        System.out.println("Список пропущенных вызовов: ");
        missedCalls111.printMissedCals(phoneBook);
    }

    public static String getRandomNumber() {
        return Long.toString((long) ((Math.random() * (MAX - MiN)) + MiN));
    }
}
