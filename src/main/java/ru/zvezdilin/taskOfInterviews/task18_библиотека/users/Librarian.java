package ru.zvezdilin.taskOfInterviews.task18_библиотека.users;

import ru.zvezdilin.taskOfInterviews.task18_библиотека.books.Book;

public interface Librarian {
    void orderBooks(Supplier supplier, Book book, int count);
}
