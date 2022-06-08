package ru.zvezdilin.taskOfInterviews.task17_игра_шутер.Weapon;

public class Automate extends Weapon {
    public Automate(String name, String slot) {
        super(name, slot);
    }

    @Override
    public void shot() {
        System.out.println("Выстрел из оружия: " + getName() + " из слота: " + getSlot() + " **** **** **** ****" + "\n");
    }
}
