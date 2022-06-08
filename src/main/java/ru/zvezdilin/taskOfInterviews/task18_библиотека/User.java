package ru.zvezdilin.taskOfInterviews.task18_библиотека;

public class User {
    private static int idAll = 0;
    private int id;
    private String name;

    public User(String name) {
        this.name = name;
        id = idAll++;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
