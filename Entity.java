public class Entity {
    private String name;
    private int health;
    private int maxHealth;
    private int attackPower;

    public Entity(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.attackPower = attackPower;
    }

    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getAttackPower() { return attackPower; }

    public void setAttackPower(int p) { this.attackPower = p; }
    public void setMaxHealth(int h) { this.maxHealth = h; }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) this.health = 0;
    }

    public void heal(int amount) {
        this.health += amount;
        if (this.health > maxHealth) this.health = maxHealth;
    }

    public boolean isAlive() { return health > 0; }
}
