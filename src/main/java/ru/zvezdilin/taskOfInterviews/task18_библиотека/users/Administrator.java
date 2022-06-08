package ru.zvezdilin.taskOfInterviews.task18_библиотека.users;


import ru.zvezdilin.taskOfInterviews.task18_библиотека.books.Book;

public interface Administrator {
    void overdueNotification(Reader reader);

    void giveOutBook(Reader reader, Book book);
}
