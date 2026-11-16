
public class Board {

    private PlacedCard[][] grid;

    public Board() {
        grid = new PlacedCard[3][3];
    }

    // TODO: Check if cell is valid and empty
    public boolean isEmpty(int row, int col) {
        // TODO: Check row and column boundaries
        // TODO: Check if grid position is null
      return false;
    }

    // TODO: Place a card on the board
    public boolean placeCard(Card card, int ownerId,
                             int row, int col) {
        // TODO: Check valid board position
        // TODO: Reject occupied cells
        // TODO: Create PlacedCard object
        // TODO: Store object in grid
        // TODO: Return true on successful placement
return false;
    }

    // TODO: Retrieve card at position
    public PlacedCard getCell(int row, int col) {
        // TODO: Check row and column boundaries
        // TODO: Return placed card or null

    }

    // TODO: Check if all 9 cells are occupied
    public boolean isFull() {
        // TODO: Loop through rows and columns
        // TODO: Return false if an empty cell exists
return false;
    }

    // TODO: Display 3x3 board in console
    public void printBoard() {
        // TODO: Print rows and columns
        // TODO: Show empty spaces
        // TODO: Show placed cards and ownership

    }
}

