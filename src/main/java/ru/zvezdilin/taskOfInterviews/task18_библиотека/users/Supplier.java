package Home_Task_Netology.Eleven.Библиотека.users;

import Home_Task_Netology.Eleven.Библиотека.books.Book;

public interface Supplier {
    void supply(Librarian librarian, Book book, int count);
}
