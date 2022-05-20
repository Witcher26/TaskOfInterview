package Home_Task_Netology.SixteenTreeSet_И_TreeMap.MissedCalls;

import Home_Task_Netology.SixteenTreeSet_И_TreeMap.MissedCalls.phoneBook.Contact;
import Home_Task_Netology.SixteenTreeSet_И_TreeMap.MissedCalls.phoneBook.MissedCalls;
import Home_Task_Netology.SixteenTreeSet_И_TreeMap.MissedCalls.phoneBook.PhoneBook;

import java.time.LocalDateTime;
/*
Совсем недавно мы с вами создавали программу для хранения номеров телефонов.
Следующая программа будет будет немного схожа по тематике. Нужно написать программу для хранения пропущенных звонков,
используя уже изученные коллекции, в том числе коллекцию TreeMap.
Программа должна хранить список пропущенных вызовов в формате: дата и время звонка и номер.

Вам надо разработать систему классов:

Класс контакта
Класс телефонной книги из прошлого задания + метод для поиска контакта по номеру
Класс списка пропущенных вызовов
Пропущенный вызов должен описываться временем и номером (не контактом).
Для времени используйте класс LocalDateTime, для получения текущего момента времени - LocalDateTime.now().

В классе списка пропущенных вызовов должен быть метод, принимающий телефонную книгу и выводящий
на экран все пропущенные вызовы в том порядке, в котором они поступали,
при этом для номеров для которых есть контакт должно быть выведено на экран имя звонившего, а не номер.

В классе Main продемонстрируйте работу ваших классов.
 */
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
