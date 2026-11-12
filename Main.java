
import java.util.ArrayList;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            ArrayList<Card> cards =
                CardDatabase.loadCards("cards_all.csv");

            System.out.println("Cards loaded: " + cards.size());

            Card card =
                CardDatabase.findByName(cards, "Geezard");

            if (card != null) {
                System.out.println(card.getName());
                System.out.println(card.getUp());
                System.out.println(card.getRight());
            }

        } catch (IOException e) {
            System.out.println("Error loading cards: "
                    + e.getMessage());
        }
    }
}
