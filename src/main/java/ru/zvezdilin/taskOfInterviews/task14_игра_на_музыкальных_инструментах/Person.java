package ru.zvezdilin.taskOfInterviews.task14_игра_на_музыкальных_инструментах;

public class Person {
    public int a;
    public int b;

    public Person(int a, int b) {
        this.a = a;
        this.b = b;
    }

    protected void play(){
        System.out.println("Это класс Person");
    }
}
