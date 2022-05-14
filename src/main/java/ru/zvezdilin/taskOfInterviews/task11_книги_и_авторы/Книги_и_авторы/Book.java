package Home_Task_Netology.six.Книги_и_авторы;

public class Book {
    static private int numberOfBooks = 0;
    static private int idAll = 0;

    private int id = 0;
    public String title;
    public String athtor;
    public Genre genre;
    public int numberOfPages;


    public Book() {
        String color = (char) 27 + "[32m"; // цвет - зеленый
        System.out.println(color);
        System.out.println("==================================");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Добро пожаловать в СУПЕР ОНЛАЙН-ЧИТАЛКУ!!! \nПри помощи соответствующих команд узнавайте: автора книги и жанр по названию книги, " +
                "\nвыводите общее количество книг в читалке, сравнивайте. \nПриятного чтения!");
        System.out.println("==================================");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

    public Book(String title, String athtor, Genre genre, int numberOfPages) {
        this.id=++idAll;
        this.title = title;
        this.athtor = athtor;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
        ++numberOfBooks;

    }

    public String toString() {
        return "Название книги: " + title + ". " + "Автор: " + athtor + ". " + "Жанр: " + genre + ". " +
                "Количество страниц: " + numberOfPages + ". " + "Жанр книги: " + genre + ".";
    }

    public static boolean compareBooks(Book book1, Book book2) {   // сравнение книг на равенство
        return book1.id == book2.id;
    }

    public static String authorOfBook(Book book) {  // вывод автора книги
        return (book.athtor);
    }

    public static Genre genreOfBook (Book book) { // вывод жанра книги
        return book.genre;
    }

    public static int allBooks (){
        return numberOfBooks;
    }
}
