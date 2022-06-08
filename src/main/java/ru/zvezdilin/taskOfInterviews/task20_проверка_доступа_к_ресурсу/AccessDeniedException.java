package ru.zvezdilin.taskOfInterviews.task20_проверка_доступа_к_ресурсу;

public class AccessDeniedException extends Exception{
    public AccessDeniedException(String message) {
        super(message);
    }
}
