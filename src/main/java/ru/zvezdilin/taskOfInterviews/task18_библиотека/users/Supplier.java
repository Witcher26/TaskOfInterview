package ru.zvezdilin.taskOfInterviews.task18_библиотека.users;

import ru.zvezdilin.taskOfInterviews.task18_библиотека.books.Book;

public interface Supplier {
    void supply(Librarian librarian, Book book, int count);
}
