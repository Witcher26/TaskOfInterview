# TaskOfInterview
Задачи с собеседований

***
### Задача №1 - Воздушные рейсы  
Описание
Необходимо продумать и разработать структуру классов и интерфейсов небольшого модуля, который будет заниматься фильтрацией набора перелётов согласно различным правилам. Правил фильтрации может быть несколько. Также наборы перелётов могут быть большими. Правила могут выбираться и задаваться динамически в зависимости от контекста выполнения операции фильтрации. Вывод информации в консоль.
### Задача №2 - `Вывод повторяющихся символов в слове`  
Слово - "hello"
### Задача №3 - `Дан массив целых чисел. Написать метод, который будет выводить все простые числа`.   
Примечание: простые числа делятся на 1 и на сами себя.   
### Задача №4 - `Мама моет раму, Рама держит маму. Вышла замуж мама за индуса Раму - вывести на экран, сколько раз повторяется каждое слово`.   
Использовать HashMap.  


### Задача №5 - `ИПэшник`.
Описание
Нужно написать программу-помощника индивидуальному предпринимателю (далее - ИП), которая помогает ему выбрать лучшую систему налогообложения. ИП будет заносить суммы доходов и расходов, а программа будет выбирать для него лучшую систему налогообложения из двух:

УСН доходы - налог 6% от доходов;
УСН доходы минус расходы - налог 15% от разницы доходов и расходов.
#Функционал программы:#
- Ввод сумм доходов и расходов ИП;
- ИП может несколько раз вносить доходы и расходы, они должны суммироваться с введёнными ранее данными;
- При выборе ИП опции определения наиболее выгодной системы налогообложения, программа должна вывести название такой системы (УСН доходы или УСН доходы минус расходы);
- При выводе самой выгодной системы налогообложения, программа должна вывести также сумму, которую удастся сэкономить, если выбрать эту систему;
- Программа должна завершаться при вводе слова end;

Нужно помнить, что налог не может быть отрицательным;
Программа должна быть структурирована в методы (например, расчёт налога для одной системы налогообложения должен представлять собой отдельный статический метод)

### Задача №6 - `Сравнение double`
Описание
Написать программу для сравнения double, float и округления этих типов

Функционал программы
Ввод номера желаемой операции (сравнить/округлить/отбросить дробную часть);
Ввод двух чисел для сравнения (одно double, другое float) или одного (для округления или отброса дробной части);
Вывод результата.

### Задача №7 - `Угадываем високосность`
Описание
Нужно написать программу, которая будет играть с пользователем в следующую игру: каждый ход программа спрашивает у него два числа: год и число дней в этом году. Вы проверяете, правильно ли пользователь указал количество дней в этом году и, если правильно, повторяете ход. В противном случае игра завершается. По окончании игры напишите пользователю сколько раз он угадал, это и будет количество набранных очков в игре.

### Задача №8  - `Високосный год`
Описание
Нужно написать программу, которая будет рассчитывать количество дней в году. Зачем это бывает нужно? Варианты бывают разные: например, для расчета продолжительности долгосрочных проектов в днях или чтобы узнать, сколько дней потребуется для космической экспедиции на Марс. Для расчета количества дней в году требуется знать несколько правил:

В високосном году 366 дней, в обычном 365.
Високосный год — это год, номер которого делится без остатка на 400 (например 2000 или 2400), либо делится на 4 но не делится на 100 (например 2008, 2096, но не 2100).

### Задача №9 - `День месяца и средняя температура за эти дни`
Описание
Написать программу для расчёта средней температуры за указанное количество дней

### Задача №10 - `Покупка товаров`
Описание
Нужно написать программу, планирующую продуктовую корзину.
У вас есть список доступных продуктов в одном массиве и соответствующая им цена в другом массиве. Пользователь вводит номер продукта из первого списка и количество продуктов этого вида, которое хочет купить. Программа добавляет указанное количество выбранного продукта в итоговую сумму продуктовой корзины. Действие повторяется до тех пор, пока пользователь не введет команду "end". Только после этого выводится вся корзина выбранных товаров и итоговая сумма.

### Задача №11 - `Книги и авторы`
Описание
Необходимо написать программу со следующими классами: "Автор" (Author), содержащий как минимум конструктор с параметрами и toString и "Книга" (Book).
Связать между собой классы Author и Book, чтобы среди типов полей одних классов встречались другие.

