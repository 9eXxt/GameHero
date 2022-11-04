package personage;

public class Warrior extends Hero {
    public Warrior(String name, float health, float attack) {
        super(name);
        super.attack = attack;
        super.health = health;
        System.out.println("\nНазва вашого персонажа: " + super.NameGet() + "\nАтака персонажа: " + attack + "\nОчки здоров'я: " + health);
    }

    @Override
    public int Attack(Enemy enemy, Hero hero)//выбор атаки части тела
    {
        System.out.print("(1) Голова \n(2) Корпус \n(3) Ноги \nВиберіть цифру частини тіла для атаки на ворога " + enemy.name.toLowerCase() + ": ");
        try {
            scan.useDelimiter("\n");
            Attack = scan.nextInt();
            if (Attack < 1 || Attack > 3) {
                System.out.println("\nПеревірте коректність даних!");
                hero.Attack(enemy, hero);
            }
        } catch (Exception e) {
            scan.nextLine();
            System.out.println("\nПеревірте коректність даних!");
            hero.Attack(enemy, hero);
        }
        return Attack;
    }
}
