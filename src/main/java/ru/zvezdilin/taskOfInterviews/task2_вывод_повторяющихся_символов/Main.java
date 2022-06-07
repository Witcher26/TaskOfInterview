package ru.zvezdilin.taskOfInterviews.task2_вывод_повторяющихся_символов;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Дана строка String text. Нужно вывести на экран все символы, которые повторяются больше двух раз
 */
public class Main {
    public static void main(String[] args) {
        //вариант №1
        String text = "lHello";
//        char[] symbols = text.toCharArray();
//
//        for (int i = 0; i < symbols.length-1; i++) {
//            int count = 1;
//            for (int j = i + 1; j < symbols.length; j++) {
//                if(Character.toLowerCase(symbols[i])==Character.toLowerCase(symbols[j])) //преобразовние в нижний регистр
//                    count++;
//            }
//            if (count >= 2)
//                System.out.printf("Символ %s встречается %d раза \n", symbols[i], count);
//        }

        //вариант №2
        for (int i = 0; i < text.length() - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < text.length(); j++)
                if (text.charAt(i) == text.charAt(j)) {
                    count++;
                }
            if (count >= 2)
                System.out.printf("Символ %s повторяется %d раза \n", text.charAt(i), count); // тогда выводит повторяющиеся значения
        }

        //Вариант №3
        char[] arraySymbols = text.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char arraySymbol : arraySymbols) {
            set.add(arraySymbol);
        }
        for (int i = 0; i < arraySymbols.length; i++) {
            for (int j = i+1; j < arraySymbols.length; j++) {
                if((arraySymbols[i]==arraySymbols[j]) && !set.contains(i)){
                    set.add(arraySymbols[i]);
                    //Todo добавляем в множество и увеличиваем количество

                }
             //TODO если в множестве есть символ - меняем значение
            }
        }
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
