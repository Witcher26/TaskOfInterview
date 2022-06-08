package ru.zvezdilin.taskOfInterviews.task18_библиотека.users;

import ru.zvezdilin.taskOfInterviews.task18_библиотека.books.Book;

public interface Reader {
    void takeBook(Administrator administrator, Book book);

    void returnBook(Administrator administrator, Book book);

}
