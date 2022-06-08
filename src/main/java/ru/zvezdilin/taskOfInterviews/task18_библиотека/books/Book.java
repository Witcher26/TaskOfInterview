package ru.zvezdilin.taskOfInterviews.task18_библиотека.books;

public class Book {
    private static int idAll = 0;
    private int id;
    private String title;

    public Book(String title) {
        this.title = title;
        id = idAll++;
    }

    public String getTitle() {
        return title;
    }
}
