package ru.zvezdilin.taskOfInterviews.task21_валидация_прочитанных_событий;
public class Main {

    public static Event[] getTheaters() {
        Theate heat = new Theate("Холодное сердце", 2013, 6);
        Theate annaK = new Theate("Анна Каренина", 2020, 3);
        Theate stupidPerson = new Theate("Бестолоч", 2021, 10);
        return new Theate[]{heat, annaK, stupidPerson};
    }

    public static Event[] getCinema() {
        Cinema movie = new Cinema("Matrix4", 2021, 16);
        Cinema cartoon = new Cinema("Ratatouille", 2007, 2);
        Cinema adventure = new Cinema("Anastasia", 2007, 1);
        return new Cinema[]{movie, cartoon, adventure};
    }

    public static void validation(Event[] eventsMassive) throws RuntimeException {
        for (Event event : eventsMassive) {
            if (event.getTitle() != null && event.getReleaseYear() != 0 && event.getAge() != 0) {
                System.out.println("\"" + event.getTitle() + "\" - Ok");
            } else
                throw new RuntimeException();
        }
        System.out.println();
    }

    public static void main(String[] args) throws RuntimeException {
        try {
            System.out.println("Проверка корректности заполнения полей спектаклей:");
            validation(getTheaters());
            System.out.println("Проверка корректности заполнения полей кино:");
            validation(getCinema());
            String green = (char) 27 + "[32m";
            System.out.println(green + "Москва. Метро Люблино. Работаем");
        } catch (RuntimeException err) {

            System.out.println("Одно из полей заполнено некорректно");
        }
    }
}
