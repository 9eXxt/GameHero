package personage;
public abstract class Enemy implements Mortal {
    protected float attack, health; // змінні для очок здоров'я та урону, який може завдавати ворог
    protected String name; // змінна для назви ворога

    Enemy(String name) {
        this.name = name;
    }

    public float getAttack(){return attack;}
    public float getHealth()
    {
        return health;
    }
    public void TakeDamage(float damage)
    {
        this.health -= damage;
    }

    public int getRandomizer(int randomizer) {
        return randomizer;
    }
    @Override
    public boolean isAlive() {
        return health <= 0;
    }
}

