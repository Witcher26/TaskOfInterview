package Home_Task_Netology.Eleven.Библиотека;

import Home_Task_Netology.Eleven.Библиотека.books.Book;
import Home_Task_Netology.Eleven.Библиотека.books.Magazine;
import Home_Task_Netology.Eleven.Библиотека.roles.LibrarianAndAdminImp;
import Home_Task_Netology.Eleven.Библиотека.roles.ReaderAndSupImp;
import Home_Task_Netology.Eleven.Библиотека.users.Administrator;
import Home_Task_Netology.Eleven.Библиотека.users.Librarian;
import Home_Task_Netology.Eleven.Библиотека.users.Reader;
import Home_Task_Netology.Eleven.Библиотека.users.Supplier;

/*
Описание
Необходимо разработать иерархию работников библиотеки. Нужно реализовать совмещение нескольких ролей в библиотеке
в одном исполнителе через интерфейсы. Каждый объект в программе имеет определенный набор действий.

Часто программист, создающий объект, не представляет все ситуации, в которых тот будет использоваться.
Также программисту, использующему объект, часто неизвестны все его детали.

Для передачи информации о том, что должен уметь объект, используются интерфейсы.

Примером интерфейсов в нашей библиотеке может служить понятие роли на проекте.
Каждая роль подразумевает набор определенных операций, которые должен "уметь" объект пользователь — User в программе.

Функционал программы
Создайте иерархию "Пользователи библиотеки" со следующими интерфейсами:
Читатель – берет и возвращает книги.
Библиотекарь – заказывает книги.
Поставщик книг – приносит книги в библиотеку.
Администратор – находит и выдает книги и уведомляет о просрочках времени возврата.
В методе public static void main создайте 2-3 объекта, реализующих эти интерфейсы.
 */
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("\"Война и мир\"");
        Book book2 = new Book("\"Игры Престолов\"");
        Magazine magazine1 = new Magazine("\"Жизнь и здоровье\"");
        Magazine magazine2 = new Magazine("\"Автомир\"");

        Reader bob = new ReaderAndSupImp("Bob");
        Administrator admin = new LibrarianAndAdminImp("Dmitrii");
        Supplier supplier = new ReaderAndSupImp("Egor");
        Librarian librarian = new LibrarianAndAdminImp("TODO");

        admin.giveOutBook(bob, book1);
        bob.takeBook(admin, book2);
        bob.takeBook(admin, magazine1);

        supplier.supply(librarian, magazine2, 50);
        admin.overdueNotification(bob);

        librarian.orderBooks(supplier, magazine1, 10);
        bob.returnBook(admin, book1);
    }
}
