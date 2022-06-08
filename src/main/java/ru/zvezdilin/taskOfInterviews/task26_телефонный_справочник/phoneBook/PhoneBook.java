package ru.zvezdilin.taskOfInterviews.task26_телефонный_справочник.phoneBook;

import java.util.*;

public class PhoneBook {

    private Map<String, List<Contact>> groups = new HashMap<>();

    public PhoneBook() {
    }

    public void createGroup(String nameGroup) {
        String message;
        System.out.println(message = groups.containsKey(nameGroup) ? "\"" + nameGroup + "\" уже существует" : "\""
                + nameGroup + "\" создана");
        groups.put(nameGroup, new ArrayList<>());
    }

    public void addContact(Contact contact, String nameGroup) {
        try {

            if (groups.get(nameGroup).contains(contact)) {
                System.out.println("В данной группе уже такой контакт");
            } else
                groups.get(nameGroup).add(contact);
            System.out.println(contact + " добавлен в групу " + nameGroup);
        } catch (NullPointerException ex) {
            System.out.println("один из объектов null");
        }
    }

    public void searchContactByGroup(String nameOrLastname, String nameGroup) {
        for (Map.Entry<String, List<Contact>> entry : groups.entrySet()) {
            if (entry.getKey().equals(nameGroup)) {
                List<Contact> tmpContact = entry.getValue();

                for (Contact contact : tmpContact) {
                    //TODO поиск совпадения по имени или по фамилии
                    if (contact.getLastname().equals(nameOrLastname) || contact.getName().equals(nameOrLastname)) {
                        System.out.println("контакт \"" + contact.getName() + "\" найден в группе: " + nameGroup);
                    } else {
                        System.out.println("контакт \"" + nameOrLastname + "\" в группе \"" + nameGroup + "\" не найден");
                    }
                }

            }
        }
    }

    public void searchPhone(String phoneNumber) {
        for (Map.Entry<String, List<Contact>> entry : groups.entrySet()) {
            for (Contact contact : entry.getValue()) {
                if (contact.getPhoneNumber().equals(phoneNumber)) {
                    System.out.println("по номеру телефона: " + phoneNumber + " был найден следующий контакт: ");
                    System.out.println(contact);
                }
            }
        }
        System.out.println("Контакта по номеру телефона: " + phoneNumber + " не найдено");
        System.out.println();
    }
}




