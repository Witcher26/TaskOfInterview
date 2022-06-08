package ru.zvezdilin.taskOfInterviews.task26_телефонный_справочник.phoneBook;

import java.util.Objects;

public class Contact {
    private String phoneNumber;
    private String name;
    private String lastname;

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Contact() {
    }

    public Contact(String phoneNumber, String name, String lastname) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return name + " " + lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(phoneNumber, contact.phoneNumber) && Objects.equals(name, contact.name) && Objects.equals(lastname, contact.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, name, lastname);
    }
}
