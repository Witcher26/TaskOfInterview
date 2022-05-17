package Home_Task_Netology.Ten.Игра_Шутер;

import Home_Task_Netology.Ten.Игра_Шутер.Weapon.Automate;
import Home_Task_Netology.Ten.Игра_Шутер.Weapon.Rifle;
import Home_Task_Netology.Ten.Игра_Шутер.Weapon.Pistol;
import Home_Task_Netology.Ten.Игра_Шутер.Weapon.Weapon;

public class Player {
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new Automate("АК-47", "Автоматы"),
                new Pistol("USP-S", "Пистолеты"),
                new Rifle("М4А1-S", "Винтовки"),
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot < 0 || slot >= getSlotsCount()) {
            System.out.println("Неверное значение. Введите число от 1 до " + getSlotsCount());
            return;
        }

        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }
}
