package ru.zvezdilin.taskOfInterviews.task17_игра_шутер.Weapon;

public class Pistol extends Weapon {
    public Pistol(String name, String slot) {
        super(name, slot);
    }

    @Override
    public void shot() {
        System.out.println("Выстрел из оружия: " + getName() + " из слота: " + getSlot() + " *  *  *  *  *  *  *" + "\n");
    }
}
