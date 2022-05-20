package Home_Task_Netology.Eleven.Библиотека.users;

import Home_Task_Netology.Eleven.Библиотека.books.Book;

public interface Administrator {
    void overdueNotification(Reader reader);

    void giveOutBook(Reader reader, Book book);
}
