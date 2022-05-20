package Home_Task_Netology.Eleven.Библиотека.users;

import Home_Task_Netology.Eleven.Библиотека.books.Book;

public interface Reader {
    void takeBook(Administrator administrator, Book book);

    void returnBook(Administrator administrator, Book book);

}
