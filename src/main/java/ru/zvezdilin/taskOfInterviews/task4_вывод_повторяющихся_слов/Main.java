package ru.zvezdilin.taskOfInterviews.task4_вывод_повторяющихся_слов;

import java.util.HashMap;
import java.util.Map;

public class Main {
    //Мама моет раму, Рама держит маму. Вышла замуж мама за индуса Раму и т.д.- `вывести на экран, сколько раз повторяется каждое слово.
    public static void main(String[] args) {
        String str = "Мама моет раму, Рама держит маму. Вышла замуж мама за индуса Раму";
        Map<String, Integer> words = new HashMap<>();

        String[] arr = str.split("\\P{IsAlphabetic}+");
        for (String s : arr) {
            Integer anyTmp = words.containsKey(s.toLowerCase()) ? words.put(s.toLowerCase(), words.get(s.toLowerCase()) + 1) : words.put(s.toLowerCase(), 1);
        }

        for (Map.Entry<String, Integer> mapEntry : words.entrySet()) {
            String key = mapEntry.getKey();
            int value = mapEntry.getValue();

            System.out.println("Слово: \"" + key + "\", количество в тексте: \"" + value + "\" раз");
        }
    }
}
