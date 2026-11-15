
import java.util.ArrayList;
import java.io.IOException;

public class Tester {

	public static void main(String[] args) {

		try {
			// Load cards from CSV
			ArrayList<Card> cards = CardDatabase.loadCards("cards_all.csv");

			System.out.println("Cards loaded: " + cards.size());

			// Test finding a card by name
			Card testCard = CardDatabase.findByName(cards, "Geezard");

			if (testCard != null) {
				System.out.println("Found: " + testCard.getName());
			}

			// Create two players
			Player p1 = new Player("Player 1", 1);
			Player p2 = new Player("Player 2", 2);

			// Give each player 5 cards
			for (int i = 0; i < 5; i++) {
				p1.addCard(cards.get(i));
				p2.addCard(cards.get(i + 5));
			}

			// Display both hands
			System.out.println("\n--- PLAYER HANDS ---");
			p1.showHand();
			p2.showHand();

			// Test getCard (does not remove)
			System.out.println("\n--- GET CARD TEST ---");

			Card selected = p1.getCard(0);

			System.out.println("Selected: " + selected.getName());
			System.out.println("Hand size: " + p1.getHandSize());

			// Test playCard (removes card)
			System.out.println("\n--- PLAY CARD TEST ---");

			Card played = p1.playCard(0);

			System.out.println("Played: " + played.getName());
			System.out.println("Hand size: " + p1.getHandSize());

			// Test hand limit
			System.out.println("\n--- HAND LIMIT TEST ---");

			try {
				p2.addCard(cards.get(10));
			} catch (IllegalStateException e) {
				System.out.println("Correctly rejected: " + e.getMessage());
			}

			// Test null protection
			System.out.println("\n--- NULL CARD TEST ---");

			try {
				p1.addCard(null);
			} catch (IllegalArgumentException e) {
				System.out.println("Correctly rejected: " + e.getMessage());
			}

			System.out.println("\n--- TESTING COMPLETE ---");

		} catch (IOException e) {
			System.out.println("Error loading cards: " + e.getMessage());
		}
	}
}
