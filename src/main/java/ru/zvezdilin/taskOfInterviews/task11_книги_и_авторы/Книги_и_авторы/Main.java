package ru.zvezdilin.taskOfInterviews.task11_книги_и_авторы.Книги_и_авторы;
public class Main {
    public static void main(String[] args) {

        Book book = new Book();
        Book book1 = new Book("Война и мир","Лев Николаевич Толстой", Genre.NOVEL, 1270);
        Book book2 = new Book("1984", "Джордж Оруэлл Жан-Кристоф Дерьен", Genre.NOVEL, 320);
        Book book3 = new Book("The Catcher in the Rye", "Jerome David Salinger", Genre.NOVEL, 128);
        Book book4 = new Book("Harry Potter and the Philosopher's Stone", "Joanne Kathleen Rowling", Genre.ROMANCE, 340);

        System.out.println("Количество книг в читалке: " + Book.allBooks() + "\n");

        System.out.println("Список всех книг:");

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println(book4.toString());
        System.out.println();

        System.out.println("Одинаковы ли книги: "+ book1.title +" и " + book2.title + "?");
        System.out.println("Ответ: " + Book.compareBooks(book1, book2));
        System.out.println();

        System.out.println("Кто является автором книги: "+ book4.title + "?");
        System.out.println("Ответ:" + Book.authorOfBook(book4));

        System.out.println();

        System.out.println("Кто является автором книги: " + book2.title + "?");
        System.out.println("Ответ: " + Book.authorOfBook(book2));

        System.out.println();

        System.out.println("Какой жанр у книги: " + book2.title + "?");
        System.out.println("Ответ: " + Book.genreOfBook(book2));

        System.out.println();
        System.out.println("Пользователи: ");

        User user1 = new User("Владимир", "Иванов", 20, book1,"ivanov@mail.ru");
        User user2 = new User("Коловрат", "Абрамович", 99, book2,"kolovrat@mail.ru");
        User user3 = new User("Евптатий", "Прохоров", 41, book1,"evpatii@mail.ru");

        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());

        user3.book=book1;

        System.out.println(user3.toString());

    }
}
