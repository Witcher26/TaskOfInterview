package Home_Task_Netology.Ten.Игра_Шутер.Weapon;

public class Weapon {
    private String name;
    private String slot;

    public Weapon(String name, String slot) {
        this.slot = slot;
        this.name = name;
    }

    public void shot() {
        System.out.println("Выстрел оружия: " + getName() + " из слота: " + getSlot());
    }

    public String getName() {
        return name;
    }

    public String getSlot() {
        return slot;
    }
}

