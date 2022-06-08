package ru.zvezdilin.taskOfInterviews.task20_проверка_доступа_к_ресурсу;

import java.util.Scanner;

import static java.lang.System.*;

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

