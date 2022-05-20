package Home_Task_Netology.SixteenTreeSet_И_TreeMap.MissedCalls.phoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<Contact>> groups = new HashMap<>();

    public PhoneBook() {

    }

    public boolean searchPhone(String phoneNumber) {
        for (Map.Entry<String, List<Contact>> entry : groups.entrySet()) {
            for (Contact contact : entry.getValue()) {
                if (contact.getPhoneNumber().equals(phoneNumber)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Contact getContact(String phoneNumber) {
        for (Map.Entry<String, List<Contact>> entry : groups.entrySet()) {
            for (Contact contact : entry.getValue()) {
                if (contact.getPhoneNumber().equals(phoneNumber)) {
                    return contact;
                }
            }
        }
        return null;
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
}

