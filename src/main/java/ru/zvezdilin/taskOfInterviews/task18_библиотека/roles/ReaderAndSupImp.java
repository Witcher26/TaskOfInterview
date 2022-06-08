package ru.zvezdilin.taskOfInterviews.task18_библиотека.roles;

import ru.zvezdilin.taskOfInterviews.task18_библиотека.User;
import ru.zvezdilin.taskOfInterviews.task18_библиотека.books.Book;
import ru.zvezdilin.taskOfInterviews.task18_библиотека.users.Administrator;
import ru.zvezdilin.taskOfInterviews.task18_библиотека.users.Librarian;
import ru.zvezdilin.taskOfInterviews.task18_библиотека.users.Reader;
import ru.zvezdilin.taskOfInterviews.task18_библиотека.users.Supplier;

public class ReaderAndSupImp extends User implements Reader, Supplier {
    private Book book = null;

    public ReaderAndSupImp(String name) {
        super(name);
    }

    public boolean isEmpty() {
        return this.book == null;
    }

    @Override
    public void takeBook(Administrator administrator, Book book) {
        if (isEmpty()) {
            System.out.println("Читатель " + this.getName() + " взял у администратора " + administrator.toString() + " книгу: " + book.getTitle());
            this.book = book;
        } else
            System.out.println("Администратор " + administrator.toString() + " не может выдать читателю " + this.getName() + " книгу: " + book.getTitle()
                    + ", потому что он не вернул предыдущую книгу: " + this.book.getTitle());
    }

    @Override
    public void returnBook(Administrator administrator, Book book) {
        if (isEmpty())
            System.out.println("У пользователя " + this.getName() + " сейчас нет книг");
        else {
            System.out.println("Пользователь " + this.getName() + " вернул администратору " + administrator.toString() + " книгу: " + book.getTitle());
            this.book = null;
        }
    }


    @Override
    public void supply(Librarian librarian, Book book, int count) {
        System.out.println("Библиотекарь " + librarian.toString() + " сделал заказ-наряд на поставку книги: " + book.getTitle()
                + " в количестве: " + count + " штук." + " у поставщика " + this.getName());
    }
}
