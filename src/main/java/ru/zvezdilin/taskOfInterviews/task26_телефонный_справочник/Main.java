package ru.zvezdilin.taskOfInterviews.task26_телефонный_справочник;

import ru.zvezdilin.taskOfInterviews.task26_телефонный_справочник.phoneBook.Contact;
import ru.zvezdilin.taskOfInterviews.task26_телефонный_справочник.phoneBook.PhoneBook;

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


