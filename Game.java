
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException;

public class Game {

	private Player player1;
	private Player player2;
	private Player currentPlayer;
	private Board board;

	// Start a new game
	public void startGame() {
		ArrayList<Card> cards = null;
		try {
			// Load cards using CardDatabase
			cards = CardDatabase.loadCards("ffxiv_cards.csv");
		} catch (IOException e) {
			System.out.println("There was an error with loading your cards. ");
			return;
		}
		// Create two players
		player1 = new Player("Player 1", 1);
		player2 = new Player("Player 2", 2);
		// Create board
		board = new Board();
		// Shuffle and deal cards
		dealCards(cards);
		// Set Player 1 as current player
		currentPlayer = player1;
		// Start turn loop
		// Stop when board is full
		// Display winner

	}

	// TODO: Randomly distribute 5 cards to each player
	private void dealCards(ArrayList<Card> cards) {
		// Copy card list
		// Check that at least 10 cards exist
		// Shuffle using Collections.shuffle()
		// add 5 cards to each player's hand

	}

	// TODO: Return current player
	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	// TODO: Handle player's turn
	public boolean takeTurn(int cardIndex, int row, int col) {
		// Validate card index
		// Get selected card from current player
		// Attempt placement using Board.placeCard()
		// If invalid, return false
		// Remove card from player's hand
		// Apply capture rules
		// Switch turns if board isn't full
		// Return true if successful

		return false;
	}

	// Alternate current player
	public void switchTurn() {
		// Switch between player1 and player2

	}

	// Count cards owned on the board
	public int countOwnedCards(int playerId) {
		// Check all nine board cells
		// Count cards matching playerId

		return 0;
	}

	// Determine winner
	public int getWinner() {
		// Count both players' board cards
		// Include remaining cards in players' hands
		// Return 1 or 2 for winner
		// Return 0 for a tie

		return 0;
	}
}
