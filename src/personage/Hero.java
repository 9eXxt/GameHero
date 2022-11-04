package personage;

import java.util.Scanner;

public abstract class Hero implements Mortal {

     public static Scanner scan = new Scanner(System.in);
     protected String name; // змінна для назви герою
     protected int Defence, Attack; //змінні для вибору частини тіла для атаки
     protected float health , attack; // змінні для очок здоров'я та урону, який може завдавати герой
     public Hero(String name)
     {
         this.name = name;
     }

     public float getAttack()
     {
         return attack;
     }
     public float getHealth()
     {
         return health;
     }
     public void TakeDamage(float damage)
     {
         health -= damage;
     }
     public String NameGet()
     {
         return name;
     }

    public abstract int Attack(Enemy enemy, Hero hero);

    public int Defence(Hero hero)
    {
        System.out.print("(1) Голова \n(2) Корпус \n(3) Ноги \nВиберіть цифру частини тіла для оборони: ");
        try {
            scan.useDelimiter("\n");
            Defence = scan.nextInt();
            if (Defence < 1 || Defence > 3)
            {
                System.out.println("\nПеревірте коректність даних!\n");
                hero.Defence(hero);
            }
        }
        catch (Exception e){
            scan.nextLine();
            System.out.println("\nПеревірте коректність даних!\n");
            hero.Defence(hero);
        }
        return Defence;
    }
    @Override
    public boolean isAlive() {
        return health <= 0;
    }
}

