package personage;

public class Zombie extends Enemy {
    public Zombie(String name, float health, float attack) {
        super(name);
        super.attack = attack;
        super.health = health;
        System.out.println("\nВаш супротивник: " + super.name + "\nАтака персонажа: " + attack + "\nОчки здоров'я: " + health + "\n");
    }
}
