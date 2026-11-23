public class Board {                // Board  V 1.0

    private PlacedCard[][] grid;

    public Board() {
        grid = new PlacedCard[3][3];
    }

    // Helper method to keep boundary checks DRY across all methods
    private boolean isValidPosition(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3;
    }

    // Check if cell is valid and empty
    public boolean isEmpty(int row, int col) {
        if (!isValidPosition(row, col)) {
            return false;
        }
        return grid[row][col] == null;
    }

    // Place a card on the board
    public boolean placeCard(Card card, int ownerId, int row, int col) {
        if (card == null || !isEmpty(row, col)) {
            return false;
        }
        grid[row][col] = new PlacedCard(card, ownerId);
        return true;
    }

    // Retrieve card at position (returns null if out of bounds or empty)
    public PlacedCard getCell(int row, int col) {
        if (!isValidPosition(row, col)) {
            return null;
        }
        return grid[row][col];
    }

    // Check if all 9 cells are occupied
    public boolean isFull() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (grid[row][col] == null) {
                    return false;
                }
            }
        }
        return true;
    }

    // Display 3x3 board in console
    public void printBoard() {
        System.out.println("\n+---------------+---------------+---------------+");
        for (int row = 0; row < 3; row++) {
            // Line 1: Owner tag and Card Name (truncated to fit column width)
            for (int col = 0; col < 3; col++) {
                PlacedCard pc = grid[row][col];
                if (pc == null) {
                    System.out.printf("|   (%d,%d)       ", row, col);
                } else {
                    String name = pc.getCard().getName();
                    if (name.length() > 9) {
                        name = name.substring(0, 9);
                    }
                    System.out.printf("| [P%d] %-9s", pc.getOwnerId(), name);
                }
            }
            System.out.println("|");

            // Line 2: Top stat
            for (int col = 0; col < 3; col++) {
                PlacedCard pc = grid[row][col];
                if (pc == null) {
                    System.out.print("|               ");
                } else {
                    System.out.printf("|       %-2d      ", pc.getCard().getUp());
                }
            }
            System.out.println("|");

            // Line 3: Left and Right stats
            for (int col = 0; col < 3; col++) {
                PlacedCard pc = grid[row][col];
                if (pc == null) {
                    System.out.print("|     EMPTY     ");
                } else {
                    Card c = pc.getCard();
                    System.out.printf("|   %-2d      %-2d  ", c.getLeft(), c.getRight());
                }
            }
            System.out.println("|");

            // Line 4: Bottom stat
            for (int col = 0; col < 3; col++) {
                PlacedCard pc = grid[row][col];
                if (pc == null) {
                    System.out.print("|               ");
                } else {
                    System.out.printf("|       %-2d      ", pc.getCard().getDown());
                }
            }
            System.out.println("|");
            System.out.println("+---------------+---------------+---------------+");
        }
    }
}
