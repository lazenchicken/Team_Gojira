
public class Card {

    // Instance variables
    private String name;
    private int level;
    private int up;
    private int right;
    private int down;
    private int left;
    private String element;

    // Constructor
    public Card(String name, int level, int up,
                int right, int down, int left,
                String element) {

        this.name = name;
        this.level = level;
        this.up = up;
        this.right = right;
        this.down = down;
        this.left = left;
        this.element = element;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getUp() {
        return up;
    }

    public int getRight() {
        return right;
    }

    public int getDown() {
        return down;
    }

    public int getLeft() {
        return left;
    }

    public String getElement() {
        return element;
    }

    // Display card information
    @Override
    public String toString() {
        return name + " (Level " + level + ")\n"
                + "    " + up + "\n"
                + left + "       " + right + "\n"
                + "    " + down;
    }
}
