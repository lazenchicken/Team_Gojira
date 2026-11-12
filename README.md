1. create cards with directional values, store five cards in player arraylist
2. create 3x3 array grid and print cells
3. choose a card and place it in empty cell
4. Compare card ownership and neighbors change if defeated
5. cards_all goes into the main folder(the folder above src)

Load break down and shared code
 Imported Card Database

DEV 1 - Card, Player

public Card getCard(int index);

public Card removeCard(int index);


DEV 2 - PlaceCard, CaptureRules

public boolean placeCard(Card card, int ownerId, int row, int col);

public PlaceCard getCell(int row, int col);

public boolean isFull();

public void printBoard();


DEV 3 - Game, Main

public void checkCaptures(Board board, int row, int col);

public int countOwnderCards(Board board, int playerId);


DEV 4 - Board

public void start();

public void takeTurn();

public void switchTurn();

public void displayWinner();

