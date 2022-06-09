package ru.zvezdilin.taskOfInterviews.task2_вывод_повторяющихся_символов_в_слове_hello;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Вариант №1
        String str = "lHello";
        Map<Character, Integer> storageChars = new HashMap<>();
        char[] chars = str.toCharArray();

        for (char aChar : chars) {
            Integer tmp = storageChars.containsKey(Character.toLowerCase(aChar)) ?
                    storageChars.put(Character.toLowerCase(aChar), storageChars.get(Character.toLowerCase(aChar)) + 1) :
                    storageChars.put(Character.toLowerCase(aChar), 1);
        }

        for (Map.Entry<Character, Integer> mapEntry : storageChars.entrySet()) {
            Character key = mapEntry.getKey();
            int value = mapEntry.getValue();

            System.out.println("Символ: \"" + key + "\", количество в слове: \"" + value + "\" раз");
        }
    }
}

////Вариант №2
//        String text = "Hello";
//        String[][] arrays = countOfCharInWord(text);
//        printValues(arrays);
//
//
//    public static String[][] countOfCharInWord(String text) {
//        String[][] arrays = new String[text.length()][2];
//
//        for (int i = 0; i < text.length() - 1; i++) {
//            int count = 1;
//            for (int j = i + 1; j < text.length(); j++) {
//                if (Character.toLowerCase(text.charAt(i)) == Character.toLowerCase(text.charAt(j))) {
//                    count++;
//                }
//                arrays[i][0] = String.valueOf(text.charAt(i));
//                arrays[i][1] = String.valueOf(count);
//            }
//        }
//        return arrays;
//    }
//
//    public static void printValues(String[][] arrays) {
//        for (int i = 0; i < arrays.length; i++) {
//            if (arrays[i][1] != null) {
//                if (Integer.parseInt(arrays[i][1]) >= 2) {
//                    System.out.printf("Символ %s встречается %s раза \n", arrays[i][0], arrays[i][1]);
//                }
//            }
//        }
//    }
//}

