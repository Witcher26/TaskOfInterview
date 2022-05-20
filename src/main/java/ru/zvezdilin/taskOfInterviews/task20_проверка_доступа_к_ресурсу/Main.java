package Home_Task_Netology.TwelveИсключения.ПроверкаДоступаКресурсу;

import java.util.Scanner;

import static java.lang.System.*;
/*
Описание
В этом задании мы напишем программу для проверки доступа к ресурсу.
Во время запуска программы нужно запросить логин или пароль пользователя.
Если один из введеных параметров не совпадает (логин/пароль), то нужно выбросить checked исключение UserNotFoundException.
Если возраст пользователя менее 18 лет, то нужно выбросить исключение AccessDeniedException, а если 18 и больше лет - вывести сообщение "Доступ предоставлен".

Массив пользователей для авторизации нужно описать до запуска программы. Каждая запись пользователя содержит поля: login, password, age (возраст) и email.

Функционал программы
Создание Scanner для чтения логина и пароля пользователя из консоли;
Создание checked исключения UserNotFoundException;
Создание checked исключения AccessDeniedException;
Выбрасывать ошибку UserNotFoundException, если логин или пароль введены не верно;
Выбрасывать ошибку AccessDeniedException, если возраст пользователя меньше 18 лет;
Если ошибок не возникло, вывести сообщение "Доступ предоставлен".
 */
public class Main {
    private static String userLogin;
    private static String userPassword;

    public static User[] getUsers() {
        User user1 = new User("Kristina", "45Er44+_sK", 25, "kristina@mail.ru");
        User user2 = new User("Ksenia", "123456789", 17, "ksenia18@mail.ru");
        User user3 = new User("Daria", "QwErty", 27, "daria@mail.ru");
        return new User[]{user1, user2, user3};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (user.getLogin().equals(login) &&
                    user.getPassword().equals(password))
                return user;
        }
        throw new UserNotFoundException("Пользователь не найден");
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() < 18) {
            throw new AccessDeniedException("Возраст меньше 18");
        }
    }

    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scanner = new Scanner(in);

        out.print("Введите логин пользователя: ");
        userLogin = scanner.nextLine();

        out.print("Введите пароль пользователя: ");
        userPassword = scanner.nextLine();

        try {
            validateUser(getUserByLoginAndPassword(userLogin, userPassword));
            out.println("Добро пожаловать в наш клуб!");
        } catch (UserNotFoundException err) {
            throw new UserNotFoundException("Логин/пароль не совпадают");
        } catch (AccessDeniedException err) {
            throw new AccessDeniedException("Возраст пользователя менее 18 лет");
        }
    }
}

