package Home_Task_Netology.Ten.Игра_Шутер.Weapon;

public class Rifle extends Weapon {
    public Rifle(String name, String slot) {
        super(name, slot);
    }

    @Override
    public void shot() {
        System.out.println("Выстрел из оружия: " + getName() + " из слота: " + getSlot() + " ** **  ** **  ** **  **" + "\n");
    }

}
