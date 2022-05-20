package Home_Task_Netology.Fourteen_Коллекции_Queue.Польская_Запись;


/*
Задача 2. Польская запись.
Описание
Задача - написать программу перевода инфиксной записи (например 2 + 3) в постфиксную запись (2 3 +),
что и будет являться так называемой "Обратной польской записью". Обра́тная по́льская запись
(англ. Reverse Polish notation, RPN) — форма записи математических и логических выражений,
в которой операнды расположены перед знаками
операций (источник https://ru.wikipedia.org/wiki/%D0%9F%D0%BE%D0%BB%D1%8C%D1%81%D0%BA%D0%B0%D1%8F_%D0%BD%D0%BE%D1%82%D0%B0%D1%86%D0%B8%D1%8F).
Такая запись имеет ряд преимуществ перед инфиксной записью при выражении математических формул:

Любая формула может быть выражена без скобок.
Удобна для вычисления формул в stack машинах (например JVM).
Нет нежелательных приоритетов операторов.
Необходимо реализовать алгоритм на основе очереди, который прочитает математическое выражение,
найдет все числа и сохранит их отдельно от знаков (в отдельную коллекцию).

Функционал программы
Ввод математического выражения
Вывод выражения в формате обратной польской записи.
 */
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