### Задание №12 - `Поворот матрицы`
Описание
Дано: двумерная матрица 8 на 8 из случайных чисел от 0 до 255 (спектр цветов GrayScale). Напишите алгоритм "поворота" такой матрицы на 90/180/360 градусов по часовой стрелке.

### Задание №13 - `Игра крестики-нолики`
Описание
Написать простой функционал игры крестики-нолики с методом проверки победы одного из игроков, написанный при помощи циклов. 

### Задание №14 - `Игра на музыкальных инструментах`
Описание
Написать приложение, имитирующее игру на музыкальных инструментах.

### Задание №15 - `Программа для бухгалтеров`
Описание
Бухгалтерская программа должна уметь проводить операции c различными агентами.

Дополнительная информация.
Практически в любом языке программирования, если вы напишете нечто подобное, вы получите не то, что вы могли ожидать:

System.out.println(0.1 + 0.2); // => 0.30000000000000004
Связанно это с тем, что числа в компьютере хранятся в двоичном виде, и конечные дроби в десятичной системе счисления 0.1 и 0.2 превращаются в бесконечные периодические дроби в двоичной системе счисления 0.00011001100110011010 и 0.00110011001100110011 соответственно. Как следствие, часть числа теряется, а значит, и точность при операциях с ними. Подробнее про представление вещественных чисел в компьютере на сайте ИТМО.

Для того чтобы производить расчёты с десятичными дробными числами, существует специальный класс BigDecimal (большое десятичное). Большое, потому что у него нет стандартных ограничений как у double (-1.7E+308 до 1.7E+308) или int (-2147483648 до 2147483647). Этот класс может хранить число, состоящее из 2,147,483,647 цифр, Карл! А десятичное, потому что каждая цифра числа хранится по отдельности, из-за чего не возникает проблем с потерями при переводе между системами счисления. В задаче предлагается принять некоторые неточности и использовать тип double.

### Задание №16 - `Программа для бухгалтеров, используя тип данных big decimal`
Описание
Здесь необходимо реализовать тот же функционал, но используя вместо double –> BigDecimal.

Работа с ним может показаться необычной и странной. Например, их нельзя сложить, используя оператор + (в Java запрещено перегружать операторы), или сравнить с помощью == (так как это объект, произойдёт сравнение ссылок, а не значений объектов). Вместо этого мы должны использовать методы .add(…) и .compareTo(…) соответственно.

Экземпляр этого класса можно создать с помощью new BigDecimal("0.1") или BigDecimal.valueOf(0.2). Как и String, экземпляры этого класса неизменяемые (иммутабельные), а методы .add(…), .multiply(…) возвращают новый объект, содержащий результат операции. При делении BigDecimal нужно обязательно указывать способ округления результата

### Задание №17 - `Игра шутер`
Описание
У игрока должна быть возможность использовать разные виды оружия, в будущем в игру могут быть добавлены новые. Необходимо спроектировать иерархию классов, а также систему слотов для оружия у игрока.

### Задание №18 - `Библиотека`
Описание
Необходимо разработать иерархию работников библиотеки. Нужно реализовать совмещение нескольких ролей в библиотеке
в одном исполнителе через интерфейсы. Каждый объект в программе имеет определенный набор действий.

### Задание №19 - `Банковские счета`
Описание
Необходимо написать приложение, имитирующее работу банка со следующим функционалом:
- несколько классов — различных счетов на основе общего интерфейса:
- Сберегательный счет (SavingsAccount);
- Кредитный счет (CreditAccount);
- Расчетный счет (CheckingAccount);
### Задание №20 - `Проверка доступа к ресурсу` 
Описание
Во время запуска программы нужно запросить логин или пароль пользователя.
Если один из введеных параметров не совпадает (логин/пароль), то нужно выбросить checked исключение UserNotFoundException.
Если возраст пользователя менее 18 лет, то нужно выбросить исключение AccessDeniedException, а если 18 и больше лет - вывести сообщение "Доступ предоставлен".

