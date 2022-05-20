package Home_Task_Netology.Eleven.Библиотека.roles;

import Home_Task_Netology.Eleven.Библиотека.User;
import Home_Task_Netology.Eleven.Библиотека.books.Book;
import Home_Task_Netology.Eleven.Библиотека.users.Administrator;
import Home_Task_Netology.Eleven.Библиотека.users.Librarian;
import Home_Task_Netology.Eleven.Библиотека.users.Reader;
import Home_Task_Netology.Eleven.Библиотека.users.Supplier;

public class LibrarianAndAdminImp extends User implements Librarian, Administrator {
    private int count = 0;
    private Book book;

    public LibrarianAndAdminImp(String name) {
        super(name);
    }

    @Override
    public void orderBooks(Supplier supplier, Book book, int count) {
        System.out.println("Библиотекарь " + this.getName() + " заказывает у поставщика  " + supplier.toString()
                + " книги: " + book.getTitle() + " в количестве " + count + " штук.");
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Администратор " + this.getName() + " уведомляет о том, что " + reader.toString()
                + " должен вернуть книгу");
    }

    @Override
    public void giveOutBook(Reader reader, Book book) {
        if (this.book != null) {
            System.out.println("Администратор " + this.getName() + " не может выдать читателю " + reader.toString()
                    + " книгу: " + book.getTitle() + " потому что он не вернул предыдущую книгу");
            this.book = book;
        } else
            System.out.println("Администратор " + this.getName() + " выдал читателю " + reader.toString()
                    + " книгу: " + book.getTitle());
    }
}
