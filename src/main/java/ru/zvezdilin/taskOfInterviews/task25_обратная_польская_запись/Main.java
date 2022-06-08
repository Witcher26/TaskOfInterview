package ru.zvezdilin.taskOfInterviews.task25_обратная_польская_запись;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Deque<String> queue = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите математическое выражение (через пробел):");
        String userValue = scanner.nextLine();
        String[] line = userValue.split(" ");

        for (int i = 0; i < line.length; i++) {
            queue.add(line[i]);
        }

        Deque<String> dequeForSymbols = new ArrayDeque<>();

        while (!queue.isEmpty()) {
            String s = queue.pollLast();
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                dequeForSymbols.addLast(s);
            } else
                dequeForSymbols.addFirst(s);
        }

        for (String dequeForSymbol : dequeForSymbols) {
            System.out.print(dequeForSymbol + " ");
        }
    }
}