### Задание №21 - `Валидация прочитанных событий`
Описание
Функционал программы:
Создание заранее подготовленного списка событий - отдельно для кино и отдельно для театров;
Возможность валидации каждого из списка событий с помощью универсального метода;
Если хотя бы одно из событий содержит поля со значением null или 0, завершить работу программы и вывести это событие;
Если ошибок не возникло, вывести сообщение "Все события корректны".

### Задание №22 - `Записная книжка`
Описание
Функционал программы:
- Запрос списка задач/дел у пользователя;
- Возможность добавить задачу в список;
- Возможность удалить задачу из списка;
- Возможность вывода всех задач с их номерами (для пользователя нумеровать с 1).
- 
### Задание №23 - `Работа лифта`
Описание
Нужно написать программу, которая считывает данные из консоли, ожидая ввода номера этажа.
После ввода каждого числа (номера этажа) добавляет значение в очередь дальнейшего перемещения лифта.
Как только пользователь введет 0, программа должна последовательно вывести список всех этажей,
на которых лифт делал остановки, в формате: "этаж 1 -> этаж 22 -> этаж 0".
Если пользователь ввел этаж вне диапазона 0-25, проигнорировать ввод таких данных.
Для реализации хранения введенных пользователем этажей отлично подойдет структура на основе интерфейса очередь (queue).
По мере ввода мы сможем добавлять в конец очереди новые значения.

### Задание №24 - `Время движения лифта`
Описание
Дополнить Задачу №23 следующими данными: после ввода нулевого этажа, программа должна рассчитать время движения лифта вместе с остановками.
Скорость движения лифта между парой этажей равна 5 секунд, время остановки на открытие и закрытие дверей лифта 10 секунд.
Вывести информацию, сколько времени потребовалось лифту, чтобы пройти ранее введенные этажи.

### Задание №25 - `Обратная польская запись`
Описание
Задача - написать программу перевода инфиксной записи (например 2 + 3) в постфиксную запись (2 3 +),
что и будет являться так называемой "Обратной польской записью". Обра́тная по́льская запись
(англ. Reverse Polish notation, RPN) — форма записи математических и логических выражений,
в которой операнды расположены перед знаками
операций (источник https://ru.wikipedia.org/wiki/%D0%9F%D0%BE%D0%BB%D1%8C%D1%81%D0%BA%D0%B0%D1%8F_%D0%BD%D0%BE%D1%82%D0%B0%D1%86%D0%B8%D1%8F).
Такая запись имеет ряд преимуществ перед инфиксной записью при выражении математических формул:
- Любая формула может быть выражена без скобок;
- Удобна для вычисления формул в stack машинах (например JVM);
- Нет нежелательных приоритетов операторов;
- Необходимо реализовать алгоритм на основе очереди, который прочитает математическое выражение,
найдет все числа и сохранит их отдельно от знаков (в отдельную коллекцию).

### Задание №26 - `Телефонный справочник`
Описание
Функционал классов:
- Создание группы контактов;
- Создание контакта;
- Добавление контакта в разные группы;
- Поиск контактов по группе;
- Поиск контакта по номеру (одну из этих двух последних операций можно сделать перебором).

### Задание №27 - `Список студентов`
Описание
Функционал программы:
- Ввод информации о студентах;
- Вывод списка студентов.
- 
Пример
Введите информацию о студенте: "ФИО, номер группы, номер студенческого билета"
Иванов Петр Николаевич, 1243-Б, 31231343 <enter>
  
Введите информацию о студенте (для завершения работы программы введите "end")
Петрова Татьяна Михайловна, 1243-Б, 43221343 <enter>
  
Введите информацию о студенте (для завершения работы программы введите "end")
end <enter>
Список студентов:
  - Иванов Петр Николаевич, 1243-Б, 31231343
  - Петрова Татьяна Михайловна, 1243-Б, 43221343
  
### Задание №28 - `Пропущенные вызовы`
Описание
Вам надо разработать систему классов:
- Класс контакта;
- Класс телефонной книги из прошлого задания + метод для поиска контакта по номеру;
- Класс списка пропущенных вызовов;
- Пропущенный вызов должен описываться временем и номером (не контактом).

### Задание №29 - `Система подбора кандидатов`
Описание
Функционал программы:
- Класс, описывающий кандидата;
- Создать множество, заполнить его кандидатами (общаться с пользователями не нужно);
- Вывод кандидатов в отсортированном порядке.
