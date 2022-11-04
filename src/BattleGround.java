import  personage.*;

import java.util.Scanner;
public class BattleGround {

    public static int menu = 0;
    public static Scanner scan = new Scanner(System.in);
    public static int nameInt;
    public static String name;
    public static int randomizer;
    public static void gameKnight(Hero warrior) //функція гри рицара
    {
        Knight knight = new Knight("Рицар", 115,30);
        while(true)
        {
            rand();
            if(warrior.Attack(knight, warrior) == knight.getRandomizer(randomizer))
            {
                if (warrior.getAttack() < 1 || warrior.getAttack() > 3)
                {
                    System.out.println("\nПеревірте коректність даних!");
                }
                knight.TakeDamage(warrior.getAttack() - 10);
                if(knight.isAlive())
                {
                    System.out.println("\nВи пробили ворога та не залишили йому очок здоров'я\nВи виграли! Вітаємо\n");
                    break;
                }
                System.out.println("\nПротивник зміг блокувати атаку! Ви залишили йому "+knight.getHealth() + " очок здоров'я!\n");
            }
            else
            {
                knight.TakeDamage(warrior.getAttack());
                if(knight.isAlive())
                {
                    System.out.println("\nВи пробили ворога та не залишили йому очок здоров'я\nВи виграли! Вітаємо\n");
                    break;
                }
                System.out.println("\nВи пробили захист, залишивши противнику " + knight.getHealth() + " очок здоров'я!\n");
            }
            rand();
            if (warrior.Defence(warrior) == knight.getRandomizer(randomizer))
            {
                warrior.TakeDamage(knight.getAttack() - 15);
                if(warrior.isAlive())
                {
                    System.out.println("\nРицар пробив ваш захист та не залишив Вам очок здоров'я\nВи програли! Не засмучуйтесь)\n");
                    break;
                }
                System.out.println("\nВи блокували атаку! Противник залишив Вам " + warrior.getHealth() + " очок здоров'я!\n");
            }
            else
            {
                warrior.TakeDamage(knight.getAttack());
                if(warrior.isAlive())
                {
                    System.out.println("\nРицар пробив ваш захист та не залишив Вам очок здоров'я\nВи програли! Не засмучуйтесь)\n");
                    break;
                }
                System.out.println("\nРицар пробив ваш захист та залишив Вам " + warrior.getHealth() + " очок здоров'я!\n");
            }
        }
    }
    public static void gameGhost(Hero warrior) //функція гри привида
    {
        Ghost ghost = new Ghost("Привид",115,15);
        while(true)
        {
            rand();
            if(warrior.Attack(ghost, warrior) == ghost.getRandomizer(randomizer))
            {
                ghost.TakeDamage(warrior.getAttack() - 10);
                if(ghost.isAlive())
                {
                    System.out.println("\nВи пробили ворога та не залишили йому очок здоров'я\nВи виграли! Вітаємо\n");
                    break;
                }
                System.out.println("\nПротивник зміг блокувати атаку! Ви залишили йому "+ghost.getHealth() + " очок здоров'я!\n");
            }
            else
            {
                ghost.TakeDamage(warrior.getAttack());
                if(ghost.isAlive())
                {
                    System.out.println("\nВи пробили ворога та не залишили йому очок здоров'я\nВи виграли! Вітаємо\n");
                    break;
                }
                System.out.println("\nВи пробили захист, залишивши противнику " + ghost.getHealth() + " очок здоров'я!\n");
            }
            rand();
            if (warrior.Defence(warrior) == ghost.getRandomizer(randomizer))
            {
                warrior.TakeDamage(ghost.getAttack() - 15);
                if(warrior.isAlive())
                {
                    System.out.println("\nПривид пробив ваш захист та не залишив Вам очок здоров'я\nВи програли! Не засмучуйтесь)\n");
                    break;
                }
                System.out.println("\nВи блокували атаку! Противник залишив Вам " + warrior.getHealth() + " очок здоров'я!\n");
            }
            else
            {
                warrior.TakeDamage(ghost.getAttack());
                if(warrior.isAlive())
                {
                    System.out.println("\nПривид пробив ваш захист та не залишив Вам очок здоров'я\nВи програли! Не засмучуйтесь)\n");
                    break;
                }
                System.out.println("\nПривид пробив ваш захист та залишив Вам " + warrior.getHealth() + " очок здоров'я!\n");
            }
        }
    }
    public static void gameZombie(Hero warrior)  //функція гри зомби
    {
        Zombie zombie = new Zombie("Зомбі",85,35);
        while(true)
        {
            rand();
            if(warrior.Attack(zombie, warrior) == zombie.getRandomizer(randomizer))
            {
                zombie.TakeDamage(warrior.getAttack() - 10);
                if(zombie.isAlive())
                {
                    System.out.println("\nВи пробили ворога та не залишили йому очок здоров'я\nВи виграли! Вітаємо\n");
                    break;
                }
                System.out.println("\nПротивник зміг блокувати атаку! Ви залишили йому "+zombie.getHealth() + " очок здоров'я!\n");
            }
            else
            {
                zombie.TakeDamage(warrior.getAttack());
                if(zombie.isAlive())
                {
                    System.out.println("\nВи пробили ворога та не залишили йому очок здоров'я\nВи виграли! Вітаємо\n");
                    break;
                }
                System.out.println("\nВи пробили захист, залишивши противнику " + zombie.getHealth() + " очок здоров'я!\n");
            }
            rand();
            if (warrior.Defence(warrior) == zombie.getRandomizer(randomizer))
            {
                warrior.TakeDamage(zombie.getAttack() - 15);
                if(warrior.isAlive())
                {
                    System.out.println("\nЗомбі пробив ваш захист та не залишив Вам очок здоров'я\nВи програли! Не засмучуйтесь)\n");
                    break;
                }
                System.out.println("\nВи блокували атаку! Противник залишив Вам " + warrior.getHealth() + " очок здоров'я!\n");
            }
            else
            {
                warrior.TakeDamage(zombie.getAttack());
                if(warrior.isAlive())
                {
                    System.out.println("\nЗомбі пробив ваш захист та не залишив Вам очок здоров'я\nВи програли! Не засмучуйтесь)\n");
                    break;
                }
                System.out.println("\nЗомбі пробив ваш захист та залишив Вам " + warrior.getHealth() + " очок здоров'я!\n");
            }
        }
    }
    public static void game() //функція гри
    {
        switch (nameInt) {
            case 1:
                Warrior warrior = new Warrior(name, 75, 25);
                rand();
                if (randomizer == 1) {
                    gameZombie(warrior);
                } else if (randomizer == 2) {
                    gameGhost(warrior);
                } else if (randomizer == 3) {
                    gameKnight(warrior);
                }
                break;
            case 2:
                Archer archer = new Archer(name, 50, 75);
                rand();
                if (randomizer == 1) {
                    gameZombie(archer);
                } else if (randomizer == 2) {
                    gameGhost(archer);
                } else if (randomizer == 3) {
                    gameKnight(archer);
                }
                break;
            case 3:
                Mage mage = new Mage(name, 65, 70);
                rand();
                if (randomizer == 1) {
                    gameZombie(mage);
                } else if (randomizer == 2) {
                    gameGhost(mage);
                } else if (randomizer == 3) {
                    gameKnight(mage);
                }
                break;
            default:
                System.out.println("\nПеревірте коректність даних!");
                name();
                game();
        }
    }
    public static void rand() //функція рандому для вибору суперника
    {
          randomizer = (int) (1+Math.random()*3);
    }
    public static void name() //функція вводу ім'я герою
    {
        System.out.print("\n(1) Воїн \n(2) Лучник \n(3) Маг \nВведіть цифру вашого персонажа: ");
        try {
            scan.useDelimiter("\n");
            nameInt =  scan.nextInt();
        }
        catch (Exception e){
            scan.nextLine();
            System.out.println("\nПеревірте коректність даних!");
            name();
        }
        if(nameInt == 1)
        {
            name = "Воїн";
        }
        else if (nameInt == 2)
        {
            name = "Лучник";
        }
        else if (nameInt == 3)
        {
            name = "Маг";
        }
    }
    public static void mainmenu() //головне меню
    {
        System.out.println("Гра Hero");
        System.out.println("(1) Розпочати гру");
        System.out.println("(2) Правила гри");
        System.out.println("(0) Вийти з гри");
        System.out.print("Введіть значення: ");
        try {
            scan.useDelimiter("\n");
            menu =  scan.nextInt();
        }
        catch (Exception e){
            scan.nextLine();
            System.out.println("\nПеревірте коректність даних!\n");
            mainmenu();
        }
    }

    public static void main(String[] args) {
        mainmenu();
        while (menu != 0)
        {
            switch (menu)
            {
                case 1:
                    name();
                    game();
                    mainmenu();
                    break;
                case 2:
                    System.out.println("\nВи маєте право вибору герою: Воїн, Лучник або Маг. Кожен з них має свою кількість очок здоров'я та атаки. Битись ви будете проти ворогів таких як: Зомбі, Рицар та Привид. \nВорог " +
                            "буде випадковим. Також ворог може атакувати героя. І герой, і ворог можуть зменшити отримуваний урон. Для цього ви будете вибирати яку частину тіла обороняти. Бажаємо гарної гри)\n");
                    mainmenu();
                    break;
                default:
                    System.out.println("\nПеревірте коректність даних!\n");
                    mainmenu();
            }
        }
    }
}