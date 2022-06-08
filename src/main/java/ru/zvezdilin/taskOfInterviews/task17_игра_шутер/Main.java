package ru.zvezdilin.taskOfInterviews.task17_игра_шутер;

import ru.zvezdilin.taskOfInterviews.task17_игра_шутер.Weapon.Player;
import java.util.Scanner;

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
