package Home_Task_Netology.FifteenHashMapHashSet.PhoneBook;

/*
Эта задача про телефонный справочник с поддержкой групп контактов. Один контакт может входить в несколько групп.
Например, если вы работаете со своим другом, то он будет в группах "Друзья" и "Работа".
Должна быть возможность создания групп и контактов, добавления одного контакта в несколько групп.
Вам предстоит разработать систему классов:

Contact - класс контакт
PhoneBook - класс телефонной книги с контактами и группами.
Общаться с пользователем в main необязательно, просто продемонстрируйте работспособность ваших классов.

Функционал классов
Создание группы контактов;
Создание контакта;
Добавление контакта в разные группы;
Поиск контактов по группе;
Поиск контакта по номеру (одну из этих двух последних операций можно сделать перебором);

Реализация
1.Создадим класс PhoneBook, в котором будем хранить все созданные группы.
2. В классе PhoneBook создадим HashMap: ключом для этой коллекции будет название группы, а значением — список контактов (List<Contact>).
3. Создадим класс Contact c полями: имя и номер телефона (при необходимости переоределим hashCode, equals, toString).
4. Создадим методы для добавления группы и контакта в группы в классе PhoneBook.
5. Для демонстрации работы программы в коде создадим несколько контактов и добавим их в несколько групп.

 */

import Home_Task_Netology.FifteenHashMapHashSet.PhoneBook.phoneBook.Contact;
import Home_Task_Netology.FifteenHashMapHashSet.PhoneBook.phoneBook.PhoneBook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        //TODO создание группы
        System.out.println("Создание группы: ");
        phoneBook.createGroup("Family");
        phoneBook.createGroup("Job");
        phoneBook.createGroup("Friends");

        //TODO Создание контакта;
        Contact fedor = new Contact("+79851816294", "Федор", "Гвинятин");
        Contact money = new Contact("8(800)-555-35-35", "Money", "Fast");

        System.out.println("Добавление контактов в группы");

        phoneBook.addContact(fedor, "Family");
        phoneBook.addContact(money, "Family");
        phoneBook.addContact(fedor, "Job");
        phoneBook.addContact(money, "Job");

        //TODO поиск контакт по группе
        System.out.println("Поиск контакта по группе");
        phoneBook.searchContactByGroup("Федор", "Family");
        System.out.println();
        phoneBook.searchContactByGroup("Федор", "Friends");

        //TODO поиск по телефону
        System.out.println("Поиск по телефону");
        phoneBook.searchPhone("+79851816294");

        System.out.println("Добавление контакта с ошибкой");
        phoneBook.addContact(fedor, null);
    }
}

