package Home_Task_Netology.Eleven.Библиотека.users;

import Home_Task_Netology.Eleven.Библиотека.books.Book;

public interface Librarian {
    void orderBooks(Supplier supplier, Book book, int count);
}
