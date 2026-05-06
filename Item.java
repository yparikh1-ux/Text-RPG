public class Item {
    private String name;
    private String type; // "weapon", "armor", "potion"
    private int statModifier;

    public Item(String name, String type, int statModifier) {
        this.name = name;
        this.type = type;
        this.statModifier = statModifier;
    }

    public String getName() { return name; }
    public String getType() { return type; }
    public int getStatModifier() { return statModifier; }
    
    public String toString() {
        return name + " [" + type + "] (Modifier: +" + statModifier + ")";
    }
}
