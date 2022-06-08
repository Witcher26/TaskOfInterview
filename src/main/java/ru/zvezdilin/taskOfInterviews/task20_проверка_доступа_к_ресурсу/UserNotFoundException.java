package ru.zvezdilin.taskOfInterviews.task20_проверка_доступа_к_ресурсу;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message );
    }
}
