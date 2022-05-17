package Home_Task_Netology.Ten.Игра_Шутер;

import java.util.Scanner;
/*
Один из проектов — это игра-шутер (Half-Life 3, только никому ни слова).
У игрока должна быть возможность использовать разные виды оружия, в будущем в игру могут быть добавлены новые.
Необходимо спроектировать иерархию классов, а также систему слотов для оружия у игрока.

Функционал программы
Создание объекта Player у которого будет набор оружия;
Возможность у игрока вызвать метод выстрела, внутри которого будут проверки на допустимость номера оружия для выстрела;
Классы оружия должны быть в пакете weapon (вспомните какие ДВЕ вещи нужно сделать, чтобы поместить классы в пакеты; мы их проходили на втором занятии);
Возможность выбора оружия для выстрела в main.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Player player = new Player();
            System.out.format("У вас %d слота с оружием.\n"
                            + "Введите номер, чтобы выстрелить.\n"
                            + "'\"-1\" чтобы выйти%n",
                    player.getSlotsCount()
            );
            int slot = scanner.nextInt() - 1;
            if (slot == -2) {
                String redText = (char) 27 + "[31m";
                System.out.println(redText + "Вы нажали \"-1\" и вышли ");
                break;
            }
            player.shotWithWeapon(slot);
        }
        System.out.println("Game over!");
    }

}
