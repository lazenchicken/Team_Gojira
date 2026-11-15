import java.util.ArrayList;

public class Player {
	private String name;
	private int id;
	private ArrayList<Card> hand;

	public Player(String name, int id) {
		this.name = name;
		this.id = id;
		this.hand = new ArrayList<Card>();
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public ArrayList<Card> getHand() {
		return new ArrayList<Card>(hand);
	}

	// add card to hand if not full
	public void addCard(Card card) {
		if (card == null) {
			throw new IllegalArgumentException("Card can not be null");
		}
		if (hand.size() >= 5) {
			throw new IllegalStateException("Hand is full");
		}
		hand.add(card);
	}
//remove and return card
	public Card removeCard(int index) {
		return hand.remove(index);
	}
	//// remove and return card when played
	public Card playCard(int index) {
		return removeCard(index);
	}

	// return without removing
	public Card getCard(int index) {
		return hand.get(index);
	}


	// check hand
	public int getHandSize() {
		return hand.size();
	}

	public boolean hasCards() {
		return !hand.isEmpty();
	}

	// show hand
	public void showHand() {
		System.out.println(name + "'s hand:");
		for (int i = 0; i < hand.size(); i++) {
			System.out.println(i + ": " + hand.get(i));
		}
	}
}
