public class Room {
    private String name, description;
    private Room north, south, east, west;
    private Item[] roomLoot;
    private Enemy roomEnemy;

    public Room(String name, String description, Item[] loot) {
        this.name = name; this.description = description; this.roomLoot = loot;
    }

    public void setExits(Room n, Room s, Room e, Room w) {
        this.north = n; this.south = s; this.east = e; this.west = w;
    }

    public Room getExit(String dir) {
        if (dir.equals("north")) return north;
        if (dir.equals("south")) return south;
        if (dir.equals("east")) return east;
        if (dir.equals("west")) return west;
        return null;
    }

    public void setEnemy(Enemy e) { this.roomEnemy = e; }
    public Enemy getEnemy() { return roomEnemy; }
    public void clearEnemy() { this.roomEnemy = null; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public Item[] getLoot() { return roomLoot; }
    public void clearLoot() { this.roomLoot = new Item[0]; }
}
