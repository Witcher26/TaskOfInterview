package Home_Task_Netology.FifteenHashMapHashSet.PhoneBook.phoneBook;
/*
Эта задача про телефонный справочник с поддержкой групп контактов. Один контакт может входить в несколько групп.
Например, если вы работаете со своим другом, то он будет в группах "Друзья" и "Работа".
Должна быть возможность создания групп и контактов, добавления одного контакта в несколько групп.
Вам предстоит разработать систему классов:

Contact - класс контакт
PhoneBook - класс телефонной книги с контактами и группами.
Общаться с пользователем в main необязательно, просто продемонстрируйте работспособность ваших классов.

Функционал классов
Создание группы контактов;
Создание контакта;
Добавление контакта в разные группы;
Поиск контактов по группе;
Поиск контакта по номеру (одну из этих двух последних операций можно сделать перебором);

Реализация
1.Создадим класс PhoneBook, в котором будем хранить все созданные группы.
2. В классе PhoneBook создадим HashMap: ключом для этой коллекции будет название группы, а значением — список контактов (List<Contact>).
3. Создадим класс Contact c полями: имя и номер телефона (при необходимости переоределим hashCode, equals, toString).
4. Создадим методы для добавления группы и контакта в группы в классе PhoneBook.
5. Для демонстрации работы программы в коде создадим несколько контактов и добавим их в несколько групп.

 */


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




