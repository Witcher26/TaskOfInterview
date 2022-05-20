package Home_Task_Netology.SixteenTreeSet_И_TreeMap.MissedCalls.phoneBook;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

public class MissedCalls implements Comparable<MissedCalls> {
    private LocalDateTime localDateTime;
    private String phoneNumber;
    private Map<LocalDateTime, String> missedCalls = new TreeMap<>();

    public MissedCalls() {
    }

    public MissedCalls(LocalDateTime localDateTime, String phoneNumber) {
        this.localDateTime = localDateTime;
        this.phoneNumber = phoneNumber;
    }

    public void addMissedContact(MissedCalls missedCal) {
        missedCalls.put(missedCal.localDateTime, missedCal.phoneNumber);
    }

    @Override
    public String toString() {
        return localDateTime + ", " + phoneNumber;
    }

    public void printMissedCals(PhoneBook phoneBook) {

        for (Map.Entry<LocalDateTime, String> entry : missedCalls.entrySet()) {
            try {
                if (phoneBook.searchPhone(entry.getValue())) {
                    System.out.print("Дата и время звонка: " + entry.getKey() + ", тел.: ");
                    System.out.println(phoneBook.getContact(entry.getValue()));
                } else {
                    System.out.println("Дата и время звонка: " + entry.getKey() + ", тел.: " + entry.getValue());
                }
            } catch (NullPointerException ex) {
                System.out.println("Err");
            }
        }
    }

    @Override
    public int compareTo(MissedCalls altMisCalls) {
        return localDateTime.compareTo(altMisCalls.localDateTime);
    }
}

