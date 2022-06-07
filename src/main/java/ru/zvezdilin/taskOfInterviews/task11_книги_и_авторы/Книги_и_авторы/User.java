package ru.zvezdilin.taskOfInterviews.task11_книги_и_авторы.Книги_и_авторы;

public class User {
    static private int idAll=0;
    static private int allUsers = 0;

    private int id;
    public String name;
    public String surname;
    public int age;
    public Book book;
    public String email;

    public User(String name, String surname, int age, Book book, String email) {
        this.id = idAll++;
        this.name = name;
        this.age = age;
        this.book = book;
        this.surname=surname;
        this.email=email;
    }

    public String toString() {
        return "Имя пользователя - " + name + ". " +
                "Фамилия - " + surname +".  " +
                "Возраст пользователя - " + age  + ". " +
                "Уникальный номер пользователя - " + id + ". " +
                "Пользователь читает книгу - " + book.title + " " +
                "из жанра " + book.genre + ". " +
                "Его почта  - " + email + ". ";
    }

    public static int allUser(){
        return ++idAll;
    }
}