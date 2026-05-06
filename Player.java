import java.util.ArrayList;

public class Player extends Entity {
    private ArrayList<Item> inventory;

    public Player(String name, int health, int attackPower) {
        super(name, health, attackPower);
        this.inventory = new ArrayList<Item>();
    }

    public void pickUp(Item item) {
        inventory.add(item);
        // If it's a permanent boost (Weapon/Armor), apply it immediately
        if (item.getType().equals("weapon")) {
            setAttackPower(getAttackPower() + item.getStatModifier());
            System.out.println("Your attack power increased by " + item.getStatModifier() + "!");
        } else if (item.getType().equals("armor")) {
            setMaxHealth(getHealth() + item.getStatModifier());
            heal(item.getStatModifier());
            System.out.println("Your max health increased by " + item.getStatModifier() + "!");
        }
    }

    public void usePotion(String name) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getName().equalsIgnoreCase(name) && inventory.get(i).getType().equals("potion")) {
                heal(inventory.get(i).getStatModifier());
                System.out.println("Used " + name + ". Health restored!");
                inventory.remove(i);
                return;
            }
        }
        System.out.println("You don't have that potion.");
    }

    public void showStats() {
        System.out.println("\n--- [ " + getName() + " STATS ] ---");
        System.out.println("HP: " + getHealth() + " | Attack: " + getAttackPower());
    }

    public void showInventory() {
        System.out.println("Inventory: " + inventory);
    }
}
